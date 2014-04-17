/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Instance#getId <em>Id</em>}</li>
 *   <li>{@link model.Instance#getIp <em>Ip</em>}</li>
 *   <li>{@link model.Instance#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link model.Instance#getDns <em>Dns</em>}</li>
 *   <li>{@link model.Instance#getPrivateIp <em>Private Ip</em>}</li>
 *   <li>{@link model.Instance#getPrivateDns <em>Private Dns</em>}</li>
 *   <li>{@link model.Instance#getCloud <em>Cloud</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
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
	 * @see model.ModelPackage#getInstance_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link model.Instance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see model.ModelPackage#getInstance_Ip()
	 * @model required="true"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link model.Instance#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Identifier</em>' attribute.
	 * @see #setModelIdentifier(String)
	 * @see model.ModelPackage#getInstance_ModelIdentifier()
	 * @model
	 * @generated
	 */
	String getModelIdentifier();

	/**
	 * Sets the value of the '{@link model.Instance#getModelIdentifier <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Identifier</em>' attribute.
	 * @see #getModelIdentifier()
	 * @generated
	 */
	void setModelIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns</em>' attribute.
	 * @see #setDns(String)
	 * @see model.ModelPackage#getInstance_Dns()
	 * @model
	 * @generated
	 */
	String getDns();

	/**
	 * Sets the value of the '{@link model.Instance#getDns <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns</em>' attribute.
	 * @see #getDns()
	 * @generated
	 */
	void setDns(String value);

	/**
	 * Returns the value of the '<em><b>Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Ip</em>' attribute.
	 * @see #setPrivateIp(String)
	 * @see model.ModelPackage#getInstance_PrivateIp()
	 * @model
	 * @generated
	 */
	String getPrivateIp();

	/**
	 * Sets the value of the '{@link model.Instance#getPrivateIp <em>Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Ip</em>' attribute.
	 * @see #getPrivateIp()
	 * @generated
	 */
	void setPrivateIp(String value);

	/**
	 * Returns the value of the '<em><b>Private Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Dns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Dns</em>' attribute.
	 * @see #setPrivateDns(String)
	 * @see model.ModelPackage#getInstance_PrivateDns()
	 * @model
	 * @generated
	 */
	String getPrivateDns();

	/**
	 * Sets the value of the '{@link model.Instance#getPrivateDns <em>Private Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Dns</em>' attribute.
	 * @see #getPrivateDns()
	 * @generated
	 */
	void setPrivateDns(String value);

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' reference.
	 * @see #setCloud(Cloud)
	 * @see model.ModelPackage#getInstance_Cloud()
	 * @model required="true"
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Sets the value of the '{@link model.Instance#getCloud <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' reference.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(Cloud value);

} // Instance
