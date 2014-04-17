package deployment;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.jclouds.scriptbuilder.domain.Statements.exec;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;

import model.AdditionalDrive;
import model.Attribute;
import model.BashScript;
import model.Cloud;
import model.Component;
import model.ConfiguredImage;
import model.DistributedSystem;
import model.FederatedInstance;
import model.Image;
import model.InstallationTask;
import model.Instance;
import model.ModelFactory;
import model.Role;
import model.ScriptCollection;
import model.StandardImage;
import model.VirtualMachine;
import model.impl.ModelFactoryImpl;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.RunNodesException;
import org.jclouds.compute.config.ComputeServiceProperties;
import org.jclouds.compute.domain.ExecResponse;
import org.jclouds.compute.domain.Hardware;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.NodeMetadataBuilder;
import org.jclouds.compute.domain.Template;
import org.jclouds.compute.options.RunScriptOptions;
import org.jclouds.compute.options.TemplateOptions;
import org.jclouds.domain.LoginCredentials;
import org.jclouds.ec2.compute.options.EC2TemplateOptions;
import org.jclouds.enterprise.config.EnterpriseConfigurationModule;
import org.jclouds.io.Payload;
import org.jclouds.io.Payloads;
import org.jclouds.logging.log4j.config.Log4JLoggingModule;
import org.jclouds.scriptbuilder.ScriptBuilder;
import org.jclouds.scriptbuilder.domain.OsFamily;
import org.jclouds.scriptbuilder.domain.Statement;
import org.jclouds.scriptbuilder.statements.login.AdminAccess;
import org.jclouds.ssh.SshClient;
import org.jclouds.sshj.config.SshjSshClientModule;

import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.inject.Module;

public class DeploymentThread implements Callable<NodeMetadata> {

	private DistributedSystem distributedSystem;
	private FederatedInstance federatedInstance;
	private Cloud cloud;
	private NodeMetadata runningNode;
	private ComputeService client;
	private long startuptime = 0;

	public DeploymentThread(DistributedSystem distributedSystem) {
		this.distributedSystem = distributedSystem;
		this.runningNode = null;
	}

	public NodeMetadata call() throws Exception {
		if (distributedSystem == null || cloud == null) {
			throw new Exception("DeploymentThread not initialized");
		} else {
			boolean deployed = deployInstance();
			//			if (!deployed) {
			//				System.out.println("First deployment failed for " + this.federatedInstance.getHostname()
			//						+ "! Trying again...");
			//				deployed = deployInstance();
			//			}
			if (deployed) {
				boolean installed = installSoftware();
				if (!installed) {
					throw new Exception(
							"DeploymentThread couldn't install software on FederatedInstance "
									+ this.federatedInstance.getHostname());
				}
			} else {
				throw new Exception(
						"DeploymentThread couldn't deploy FederatedInstance "
								+ this.federatedInstance.getHostname());
			}
			try {
				this.client.getContext().close();
			} catch (Exception e) {
			}
		}
		return runningNode;
	}

	public void init(FederatedInstance federatedInstance, Cloud cloud) {
		Component component = (Component) federatedInstance.eContainer();
		if (this.distributedSystem.getComponent().contains(component)
				&& this.distributedSystem.getCloud().contains(cloud)) {
			this.federatedInstance = federatedInstance;
			this.cloud = cloud;
		} else {
			System.out.println("Initialization with component "
					+ component.getName() + " and cloud " + cloud.getName()
					+ " failed.");
		}
	}

