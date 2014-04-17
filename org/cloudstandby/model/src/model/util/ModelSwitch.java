/**
 */
package model.util;

import java.util.List;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.CLOUD_STANDBY: {
				CloudStandby cloudStandby = (CloudStandby)theEObject;
				Object result = caseCloudStandby(cloudStandby);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				Object result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEDERATED_INSTANCE: {
				FederatedInstance federatedInstance = (FederatedInstance)theEObject;
				Object result = caseFederatedInstance(federatedInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE: {
				FederatedVirtualMachine federatedVirtualMachine = (FederatedVirtualMachine)theEObject;
				Object result = caseFederatedVirtualMachine(federatedVirtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTALLATION_TASK: {
				InstallationTask installationTask = (InstallationTask)theEObject;
				Object result = caseInstallationTask(installationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STANDARD_IMAGE: {
				StandardImage standardImage = (StandardImage)theEObject;
				Object result = caseStandardImage(standardImage);
				if (result == null) result = caseImage(standardImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMAGE: {
				Image image = (Image)theEObject;
				Object result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEDERATED_IMAGE: {
				FederatedImage federatedImage = (FederatedImage)theEObject;
				Object result = caseFederatedImage(federatedImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CLOUD: {
				Cloud cloud = (Cloud)theEObject;
				Object result = caseCloud(cloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VIRTUAL_MACHINE: {
				VirtualMachine virtualMachine = (VirtualMachine)theEObject;
				Object result = caseVirtualMachine(virtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISTRIBUTED_SYSTEM: {
				DistributedSystem distributedSystem = (DistributedSystem)theEObject;
				Object result = caseDistributedSystem(distributedSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROLE: {
				Role role = (Role)theEObject;
				Object result = caseRole(role);
				if (result == null) result = caseInstallationTask(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTALLATION_SCRIPT: {
				InstallationScript installationScript = (InstallationScript)theEObject;
				Object result = caseInstallationScript(installationScript);
				if (result == null) result = caseInstallationTask(installationScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BASH_SCRIPT: {
				BashScript bashScript = (BashScript)theEObject;
				Object result = caseBashScript(bashScript);
				if (result == null) result = caseInstallationScript(bashScript);
				if (result == null) result = caseInstallationTask(bashScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCRIPT_COLLECTION: {
				ScriptCollection scriptCollection = (ScriptCollection)theEObject;
				Object result = caseScriptCollection(scriptCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BASH_SCRIPT_COLLECTION: {
				BashScriptCollection bashScriptCollection = (BashScriptCollection)theEObject;
				Object result = caseBashScriptCollection(bashScriptCollection);
				if (result == null) result = caseScriptCollection(bashScriptCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				Object result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEDERATION: {
				Federation federation = (Federation)theEObject;
				Object result = caseFederation(federation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INFRASTRUCTURE: {
				Infrastructure infrastructure = (Infrastructure)theEObject;
				Object result = caseInfrastructure(infrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTALLATION: {
				Installation installation = (Installation)theEObject;
				Object result = caseInstallation(installation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEMPLATE_FILE: {
				TemplateFile templateFile = (TemplateFile)theEObject;
				Object result = caseTemplateFile(templateFile);
				if (result == null) result = caseTemplateResource(templateFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				Object result = caseInstance(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONFIGURED_IMAGE: {
				ConfiguredImage configuredImage = (ConfiguredImage)theEObject;
				Object result = caseConfiguredImage(configuredImage);
				if (result == null) result = caseImage(configuredImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEMPLATE_RESOURCE: {
				TemplateResource templateResource = (TemplateResource)theEObject;
				Object result = caseTemplateResource(templateResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEMPLATE_DIR: {
				TemplateDir templateDir = (TemplateDir)theEObject;
				Object result = caseTemplateDir(templateDir);
				if (result == null) result = caseTemplateResource(templateDir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BACKUP_JOB: {
				BackupJob backupJob = (BackupJob)theEObject;
				Object result = caseBackupJob(backupJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RSYNC_JOB: {
				RsyncJob rsyncJob = (RsyncJob)theEObject;
				Object result = caseRsyncJob(rsyncJob);
				if (result == null) result = caseBackupJob(rsyncJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CLOUD_STANDBY_REPLICATION: {
				CloudStandbyReplication cloudStandbyReplication = (CloudStandbyReplication)theEObject;
				Object result = caseCloudStandbyReplication(cloudStandbyReplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ADDITIONAL_DRIVE: {
				AdditionalDrive additionalDrive = (AdditionalDrive)theEObject;
				Object result = caseAdditionalDrive(additionalDrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BASH_JOB: {
				BashJob bashJob = (BashJob)theEObject;
				Object result = caseBashJob(bashJob);
				if (result == null) result = caseBackupJob(bashJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Standby</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Standby</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCloudStandby(CloudStandby object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federated Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federated Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederatedInstance(FederatedInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federated Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federated Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederatedVirtualMachine(FederatedVirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstallationTask(InstallationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStandardImage(StandardImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federated Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federated Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederatedImage(FederatedImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCloud(Cloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVirtualMachine(VirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distributed System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distributed System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDistributedSystem(DistributedSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstallationScript(InstallationScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bash Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bash Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBashScript(BashScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScriptCollection(ScriptCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bash Script Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bash Script Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBashScriptCollection(BashScriptCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederation(Federation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInfrastructure(Infrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstallation(Installation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateFile(TemplateFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configured Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configured Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfiguredImage(ConfiguredImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateResource(TemplateResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Dir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Dir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateDir(TemplateDir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backup Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backup Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBackupJob(BackupJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rsync Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rsync Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRsyncJob(RsyncJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Standby Replication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Standby Replication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCloudStandbyReplication(CloudStandbyReplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Drive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Drive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdditionalDrive(AdditionalDrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bash Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bash Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBashJob(BashJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
