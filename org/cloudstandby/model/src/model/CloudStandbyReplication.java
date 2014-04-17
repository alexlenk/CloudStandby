/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Standby Replication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.CloudStandbyReplication#getUpdateInterval <em>Update Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCloudStandbyReplication()
 * @model
 * @generated
 */
public interface CloudStandbyReplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Update Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Interval</em>' attribute.
	 * @see #setUpdateInterval(int)
	 * @see model.ModelPackage#getCloudStandbyReplication_UpdateInterval()
	 * @model
	 * @generated
	 */
	int getUpdateInterval();

	/**
	 * Sets the value of the '{@link model.CloudStandbyReplication#getUpdateInterval <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Interval</em>' attribute.
	 * @see #getUpdateInterval()
	 * @generated
	 */
	void setUpdateInterval(int value);

} // CloudStandbyReplication
