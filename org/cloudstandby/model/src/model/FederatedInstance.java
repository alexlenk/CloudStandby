/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federated Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FederatedInstance#getHostname <em>Hostname</em>}</li>
 *   <li>{@link model.FederatedInstance#getInstance <em>Instance</em>}</li>
 *   <li>{@link model.FederatedInstance#getBackupJob <em>Backup Job</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFederatedInstance()
 * @model
 * @generated
 */
public interface FederatedInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see model.ModelPackage#getFederatedInstance_Hostname()
	 * @model required="true"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link model.FederatedInstance#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link model.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see model.ModelPackage#getFederatedInstance_Instance()
	 * @model type="model.Instance" containment="true"
	 * @generated
	 */
	EList getInstance();

	/**
	 * Returns the value of the '<em><b>Backup Job</b></em>' containment reference list.
	 * The list contents are of type {@link model.BackupJob}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup Job</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Job</em>' containment reference list.
	 * @see model.ModelPackage#getFederatedInstance_BackupJob()
	 * @model type="model.BackupJob" containment="true"
	 * @generated
	 */
	EList getBackupJob();

} // FederatedInstance
