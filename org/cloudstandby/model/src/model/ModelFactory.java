/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Standby</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Standby</em>'.
	 * @generated
	 */
	CloudStandby createCloudStandby();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Federated Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Federated Instance</em>'.
	 * @generated
	 */
	FederatedInstance createFederatedInstance();

	/**
	 * Returns a new object of class '<em>Federated Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Federated Virtual Machine</em>'.
	 * @generated
	 */
	FederatedVirtualMachine createFederatedVirtualMachine();

	/**
	 * Returns a new object of class '<em>Standard Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Image</em>'.
	 * @generated
	 */
	StandardImage createStandardImage();

	/**
	 * Returns a new object of class '<em>Federated Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Federated Image</em>'.
	 * @generated
	 */
	FederatedImage createFederatedImage();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	VirtualMachine createVirtualMachine();

	/**
	 * Returns a new object of class '<em>Distributed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distributed System</em>'.
	 * @generated
	 */
	DistributedSystem createDistributedSystem();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Bash Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bash Script</em>'.
	 * @generated
	 */
	BashScript createBashScript();

	/**
	 * Returns a new object of class '<em>Script Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Collection</em>'.
	 * @generated
	 */
	ScriptCollection createScriptCollection();

	/**
	 * Returns a new object of class '<em>Bash Script Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bash Script Collection</em>'.
	 * @generated
	 */
	BashScriptCollection createBashScriptCollection();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Federation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Federation</em>'.
	 * @generated
	 */
	Federation createFederation();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	Infrastructure createInfrastructure();

	/**
	 * Returns a new object of class '<em>Installation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Installation</em>'.
	 * @generated
	 */
	Installation createInstallation();

	/**
	 * Returns a new object of class '<em>Template File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template File</em>'.
	 * @generated
	 */
	TemplateFile createTemplateFile();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Configured Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configured Image</em>'.
	 * @generated
	 */
	ConfiguredImage createConfiguredImage();

	/**
	 * Returns a new object of class '<em>Template Dir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Dir</em>'.
	 * @generated
	 */
	TemplateDir createTemplateDir();

	/**
	 * Returns a new object of class '<em>Rsync Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rsync Job</em>'.
	 * @generated
	 */
	RsyncJob createRsyncJob();

	/**
	 * Returns a new object of class '<em>Cloud Standby Replication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Standby Replication</em>'.
	 * @generated
	 */
	CloudStandbyReplication createCloudStandbyReplication();

	/**
	 * Returns a new object of class '<em>Additional Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Drive</em>'.
	 * @generated
	 */
	AdditionalDrive createAdditionalDrive();

	/**
	 * Returns a new object of class '<em>Bash Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bash Job</em>'.
	 * @generated
	 */
	BashJob createBashJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
