/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federated Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FederatedVirtualMachine#getVirtualMachine <em>Virtual Machine</em>}</li>
 *   <li>{@link model.FederatedVirtualMachine#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFederatedVirtualMachine()
 * @model
 * @generated
 */
public interface FederatedVirtualMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Machine</b></em>' reference list.
	 * The list contents are of type {@link model.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Machine</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Machine</em>' reference list.
	 * @see model.ModelPackage#getFederatedVirtualMachine_VirtualMachine()
	 * @model type="model.VirtualMachine" lower="2"
	 * @generated
	 */
	EList getVirtualMachine();

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
	 * @see model.ModelPackage#getFederatedVirtualMachine_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.FederatedVirtualMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FederatedVirtualMachine
