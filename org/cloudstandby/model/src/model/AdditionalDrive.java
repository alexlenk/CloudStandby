/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.AdditionalDrive#getName <em>Name</em>}</li>
 *   <li>{@link model.AdditionalDrive#getSize <em>Size</em>}</li>
 *   <li>{@link model.AdditionalDrive#getDevice <em>Device</em>}</li>
 *   <li>{@link model.AdditionalDrive#getImageId <em>Image Id</em>}</li>
 *   <li>{@link model.AdditionalDrive#getMountPoint <em>Mount Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAdditionalDrive()
 * @model
 * @generated
 */
public interface AdditionalDrive extends EObject {
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
	 * @see model.ModelPackage#getAdditionalDrive_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.AdditionalDrive#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see model.ModelPackage#getAdditionalDrive_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link model.AdditionalDrive#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see model.ModelPackage#getAdditionalDrive_Device()
	 * @model required="true"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link model.AdditionalDrive#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see model.ModelPackage#getAdditionalDrive_ImageId()
	 * @model
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link model.AdditionalDrive#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Mount Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mount Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Point</em>' attribute.
	 * @see #setMountPoint(String)
	 * @see model.ModelPackage#getAdditionalDrive_MountPoint()
	 * @model
	 * @generated
	 */
	String getMountPoint();

	/**
	 * Sets the value of the '{@link model.AdditionalDrive#getMountPoint <em>Mount Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Point</em>' attribute.
	 * @see #getMountPoint()
	 * @generated
	 */
	void setMountPoint(String value);

} // AdditionalDrive
