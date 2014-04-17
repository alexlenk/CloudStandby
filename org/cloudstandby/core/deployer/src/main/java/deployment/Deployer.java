package deployment;

import static com.google.common.base.Predicates.not;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.jclouds.compute.predicates.NodePredicates.withIds;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import model.Cloud;
import model.CloudStandby;
import model.Component;
import model.DistributedSystem;
import model.FederatedInstance;
import model.Instance;
import model.impl.ModelPackageImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.config.ComputeServiceProperties;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.predicates.NodePredicates;
import org.jclouds.enterprise.config.EnterpriseConfigurationModule;
import org.jclouds.logging.log4j.config.Log4JLoggingModule;
import org.jclouds.sshj.config.SshjSshClientModule;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;

public class Deployer {

	private CloudStandby cloudStandby;
	private java.net.URI modelUri;

	public Deployer() {
		this.cloudStandby = null;
		this.modelUri = null;
	}

	public boolean loadModel(java.net.URI uri) {
		try {
			// Initialize model
			ModelPackageImpl.init();
			//ModelPackage.eINSTANCE.eClass();
			// Register the XMI resource factory for the .model extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> map = reg.getExtensionToFactoryMap();
			map.put("model", new XMIResourceFactoryImpl());
			// Obtain a new resource set
			ResourceSet resourceSet = new ResourceSetImpl();
			// Get the resource
			Resource resource = resourceSet.getResource(
					URI.createURI(uri.toString()), true);
			this.cloudStandby = (CloudStandby) resource.getContents().get(0);
			this.modelUri = uri;
			System.out.println("Model \"" + uri.toString() + "\" loaded.");
			return true;
		} catch (Exception e) {
			System.out.println("Model file \"" + uri.toString()
					+ "\" couldn't be loaded.");
			return false;
		}
	}

