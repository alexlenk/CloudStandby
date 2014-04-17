/**
 */
package model.impl;

import java.util.Collection;

import model.AdditionalDrive;
import model.ConfiguredImage;
import model.InstallationTask;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configured Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ConfiguredImageImpl#getInstallationTask <em>Installation Task</em>}</li>
 *   <li>{@link model.impl.ConfiguredImageImpl#getAdditionalDrive <em>Additional Drive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfiguredImageImpl extends ImageImpl implements ConfiguredImage {
	/**
	 * The cached value of the '{@link #getInstallationTask() <em>Installation Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationTask()
	 * @generated
	 * @ordered
	 */
	protected EList installationTask;

	/**
	 * The cached value of the '{@link #getAdditionalDrive() <em>Additional Drive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDrive()
	 * @generated
	 * @ordered
	 */
	protected EList additionalDrive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguredImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONFIGURED_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInstallationTask() {
		if (installationTask == null) {
			installationTask = new EObjectResolvingEList(InstallationTask.class, this, ModelPackage.CONFIGURED_IMAGE__INSTALLATION_TASK);
		}
		return installationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAdditionalDrive() {
		if (additionalDrive == null) {
			additionalDrive = new EObjectContainmentEList(AdditionalDrive.class, this, ModelPackage.CONFIGURED_IMAGE__ADDITIONAL_DRIVE);
		}
		return additionalDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONFIGURED_IMAGE__ADDITIONAL_DRIVE:
				return ((InternalEList)getAdditionalDrive()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CONFIGURED_IMAGE__INSTALLATION_TASK:
				return getInstallationTask();
			case ModelPackage.CONFIGURED_IMAGE__ADDITIONAL_DRIVE:
				return getAdditionalDrive();
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
			case ModelPackage.CONFIGURED_IMAGE__INSTALLATION_TASK:
				getInstallationTask().clear();
				getInstallationTask().addAll((Collection)newValue);
				return;
			case ModelPackage.CONFIGURED_IMAGE__ADDITIONAL_DRIVE:
				getAdditionalDrive().clear();
				getAdditionalDrive().addAll((Collection)newValue);
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
			case ModelPackage.CONFIGURED_IMAGE__INSTALLATION_TASK:
				getInstallationTask().clear();
				return;
			case ModelPackage.CONFIGURED_IMAGE__ADDITIONAL_DRIVE:
				getAdditionalDrive().clear();
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
			case ModelPackage.CONFIGURED_IMAGE__INSTALLATION_TASK:
				return installationTask != null && !installationTask.isEmpty();
			case ModelPackage.CONFIGURED_IMAGE__ADDITIONAL_DRIVE:
				return additionalDrive != null && !additionalDrive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfiguredImageImpl
