/**
 */
package model.impl;

import model.CloudStandbyReplication;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Standby Replication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.CloudStandbyReplicationImpl#getUpdateInterval <em>Update Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudStandbyReplicationImpl extends EObjectImpl implements CloudStandbyReplication {
	/**
	 * The default value of the '{@link #getUpdateInterval() <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int UPDATE_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpdateInterval() <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateInterval()
	 * @generated
	 * @ordered
	 */
	protected int updateInterval = UPDATE_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudStandbyReplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLOUD_STANDBY_REPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpdateInterval() {
		return updateInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateInterval(int newUpdateInterval) {
		int oldUpdateInterval = updateInterval;
		updateInterval = newUpdateInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL, oldUpdateInterval, updateInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL:
				return new Integer(getUpdateInterval());
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
			case ModelPackage.CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL:
				setUpdateInterval(((Integer)newValue).intValue());
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
			case ModelPackage.CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL:
				setUpdateInterval(UPDATE_INTERVAL_EDEFAULT);
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
			case ModelPackage.CLOUD_STANDBY_REPLICATION__UPDATE_INTERVAL:
				return updateInterval != UPDATE_INTERVAL_EDEFAULT;
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
		result.append(" (updateInterval: ");
		result.append(updateInterval);
		result.append(')');
		return result.toString();
	}

} //CloudStandbyReplicationImpl
