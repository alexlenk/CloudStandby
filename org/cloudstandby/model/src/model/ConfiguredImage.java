/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configured Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ConfiguredImage#getInstallationTask <em>Installation Task</em>}</li>
 *   <li>{@link model.ConfiguredImage#getAdditionalDrive <em>Additional Drive</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getConfiguredImage()
 * @model
 * @generated
 */
public interface ConfiguredImage extends Image {
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
	 * @see model.ModelPackage#getConfiguredImage_InstallationTask()
	 * @model type="model.InstallationTask"
	 * @generated
	 */
	EList getInstallationTask();

	/**
	 * Returns the value of the '<em><b>Additional Drive</b></em>' containment reference list.
	 * The list contents are of type {@link model.AdditionalDrive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Drive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Drive</em>' containment reference list.
	 * @see model.ModelPackage#getConfiguredImage_AdditionalDrive()
	 * @model type="model.AdditionalDrive" containment="true"
	 * @generated
	 */
	EList getAdditionalDrive();

} // ConfiguredImage
