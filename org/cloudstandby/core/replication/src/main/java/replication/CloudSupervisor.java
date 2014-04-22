package replication;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import model.Cloud;
import model.CloudStandby;
import model.Component;
import model.FederatedInstance;
import model.Instance;

import org.eclipse.emf.common.util.EList;
import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.config.ComputeServiceProperties;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.NodeMetadata.Status;
import org.jclouds.enterprise.config.EnterpriseConfigurationModule;
import org.jclouds.logging.log4j.config.Log4JLoggingModule;
import org.jclouds.sshj.config.SshjSshClientModule;

import replication.Replication.SystemModel;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;

public class CloudSupervisor extends Thread {

	private int supervisionInterval;
	private Cloud cloud;
	private SystemModel systemModel;
	private CloudStandby cloudStandbyModel;

	public void superviseCloud(SystemModel systemModel,
			CloudStandby cloudStandbyModel, Cloud cloud, int supervisionInterval) {
		this.systemModel = systemModel;
		this.cloud = cloud;
		this.supervisionInterval = supervisionInterval;
		this.cloudStandbyModel = cloudStandbyModel;
	}

	@Override
	public void run() {
		SystemState currentState = null;
		Map<Instance, NodeMetadata.Status> instanceStates = new HashMap<Instance, NodeMetadata.Status>();

		//--------- OPEN PROVIDER CONNECTION -------------
		String cloudprovider = this.cloud.getProviderId().getLiteral();
		String publicKey = this.cloud.getPublicKey();
		String privateKey = this.cloud.getPrivateKey();
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
		ComputeService client = computeServiceContext.getComputeService();

		//--------- CHECK STATUS OF INSTANCES -------------
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < (supervisionInterval * 1000)) {
			EList<Component> components = this.cloudStandbyModel
					.getDistributedSystem().getComponent();
			List<Instance> relevantInstances = new LinkedList<Instance>();
			for (Component comp : components) {
				EList<FederatedInstance> fedInstances = comp
						.getFederatedInstance();
				for (FederatedInstance fedInstance : fedInstances) {
					EList<Instance> instances = fedInstance.getInstance();
					boolean instanceExists = false;
					for (Instance instance : instances) {
						if (instance.getCloud().getName()
								.equals(this.cloud.getName())) {
							relevantInstances.add(instance);
							instanceExists = true;
						}
					}
					if (!instanceExists) {
						System.out
								.printf("Error: No instance for federated Instance %s in cloud %s found!",
										fedInstance.getHostname(),
										this.cloud.getName());
						this.systemModel.systemStates.put(this.cloud,
								SystemState.NONEXISTENT);
					}
				}
			}

			for (Instance instance : relevantInstances) {
				NodeMetadata currentInstance = client.getNodeMetadata(instance
						.getId());
				if (currentInstance == null) {
					instanceStates.put(instance, NodeMetadata.Status.ERROR);
				} else {
					Status currentStatus = currentInstance.getStatus();
					//					System.out
					//							.printf("Instance info: state of federated instance %s in cloud %s is %s!\n",
					//									instance.getId(), this.cloud.getName(),
					//									currentStatus.toString());
					instanceStates.put(instance, currentStatus);
				}
			}
			Collection<Status> statusValues = instanceStates.values();
			if (statusValues.contains(NodeMetadata.Status.ERROR)
					|| statusValues.isEmpty()) {
				this.systemModel.systemStates
						.put(this.cloud, SystemState.ERROR);
			} else {
				if (!statusValues.contains(NodeMetadata.Status.TERMINATED)
						&& !statusValues
								.contains(NodeMetadata.Status.UNRECOGNIZED)) {
					if (!statusValues.contains(NodeMetadata.Status.PENDING)) {
						if (!statusValues
								.contains(NodeMetadata.Status.SUSPENDED)) {
							if (statusValues
									.contains(NodeMetadata.Status.RUNNING)) {
								this.systemModel.systemStates.put(this.cloud,
										SystemState.RUNNING);
							} else {
								this.systemModel.systemStates.put(this.cloud,
										SystemState.NONEXISTENT);
							}
						} else {
							if (!statusValues
									.contains(NodeMetadata.Status.RUNNING)) {
								this.systemModel.systemStates.put(this.cloud,
										SystemState.STOPPED);
							} else {
								this.systemModel.systemStates.put(this.cloud,
										SystemState.PENDING);
							}
						}
					} else {
						this.systemModel.systemStates.put(this.cloud,
								SystemState.PENDING);
					}
				} else {
					this.systemModel.systemStates.put(this.cloud,
							SystemState.NONEXISTENT);
				}
			}
			System.out.printf("Cloud info: state of cloud %s is %s!\n",
					this.cloud.getName(),
					this.systemModel.systemStates.get(this.cloud));
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			client.getContext().close();
		} catch (Exception e) {
		}
	}
}
