/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Installation#getScriptCollection <em>Script Collection</em>}</li>
 *   <li>{@link model.Installation#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getInstallation()
 * @model
 * @generated
 */
public interface Installation extends EObject {
	/**
	 * Returns the value of the '<em><b>Script Collection</b></em>' containment reference list.
	 * The list contents are of type {@link model.ScriptCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Collection</em>' containment reference list.
	 * @see model.ModelPackage#getInstallation_ScriptCollection()
	 * @model type="model.ScriptCollection" containment="true"
	 * @generated
	 */
	EList getScriptCollection();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link model.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see model.ModelPackage#getInstallation_Role()
	 * @model type="model.Role" containment="true"
	 * @generated
	 */
	EList getRole();

} // Installation
