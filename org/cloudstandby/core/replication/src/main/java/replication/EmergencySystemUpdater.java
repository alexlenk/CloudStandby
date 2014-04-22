package replication;

import java.net.URI;

import model.Cloud;
import model.CloudStandby;
import replication.Replication.SystemModel;
import deployment.Deployer;

public class EmergencySystemUpdater extends Thread {
	private SystemModel systemModel;
	private CloudStandby cloudStandby;
	private Cloud cloud;
	private URI modelUri;
	private boolean paused;
	private boolean terminated;
	private int updateInterval;

	public EmergencySystemUpdater(SystemModel systemModel, URI modelUri,
			Cloud cloud, int updateInterval) {
		this.systemModel = systemModel;
		this.modelUri = modelUri;
		this.cloud = cloud;
		this.paused = false;
		this.terminated = false;
		this.updateInterval = updateInterval * 1000;
	}

	public void terminate() {
		this.terminated = true;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public boolean getPaused() {
		return this.paused;
	}

	private boolean startEmergencySystem() {
		Deployer deployer = new Deployer();
		deployer.loadModel(this.modelUri);
		return deployer.startDeployment(1);
	}

	private boolean stopEmergencySystem() {
		Deployer deployer = new Deployer();
		deployer.loadModel(this.modelUri);
		return deployer.stopDeployment(1, false);
	}

	private boolean updateEmergencySystem() {
		return true;
	}

	@Override
	public void run() {
		System.out.println("Updater: started");
		while (!terminated) {
			while (!paused) {
				this.systemModel.emergencySystemUpdateRunning = true;
				System.out
						.println("Updater: not paused -> Update emergency system");
				//Non-emergency mode
				boolean success = false;
				if (startEmergencySystem()) {
					if (updateEmergencySystem()) {
						if (stopEmergencySystem()) {
							success = true;
						}
					}
				}
				try {
					Thread.sleep(updateInterval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while (paused) {
				//Emergency mode
				this.systemModel.emergencySystemUpdateRunning = false;
				System.out.println("Updater: paused -> start emergency mode");
				if (!systemModel.systemStates.get(this.cloud).equals(
						SystemState.RUNNING)) {
					startEmergencySystem();
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Updater: finished");
	}
}
