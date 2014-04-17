/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Component#getFederatedInstance <em>Federated Instance</em>}</li>
 *   <li>{@link model.Component#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}</li>
 *   <li>{@link model.Component#getFederatedImage <em>Federated Image</em>}</li>
 *   <li>{@link model.Component#getName <em>Name</em>}</li>
 *   <li>{@link model.Component#getRequires <em>Requires</em>}</li>
 *   <li>{@link model.Component#getInstallationTask <em>Installation Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Federated Instance</b></em>' containment reference list.
	 * The list contents are of type {@link model.FederatedInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federated Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federated Instance</em>' containment reference list.
	 * @see model.ModelPackage#getComponent_FederatedInstance()
	 * @model type="model.FederatedInstance" containment="true" required="true"
	 * @generated
	 */
	EList getFederatedInstance();

	/**
	 * Returns the value of the '<em><b>Federated Virtual Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federated Virtual Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federated Virtual Machine</em>' reference.
	 * @see #setFederatedVirtualMachine(FederatedVirtualMachine)
	 * @see model.ModelPackage#getComponent_FederatedVirtualMachine()
	 * @model required="true"
	 * @generated
	 */
	FederatedVirtualMachine getFederatedVirtualMachine();

	/**
	 * Sets the value of the '{@link model.Component#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federated Virtual Machine</em>' reference.
	 * @see #getFederatedVirtualMachine()
	 * @generated
	 */
	void setFederatedVirtualMachine(FederatedVirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Federated Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federated Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federated Image</em>' reference.
	 * @see #setFederatedImage(FederatedImage)
	 * @see model.ModelPackage#getComponent_FederatedImage()
	 * @model required="true"
	 * @generated
	 */
	FederatedImage getFederatedImage();

	/**
	 * Sets the value of the '{@link model.Component#getFederatedImage <em>Federated Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federated Image</em>' reference.
	 * @see #getFederatedImage()
	 * @generated
	 */
	void setFederatedImage(FederatedImage value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link model.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see model.ModelPackage#getComponent_Requires()
	 * @model type="model.Component"
	 * @generated
	 */
	EList getRequires();

	/**
	 * Returns the value of the '<em><b>Installation Task</b></em>' reference list.
	 * The list contents are of type {@link model.InstallationTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Task</em>' reference list.
	 * @see model.ModelPackage#getComponent_InstallationTask()
	 * @model type="model.InstallationTask"
	 * @generated
	 */
	EList getInstallationTask();

} // Component
