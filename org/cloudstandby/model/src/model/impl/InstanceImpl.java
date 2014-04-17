/**
 */
package model.impl;

import model.Cloud;
import model.Instance;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.InstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.InstanceImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link model.impl.InstanceImpl#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link model.impl.InstanceImpl#getDns <em>Dns</em>}</li>
 *   <li>{@link model.impl.InstanceImpl#getPrivateIp <em>Private Ip</em>}</li>
 *   <li>{@link model.impl.InstanceImpl#getPrivateDns <em>Private Dns</em>}</li>
 *   <li>{@link model.impl.InstanceImpl#getCloud <em>Cloud</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends EObjectImpl implements Instance {
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
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String modelIdentifier = MODEL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected String dns = DNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateIp() <em>Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIp()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateIp() <em>Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIp()
	 * @generated
	 * @ordered
	 */
	protected String privateIp = PRIVATE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateDns() <em>Private Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateDns()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_DNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateDns() <em>Private Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateDns()
	 * @generated
	 * @ordered
	 */
	protected String privateDns = PRIVATE_DNS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCloud() <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud()
	 * @generated
	 * @ordered
	 */
	protected Cloud cloud;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelIdentifier() {
		return modelIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIdentifier(String newModelIdentifier) {
		String oldModelIdentifier = modelIdentifier;
		modelIdentifier = newModelIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__MODEL_IDENTIFIER, oldModelIdentifier, modelIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDns() {
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDns(String newDns) {
		String oldDns = dns;
		dns = newDns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__DNS, oldDns, dns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateIp() {
		return privateIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateIp(String newPrivateIp) {
		String oldPrivateIp = privateIp;
		privateIp = newPrivateIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__PRIVATE_IP, oldPrivateIp, privateIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateDns() {
		return privateDns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateDns(String newPrivateDns) {
		String oldPrivateDns = privateDns;
		privateDns = newPrivateDns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__PRIVATE_DNS, oldPrivateDns, privateDns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud getCloud() {
		if (cloud != null && cloud.eIsProxy()) {
			InternalEObject oldCloud = (InternalEObject)cloud;
			cloud = (Cloud)eResolveProxy(oldCloud);
			if (cloud != oldCloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.INSTANCE__CLOUD, oldCloud, cloud));
			}
		}
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud basicGetCloud() {
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud(Cloud newCloud) {
		Cloud oldCloud = cloud;
		cloud = newCloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__CLOUD, oldCloud, cloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.INSTANCE__ID:
				return getId();
			case ModelPackage.INSTANCE__IP:
				return getIp();
			case ModelPackage.INSTANCE__MODEL_IDENTIFIER:
				return getModelIdentifier();
			case ModelPackage.INSTANCE__DNS:
				return getDns();
			case ModelPackage.INSTANCE__PRIVATE_IP:
				return getPrivateIp();
			case ModelPackage.INSTANCE__PRIVATE_DNS:
				return getPrivateDns();
			case ModelPackage.INSTANCE__CLOUD:
				if (resolve) return getCloud();
				return basicGetCloud();
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
			case ModelPackage.INSTANCE__ID:
				setId((String)newValue);
				return;
			case ModelPackage.INSTANCE__IP:
				setIp((String)newValue);
				return;
			case ModelPackage.INSTANCE__MODEL_IDENTIFIER:
				setModelIdentifier((String)newValue);
				return;
			case ModelPackage.INSTANCE__DNS:
				setDns((String)newValue);
				return;
			case ModelPackage.INSTANCE__PRIVATE_IP:
				setPrivateIp((String)newValue);
				return;
			case ModelPackage.INSTANCE__PRIVATE_DNS:
				setPrivateDns((String)newValue);
				return;
			case ModelPackage.INSTANCE__CLOUD:
				setCloud((Cloud)newValue);
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
			case ModelPackage.INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.INSTANCE__IP:
				setIp(IP_EDEFAULT);
				return;
			case ModelPackage.INSTANCE__MODEL_IDENTIFIER:
				setModelIdentifier(MODEL_IDENTIFIER_EDEFAULT);
				return;
			case ModelPackage.INSTANCE__DNS:
				setDns(DNS_EDEFAULT);
				return;
			case ModelPackage.INSTANCE__PRIVATE_IP:
				setPrivateIp(PRIVATE_IP_EDEFAULT);
				return;
			case ModelPackage.INSTANCE__PRIVATE_DNS:
				setPrivateDns(PRIVATE_DNS_EDEFAULT);
				return;
			case ModelPackage.INSTANCE__CLOUD:
				setCloud((Cloud)null);
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
			case ModelPackage.INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.INSTANCE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case ModelPackage.INSTANCE__MODEL_IDENTIFIER:
				return MODEL_IDENTIFIER_EDEFAULT == null ? modelIdentifier != null : !MODEL_IDENTIFIER_EDEFAULT.equals(modelIdentifier);
			case ModelPackage.INSTANCE__DNS:
				return DNS_EDEFAULT == null ? dns != null : !DNS_EDEFAULT.equals(dns);
			case ModelPackage.INSTANCE__PRIVATE_IP:
				return PRIVATE_IP_EDEFAULT == null ? privateIp != null : !PRIVATE_IP_EDEFAULT.equals(privateIp);
			case ModelPackage.INSTANCE__PRIVATE_DNS:
				return PRIVATE_DNS_EDEFAULT == null ? privateDns != null : !PRIVATE_DNS_EDEFAULT.equals(privateDns);
			case ModelPackage.INSTANCE__CLOUD:
				return cloud != null;
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
		result.append(", ip: ");
		result.append(ip);
		result.append(", modelIdentifier: ");
		result.append(modelIdentifier);
		result.append(", dns: ");
		result.append(dns);
		result.append(", privateIp: ");
		result.append(privateIp);
		result.append(", privateDns: ");
		result.append(privateDns);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
