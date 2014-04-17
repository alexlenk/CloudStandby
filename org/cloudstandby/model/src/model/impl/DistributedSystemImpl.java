/**
 */
package model.impl;

import java.util.Collection;

import model.Cloud;
import model.CloudStandbyReplication;
import model.Component;
import model.DistributedSystem;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distributed System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.DistributedSystemImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link model.impl.DistributedSystemImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link model.impl.DistributedSystemImpl#getCloudStandbyReplication <em>Cloud Standby Replication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributedSystemImpl extends EObjectImpl implements DistributedSystem {
	/**
	 * The cached value of the '{@link #getCloud() <em>Cloud</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud()
	 * @generated
	 * @ordered
	 */
	protected EList cloud;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList component;

	/**
	 * The cached value of the '{@link #getCloudStandbyReplication() <em>Cloud Standby Replication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudStandbyReplication()
	 * @generated
	 * @ordered
	 */
	protected CloudStandbyReplication cloudStandbyReplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DISTRIBUTED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCloud() {
		if (cloud == null) {
			cloud = new EObjectResolvingEList(Cloud.class, this, ModelPackage.DISTRIBUTED_SYSTEM__CLOUD);
		}
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList(Component.class, this, ModelPackage.DISTRIBUTED_SYSTEM__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudStandbyReplication getCloudStandbyReplication() {
		return cloudStandbyReplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudStandbyReplication(CloudStandbyReplication newCloudStandbyReplication, NotificationChain msgs) {
		CloudStandbyReplication oldCloudStandbyReplication = cloudStandbyReplication;
		cloudStandbyReplication = newCloudStandbyReplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION, oldCloudStandbyReplication, newCloudStandbyReplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudStandbyReplication(CloudStandbyReplication newCloudStandbyReplication) {
		if (newCloudStandbyReplication != cloudStandbyReplication) {
			NotificationChain msgs = null;
			if (cloudStandbyReplication != null)
				msgs = ((InternalEObject)cloudStandbyReplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION, null, msgs);
			if (newCloudStandbyReplication != null)
				msgs = ((InternalEObject)newCloudStandbyReplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION, null, msgs);
			msgs = basicSetCloudStandbyReplication(newCloudStandbyReplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION, newCloudStandbyReplication, newCloudStandbyReplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DISTRIBUTED_SYSTEM__COMPONENT:
				return ((InternalEList)getComponent()).basicRemove(otherEnd, msgs);
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION:
				return basicSetCloudStandbyReplication(null, msgs);
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
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD:
				return getCloud();
			case ModelPackage.DISTRIBUTED_SYSTEM__COMPONENT:
				return getComponent();
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION:
				return getCloudStandbyReplication();
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
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD:
				getCloud().clear();
				getCloud().addAll((Collection)newValue);
				return;
			case ModelPackage.DISTRIBUTED_SYSTEM__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection)newValue);
				return;
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION:
				setCloudStandbyReplication((CloudStandbyReplication)newValue);
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
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD:
				getCloud().clear();
				return;
			case ModelPackage.DISTRIBUTED_SYSTEM__COMPONENT:
				getComponent().clear();
				return;
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION:
				setCloudStandbyReplication((CloudStandbyReplication)null);
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
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD:
				return cloud != null && !cloud.isEmpty();
			case ModelPackage.DISTRIBUTED_SYSTEM__COMPONENT:
				return component != null && !component.isEmpty();
			case ModelPackage.DISTRIBUTED_SYSTEM__CLOUD_STANDBY_REPLICATION:
				return cloudStandbyReplication != null;
		}
		return super.eIsSet(featureID);
	}

} //DistributedSystemImpl
