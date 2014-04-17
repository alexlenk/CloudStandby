/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Cloud#getStandardImage <em>Standard Image</em>}</li>
 *   <li>{@link model.Cloud#getVirtualMachine <em>Virtual Machine</em>}</li>
 *   <li>{@link model.Cloud#getName <em>Name</em>}</li>
 *   <li>{@link model.Cloud#getLocation <em>Location</em>}</li>
 *   <li>{@link model.Cloud#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link model.Cloud#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link model.Cloud#getPrivateKey <em>Private Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCloud()
 * @model
 * @generated
 */
public interface Cloud extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard Image</b></em>' containment reference list.
	 * The list contents are of type {@link model.StandardImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Image</em>' containment reference list.
	 * @see model.ModelPackage#getCloud_StandardImage()
	 * @model type="model.StandardImage" containment="true" required="true"
	 * @generated
	 */
	EList getStandardImage();

	/**
	 * Returns the value of the '<em><b>Virtual Machine</b></em>' containment reference list.
	 * The list contents are of type {@link model.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Machine</em>' containment reference list.
	 * @see model.ModelPackage#getCloud_VirtualMachine()
	 * @model type="model.VirtualMachine" containment="true" required="true"
	 * @generated
	 */
	EList getVirtualMachine();

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
	 * @see model.ModelPackage#getCloud_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Cloud#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see model.ModelPackage#getCloud_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link model.Cloud#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Provider Id</b></em>' attribute.
	 * The literals are from the enumeration {@link model.ProviderId}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Id</em>' attribute.
	 * @see model.ProviderId
	 * @see #setProviderId(ProviderId)
	 * @see model.ModelPackage#getCloud_ProviderId()
	 * @model required="true"
	 * @generated
	 */
	ProviderId getProviderId();

	/**
	 * Sets the value of the '{@link model.Cloud#getProviderId <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Id</em>' attribute.
	 * @see model.ProviderId
	 * @see #getProviderId()
	 * @generated
	 */
	void setProviderId(ProviderId value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see model.ModelPackage#getCloud_PublicKey()
	 * @model required="true"
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link model.Cloud#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see model.ModelPackage#getCloud_PrivateKey()
	 * @model required="true"
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link model.Cloud#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

} // Cloud