	/**
	 * Saves the deployed model in the old file
	 */
	private void saveCloudstandbyModel() {
		try {
			// Create a resource set.
			ResourceSet resourceSet = new ResourceSetImpl();
			// Register the default resource factory -- only needed for stand-alone!
			// this tells EMF to use XML to save the model
			resourceSet
					.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());
			// Get the URI of the model file.
			URI fileURI = URI.createURI(this.modelUri.toString());
			// Create a resource for this file.
			Resource resource = resourceSet.createResource(fileURI);
			// Add the model objects to the contents.
			resource.getContents().add(this.cloudStandby);
			// Save the contents of the resource to the file system.
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Resource saved to " + fileURI);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public boolean startDeployment(int cloud) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String formattedDate = sdf.format(now);
		String startTimeAsString = sdf2.format(now);
		ExecutorService executor = Executors.newCachedThreadPool();
		DistributedSystem distributedSystem = null;
		Cloud currentCloud = null;
		try {
			distributedSystem = this.cloudStandby.getDistributedSystem();
			currentCloud = (Cloud) this.cloudStandby.getDistributedSystem()
					.getCloud().get(cloud);
		} catch (Exception e) {
			System.out.println("No cloud with index " + cloud
					+ " defined for this distributed system!");
			return false;
		}

		//------------- MPM CALCULATION ----------------
		HashMap<Object, List<Object>> requiresRelations = new HashMap<Object, List<Object>>();
		for (Component component : (EList<Component>) distributedSystem
				.getComponent()) {
			requiresRelations.put(component, component.getRequires());
		}
		DeploymentGraph requiresGraph = new DeploymentGraph(requiresRelations);
		HashMap<Object, MpmKennzahl> mpmResult = requiresGraph.mpmCalculation();
		TreeMap<Integer, List<Object>> deploymentSteps = new TreeMap<Integer, List<Object>>();
		for (Entry<Object, MpmKennzahl> entry : mpmResult.entrySet()) {
			if (deploymentSteps.get(entry.getValue().getEst()) != null) {
				deploymentSteps.get(entry.getValue().getEst()).add(
						entry.getKey());
			} else {
				List<Object> objList = new LinkedList<Object>();
				objList.add(entry.getKey());
				deploymentSteps.put(entry.getValue().getEst(), objList);
			}
		}

		//------------- DEPLOYMENT ----------------
		Iterator<Integer> stepIterator = deploymentSteps.navigableKeySet()
				.iterator();
		int step;
		while (stepIterator.hasNext()) {
			Long start = System.currentTimeMillis() / 1000;
			step = stepIterator.next();
			LinkedList<Component> components = new LinkedList<Component>();
			LinkedList<Future<NodeMetadata>> runningDeployments = new LinkedList<Future<NodeMetadata>>();
			for (Object object : deploymentSteps.get(step)) {
				components.add((Component) object);
			}
			for (Component component : components) {
				for (FederatedInstance fedInstance : (EList<FederatedInstance>) component
						.getFederatedInstance()) {
					DeploymentThread deploymentThread = new DeploymentThread(
							distributedSystem);
					deploymentThread.init(fedInstance, currentCloud);
					System.out.printf("deploying: %s on %s \n",
							fedInstance.getHostname(), currentCloud.getName());
					Future<NodeMetadata> futureResult = executor
							.submit(deploymentThread);
					// Add thread future to a list to check activity
					runningDeployments.add(futureResult);
				}
			}
			for (Future<NodeMetadata> node : runningDeployments) {
				try {
					NodeMetadata deployedNode = node.get();
					System.out.printf("deployed: %s with id %s on %s \n",
							deployedNode.getName(), deployedNode.getId(),
							currentCloud.getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
			try {
				System.out.println("saving....");
				saveCloudstandbyModel();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				// Write result
				Thread.sleep(1000);
				FileOutputStream out;
				out = new FileOutputStream(new File("ResultDeployments.csv"),
						true);

				Long duration = (System.currentTimeMillis() / 1000) - start;
				Date date = new Date();
				String startTimeString = sdf2.format(start);
				String finishTimeString = sdf2.format(date);
				String output;
				String componentsToString = "[";
				for (Component c : components) {
					componentsToString += c.getName() + ",";
				}
				output = formattedDate + ";" + currentCloud.getName() + ";"
						+ componentsToString + ";" + duration.toString() + ";"
						+ startTimeString + ";" + finishTimeString + "\n";

				out.write(output.getBytes());
				out.flush();
				out.close();
			} catch (Exception e) {
			}
		}
		return true;
	}

	public boolean stopDeployment(int cloud, boolean kill) {
		Cloud currentCloud = null;
		try {
			currentCloud = (Cloud) this.cloudStandby.getDistributedSystem()
					.getCloud().get(cloud);
		} catch (Exception e) {
			System.out.println("No cloud with index " + cloud
					+ " defined for this distributed system!");
			return false;
		}
		String cloudprovider = currentCloud.getProviderId().getLiteral();
		String publicKey = currentCloud.getPublicKey();
		String privateKey = currentCloud.getPrivateKey();
		// These properties control how often jclouds polls for a status udpate
		Properties overrides = new Properties();
		overrides.setProperty(ComputeServiceProperties.POLL_INITIAL_PERIOD,
				String.valueOf(SECONDS.toMillis(10)));
		overrides.setProperty(ComputeServiceProperties.POLL_MAX_PERIOD,
				String.valueOf(SECONDS.toMillis(20)));
		// This module is responsible for enabling logging
		Iterable<Module> modules = ImmutableSet.<Module> of(
				new SshjSshClientModule(), new EnterpriseConfigurationModule(),
				new Log4JLoggingModule());
		ComputeServiceContext computeServiceContext = ContextBuilder
				.newBuilder(cloudprovider).credentials(publicKey, privateKey)
				.modules(modules).overrides(overrides)
				.buildView(ComputeServiceContext.class);
		ComputeService jcloudClient = computeServiceContext.getComputeService();
		List<String> ids = new LinkedList<String>();
		for (Component component : (EList<Component>) this.cloudStandby
				.getDistributedSystem().getComponent()) {
			EList<FederatedInstance> fedInstances = component
					.getFederatedInstance();
			for (FederatedInstance fedInstance : fedInstances) {
				EList<Instance> instances = fedInstance.getInstance();
				for (Instance instance : instances) {
					if (instance.getCloud().getName()
							.equals(currentCloud.getName())) {
						ids.add(instance.getId());
						System.out.println(instance.getId());
					}
				}
				if (kill) {
					Iterator<Instance> iter = instances.iterator();
					while (iter.hasNext()) {
						Instance i = iter.next();
						if (i.getCloud().getName()
								.equals(currentCloud.getName())) {
							iter.remove();
						}
					}
				}
			}
		}
		try {
			String[] idsAsArray = ids.toArray(new String[ids.size()]);
			if (kill) {
				Set<? extends NodeMetadata> destroyed = jcloudClient
						.destroyNodesMatching(Predicates.<NodeMetadata> and(
								not(NodePredicates.TERMINATED),
								withIds(idsAsArray)));
				for (NodeMetadata node : destroyed) {
					System.out.printf("terminated: %s , %s \n", node.getId(),
							node.getName());
				}
			} else {
				jcloudClient.suspendNodesMatching(Predicates
						.<NodeMetadata> and(not(NodePredicates.TERMINATED),
								withIds(idsAsArray)));
				for (String node : idsAsArray) {
					System.out.printf("stopped: %s \n", node);
				}
			}
			jcloudClient.getContext().close();
			saveCloudstandbyModel();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
