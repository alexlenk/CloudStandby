/**
 */
package model.impl;

import java.util.Collection;

import model.Cloud;
import model.ModelPackage;
import model.ProviderId;
import model.StandardImage;
import model.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.CloudImpl#getStandardImage <em>Standard Image</em>}</li>
 *   <li>{@link model.impl.CloudImpl#getVirtualMachine <em>Virtual Machine</em>}</li>
 *   <li>{@link model.impl.CloudImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.CloudImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link model.impl.CloudImpl#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link model.impl.CloudImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link model.impl.CloudImpl#getPrivateKey <em>Private Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudImpl extends EObjectImpl implements Cloud {
	/**
	 * The cached value of the '{@link #getStandardImage() <em>Standard Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardImage()
	 * @generated
	 * @ordered
	 */
	protected EList standardImage;

	/**
	 * The cached value of the '{@link #getVirtualMachine() <em>Virtual Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMachine()
	 * @generated
	 * @ordered
	 */
	protected EList virtualMachine;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderId PROVIDER_ID_EDEFAULT = ProviderId.AMAZON_EC2_LITERAL;

	/**
	 * The cached value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected ProviderId providerId = PROVIDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String publicKey = PUBLIC_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStandardImage() {
		if (standardImage == null) {
			standardImage = new EObjectContainmentEList(StandardImage.class, this, ModelPackage.CLOUD__STANDARD_IMAGE);
		}
		return standardImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVirtualMachine() {
		if (virtualMachine == null) {
			virtualMachine = new EObjectContainmentEList(VirtualMachine.class, this, ModelPackage.CLOUD__VIRTUAL_MACHINE);
		}
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderId getProviderId() {
		return providerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderId(ProviderId newProviderId) {
		ProviderId oldProviderId = providerId;
		providerId = newProviderId == null ? PROVIDER_ID_EDEFAULT : newProviderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD__PROVIDER_ID, oldProviderId, providerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(String newPublicKey) {
		String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD__PUBLIC_KEY, oldPublicKey, publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CLOUD__STANDARD_IMAGE:
				return ((InternalEList)getStandardImage()).basicRemove(otherEnd, msgs);
			case ModelPackage.CLOUD__VIRTUAL_MACHINE:
				return ((InternalEList)getVirtualMachine()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CLOUD__STANDARD_IMAGE:
				return getStandardImage();
			case ModelPackage.CLOUD__VIRTUAL_MACHINE:
				return getVirtualMachine();
			case ModelPackage.CLOUD__NAME:
				return getName();
			case ModelPackage.CLOUD__LOCATION:
				return getLocation();
			case ModelPackage.CLOUD__PROVIDER_ID:
				return getProviderId();
			case ModelPackage.CLOUD__PUBLIC_KEY:
				return getPublicKey();
			case ModelPackage.CLOUD__PRIVATE_KEY:
				return getPrivateKey();
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
			case ModelPackage.CLOUD__STANDARD_IMAGE:
				getStandardImage().clear();
				getStandardImage().addAll((Collection)newValue);
				return;
			case ModelPackage.CLOUD__VIRTUAL_MACHINE:
				getVirtualMachine().clear();
				getVirtualMachine().addAll((Collection)newValue);
				return;
			case ModelPackage.CLOUD__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.CLOUD__LOCATION:
				setLocation((String)newValue);
				return;
			case ModelPackage.CLOUD__PROVIDER_ID:
				setProviderId((ProviderId)newValue);
				return;
			case ModelPackage.CLOUD__PUBLIC_KEY:
				setPublicKey((String)newValue);
				return;
			case ModelPackage.CLOUD__PRIVATE_KEY:
				setPrivateKey((String)newValue);
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
			case ModelPackage.CLOUD__STANDARD_IMAGE:
				getStandardImage().clear();
				return;
			case ModelPackage.CLOUD__VIRTUAL_MACHINE:
				getVirtualMachine().clear();
				return;
			case ModelPackage.CLOUD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.CLOUD__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ModelPackage.CLOUD__PROVIDER_ID:
				setProviderId(PROVIDER_ID_EDEFAULT);
				return;
			case ModelPackage.CLOUD__PUBLIC_KEY:
				setPublicKey(PUBLIC_KEY_EDEFAULT);
				return;
			case ModelPackage.CLOUD__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
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
			case ModelPackage.CLOUD__STANDARD_IMAGE:
				return standardImage != null && !standardImage.isEmpty();
			case ModelPackage.CLOUD__VIRTUAL_MACHINE:
				return virtualMachine != null && !virtualMachine.isEmpty();
			case ModelPackage.CLOUD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.CLOUD__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ModelPackage.CLOUD__PROVIDER_ID:
				return providerId != PROVIDER_ID_EDEFAULT;
			case ModelPackage.CLOUD__PUBLIC_KEY:
				return PUBLIC_KEY_EDEFAULT == null ? publicKey != null : !PUBLIC_KEY_EDEFAULT.equals(publicKey);
			case ModelPackage.CLOUD__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", providerId: ");
		result.append(providerId);
		result.append(", publicKey: ");
		result.append(publicKey);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(')');
		return result.toString();
	}

} //CloudImpl
