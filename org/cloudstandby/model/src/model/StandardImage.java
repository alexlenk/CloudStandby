/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.StandardImage#getConfiguredImage <em>Configured Image</em>}</li>
 *   <li>{@link model.StandardImage#getId <em>Id</em>}</li>
 *   <li>{@link model.StandardImage#getLogin <em>Login</em>}</li>
 *   <li>{@link model.StandardImage#getJsonDescription <em>Json Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getStandardImage()
 * @model
 * @generated
 */
public interface StandardImage extends Image {
	/**
	 * Returns the value of the '<em><b>Configured Image</b></em>' containment reference list.
	 * The list contents are of type {@link model.ConfiguredImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Image</em>' containment reference list.
	 * @see model.ModelPackage#getStandardImage_ConfiguredImage()
	 * @model type="model.ConfiguredImage" containment="true"
	 * @generated
	 */
	EList getConfiguredImage();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see model.ModelPackage#getStandardImage_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link model.StandardImage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see model.ModelPackage#getStandardImage_Login()
	 * @model required="true"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link model.StandardImage#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Json Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Description</em>' attribute.
	 * @see #setJsonDescription(String)
	 * @see model.ModelPackage#getStandardImage_JsonDescription()
	 * @model
	 * @generated
	 */
	String getJsonDescription();

	/**
	 * Sets the value of the '{@link model.StandardImage#getJsonDescription <em>Json Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Description</em>' attribute.
	 * @see #getJsonDescription()
	 * @generated
	 */
	void setJsonDescription(String value);

} // StandardImage
