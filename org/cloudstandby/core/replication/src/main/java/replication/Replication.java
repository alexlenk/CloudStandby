package replication;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import model.Cloud;
import model.CloudStandby;
import model.impl.ModelPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import deployment.Deployer;

public class Replication {

	private int updateInterval;
	private int supervisionInterval;
	private boolean emergencyMode = false;
	private CloudStandby cloudStandby;
	private SystemModel systemModel = new SystemModel();
	private java.net.URI modelUri;
	private EmergencySystemUpdater emergencySystemUpdater;

	public static class SystemModel {
		public Map<Cloud, SystemState> systemStates = Collections
				.synchronizedMap(new HashMap<Cloud, SystemState>());
		public boolean emergencySystemUpdateRunning = false;
	}

	public static void main(String[] args) {
		Replication r = new Replication();
		java.net.URI model;
		try {
			model = new java.net.URI("ReplicationTest_20140324.model");
			r.startReplicationController(1200, 90, model);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public void startReplicationController(int supervisionInterval,
			int updateInterval, java.net.URI modelUri) {
		this.supervisionInterval = supervisionInterval;
		this.updateInterval = updateInterval;
		loadModel(modelUri);
		Cloud primary = (Cloud) this.cloudStandby.getDistributedSystem()
				.getCloud().get(0);
		Cloud emergency = (Cloud) this.cloudStandby.getDistributedSystem()
				.getCloud().get(1);
		this.startPrimarySystem();
		this.supervisePrimaryCloud();
		this.superviseReplicaCloud();
		systemModel.systemStates.put(primary, SystemState.PENDING);
		systemModel.systemStates.put(emergency, SystemState.PENDING);
		updateEmergencySystem();
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) / 1000 < this.supervisionInterval) {
			//Wait for primary system to run
			System.out
					.printf("Main: remaining secs=%s, emergencyMode=%s\n",
							(this.supervisionInterval - (System
									.currentTimeMillis() - start) / 1000),
							this.emergencyMode);
			while (systemModel.systemStates.get(primary).equals(
					SystemState.PENDING)) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (emergencyMode
					&& systemModel.systemStates.get(primary).equals(
							SystemState.RUNNING)) {
				boolean emergencyModeStopped = this.stopEmergencyMode();
				loadModel(modelUri);
			}
			if (!emergencyMode
					&& !systemModel.systemStates.get(primary).equals(
							SystemState.RUNNING)
					&& !systemModel.systemStates.get(primary).equals(
							SystemState.PENDING)) {
				boolean emergencyModeStarted = this.startEmergencyMode();
				loadModel(modelUri);
			}
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public boolean loadModel(java.net.URI uri) {
		try {
			this.modelUri = uri;
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
			System.out
					.println("Main: Model \"" + uri.toString() + "\" loaded.");
			return true;
		} catch (Exception e) {
			System.out.println("Main: Model file \"" + uri.toString()
					+ "\" couldn't be loaded.");
			return false;
		}
	}

	public void supervisePrimaryCloud() {
		CloudSupervisor primarySupervisor = new CloudSupervisor();
		primarySupervisor.superviseCloud(systemModel, this.cloudStandby,
				(Cloud) cloudStandby.getDistributedSystem().getCloud().get(0),
				supervisionInterval);
		primarySupervisor.setDaemon(false);
		primarySupervisor.start();
	}

	public void superviseReplicaCloud() {
		CloudSupervisor secondarySupervisor = new CloudSupervisor();
		secondarySupervisor.superviseCloud(systemModel, this.cloudStandby,
				(Cloud) cloudStandby.getDistributedSystem().getCloud().get(1),
				supervisionInterval);
		secondarySupervisor.setDaemon(false);
		secondarySupervisor.start();
	}

	public boolean startPrimarySystem() {
		System.out.println("Main: startPrimarySystem()");
		Deployer deployer = new Deployer();
		deployer.loadModel(this.modelUri);
		return deployer.startDeployment(0);
	}

	public boolean startEmergencySystem() {
		System.out.println("Main: startEmergencySystem()");
		Deployer deployer = new Deployer();
		deployer.loadModel(this.modelUri);
		return deployer.startDeployment(1);
	}

	public boolean stopPrimarySystem() {
		System.out.println("Main: stopPrimarySystem()");
		Deployer deployer = new Deployer();
		deployer.loadModel(this.modelUri);
		return deployer.stopDeployment(0, false);
	}

	public boolean startEmergencyMode() {
		System.out.println("Main: startEmergencyMode()");
		emergencyMode = true;
		this.emergencySystemUpdater.setPaused(true);
		while (this.systemModel.emergencySystemUpdateRunning) {
			System.out.println("Main: waiting for update thread to pause");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return startPrimarySystem();
	}

	public boolean stopEmergencyMode() {
		System.out.println("Main: stopEmergencyMode()");
		emergencyMode = false;
		this.emergencySystemUpdater.setPaused(false);
		while (!this.systemModel.emergencySystemUpdateRunning) {
			System.out.println("Main: waiting for update thread to resume");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public boolean updateEmergencySystem() {
		System.out.println("Main: updateEmergencySystem()");
		try {
			if (this.emergencySystemUpdater == null
					|| !this.emergencySystemUpdater.isAlive()) {
				this.emergencySystemUpdater = new EmergencySystemUpdater(
						systemModel, this.modelUri, (Cloud) cloudStandby
								.getDistributedSystem().getCloud().get(1),
						this.updateInterval);
				this.emergencySystemUpdater.setPaused(false);
				this.emergencySystemUpdater.setDaemon(false);
				this.emergencySystemUpdater.start();
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
