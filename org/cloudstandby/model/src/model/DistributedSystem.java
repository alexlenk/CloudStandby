/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributed System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.DistributedSystem#getCloud <em>Cloud</em>}</li>
 *   <li>{@link model.DistributedSystem#getComponent <em>Component</em>}</li>
 *   <li>{@link model.DistributedSystem#getCloudStandbyReplication <em>Cloud Standby Replication</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getDistributedSystem()
 * @model
 * @generated
 */
public interface DistributedSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' reference list.
	 * The list contents are of type {@link model.Cloud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' reference list.
	 * @see model.ModelPackage#getDistributedSystem_Cloud()
	 * @model type="model.Cloud" required="true"
	 * @generated
	 */
	EList getCloud();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link model.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see model.ModelPackage#getDistributedSystem_Component()
	 * @model type="model.Component" containment="true" required="true"
	 * @generated
	 */
	EList getComponent();

	/**
	 * Returns the value of the '<em><b>Cloud Standby Replication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Standby Replication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Standby Replication</em>' containment reference.
	 * @see #setCloudStandbyReplication(CloudStandbyReplication)
	 * @see model.ModelPackage#getDistributedSystem_CloudStandbyReplication()
	 * @model containment="true"
	 * @generated
	 */
	CloudStandbyReplication getCloudStandbyReplication();

	/**
	 * Sets the value of the '{@link model.DistributedSystem#getCloudStandbyReplication <em>Cloud Standby Replication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Standby Replication</em>' containment reference.
	 * @see #getCloudStandbyReplication()
	 * @generated
	 */
	void setCloudStandbyReplication(CloudStandbyReplication value);

} // DistributedSystem
