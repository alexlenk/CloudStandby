/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.CloudStandbyImpl <em>Cloud Standby</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CloudStandbyImpl
	 * @see model.impl.ModelPackageImpl#getCloudStandby()
	 * @generated
	 */
	int CLOUD_STANDBY = 0;

	/**
	 * The feature id for the '<em><b>Distributed System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY__DISTRIBUTED_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY__INSTALLATION = 1;

	/**
	 * The feature id for the '<em><b>Infrastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY__INFRASTRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Federation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY__FEDERATION = 3;

	/**
	 * The number of structural features of the '<em>Cloud Standby</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComponentImpl
	 * @see model.impl.ModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Federated Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEDERATED_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Federated Virtual Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEDERATED_VIRTUAL_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Federated Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEDERATED_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRES = 4;

	/**
	 * The feature id for the '<em><b>Installation Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INSTALLATION_TASK = 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.FederatedInstanceImpl <em>Federated Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FederatedInstanceImpl
	 * @see model.impl.ModelPackageImpl#getFederatedInstance()
	 * @generated
	 */
	int FEDERATED_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_INSTANCE__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_INSTANCE__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Backup Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_INSTANCE__BACKUP_JOB = 2;

	/**
	 * The number of structural features of the '<em>Federated Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.FederatedVirtualMachineImpl <em>Federated Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FederatedVirtualMachineImpl
	 * @see model.impl.ModelPackageImpl#getFederatedVirtualMachine()
	 * @generated
	 */
	int FEDERATED_VIRTUAL_MACHINE = 3;

	/**
	 * The feature id for the '<em><b>Virtual Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_VIRTUAL_MACHINE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Federated Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_VIRTUAL_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.InstallationTaskImpl <em>Installation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstallationTaskImpl
	 * @see model.impl.ModelPackageImpl#getInstallationTask()
	 * @generated
	 */
	int INSTALLATION_TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_TASK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Installation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_TASK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ImageImpl
	 * @see model.impl.ModelPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.StandardImageImpl <em>Standard Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StandardImageImpl
	 * @see model.impl.ModelPackageImpl#getStandardImage()
	 * @generated
	 */
	int STANDARD_IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_IMAGE__NAME = IMAGE__NAME;

	/**
	 * The feature id for the '<em><b>Configured Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_IMAGE__CONFIGURED_IMAGE = IMAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_IMAGE__ID = IMAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_IMAGE__LOGIN = IMAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Json Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_IMAGE__JSON_DESCRIPTION = IMAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Standard Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_IMAGE_FEATURE_COUNT = IMAGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.impl.FederatedImageImpl <em>Federated Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FederatedImageImpl
	 * @see model.impl.ModelPackageImpl#getFederatedImage()
	 * @generated
	 */
	int FEDERATED_IMAGE = 7;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_IMAGE__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_IMAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Federated Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATED_IMAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CloudImpl
	 * @see model.impl.ModelPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 8;

	/**
	 * The feature id for the '<em><b>Standard Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__STANDARD_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Virtual Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__VIRTUAL_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PROVIDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PUBLIC_KEY = 5;

	/**
	 * The feature id for the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PRIVATE_KEY = 6;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.VirtualMachineImpl
	 * @see model.impl.ModelPackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ID = 1;

	/**
	 * The feature id for the '<em><b>Json Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__JSON_DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.DistributedSystemImpl <em>Distributed System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DistributedSystemImpl
	 * @see model.impl.ModelPackageImpl#getDistributedSystem()
	 * @generated
	 */
	int DISTRIBUTED_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_SYSTEM__CLOUD = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_SYSTEM__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Cloud Standby Replication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION = 2;

	/**
	 * The number of structural features of the '<em>Distributed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RoleImpl
	 * @see model.impl.ModelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = INSTALLATION_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Installation Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INSTALLATION_TASK = INSTALLATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INSTALLATION_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.InstallationScriptImpl <em>Installation Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstallationScriptImpl
	 * @see model.impl.ModelPackageImpl#getInstallationScript()
	 * @generated
	 */
	int INSTALLATION_SCRIPT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_SCRIPT__NAME = INSTALLATION_TASK__NAME;

	/**
	 * The number of structural features of the '<em>Installation Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_SCRIPT_FEATURE_COUNT = INSTALLATION_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BashScriptImpl <em>Bash Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BashScriptImpl
	 * @see model.impl.ModelPackageImpl#getBashScript()
	 * @generated
	 */
	int BASH_SCRIPT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT__NAME = INSTALLATION_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT__CODE = INSTALLATION_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bash Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT_FEATURE_COUNT = INSTALLATION_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.ScriptCollectionImpl <em>Script Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ScriptCollectionImpl
	 * @see model.impl.ModelPackageImpl#getScriptCollection()
	 * @generated
	 */
	int SCRIPT_COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_COLLECTION__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Template Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_COLLECTION__TEMPLATE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_COLLECTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Installation Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_COLLECTION__INSTALLATION_SCRIPT = 3;

	/**
	 * The number of structural features of the '<em>Script Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_COLLECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.BashScriptCollectionImpl <em>Bash Script Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BashScriptCollectionImpl
	 * @see model.impl.ModelPackageImpl#getBashScriptCollection()
	 * @generated
	 */
	int BASH_SCRIPT_COLLECTION = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT_COLLECTION__ATTRIBUTE = SCRIPT_COLLECTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Template Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT_COLLECTION__TEMPLATE_RESOURCE = SCRIPT_COLLECTION__TEMPLATE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT_COLLECTION__NAME = SCRIPT_COLLECTION__NAME;

	/**
	 * The feature id for the '<em><b>Installation Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT_COLLECTION__INSTALLATION_SCRIPT = SCRIPT_COLLECTION__INSTALLATION_SCRIPT;

	/**
	 * The number of structural features of the '<em>Bash Script Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_SCRIPT_COLLECTION_FEATURE_COUNT = SCRIPT_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AttributeImpl
	 * @see model.impl.ModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.FederationImpl <em>Federation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FederationImpl
	 * @see model.impl.ModelPackageImpl#getFederation()
	 * @generated
	 */
	int FEDERATION = 17;

	/**
	 * The feature id for the '<em><b>Federated Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION__FEDERATED_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Federated Virtual Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION__FEDERATED_VIRTUAL_MACHINE = 1;

	/**
	 * The number of structural features of the '<em>Federation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InfrastructureImpl
	 * @see model.impl.ModelPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 18;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__CLOUD = 0;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.InstallationImpl <em>Installation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstallationImpl
	 * @see model.impl.ModelPackageImpl#getInstallation()
	 * @generated
	 */
	int INSTALLATION = 19;

	/**
	 * The feature id for the '<em><b>Script Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION__SCRIPT_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.TemplateResourceImpl <em>Template Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TemplateResourceImpl
	 * @see model.impl.ModelPackageImpl#getTemplateResource()
	 * @generated
	 */
	int TEMPLATE_RESOURCE = 23;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_RESOURCE__URI = 0;

	/**
	 * The number of structural features of the '<em>Template Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.TemplateFileImpl <em>Template File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TemplateFileImpl
	 * @see model.impl.ModelPackageImpl#getTemplateFile()
	 * @generated
	 */
	int TEMPLATE_FILE = 20;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILE__URI = TEMPLATE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILE__CONTENT = TEMPLATE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILE_FEATURE_COUNT = TEMPLATE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstanceImpl
	 * @see model.impl.ModelPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IP = 1;

	/**
	 * The feature id for the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__MODEL_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__DNS = 3;

	/**
	 * The feature id for the '<em><b>Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PRIVATE_IP = 4;

	/**
	 * The feature id for the '<em><b>Private Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PRIVATE_DNS = 5;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CLOUD = 6;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.impl.ConfiguredImageImpl <em>Configured Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ConfiguredImageImpl
	 * @see model.impl.ModelPackageImpl#getConfiguredImage()
	 * @generated
	 */
	int CONFIGURED_IMAGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_IMAGE__NAME = IMAGE__NAME;

	/**
	 * The feature id for the '<em><b>Installation Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_IMAGE__INSTALLATION_TASK = IMAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Drive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_IMAGE__ADDITIONAL_DRIVE = IMAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configured Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_IMAGE_FEATURE_COUNT = IMAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.TemplateDirImpl <em>Template Dir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TemplateDirImpl
	 * @see model.impl.ModelPackageImpl#getTemplateDir()
	 * @generated
	 */
	int TEMPLATE_DIR = 24;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DIR__URI = TEMPLATE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Template Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DIR__TEMPLATE_RESOURCE = TEMPLATE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Dir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DIR_FEATURE_COUNT = TEMPLATE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.BackupJobImpl <em>Backup Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BackupJobImpl
	 * @see model.impl.ModelPackageImpl#getBackupJob()
	 * @generated
	 */
	int BACKUP_JOB = 25;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP_JOB__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP_JOB__NAME = 1;

	/**
	 * The number of structural features of the '<em>Backup Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUP_JOB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.RsyncJobImpl <em>Rsync Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RsyncJobImpl
	 * @see model.impl.ModelPackageImpl#getRsyncJob()
	 * @generated
	 */
	int RSYNC_JOB = 26;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYNC_JOB__PERIOD = BACKUP_JOB__PERIOD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYNC_JOB__NAME = BACKUP_JOB__NAME;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYNC_JOB__LOCAL = BACKUP_JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYNC_JOB__REMOTE = BACKUP_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rsync Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYNC_JOB_FEATURE_COUNT = BACKUP_JOB_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.CloudStandbyReplicationImpl <em>Cloud Standby Replication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CloudStandbyReplicationImpl
	 * @see model.impl.ModelPackageImpl#getCloudStandbyReplication()
	 * @generated
	 */
	int CLOUD_STANDBY_REPLICATION = 27;

	/**
	 * The feature id for the '<em><b>Update Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL = 0;

	/**
	 * The number of structural features of the '<em>Cloud Standby Replication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STANDBY_REPLICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.AdditionalDriveImpl <em>Additional Drive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AdditionalDriveImpl
	 * @see model.impl.ModelPackageImpl#getAdditionalDrive()
	 * @generated
	 */
	int ADDITIONAL_DRIVE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DRIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DRIVE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DRIVE__DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DRIVE__IMAGE_ID = 3;

	/**
	 * The feature id for the '<em><b>Mount Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DRIVE__MOUNT_POINT = 4;

	/**
	 * The number of structural features of the '<em>Additional Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DRIVE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.impl.BashJobImpl <em>Bash Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BashJobImpl
	 * @see model.impl.ModelPackageImpl#getBashJob()
	 * @generated
	 */
	int BASH_JOB = 29;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_JOB__PERIOD = BACKUP_JOB__PERIOD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_JOB__NAME = BACKUP_JOB__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_JOB__CODE = BACKUP_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bash Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASH_JOB_FEATURE_COUNT = BACKUP_JOB_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.ProviderId <em>Provider Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ProviderId
	 * @see model.impl.ModelPackageImpl#getProviderId()
	 * @generated
	 */
	int PROVIDER_ID = 30;


	/**
	 * Returns the meta object for class '{@link model.CloudStandby <em>Cloud Standby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Standby</em>'.
	 * @see model.CloudStandby
	 * @generated
	 */
	EClass getCloudStandby();

	/**
	 * Returns the meta object for the containment reference '{@link model.CloudStandby#getDistributedSystem <em>Distributed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distributed System</em>'.
	 * @see model.CloudStandby#getDistributedSystem()
	 * @see #getCloudStandby()
	 * @generated
	 */
	EReference getCloudStandby_DistributedSystem();

	/**
	 * Returns the meta object for the containment reference '{@link model.CloudStandby#getInstallation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Installation</em>'.
	 * @see model.CloudStandby#getInstallation()
	 * @see #getCloudStandby()
	 * @generated
	 */
	EReference getCloudStandby_Installation();

	/**
	 * Returns the meta object for the containment reference '{@link model.CloudStandby#getInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infrastructure</em>'.
	 * @see model.CloudStandby#getInfrastructure()
	 * @see #getCloudStandby()
	 * @generated
	 */
	EReference getCloudStandby_Infrastructure();

	/**
	 * Returns the meta object for the containment reference '{@link model.CloudStandby#getFederation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Federation</em>'.
	 * @see model.CloudStandby#getFederation()
	 * @see #getCloudStandby()
	 * @generated
	 */
	EReference getCloudStandby_Federation();

	/**
	 * Returns the meta object for class '{@link model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see model.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Component#getFederatedInstance <em>Federated Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Federated Instance</em>'.
	 * @see model.Component#getFederatedInstance()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FederatedInstance();

	/**
	 * Returns the meta object for the reference '{@link model.Component#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Federated Virtual Machine</em>'.
	 * @see model.Component#getFederatedVirtualMachine()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FederatedVirtualMachine();

	/**
	 * Returns the meta object for the reference '{@link model.Component#getFederatedImage <em>Federated Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Federated Image</em>'.
	 * @see model.Component#getFederatedImage()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FederatedImage();

	/**
	 * Returns the meta object for the attribute '{@link model.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the reference list '{@link model.Component#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see model.Component#getRequires()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Requires();

	/**
	 * Returns the meta object for the reference list '{@link model.Component#getInstallationTask <em>Installation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Installation Task</em>'.
	 * @see model.Component#getInstallationTask()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InstallationTask();

	/**
	 * Returns the meta object for class '{@link model.FederatedInstance <em>Federated Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federated Instance</em>'.
	 * @see model.FederatedInstance
	 * @generated
	 */
	EClass getFederatedInstance();

	/**
	 * Returns the meta object for the attribute '{@link model.FederatedInstance#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see model.FederatedInstance#getHostname()
	 * @see #getFederatedInstance()
	 * @generated
	 */
	EAttribute getFederatedInstance_Hostname();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FederatedInstance#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see model.FederatedInstance#getInstance()
	 * @see #getFederatedInstance()
	 * @generated
	 */
	EReference getFederatedInstance_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FederatedInstance#getBackupJob <em>Backup Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Backup Job</em>'.
	 * @see model.FederatedInstance#getBackupJob()
	 * @see #getFederatedInstance()
	 * @generated
	 */
	EReference getFederatedInstance_BackupJob();

	/**
	 * Returns the meta object for class '{@link model.FederatedVirtualMachine <em>Federated Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federated Virtual Machine</em>'.
	 * @see model.FederatedVirtualMachine
	 * @generated
	 */
	EClass getFederatedVirtualMachine();

	/**
	 * Returns the meta object for the reference list '{@link model.FederatedVirtualMachine#getVirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Machine</em>'.
	 * @see model.FederatedVirtualMachine#getVirtualMachine()
	 * @see #getFederatedVirtualMachine()
	 * @generated
	 */
	EReference getFederatedVirtualMachine_VirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link model.FederatedVirtualMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.FederatedVirtualMachine#getName()
	 * @see #getFederatedVirtualMachine()
	 * @generated
	 */
	EAttribute getFederatedVirtualMachine_Name();

	/**
	 * Returns the meta object for class '{@link model.InstallationTask <em>Installation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Task</em>'.
	 * @see model.InstallationTask
	 * @generated
	 */
	EClass getInstallationTask();

	/**
	 * Returns the meta object for the attribute '{@link model.InstallationTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.InstallationTask#getName()
	 * @see #getInstallationTask()
	 * @generated
	 */
	EAttribute getInstallationTask_Name();

	/**
	 * Returns the meta object for class '{@link model.StandardImage <em>Standard Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Image</em>'.
	 * @see model.StandardImage
	 * @generated
	 */
	EClass getStandardImage();

	/**
	 * Returns the meta object for the containment reference list '{@link model.StandardImage#getConfiguredImage <em>Configured Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configured Image</em>'.
	 * @see model.StandardImage#getConfiguredImage()
	 * @see #getStandardImage()
	 * @generated
	 */
	EReference getStandardImage_ConfiguredImage();

	/**
	 * Returns the meta object for the attribute '{@link model.StandardImage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.StandardImage#getId()
	 * @see #getStandardImage()
	 * @generated
	 */
	EAttribute getStandardImage_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.StandardImage#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see model.StandardImage#getLogin()
	 * @see #getStandardImage()
	 * @generated
	 */
	EAttribute getStandardImage_Login();

	/**
	 * Returns the meta object for the attribute '{@link model.StandardImage#getJsonDescription <em>Json Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Description</em>'.
	 * @see model.StandardImage#getJsonDescription()
	 * @see #getStandardImage()
	 * @generated
	 */
	EAttribute getStandardImage_JsonDescription();

	/**
	 * Returns the meta object for class '{@link model.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see model.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link model.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for class '{@link model.FederatedImage <em>Federated Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federated Image</em>'.
	 * @see model.FederatedImage
	 * @generated
	 */
	EClass getFederatedImage();

	/**
	 * Returns the meta object for the reference list '{@link model.FederatedImage#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see model.FederatedImage#getImage()
	 * @see #getFederatedImage()
	 * @generated
	 */
	EReference getFederatedImage_Image();

	/**
	 * Returns the meta object for the attribute '{@link model.FederatedImage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.FederatedImage#getName()
	 * @see #getFederatedImage()
	 * @generated
	 */
	EAttribute getFederatedImage_Name();

	/**
	 * Returns the meta object for class '{@link model.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see model.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cloud#getStandardImage <em>Standard Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard Image</em>'.
	 * @see model.Cloud#getStandardImage()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_StandardImage();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cloud#getVirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Machine</em>'.
	 * @see model.Cloud#getVirtualMachine()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_VirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link model.Cloud#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Cloud#getName()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Cloud#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see model.Cloud#getLocation()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Location();

	/**
	 * Returns the meta object for the attribute '{@link model.Cloud#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see model.Cloud#getProviderId()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_ProviderId();

	/**
	 * Returns the meta object for the attribute '{@link model.Cloud#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see model.Cloud#getPublicKey()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_PublicKey();

	/**
	 * Returns the meta object for the attribute '{@link model.Cloud#getPrivateKey <em>Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key</em>'.
	 * @see model.Cloud#getPrivateKey()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_PrivateKey();

	/**
	 * Returns the meta object for class '{@link model.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see model.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link model.VirtualMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.VirtualMachine#getName()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.VirtualMachine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.VirtualMachine#getId()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.VirtualMachine#getJsonDescription <em>Json Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Description</em>'.
	 * @see model.VirtualMachine#getJsonDescription()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_JsonDescription();

	/**
	 * Returns the meta object for class '{@link model.DistributedSystem <em>Distributed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributed System</em>'.
	 * @see model.DistributedSystem
	 * @generated
	 */
	EClass getDistributedSystem();

	/**
	 * Returns the meta object for the reference list '{@link model.DistributedSystem#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloud</em>'.
	 * @see model.DistributedSystem#getCloud()
	 * @see #getDistributedSystem()
	 * @generated
	 */
	EReference getDistributedSystem_Cloud();

	/**
	 * Returns the meta object for the containment reference list '{@link model.DistributedSystem#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see model.DistributedSystem#getComponent()
	 * @see #getDistributedSystem()
	 * @generated
	 */
	EReference getDistributedSystem_Component();

	/**
	 * Returns the meta object for the containment reference '{@link model.DistributedSystem#getCloudStandbyReplication <em>Cloud Standby Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloud Standby Replication</em>'.
	 * @see model.DistributedSystem#getCloudStandbyReplication()
	 * @see #getDistributedSystem()
	 * @generated
	 */
	EReference getDistributedSystem_CloudStandbyReplication();

	/**
	 * Returns the meta object for class '{@link model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see model.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link model.Role#getInstallationTask <em>Installation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Installation Task</em>'.
	 * @see model.Role#getInstallationTask()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_InstallationTask();

	/**
	 * Returns the meta object for class '{@link model.InstallationScript <em>Installation Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Script</em>'.
	 * @see model.InstallationScript
	 * @generated
	 */
	EClass getInstallationScript();

	/**
	 * Returns the meta object for class '{@link model.BashScript <em>Bash Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bash Script</em>'.
	 * @see model.BashScript
	 * @generated
	 */
	EClass getBashScript();

	/**
	 * Returns the meta object for the attribute '{@link model.BashScript#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see model.BashScript#getCode()
	 * @see #getBashScript()
	 * @generated
	 */
	EAttribute getBashScript_Code();

	/**
	 * Returns the meta object for class '{@link model.ScriptCollection <em>Script Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Collection</em>'.
	 * @see model.ScriptCollection
	 * @generated
	 */
	EClass getScriptCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ScriptCollection#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see model.ScriptCollection#getAttribute()
	 * @see #getScriptCollection()
	 * @generated
	 */
	EReference getScriptCollection_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ScriptCollection#getTemplateResource <em>Template Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Resource</em>'.
	 * @see model.ScriptCollection#getTemplateResource()
	 * @see #getScriptCollection()
	 * @generated
	 */
	EReference getScriptCollection_TemplateResource();

	/**
	 * Returns the meta object for the attribute '{@link model.ScriptCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.ScriptCollection#getName()
	 * @see #getScriptCollection()
	 * @generated
	 */
	EAttribute getScriptCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ScriptCollection#getInstallationScript <em>Installation Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Installation Script</em>'.
	 * @see model.ScriptCollection#getInstallationScript()
	 * @see #getScriptCollection()
	 * @generated
	 */
	EReference getScriptCollection_InstallationScript();

	/**
	 * Returns the meta object for class '{@link model.BashScriptCollection <em>Bash Script Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bash Script Collection</em>'.
	 * @see model.BashScriptCollection
	 * @generated
	 */
	EClass getBashScriptCollection();

	/**
	 * Returns the meta object for class '{@link model.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see model.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link model.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link model.Federation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federation</em>'.
	 * @see model.Federation
	 * @generated
	 */
	EClass getFederation();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Federation#getFederatedImage <em>Federated Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Federated Image</em>'.
	 * @see model.Federation#getFederatedImage()
	 * @see #getFederation()
	 * @generated
	 */
	EReference getFederation_FederatedImage();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Federation#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Federated Virtual Machine</em>'.
	 * @see model.Federation#getFederatedVirtualMachine()
	 * @see #getFederation()
	 * @generated
	 */
	EReference getFederation_FederatedVirtualMachine();

	/**
	 * Returns the meta object for class '{@link model.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see model.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Infrastructure#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cloud</em>'.
	 * @see model.Infrastructure#getCloud()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Cloud();

	/**
	 * Returns the meta object for class '{@link model.Installation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation</em>'.
	 * @see model.Installation
	 * @generated
	 */
	EClass getInstallation();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Installation#getScriptCollection <em>Script Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script Collection</em>'.
	 * @see model.Installation#getScriptCollection()
	 * @see #getInstallation()
	 * @generated
	 */
	EReference getInstallation_ScriptCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Installation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see model.Installation#getRole()
	 * @see #getInstallation()
	 * @generated
	 */
	EReference getInstallation_Role();

	/**
	 * Returns the meta object for class '{@link model.TemplateFile <em>Template File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template File</em>'.
	 * @see model.TemplateFile
	 * @generated
	 */
	EClass getTemplateFile();

	/**
	 * Returns the meta object for the attribute '{@link model.TemplateFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see model.TemplateFile#getContent()
	 * @see #getTemplateFile()
	 * @generated
	 */
	EAttribute getTemplateFile_Content();

	/**
	 * Returns the meta object for class '{@link model.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see model.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link model.Instance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Instance#getId()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.Instance#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see model.Instance#getIp()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Ip();

	/**
	 * Returns the meta object for the attribute '{@link model.Instance#getModelIdentifier <em>Model Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Identifier</em>'.
	 * @see model.Instance#getModelIdentifier()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ModelIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link model.Instance#getDns <em>Dns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns</em>'.
	 * @see model.Instance#getDns()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Dns();

	/**
	 * Returns the meta object for the attribute '{@link model.Instance#getPrivateIp <em>Private Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip</em>'.
	 * @see model.Instance#getPrivateIp()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_PrivateIp();

	/**
	 * Returns the meta object for the attribute '{@link model.Instance#getPrivateDns <em>Private Dns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Dns</em>'.
	 * @see model.Instance#getPrivateDns()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_PrivateDns();

	/**
	 * Returns the meta object for the reference '{@link model.Instance#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud</em>'.
	 * @see model.Instance#getCloud()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Cloud();

	/**
	 * Returns the meta object for class '{@link model.ConfiguredImage <em>Configured Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Image</em>'.
	 * @see model.ConfiguredImage
	 * @generated
	 */
	EClass getConfiguredImage();

	/**
	 * Returns the meta object for the reference list '{@link model.ConfiguredImage#getInstallationTask <em>Installation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Installation Task</em>'.
	 * @see model.ConfiguredImage#getInstallationTask()
	 * @see #getConfiguredImage()
	 * @generated
	 */
	EReference getConfiguredImage_InstallationTask();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ConfiguredImage#getAdditionalDrive <em>Additional Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Drive</em>'.
	 * @see model.ConfiguredImage#getAdditionalDrive()
	 * @see #getConfiguredImage()
	 * @generated
	 */
	EReference getConfiguredImage_AdditionalDrive();

	/**
	 * Returns the meta object for class '{@link model.TemplateResource <em>Template Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Resource</em>'.
	 * @see model.TemplateResource
	 * @generated
	 */
	EClass getTemplateResource();

	/**
	 * Returns the meta object for the attribute '{@link model.TemplateResource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see model.TemplateResource#getUri()
	 * @see #getTemplateResource()
	 * @generated
	 */
	EAttribute getTemplateResource_Uri();

	/**
	 * Returns the meta object for class '{@link model.TemplateDir <em>Template Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Dir</em>'.
	 * @see model.TemplateDir
	 * @generated
	 */
	EClass getTemplateDir();

	/**
	 * Returns the meta object for the containment reference list '{@link model.TemplateDir#getTemplateResource <em>Template Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Resource</em>'.
	 * @see model.TemplateDir#getTemplateResource()
	 * @see #getTemplateDir()
	 * @generated
	 */
	EReference getTemplateDir_TemplateResource();

	/**
	 * Returns the meta object for class '{@link model.BackupJob <em>Backup Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backup Job</em>'.
	 * @see model.BackupJob
	 * @generated
	 */
	EClass getBackupJob();

	/**
	 * Returns the meta object for the attribute '{@link model.BackupJob#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see model.BackupJob#getPeriod()
	 * @see #getBackupJob()
	 * @generated
	 */
	EAttribute getBackupJob_Period();

	/**
	 * Returns the meta object for the attribute '{@link model.BackupJob#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.BackupJob#getName()
	 * @see #getBackupJob()
	 * @generated
	 */
	EAttribute getBackupJob_Name();

	/**
	 * Returns the meta object for class '{@link model.RsyncJob <em>Rsync Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rsync Job</em>'.
	 * @see model.RsyncJob
	 * @generated
	 */
	EClass getRsyncJob();

	/**
	 * Returns the meta object for the attribute '{@link model.RsyncJob#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see model.RsyncJob#getLocal()
	 * @see #getRsyncJob()
	 * @generated
	 */
	EAttribute getRsyncJob_Local();

	/**
	 * Returns the meta object for the attribute '{@link model.RsyncJob#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see model.RsyncJob#getRemote()
	 * @see #getRsyncJob()
	 * @generated
	 */
	EAttribute getRsyncJob_Remote();

	/**
	 * Returns the meta object for class '{@link model.CloudStandbyReplication <em>Cloud Standby Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Standby Replication</em>'.
	 * @see model.CloudStandbyReplication
	 * @generated
	 */
	EClass getCloudStandbyReplication();

	/**
	 * Returns the meta object for the attribute '{@link model.CloudStandbyReplication#getUpdateInterval <em>Update Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Interval</em>'.
	 * @see model.CloudStandbyReplication#getUpdateInterval()
	 * @see #getCloudStandbyReplication()
	 * @generated
	 */
	EAttribute getCloudStandbyReplication_UpdateInterval();

	/**
	 * Returns the meta object for class '{@link model.AdditionalDrive <em>Additional Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Drive</em>'.
	 * @see model.AdditionalDrive
	 * @generated
	 */
	EClass getAdditionalDrive();

	/**
	 * Returns the meta object for the attribute '{@link model.AdditionalDrive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.AdditionalDrive#getName()
	 * @see #getAdditionalDrive()
	 * @generated
	 */
	EAttribute getAdditionalDrive_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.AdditionalDrive#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see model.AdditionalDrive#getSize()
	 * @see #getAdditionalDrive()
	 * @generated
	 */
	EAttribute getAdditionalDrive_Size();

	/**
	 * Returns the meta object for the attribute '{@link model.AdditionalDrive#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see model.AdditionalDrive#getDevice()
	 * @see #getAdditionalDrive()
	 * @generated
	 */
	EAttribute getAdditionalDrive_Device();

	/**
	 * Returns the meta object for the attribute '{@link model.AdditionalDrive#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see model.AdditionalDrive#getImageId()
	 * @see #getAdditionalDrive()
	 * @generated
	 */
	EAttribute getAdditionalDrive_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link model.AdditionalDrive#getMountPoint <em>Mount Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Point</em>'.
	 * @see model.AdditionalDrive#getMountPoint()
	 * @see #getAdditionalDrive()
	 * @generated
	 */
	EAttribute getAdditionalDrive_MountPoint();

	/**
	 * Returns the meta object for class '{@link model.BashJob <em>Bash Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bash Job</em>'.
	 * @see model.BashJob
	 * @generated
	 */
	EClass getBashJob();

	/**
	 * Returns the meta object for the attribute '{@link model.BashJob#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see model.BashJob#getCode()
	 * @see #getBashJob()
	 * @generated
	 */
	EAttribute getBashJob_Code();

	/**
	 * Returns the meta object for enum '{@link model.ProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provider Id</em>'.
	 * @see model.ProviderId
	 * @generated
	 */
	EEnum getProviderId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.CloudStandbyImpl <em>Cloud Standby</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CloudStandbyImpl
		 * @see model.impl.ModelPackageImpl#getCloudStandby()
		 * @generated
		 */
		EClass CLOUD_STANDBY = eINSTANCE.getCloudStandby();

		/**
		 * The meta object literal for the '<em><b>Distributed System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_STANDBY__DISTRIBUTED_SYSTEM = eINSTANCE.getCloudStandby_DistributedSystem();

		/**
		 * The meta object literal for the '<em><b>Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_STANDBY__INSTALLATION = eINSTANCE.getCloudStandby_Installation();

		/**
		 * The meta object literal for the '<em><b>Infrastructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_STANDBY__INFRASTRUCTURE = eINSTANCE.getCloudStandby_Infrastructure();

		/**
		 * The meta object literal for the '<em><b>Federation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_STANDBY__FEDERATION = eINSTANCE.getCloudStandby_Federation();

		/**
		 * The meta object literal for the '{@link model.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ComponentImpl
		 * @see model.impl.ModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Federated Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FEDERATED_INSTANCE = eINSTANCE.getComponent_FederatedInstance();

		/**
		 * The meta object literal for the '<em><b>Federated Virtual Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FEDERATED_VIRTUAL_MACHINE = eINSTANCE.getComponent_FederatedVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Federated Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FEDERATED_IMAGE = eINSTANCE.getComponent_FederatedImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRES = eINSTANCE.getComponent_Requires();

		/**
		 * The meta object literal for the '<em><b>Installation Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INSTALLATION_TASK = eINSTANCE.getComponent_InstallationTask();

		/**
		 * The meta object literal for the '{@link model.impl.FederatedInstanceImpl <em>Federated Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FederatedInstanceImpl
		 * @see model.impl.ModelPackageImpl#getFederatedInstance()
		 * @generated
		 */
		EClass FEDERATED_INSTANCE = eINSTANCE.getFederatedInstance();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEDERATED_INSTANCE__HOSTNAME = eINSTANCE.getFederatedInstance_Hostname();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERATED_INSTANCE__INSTANCE = eINSTANCE.getFederatedInstance_Instance();

		/**
		 * The meta object literal for the '<em><b>Backup Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERATED_INSTANCE__BACKUP_JOB = eINSTANCE.getFederatedInstance_BackupJob();

		/**
		 * The meta object literal for the '{@link model.impl.FederatedVirtualMachineImpl <em>Federated Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FederatedVirtualMachineImpl
		 * @see model.impl.ModelPackageImpl#getFederatedVirtualMachine()
		 * @generated
		 */
		EClass FEDERATED_VIRTUAL_MACHINE = eINSTANCE.getFederatedVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Virtual Machine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE = eINSTANCE.getFederatedVirtualMachine_VirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEDERATED_VIRTUAL_MACHINE__NAME = eINSTANCE.getFederatedVirtualMachine_Name();

		/**
		 * The meta object literal for the '{@link model.impl.InstallationTaskImpl <em>Installation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InstallationTaskImpl
		 * @see model.impl.ModelPackageImpl#getInstallationTask()
		 * @generated
		 */
		EClass INSTALLATION_TASK = eINSTANCE.getInstallationTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_TASK__NAME = eINSTANCE.getInstallationTask_Name();

		/**
		 * The meta object literal for the '{@link model.impl.StandardImageImpl <em>Standard Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StandardImageImpl
		 * @see model.impl.ModelPackageImpl#getStandardImage()
		 * @generated
		 */
		EClass STANDARD_IMAGE = eINSTANCE.getStandardImage();

		/**
		 * The meta object literal for the '<em><b>Configured Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_IMAGE__CONFIGURED_IMAGE = eINSTANCE.getStandardImage_ConfiguredImage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_IMAGE__ID = eINSTANCE.getStandardImage_Id();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_IMAGE__LOGIN = eINSTANCE.getStandardImage_Login();

		/**
		 * The meta object literal for the '<em><b>Json Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_IMAGE__JSON_DESCRIPTION = eINSTANCE.getStandardImage_JsonDescription();

		/**
		 * The meta object literal for the '{@link model.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ImageImpl
		 * @see model.impl.ModelPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '{@link model.impl.FederatedImageImpl <em>Federated Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FederatedImageImpl
		 * @see model.impl.ModelPackageImpl#getFederatedImage()
		 * @generated
		 */
		EClass FEDERATED_IMAGE = eINSTANCE.getFederatedImage();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERATED_IMAGE__IMAGE = eINSTANCE.getFederatedImage_Image();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEDERATED_IMAGE__NAME = eINSTANCE.getFederatedImage_Name();

		/**
		 * The meta object literal for the '{@link model.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CloudImpl
		 * @see model.impl.ModelPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>Standard Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__STANDARD_IMAGE = eINSTANCE.getCloud_StandardImage();

		/**
		 * The meta object literal for the '<em><b>Virtual Machine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__VIRTUAL_MACHINE = eINSTANCE.getCloud_VirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__NAME = eINSTANCE.getCloud_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__LOCATION = eINSTANCE.getCloud_Location();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__PROVIDER_ID = eINSTANCE.getCloud_ProviderId();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__PUBLIC_KEY = eINSTANCE.getCloud_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__PRIVATE_KEY = eINSTANCE.getCloud_PrivateKey();

		/**
		 * The meta object literal for the '{@link model.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.VirtualMachineImpl
		 * @see model.impl.ModelPackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__NAME = eINSTANCE.getVirtualMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__ID = eINSTANCE.getVirtualMachine_Id();

		/**
		 * The meta object literal for the '<em><b>Json Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__JSON_DESCRIPTION = eINSTANCE.getVirtualMachine_JsonDescription();

		/**
		 * The meta object literal for the '{@link model.impl.DistributedSystemImpl <em>Distributed System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DistributedSystemImpl
		 * @see model.impl.ModelPackageImpl#getDistributedSystem()
		 * @generated
		 */
		EClass DISTRIBUTED_SYSTEM = eINSTANCE.getDistributedSystem();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_SYSTEM__CLOUD = eINSTANCE.getDistributedSystem_Cloud();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_SYSTEM__COMPONENT = eINSTANCE.getDistributedSystem_Component();

		/**
		 * The meta object literal for the '<em><b>Cloud Standby Replication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION = eINSTANCE.getDistributedSystem_CloudStandbyReplication();

		/**
		 * The meta object literal for the '{@link model.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RoleImpl
		 * @see model.impl.ModelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Installation Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INSTALLATION_TASK = eINSTANCE.getRole_InstallationTask();

		/**
		 * The meta object literal for the '{@link model.impl.InstallationScriptImpl <em>Installation Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InstallationScriptImpl
		 * @see model.impl.ModelPackageImpl#getInstallationScript()
		 * @generated
		 */
		EClass INSTALLATION_SCRIPT = eINSTANCE.getInstallationScript();

		/**
		 * The meta object literal for the '{@link model.impl.BashScriptImpl <em>Bash Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BashScriptImpl
		 * @see model.impl.ModelPackageImpl#getBashScript()
		 * @generated
		 */
		EClass BASH_SCRIPT = eINSTANCE.getBashScript();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASH_SCRIPT__CODE = eINSTANCE.getBashScript_Code();

		/**
		 * The meta object literal for the '{@link model.impl.ScriptCollectionImpl <em>Script Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ScriptCollectionImpl
		 * @see model.impl.ModelPackageImpl#getScriptCollection()
		 * @generated
		 */
		EClass SCRIPT_COLLECTION = eINSTANCE.getScriptCollection();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_COLLECTION__ATTRIBUTE = eINSTANCE.getScriptCollection_Attribute();

		/**
		 * The meta object literal for the '<em><b>Template Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_COLLECTION__TEMPLATE_RESOURCE = eINSTANCE.getScriptCollection_TemplateResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_COLLECTION__NAME = eINSTANCE.getScriptCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Installation Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_COLLECTION__INSTALLATION_SCRIPT = eINSTANCE.getScriptCollection_InstallationScript();

		/**
		 * The meta object literal for the '{@link model.impl.BashScriptCollectionImpl <em>Bash Script Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BashScriptCollectionImpl
		 * @see model.impl.ModelPackageImpl#getBashScriptCollection()
		 * @generated
		 */
		EClass BASH_SCRIPT_COLLECTION = eINSTANCE.getBashScriptCollection();

		/**
		 * The meta object literal for the '{@link model.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AttributeImpl
		 * @see model.impl.ModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link model.impl.FederationImpl <em>Federation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FederationImpl
		 * @see model.impl.ModelPackageImpl#getFederation()
		 * @generated
		 */
		EClass FEDERATION = eINSTANCE.getFederation();

		/**
		 * The meta object literal for the '<em><b>Federated Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERATION__FEDERATED_IMAGE = eINSTANCE.getFederation_FederatedImage();

		/**
		 * The meta object literal for the '<em><b>Federated Virtual Machine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEDERATION__FEDERATED_VIRTUAL_MACHINE = eINSTANCE.getFederation_FederatedVirtualMachine();

		/**
		 * The meta object literal for the '{@link model.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InfrastructureImpl
		 * @see model.impl.ModelPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__CLOUD = eINSTANCE.getInfrastructure_Cloud();

		/**
		 * The meta object literal for the '{@link model.impl.InstallationImpl <em>Installation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InstallationImpl
		 * @see model.impl.ModelPackageImpl#getInstallation()
		 * @generated
		 */
		EClass INSTALLATION = eINSTANCE.getInstallation();

		/**
		 * The meta object literal for the '<em><b>Script Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLATION__SCRIPT_COLLECTION = eINSTANCE.getInstallation_ScriptCollection();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLATION__ROLE = eINSTANCE.getInstallation_Role();

		/**
		 * The meta object literal for the '{@link model.impl.TemplateFileImpl <em>Template File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TemplateFileImpl
		 * @see model.impl.ModelPackageImpl#getTemplateFile()
		 * @generated
		 */
		EClass TEMPLATE_FILE = eINSTANCE.getTemplateFile();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_FILE__CONTENT = eINSTANCE.getTemplateFile_Content();

		/**
		 * The meta object literal for the '{@link model.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InstanceImpl
		 * @see model.impl.ModelPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__ID = eINSTANCE.getInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__IP = eINSTANCE.getInstance_Ip();

		/**
		 * The meta object literal for the '<em><b>Model Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__MODEL_IDENTIFIER = eINSTANCE.getInstance_ModelIdentifier();

		/**
		 * The meta object literal for the '<em><b>Dns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__DNS = eINSTANCE.getInstance_Dns();

		/**
		 * The meta object literal for the '<em><b>Private Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__PRIVATE_IP = eINSTANCE.getInstance_PrivateIp();

		/**
		 * The meta object literal for the '<em><b>Private Dns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__PRIVATE_DNS = eINSTANCE.getInstance_PrivateDns();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CLOUD = eINSTANCE.getInstance_Cloud();

		/**
		 * The meta object literal for the '{@link model.impl.ConfiguredImageImpl <em>Configured Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ConfiguredImageImpl
		 * @see model.impl.ModelPackageImpl#getConfiguredImage()
		 * @generated
		 */
		EClass CONFIGURED_IMAGE = eINSTANCE.getConfiguredImage();

		/**
		 * The meta object literal for the '<em><b>Installation Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_IMAGE__INSTALLATION_TASK = eINSTANCE.getConfiguredImage_InstallationTask();

		/**
		 * The meta object literal for the '<em><b>Additional Drive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_IMAGE__ADDITIONAL_DRIVE = eINSTANCE.getConfiguredImage_AdditionalDrive();

		/**
		 * The meta object literal for the '{@link model.impl.TemplateResourceImpl <em>Template Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TemplateResourceImpl
		 * @see model.impl.ModelPackageImpl#getTemplateResource()
		 * @generated
		 */
		EClass TEMPLATE_RESOURCE = eINSTANCE.getTemplateResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_RESOURCE__URI = eINSTANCE.getTemplateResource_Uri();

		/**
		 * The meta object literal for the '{@link model.impl.TemplateDirImpl <em>Template Dir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TemplateDirImpl
		 * @see model.impl.ModelPackageImpl#getTemplateDir()
		 * @generated
		 */
		EClass TEMPLATE_DIR = eINSTANCE.getTemplateDir();

		/**
		 * The meta object literal for the '<em><b>Template Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DIR__TEMPLATE_RESOURCE = eINSTANCE.getTemplateDir_TemplateResource();

		/**
		 * The meta object literal for the '{@link model.impl.BackupJobImpl <em>Backup Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BackupJobImpl
		 * @see model.impl.ModelPackageImpl#getBackupJob()
		 * @generated
		 */
		EClass BACKUP_JOB = eINSTANCE.getBackupJob();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKUP_JOB__PERIOD = eINSTANCE.getBackupJob_Period();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKUP_JOB__NAME = eINSTANCE.getBackupJob_Name();

		/**
		 * The meta object literal for the '{@link model.impl.RsyncJobImpl <em>Rsync Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RsyncJobImpl
		 * @see model.impl.ModelPackageImpl#getRsyncJob()
		 * @generated
		 */
		EClass RSYNC_JOB = eINSTANCE.getRsyncJob();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSYNC_JOB__LOCAL = eINSTANCE.getRsyncJob_Local();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSYNC_JOB__REMOTE = eINSTANCE.getRsyncJob_Remote();

		/**
		 * The meta object literal for the '{@link model.impl.CloudStandbyReplicationImpl <em>Cloud Standby Replication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CloudStandbyReplicationImpl
		 * @see model.impl.ModelPackageImpl#getCloudStandbyReplication()
		 * @generated
		 */
		EClass CLOUD_STANDBY_REPLICATION = eINSTANCE.getCloudStandbyReplication();

		/**
		 * The meta object literal for the '<em><b>Update Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL = eINSTANCE.getCloudStandbyReplication_UpdateInterval();

		/**
		 * The meta object literal for the '{@link model.impl.AdditionalDriveImpl <em>Additional Drive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AdditionalDriveImpl
		 * @see model.impl.ModelPackageImpl#getAdditionalDrive()
		 * @generated
		 */
		EClass ADDITIONAL_DRIVE = eINSTANCE.getAdditionalDrive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DRIVE__NAME = eINSTANCE.getAdditionalDrive_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DRIVE__SIZE = eINSTANCE.getAdditionalDrive_Size();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DRIVE__DEVICE = eINSTANCE.getAdditionalDrive_Device();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DRIVE__IMAGE_ID = eINSTANCE.getAdditionalDrive_ImageId();

		/**
		 * The meta object literal for the '<em><b>Mount Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DRIVE__MOUNT_POINT = eINSTANCE.getAdditionalDrive_MountPoint();

		/**
		 * The meta object literal for the '{@link model.impl.BashJobImpl <em>Bash Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BashJobImpl
		 * @see model.impl.ModelPackageImpl#getBashJob()
		 * @generated
		 */
		EClass BASH_JOB = eINSTANCE.getBashJob();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASH_JOB__CODE = eINSTANCE.getBashJob_Code();

		/**
		 * The meta object literal for the '{@link model.ProviderId <em>Provider Id</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ProviderId
		 * @see model.impl.ModelPackageImpl#getProviderId()
		 * @generated
		 */
		EEnum PROVIDER_ID = eINSTANCE.getProviderId();

	}

} //ModelPackage
