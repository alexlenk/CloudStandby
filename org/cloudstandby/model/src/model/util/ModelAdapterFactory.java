/**
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch modelSwitch =
		new ModelSwitch() {
			public Object caseCloudStandby(CloudStandby object) {
				return createCloudStandbyAdapter();
			}
			public Object caseComponent(Component object) {
				return createComponentAdapter();
			}
			public Object caseFederatedInstance(FederatedInstance object) {
				return createFederatedInstanceAdapter();
			}
			public Object caseFederatedVirtualMachine(FederatedVirtualMachine object) {
				return createFederatedVirtualMachineAdapter();
			}
			public Object caseInstallationTask(InstallationTask object) {
				return createInstallationTaskAdapter();
			}
			public Object caseStandardImage(StandardImage object) {
				return createStandardImageAdapter();
			}
			public Object caseImage(Image object) {
				return createImageAdapter();
			}
			public Object caseFederatedImage(FederatedImage object) {
				return createFederatedImageAdapter();
			}
			public Object caseCloud(Cloud object) {
				return createCloudAdapter();
			}
			public Object caseVirtualMachine(VirtualMachine object) {
				return createVirtualMachineAdapter();
			}
			public Object caseDistributedSystem(DistributedSystem object) {
				return createDistributedSystemAdapter();
			}
			public Object caseRole(Role object) {
				return createRoleAdapter();
			}
			public Object caseInstallationScript(InstallationScript object) {
				return createInstallationScriptAdapter();
			}
			public Object caseBashScript(BashScript object) {
				return createBashScriptAdapter();
			}
			public Object caseScriptCollection(ScriptCollection object) {
				return createScriptCollectionAdapter();
			}
			public Object caseBashScriptCollection(BashScriptCollection object) {
				return createBashScriptCollectionAdapter();
			}
			public Object caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			public Object caseFederation(Federation object) {
				return createFederationAdapter();
			}
			public Object caseInfrastructure(Infrastructure object) {
				return createInfrastructureAdapter();
			}
			public Object caseInstallation(Installation object) {
				return createInstallationAdapter();
			}
			public Object caseTemplateFile(TemplateFile object) {
				return createTemplateFileAdapter();
			}
			public Object caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			public Object caseConfiguredImage(ConfiguredImage object) {
				return createConfiguredImageAdapter();
			}
			public Object caseTemplateResource(TemplateResource object) {
				return createTemplateResourceAdapter();
			}
			public Object caseTemplateDir(TemplateDir object) {
				return createTemplateDirAdapter();
			}
			public Object caseBackupJob(BackupJob object) {
				return createBackupJobAdapter();
			}
			public Object caseRsyncJob(RsyncJob object) {
				return createRsyncJobAdapter();
			}
			public Object caseCloudStandbyReplication(CloudStandbyReplication object) {
				return createCloudStandbyReplicationAdapter();
			}
			public Object caseAdditionalDrive(AdditionalDrive object) {
				return createAdditionalDriveAdapter();
			}
			public Object caseBashJob(BashJob object) {
				return createBashJobAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.CloudStandby <em>Cloud Standby</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CloudStandby
	 * @generated
	 */
	public Adapter createCloudStandbyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FederatedInstance <em>Federated Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FederatedInstance
	 * @generated
	 */
	public Adapter createFederatedInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FederatedVirtualMachine <em>Federated Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FederatedVirtualMachine
	 * @generated
	 */
	public Adapter createFederatedVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InstallationTask <em>Installation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InstallationTask
	 * @generated
	 */
	public Adapter createInstallationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StandardImage <em>Standard Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StandardImage
	 * @generated
	 */
	public Adapter createStandardImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FederatedImage <em>Federated Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FederatedImage
	 * @generated
	 */
	public Adapter createFederatedImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.VirtualMachine
	 * @generated
	 */
	public Adapter createVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DistributedSystem <em>Distributed System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DistributedSystem
	 * @generated
	 */
	public Adapter createDistributedSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InstallationScript <em>Installation Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InstallationScript
	 * @generated
	 */
	public Adapter createInstallationScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BashScript <em>Bash Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BashScript
	 * @generated
	 */
	public Adapter createBashScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ScriptCollection <em>Script Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ScriptCollection
	 * @generated
	 */
	public Adapter createScriptCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BashScriptCollection <em>Bash Script Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BashScriptCollection
	 * @generated
	 */
	public Adapter createBashScriptCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Federation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Federation
	 * @generated
	 */
	public Adapter createFederationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Installation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Installation
	 * @generated
	 */
	public Adapter createInstallationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TemplateFile <em>Template File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TemplateFile
	 * @generated
	 */
	public Adapter createTemplateFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ConfiguredImage <em>Configured Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ConfiguredImage
	 * @generated
	 */
	public Adapter createConfiguredImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TemplateResource <em>Template Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TemplateResource
	 * @generated
	 */
	public Adapter createTemplateResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TemplateDir <em>Template Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TemplateDir
	 * @generated
	 */
	public Adapter createTemplateDirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BackupJob <em>Backup Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BackupJob
	 * @generated
	 */
	public Adapter createBackupJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RsyncJob <em>Rsync Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RsyncJob
	 * @generated
	 */
	public Adapter createRsyncJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CloudStandbyReplication <em>Cloud Standby Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CloudStandbyReplication
	 * @generated
	 */
	public Adapter createCloudStandbyReplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AdditionalDrive <em>Additional Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AdditionalDrive
	 * @generated
	 */
	public Adapter createAdditionalDriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BashJob <em>Bash Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BashJob
	 * @generated
	 */
	public Adapter createBashJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
