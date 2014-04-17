/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Federation#getFederatedImage <em>Federated Image</em>}</li>
 *   <li>{@link model.Federation#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFederation()
 * @model
 * @generated
 */
public interface Federation extends EObject {
	/**
	 * Returns the value of the '<em><b>Federated Image</b></em>' containment reference list.
	 * The list contents are of type {@link model.FederatedImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federated Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federated Image</em>' containment reference list.
	 * @see model.ModelPackage#getFederation_FederatedImage()
	 * @model type="model.FederatedImage" containment="true" required="true"
	 * @generated
	 */
	EList getFederatedImage();

	/**
	 * Returns the value of the '<em><b>Federated Virtual Machine</b></em>' containment reference list.
	 * The list contents are of type {@link model.FederatedVirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federated Virtual Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federated Virtual Machine</em>' containment reference list.
	 * @see model.ModelPackage#getFederation_FederatedVirtualMachine()
	 * @model type="model.FederatedVirtualMachine" containment="true" required="true"
	 * @generated
	 */
	EList getFederatedVirtualMachine();

} // Federation
