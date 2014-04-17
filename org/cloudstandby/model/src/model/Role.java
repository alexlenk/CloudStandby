/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Role#getInstallationTask <em>Installation Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends InstallationTask {
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
	 * @see model.ModelPackage#getRole_InstallationTask()
	 * @model type="model.InstallationTask"
	 * @generated
	 */
	EList getInstallationTask();

} // Role
