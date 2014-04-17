/**
 */
package model.impl;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://model/1.0"); 
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.CLOUD_STANDBY: return createCloudStandby();
			case ModelPackage.COMPONENT: return createComponent();
			case ModelPackage.FEDERATED_INSTANCE: return createFederatedInstance();
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE: return createFederatedVirtualMachine();
			case ModelPackage.STANDARD_IMAGE: return createStandardImage();
			case ModelPackage.FEDERATED_IMAGE: return createFederatedImage();
			case ModelPackage.CLOUD: return createCloud();
			case ModelPackage.VIRTUAL_MACHINE: return createVirtualMachine();
			case ModelPackage.DISTRIBUTED_SYSTEM: return createDistributedSystem();
			case ModelPackage.ROLE: return createRole();
			case ModelPackage.BASH_SCRIPT: return createBashScript();
			case ModelPackage.SCRIPT_COLLECTION: return createScriptCollection();
			case ModelPackage.BASH_SCRIPT_COLLECTION: return createBashScriptCollection();
			case ModelPackage.ATTRIBUTE: return createAttribute();
			case ModelPackage.FEDERATION: return createFederation();
			case ModelPackage.INFRASTRUCTURE: return createInfrastructure();
			case ModelPackage.INSTALLATION: return createInstallation();
			case ModelPackage.TEMPLATE_FILE: return createTemplateFile();
			case ModelPackage.INSTANCE: return createInstance();
			case ModelPackage.CONFIGURED_IMAGE: return createConfiguredImage();
			case ModelPackage.TEMPLATE_DIR: return createTemplateDir();
			case ModelPackage.RSYNC_JOB: return createRsyncJob();
			case ModelPackage.CLOUD_STANDBY_REPLICATION: return createCloudStandbyReplication();
			case ModelPackage.ADDITIONAL_DRIVE: return createAdditionalDrive();
			case ModelPackage.BASH_JOB: return createBashJob();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.PROVIDER_ID:
				return createProviderIdFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.PROVIDER_ID:
				return convertProviderIdToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudStandby createCloudStandby() {
		CloudStandbyImpl cloudStandby = new CloudStandbyImpl();
		return cloudStandby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedInstance createFederatedInstance() {
		FederatedInstanceImpl federatedInstance = new FederatedInstanceImpl();
		return federatedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedVirtualMachine createFederatedVirtualMachine() {
		FederatedVirtualMachineImpl federatedVirtualMachine = new FederatedVirtualMachineImpl();
		return federatedVirtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardImage createStandardImage() {
		StandardImageImpl standardImage = new StandardImageImpl();
		return standardImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedImage createFederatedImage() {
		FederatedImageImpl federatedImage = new FederatedImageImpl();
		return federatedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine createVirtualMachine() {
		VirtualMachineImpl virtualMachine = new VirtualMachineImpl();
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributedSystem createDistributedSystem() {
		DistributedSystemImpl distributedSystem = new DistributedSystemImpl();
		return distributedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BashScript createBashScript() {
		BashScriptImpl bashScript = new BashScriptImpl();
		return bashScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptCollection createScriptCollection() {
		ScriptCollectionImpl scriptCollection = new ScriptCollectionImpl();
		return scriptCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BashScriptCollection createBashScriptCollection() {
		BashScriptCollectionImpl bashScriptCollection = new BashScriptCollectionImpl();
		return bashScriptCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Federation createFederation() {
		FederationImpl federation = new FederationImpl();
		return federation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Installation createInstallation() {
		InstallationImpl installation = new InstallationImpl();
		return installation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFile createTemplateFile() {
		TemplateFileImpl templateFile = new TemplateFileImpl();
		return templateFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguredImage createConfiguredImage() {
		ConfiguredImageImpl configuredImage = new ConfiguredImageImpl();
		return configuredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDir createTemplateDir() {
		TemplateDirImpl templateDir = new TemplateDirImpl();
		return templateDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsyncJob createRsyncJob() {
		RsyncJobImpl rsyncJob = new RsyncJobImpl();
		return rsyncJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudStandbyReplication createCloudStandbyReplication() {
		CloudStandbyReplicationImpl cloudStandbyReplication = new CloudStandbyReplicationImpl();
		return cloudStandbyReplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalDrive createAdditionalDrive() {
		AdditionalDriveImpl additionalDrive = new AdditionalDriveImpl();
		return additionalDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BashJob createBashJob() {
		BashJobImpl bashJob = new BashJobImpl();
		return bashJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderId createProviderIdFromString(EDataType eDataType, String initialValue) {
		ProviderId result = ProviderId.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderIdToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
