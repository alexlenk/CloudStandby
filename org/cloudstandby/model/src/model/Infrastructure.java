/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Infrastructure#getCloud <em>Cloud</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getInfrastructure()
 * @model
 * @generated
 */
public interface Infrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' containment reference list.
	 * The list contents are of type {@link model.Cloud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' containment reference list.
	 * @see model.ModelPackage#getInfrastructure_Cloud()
	 * @model type="model.Cloud" containment="true" lower="2"
	 * @generated
	 */
	EList getCloud();

} // Infrastructure
