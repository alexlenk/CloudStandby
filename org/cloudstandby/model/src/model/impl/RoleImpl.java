/**
 */
package model.impl;

import java.util.Collection;

import model.InstallationTask;
import model.ModelPackage;
import model.Role;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.RoleImpl#getInstallationTask <em>Installation Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends InstallationTaskImpl implements Role {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInstallationTask() {
		if (installationTask == null) {
			installationTask = new EObjectResolvingEList(InstallationTask.class, this, ModelPackage.ROLE__INSTALLATION_TASK);
		}
		return installationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROLE__INSTALLATION_TASK:
				return getInstallationTask();
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
			case ModelPackage.ROLE__INSTALLATION_TASK:
				getInstallationTask().clear();
				getInstallationTask().addAll((Collection)newValue);
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
			case ModelPackage.ROLE__INSTALLATION_TASK:
				getInstallationTask().clear();
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
			case ModelPackage.ROLE__INSTALLATION_TASK:
				return installationTask != null && !installationTask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
