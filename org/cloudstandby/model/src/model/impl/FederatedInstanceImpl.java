/**
 */
package model.impl;

import java.util.Collection;

import model.BackupJob;
import model.FederatedInstance;
import model.Instance;
import model.ModelPackage;

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
 * An implementation of the model object '<em><b>Federated Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FederatedInstanceImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link model.impl.FederatedInstanceImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link model.impl.FederatedInstanceImpl#getBackupJob <em>Backup Job</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FederatedInstanceImpl extends EObjectImpl implements FederatedInstance {
	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList instance;

	/**
	 * The cached value of the '{@link #getBackupJob() <em>Backup Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupJob()
	 * @generated
	 * @ordered
	 */
	protected EList backupJob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederatedInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FEDERATED_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEDERATED_INSTANCE__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList(Instance.class, this, ModelPackage.FEDERATED_INSTANCE__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBackupJob() {
		if (backupJob == null) {
			backupJob = new EObjectContainmentEList(BackupJob.class, this, ModelPackage.FEDERATED_INSTANCE__BACKUP_JOB);
		}
		return backupJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FEDERATED_INSTANCE__INSTANCE:
				return ((InternalEList)getInstance()).basicRemove(otherEnd, msgs);
			case ModelPackage.FEDERATED_INSTANCE__BACKUP_JOB:
				return ((InternalEList)getBackupJob()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.FEDERATED_INSTANCE__HOSTNAME:
				return getHostname();
			case ModelPackage.FEDERATED_INSTANCE__INSTANCE:
				return getInstance();
			case ModelPackage.FEDERATED_INSTANCE__BACKUP_JOB:
				return getBackupJob();
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
			case ModelPackage.FEDERATED_INSTANCE__HOSTNAME:
				setHostname((String)newValue);
				return;
			case ModelPackage.FEDERATED_INSTANCE__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection)newValue);
				return;
			case ModelPackage.FEDERATED_INSTANCE__BACKUP_JOB:
				getBackupJob().clear();
				getBackupJob().addAll((Collection)newValue);
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
			case ModelPackage.FEDERATED_INSTANCE__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case ModelPackage.FEDERATED_INSTANCE__INSTANCE:
				getInstance().clear();
				return;
			case ModelPackage.FEDERATED_INSTANCE__BACKUP_JOB:
				getBackupJob().clear();
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
			case ModelPackage.FEDERATED_INSTANCE__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case ModelPackage.FEDERATED_INSTANCE__INSTANCE:
				return instance != null && !instance.isEmpty();
			case ModelPackage.FEDERATED_INSTANCE__BACKUP_JOB:
				return backupJob != null && !backupJob.isEmpty();
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
		result.append(" (hostname: ");
		result.append(hostname);
		result.append(')');
		return result.toString();
	}

} //FederatedInstanceImpl