	/**
	 * Steps: 1) open provider connection 2) check if instance exists as ebs, if
	 * yes go to 5. 3) find virtual machine in model 4) find image and
	 * additional drives in model 5) start/restart instance 6) run
	 * installSoftware()
	 * 
	 * @return
	 */
	private boolean deployInstance() {
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
		this.client = computeServiceContext.getComputeService();

		//--------- CHECK STATUS OF INSTANCE -------------
		int numInstancesRunning = this.federatedInstance.getInstance().size();
		EList<Instance> instances = this.federatedInstance.getInstance();
		Instance existingInstance = null;
		for (Instance instance : instances) {
			if (instance.getCloud().getName().equals(this.cloud.getName())) {
				NodeMetadata currentInstance = client.getNodeMetadata(instance
						.getId());
				if (currentInstance != null
						&& currentInstance.getStatus().equals(
								NodeMetadata.Status.SUSPENDED)
						|| currentInstance.getStatus().equals(
								NodeMetadata.Status.RUNNING)) {
					existingInstance = instance;
				}
			}
		}

		//--------- FIND IMAGE AND ADDITIONAL DRIVES -------------
		if (existingInstance == null) {
			Component component = (Component) federatedInstance.eContainer();

			// Virtual Machine
			Hardware finalVM = null;
			Set<? extends Hardware> vms = client.listHardwareProfiles();
			Iterator<VirtualMachine> vmIterator = (Iterator<VirtualMachine>) component
					.getFederatedVirtualMachine().getVirtualMachine()
					.iterator();
			boolean vmFound = false;
			VirtualMachine vmCandidate = null;
			while (vmIterator.hasNext() && !vmFound) {
				vmCandidate = vmIterator.next();
				Cloud vmCloud = (Cloud) vmCandidate.eContainer();
				if (vmCloud.getName().equals(this.cloud.getName())) {
					String vmId = vmCandidate.getId();
					for (Hardware vm : vms) {
						if (vm.getProviderId().equals(vmId)) {
							finalVM = vm;
							vmFound = true;
						}
					}

				}
			}

			// Image
			String imageId = null;
			LinkedList<AdditionalDrive> additionalDrives = new LinkedList<AdditionalDrive>();
			EList<Image> imageCandidates = component.getFederatedImage()
					.getImage();
			for (Image imageCandidate : imageCandidates) {
				if (imageCandidate instanceof ConfiguredImage) {
					ConfiguredImage candidate = (ConfiguredImage) imageCandidate;
					StandardImage standardImage = (StandardImage) candidate
							.eContainer();
					Cloud imageCloud = (Cloud) standardImage.eContainer();
					if (imageCloud.getName().equals(this.cloud.getName())) {
						imageId = ((StandardImage) candidate.eContainer())
								.getId();
						// Additional Drives
						for (Object drive : candidate.getAdditionalDrive()) {
							additionalDrives.add((AdditionalDrive) drive);
						}
						break;
					}
				} else {
					StandardImage candidate = (StandardImage) imageCandidate;
					Cloud imageCloud = (Cloud) candidate.eContainer();
					if (imageCloud.getName().equals(this.cloud.getName())) {
						imageId = candidate.getId();
						break;
					}
				}
			}

			//--------- START INSTANCE -------------
			// Define admin user
			Statement bootInstructions = AdminAccess
					.builder()
					.adminUsername("cloudstandby")
					.adminFullName("cloudstandby")
					.adminPrivateKey(
							new File("resources/replicationKeyPrivate"))
					.adminPublicKey(new File("resources/replicationKeyPublic"))
					.authorizeAdminPublicKey(true).installAdminPrivateKey(true)
					.build();
			// Define template options like open ports or public/private keys
			TemplateOptions templateOptions = new TemplateOptions();
			templateOptions.inboundPorts(new int[] { 22, 80, 873, 8080 })
					.runScript(bootInstructions);
			Template template = client.templateBuilder()
					.locationId(cloud.getLocation()).fromHardware(finalVM)
					.imageId(cloud.getLocation() + "/" + imageId)
					.options(templateOptions).build();
			for (AdditionalDrive drive : additionalDrives) {
				template.getOptions()
						.as(EC2TemplateOptions.class)
						.mapEBSSnapshotToDeviceName(
								"/dev/sd" + drive.getDevice(),
								drive.getImageId(), drive.getSize(), true);
			}
			Set<? extends NodeMetadata> nodes;
			try {
				long start = System.currentTimeMillis();
				nodes = client.createNodesInGroup(
						this.federatedInstance.getHostname(), 1, template);
				this.startuptime = (System.currentTimeMillis() - start) / 1000;
				System.out.println(this.federatedInstance.getHostname()
						+ ": <<" + "Node is running");
				this.runningNode = nodes.iterator().next();
				Instance instanceRuntime;
				ModelFactory modelFactory = new ModelFactoryImpl();
				// TODO: Delete old runtimes if the model file was used before
				instanceRuntime = modelFactory.createInstance();
				instanceRuntime.setDns(runningNode.getPublicAddresses()
						.iterator().next());
				instanceRuntime.setId(runningNode.getId());
				instanceRuntime.setIp(runningNode.getPublicAddresses()
						.iterator().next());
				instanceRuntime.setPrivateIp(runningNode.getPrivateAddresses()
						.iterator().next());
				instanceRuntime.setCloud(this.cloud);
				this.federatedInstance.getInstance().add(instanceRuntime);
			} catch (RunNodesException e) {
				e.printStackTrace();
			}

		} else {
			//--------- RESTART INSTANCE -------------
			try {
				long start = System.currentTimeMillis();
				client.resumeNode(existingInstance.getId());
				this.startuptime = (System.currentTimeMillis() - start) / 1000;
				this.runningNode = client.getNodeMetadata(existingInstance
						.getId());
				if (runningNode.getPublicAddresses().iterator().hasNext()
						&& runningNode.getPrivateAddresses().iterator()
								.hasNext()) {
					String ip = runningNode.getPublicAddresses().iterator()
							.next();
					String private_ip = runningNode.getPrivateAddresses()
							.iterator().next();
					existingInstance.setDns(ip);
					existingInstance.setIp(ip);
					existingInstance.setPrivateIp(runningNode
							.getPrivateAddresses().iterator().next());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (this.runningNode != null);
	}

	private boolean installSoftware() {
		//Add informations about other running instances
		LinkedList<String> startupScripts = new LinkedList<String>();
		startupScripts.addAll(depthFirstSearch(this.federatedInstance));
		startupScripts
				.addFirst("set -x; let TASK_ID=1; "
						+ "write_result () { STARTSEC=$(date -d\"$DATE_START\" +%s); ENDSEC=$(date -d\"$DATE_STOP\" +%s); START=$(date -d\"$DATE_START\" +%d\\-%m\\-%Y\\ %H:%M:%S); END=$(date -d\"$DATE_STOP\" +%d\\-%m\\-%Y\\ %H:%M:%S); PRINT_TASK_ID=`printf %03d ${a%.*} $TASK_ID`;"
						+ " echo \"$GROUP_ID;$NODE_ID;$PRINT_TASK_ID - $1;$(($ENDSEC - $STARTSEC));$START;$END;$RUN_ID;"
						+ "\" >> ~/result.csv" + ";((TASK_ID++));}");
		startupScripts
				.addFirst("apt-get install -y ntp; echo \"Europe/Berlin\" > /etc/timezone; dpkg-reconfigure -f noninteractive tzdata;");
		startupScripts
				.addFirst("echo 'StrictHostKeyChecking no' >> /etc/ssh/ssh_config");
		startupScripts
				.addFirst("sudo sed -i 's/PermitEmptyPasswords no/PermitEmptyPasswords yes/' /etc/ssh/sshd_config");
		startupScripts.addFirst("sudo rm ~/result.csv");
		try {
			startupScripts
					.addFirst("mkdir -p /root/.ssh/; touch /root/.ssh/id_rsa; echo '"
							+ FileUtils.readFileToString(new File(
									"resources/replicationKeyPrivate"))
							+ "' >> /root/.ssh/id_rsa; chmod 600 /root/.ssh/id_rsa");

			startupScripts.addFirst("NODE_ID=\"" + runningNode.getId() + "\"");
			startupScripts.addFirst("GROUP_ID=\"" + runningNode.getGroup()
					+ "\"");
			if (runningNode.getPublicAddresses().iterator().hasNext()
					&& runningNode.getPrivateAddresses().iterator().hasNext()) {
				String ip = runningNode.getPublicAddresses().iterator().next();
				String private_ip = runningNode.getPrivateAddresses()
						.iterator().next();
				startupScripts.addFirst("THIS_IP=\""
						+ runningNode.getPublicAddresses().iterator().next()
						+ "\"");
				startupScripts.addFirst("THIS_PRIVATEIP=\""
						+ runningNode.getPrivateAddresses().iterator().next()
						+ "\"");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// Write a bash script from model with the help of jclouds' ScriptBuilder
		ScriptBuilder builder = new ScriptBuilder();
		Iterator<String> scriptIterator = startupScripts.iterator();
		while (scriptIterator.hasNext()) {
			builder.addStatement(exec(scriptIterator.next()));
		}
		String bashScript = builder.render(OsFamily.UNIX);
		//Create a file "runscript.sh" at the host and write the contents
		String user = "cloudstandby";
		String privateKey;
		SshClient ssh = null;
		try {
			privateKey = FileUtils.readFileToString(new File(
					"resources/replicationKeyPrivate"));
			LoginCredentials cred = LoginCredentials.builder().user(user)
					.privateKey(privateKey).build();
			runningNode = NodeMetadataBuilder.fromNodeMetadata(runningNode)
					.credentials(cred).build();
			ssh = client.getContext().utils().sshForNode().apply(runningNode);
			ListenableFuture<ExecResponse> futureResponse = null;
			ssh.connect();
			ssh.put("runscript.sh", Payloads.newPayload(bashScript));
			// Execute script on node
			futureResponse = client.submitScriptOnNode(runningNode.getId(),
					exec("bash ~/runscript.sh"),
					RunScriptOptions.Builder.overrideLoginCredentials(cred));
			ExecResponse response = futureResponse.get();
			FileUtils.writeStringToFile(new File("log/sshOutput_"
					+ this.runningNode.getName() + ".txt"),
					"----------\nInstanz: " + this.runningNode.getName()
							+ "\n----------\n" + response.getOutput(), true);
			FileUtils.writeStringToFile(new File("log/sshError_"
					+ this.runningNode.getName() + ".txt"),
					"----------\n" + this.runningNode.getName()
							+ "\n----------\n" + response.getError(), true);
			System.out.println(this.federatedInstance.getHostname() + ": <<"
					+ " downloading result.csv");
			Payload p = ssh.get("result.csv");
			FileOutputStream out = new FileOutputStream(new File("Result.csv"),
					true);
			p.writeTo(out);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Trying donwload again!");
			System.out.println(this.federatedInstance.getHostname() + ": <<"
					+ " downloading result.csv");
			try {
				privateKey = FileUtils.readFileToString(new File(
						"resources/replicationKeyPrivate"));
				LoginCredentials cred = LoginCredentials.builder().user(user)
						.privateKey(privateKey).build();
				runningNode = NodeMetadataBuilder.fromNodeMetadata(runningNode)
						.credentials(cred).build();
				ssh = client.getContext().utils().sshForNode()
						.apply(runningNode);
				ListenableFuture<ExecResponse> futureResponse = null;
				ssh.connect();
				Payload p = ssh.get("result.csv");
				FileOutputStream out;
				out = new FileOutputStream(new File("Result.csv"), true);
				p.writeTo(out);
				out.flush();
				out.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("No result.csv found!");
		} finally {
			if (ssh != null)
				ssh.disconnect();
		}
		return true;
	}

	/**
	 * Depth-first search through installation tasks of a prepared image and/or
	 * components
	 * 
	 * @param image
	 *            - image that has to be prepared with installation tasks
	 * @return linked list of sorted commands with installation attributes as
	 *         the first elements
	 */
	private List<String> depthFirstSearch(FederatedInstance fedInstance) {
		Component component = (Component) fedInstance.eContainer();
		ConfiguredImage image = null;
		for (Image imageCandidate : (EList<Image>) component
				.getFederatedImage().getImage()) {
			if (imageCandidate instanceof ConfiguredImage) {
				ConfiguredImage candidate = (ConfiguredImage) imageCandidate;
				StandardImage standardImage = (StandardImage) candidate
						.eContainer();
				Cloud imageCloud = (Cloud) standardImage.eContainer();
				if (imageCloud.getName().equals(this.cloud.getName())) {
					image = candidate;
				}
			}
		}
		LinkedList<String> commands = new LinkedList<String>();
		LinkedList<BashScript> taskList = new LinkedList<BashScript>();
		LinkedList<InstallationTask> tasks = new LinkedList<InstallationTask>();
		if (image != null) {
			tasks.addAll(image.getInstallationTask());
		}
		if (component != null) {
			tasks.addAll(component.getInstallationTask());
		}
		Iterator<InstallationTask> i = tasks.iterator();
		InstallationTask task;
		// recursive depth-first search with InstallationScriptBash-objects as leafes and InstallationRole as nodes
		while (i.hasNext()) {
			task = i.next();
			if (task instanceof BashScript) {
				BashScript iScriptBash = (BashScript) task;
				taskList.add(iScriptBash);
			} else if (task instanceof Role) {
				Role role = (Role) task;
				taskList.addAll(depthFirstRecursive(role));
			}
		}
		// Identify and collect ScriptCollection-objects
		LinkedList<ScriptCollection> scriptCollection = new LinkedList<ScriptCollection>();
		ScriptCollection collection = null;
		commands.addFirst("echo \"$GROUP_ID;$NODE_ID;000 - instance startup;"
				+ this.startuptime + ";0;0;$RUN_ID;\" >> ~/result.csv");
		for (BashScript script : taskList) {
			commands.add("DATE_START=$(date);");
			// allow multi-row code
			String[] splitResult = script.getCode().split(
					System.getProperty("line.separator"));
			for (String s : splitResult) {
				if (s != null) {
					commands.add(s);
				}
			}
			commands.add("DATE_STOP=$(date); write_result \""
					+ script.getName() + "\" \"$DATE_START\" \"$DATE_STOP\";");
			collection = (ScriptCollection) script.eContainer();
			if (!scriptCollection.contains(collection)) {
				scriptCollection.add(collection);
			}
		}
		// collect the installation attributes of the InstallationScriptCollectionBash-objects
		EList<Attribute> attributes = null;
		for (ScriptCollection coll : scriptCollection) {
			attributes = (EList<Attribute>) coll.getAttribute();
			for (Attribute attribute : attributes) {
				commands.addFirst(attribute.getName() + "=\""
						+ attribute.getValue() + "\"");
			}
		}
		return commands;
	}

	/**
	 * Recursive depth-first search that starts from an installation role
	 * 
	 * @param role
	 *            - root role of a tree structure
	 * @return linked list of sorted InstallationScriptBash objects
	 */
	@SuppressWarnings("unchecked")
	private List<BashScript> depthFirstRecursive(Role role) {
		LinkedList<BashScript> taskList = new LinkedList<BashScript>();
		Iterator<InstallationTask> i = role.getInstallationTask().iterator();
		InstallationTask task;
		while (i.hasNext()) {
			task = i.next();
			if (task instanceof BashScript) {
				BashScript iScriptBash = (BashScript) task;
				taskList.add(iScriptBash);
			} else if (task instanceof Role) {
				Role subRole = (Role) task;
				taskList.addAll(depthFirstRecursive(subRole));
			}
		}
		return taskList;
	}
}
