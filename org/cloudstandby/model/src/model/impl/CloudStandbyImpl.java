/**
 */
package model.impl;

import model.CloudStandby;
import model.DistributedSystem;
import model.Federation;
import model.Infrastructure;
import model.Installation;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Standby</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.CloudStandbyImpl#getDistributedSystem <em>Distributed System</em>}</li>
 *   <li>{@link model.impl.CloudStandbyImpl#getInstallation <em>Installation</em>}</li>
 *   <li>{@link model.impl.CloudStandbyImpl#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link model.impl.CloudStandbyImpl#getFederation <em>Federation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudStandbyImpl extends EObjectImpl implements CloudStandby {
	/**
	 * The cached value of the '{@link #getDistributedSystem() <em>Distributed System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributedSystem()
	 * @generated
	 * @ordered
	 */
	protected DistributedSystem distributedSystem;

	/**
	 * The cached value of the '{@link #getInstallation() <em>Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallation()
	 * @generated
	 * @ordered
	 */
	protected Installation installation;

	/**
	 * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected Infrastructure infrastructure;

	/**
	 * The cached value of the '{@link #getFederation() <em>Federation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederation()
	 * @generated
	 * @ordered
	 */
	protected Federation federation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudStandbyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLOUD_STANDBY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributedSystem getDistributedSystem() {
		return distributedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributedSystem(DistributedSystem newDistributedSystem, NotificationChain msgs) {
		DistributedSystem oldDistributedSystem = distributedSystem;
		distributedSystem = newDistributedSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM, oldDistributedSystem, newDistributedSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributedSystem(DistributedSystem newDistributedSystem) {
		if (newDistributedSystem != distributedSystem) {
			NotificationChain msgs = null;
			if (distributedSystem != null)
				msgs = ((InternalEObject)distributedSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM, null, msgs);
			if (newDistributedSystem != null)
				msgs = ((InternalEObject)newDistributedSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM, null, msgs);
			msgs = basicSetDistributedSystem(newDistributedSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM, newDistributedSystem, newDistributedSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Installation getInstallation() {
		return installation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstallation(Installation newInstallation, NotificationChain msgs) {
		Installation oldInstallation = installation;
		installation = newInstallation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__INSTALLATION, oldInstallation, newInstallation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallation(Installation newInstallation) {
		if (newInstallation != installation) {
			NotificationChain msgs = null;
			if (installation != null)
				msgs = ((InternalEObject)installation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__INSTALLATION, null, msgs);
			if (newInstallation != null)
				msgs = ((InternalEObject)newInstallation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__INSTALLATION, null, msgs);
			msgs = basicSetInstallation(newInstallation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__INSTALLATION, newInstallation, newInstallation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure getInfrastructure() {
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfrastructure(Infrastructure newInfrastructure, NotificationChain msgs) {
		Infrastructure oldInfrastructure = infrastructure;
		infrastructure = newInfrastructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE, oldInfrastructure, newInfrastructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfrastructure(Infrastructure newInfrastructure) {
		if (newInfrastructure != infrastructure) {
			NotificationChain msgs = null;
			if (infrastructure != null)
				msgs = ((InternalEObject)infrastructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE, null, msgs);
			if (newInfrastructure != null)
				msgs = ((InternalEObject)newInfrastructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE, null, msgs);
			msgs = basicSetInfrastructure(newInfrastructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE, newInfrastructure, newInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Federation getFederation() {
		return federation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederation(Federation newFederation, NotificationChain msgs) {
		Federation oldFederation = federation;
		federation = newFederation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__FEDERATION, oldFederation, newFederation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederation(Federation newFederation) {
		if (newFederation != federation) {
			NotificationChain msgs = null;
			if (federation != null)
				msgs = ((InternalEObject)federation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__FEDERATION, null, msgs);
			if (newFederation != null)
				msgs = ((InternalEObject)newFederation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CLOUD_STANDBY__FEDERATION, null, msgs);
			msgs = basicSetFederation(newFederation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY__FEDERATION, newFederation, newFederation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM:
				return basicSetDistributedSystem(null, msgs);
			case ModelPackage.CLOUD_STANDBY__INSTALLATION:
				return basicSetInstallation(null, msgs);
			case ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE:
				return basicSetInfrastructure(null, msgs);
			case ModelPackage.CLOUD_STANDBY__FEDERATION:
				return basicSetFederation(null, msgs);
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
			case ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM:
				return getDistributedSystem();
			case ModelPackage.CLOUD_STANDBY__INSTALLATION:
				return getInstallation();
			case ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE:
				return getInfrastructure();
			case ModelPackage.CLOUD_STANDBY__FEDERATION:
				return getFederation();
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
			case ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM:
				setDistributedSystem((DistributedSystem)newValue);
				return;
			case ModelPackage.CLOUD_STANDBY__INSTALLATION:
				setInstallation((Installation)newValue);
				return;
			case ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE:
				setInfrastructure((Infrastructure)newValue);
				return;
			case ModelPackage.CLOUD_STANDBY__FEDERATION:
				setFederation((Federation)newValue);
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
			case ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM:
				setDistributedSystem((DistributedSystem)null);
				return;
			case ModelPackage.CLOUD_STANDBY__INSTALLATION:
				setInstallation((Installation)null);
				return;
			case ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE:
				setInfrastructure((Infrastructure)null);
				return;
			case ModelPackage.CLOUD_STANDBY__FEDERATION:
				setFederation((Federation)null);
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
			case ModelPackage.CLOUD_STANDBY__DISTRIBUTED_SYSTEM:
				return distributedSystem != null;
			case ModelPackage.CLOUD_STANDBY__INSTALLATION:
				return installation != null;
			case ModelPackage.CLOUD_STANDBY__INFRASTRUCTURE:
				return infrastructure != null;
			case ModelPackage.CLOUD_STANDBY__FEDERATION:
				return federation != null;
		}
		return super.eIsSet(featureID);
	}

} //CloudStandbyImpl
