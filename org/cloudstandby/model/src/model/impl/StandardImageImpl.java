/**
 */
package model.impl;

import java.util.Collection;

import model.ConfiguredImage;
import model.ModelPackage;
import model.StandardImage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.StandardImageImpl#getConfiguredImage <em>Configured Image</em>}</li>
 *   <li>{@link model.impl.StandardImageImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.StandardImageImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link model.impl.StandardImageImpl#getJsonDescription <em>Json Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardImageImpl extends ImageImpl implements StandardImage {
	/**
	 * The cached value of the '{@link #getConfiguredImage() <em>Configured Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredImage()
	 * @generated
	 * @ordered
	 */
	protected EList configuredImage;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsonDescription() <em>Json Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonDescription() <em>Json Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDescription()
	 * @generated
	 * @ordered
	 */
	protected String jsonDescription = JSON_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.STANDARD_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfiguredImage() {
		if (configuredImage == null) {
			configuredImage = new EObjectContainmentEList(ConfiguredImage.class, this, ModelPackage.STANDARD_IMAGE__CONFIGURED_IMAGE);
		}
		return configuredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STANDARD_IMAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STANDARD_IMAGE__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsonDescription() {
		return jsonDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonDescription(String newJsonDescription) {
		String oldJsonDescription = jsonDescription;
		jsonDescription = newJsonDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STANDARD_IMAGE__JSON_DESCRIPTION, oldJsonDescription, jsonDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.STANDARD_IMAGE__CONFIGURED_IMAGE:
				return ((InternalEList)getConfiguredImage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.STANDARD_IMAGE__CONFIGURED_IMAGE:
				return getConfiguredImage();
			case ModelPackage.STANDARD_IMAGE__ID:
				return getId();
			case ModelPackage.STANDARD_IMAGE__LOGIN:
				return getLogin();
			case ModelPackage.STANDARD_IMAGE__JSON_DESCRIPTION:
				return getJsonDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.STANDARD_IMAGE__CONFIGURED_IMAGE:
				getConfiguredImage().clear();
				getConfiguredImage().addAll((Collection)newValue);
				return;
			case ModelPackage.STANDARD_IMAGE__ID:
				setId((String)newValue);
				return;
			case ModelPackage.STANDARD_IMAGE__LOGIN:
				setLogin((String)newValue);
				return;
			case ModelPackage.STANDARD_IMAGE__JSON_DESCRIPTION:
				setJsonDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.STANDARD_IMAGE__CONFIGURED_IMAGE:
				getConfiguredImage().clear();
				return;
			case ModelPackage.STANDARD_IMAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.STANDARD_IMAGE__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case ModelPackage.STANDARD_IMAGE__JSON_DESCRIPTION:
				setJsonDescription(JSON_DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.STANDARD_IMAGE__CONFIGURED_IMAGE:
				return configuredImage != null && !configuredImage.isEmpty();
			case ModelPackage.STANDARD_IMAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.STANDARD_IMAGE__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case ModelPackage.STANDARD_IMAGE__JSON_DESCRIPTION:
				return JSON_DESCRIPTION_EDEFAULT == null ? jsonDescription != null : !JSON_DESCRIPTION_EDEFAULT.equals(jsonDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", login: ");
		result.append(login);
		result.append(", jsonDescription: ");
		result.append(jsonDescription);
		result.append(')');
		return result.toString();
	}

} //StandardImageImpl
