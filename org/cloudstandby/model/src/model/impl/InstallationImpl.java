/**
 */
package model.impl;

import java.util.Collection;

import model.Installation;
import model.ModelPackage;
import model.Role;
import model.ScriptCollection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.InstallationImpl#getScriptCollection <em>Script Collection</em>}</li>
 *   <li>{@link model.impl.InstallationImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstallationImpl extends EObjectImpl implements Installation {
	/**
	 * The cached value of the '{@link #getScriptCollection() <em>Script Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptCollection()
	 * @generated
	 * @ordered
	 */
	protected EList scriptCollection;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstallationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INSTALLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getScriptCollection() {
		if (scriptCollection == null) {
			scriptCollection = new EObjectContainmentEList(ScriptCollection.class, this, ModelPackage.INSTALLATION__SCRIPT_COLLECTION);
		}
		return scriptCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRole() {
		if (role == null) {
			role = new EObjectContainmentEList(Role.class, this, ModelPackage.INSTALLATION__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INSTALLATION__SCRIPT_COLLECTION:
				return ((InternalEList)getScriptCollection()).basicRemove(otherEnd, msgs);
			case ModelPackage.INSTALLATION__ROLE:
				return ((InternalEList)getRole()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INSTALLATION__SCRIPT_COLLECTION:
				return getScriptCollection();
			case ModelPackage.INSTALLATION__ROLE:
				return getRole();
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
			case ModelPackage.INSTALLATION__SCRIPT_COLLECTION:
				getScriptCollection().clear();
				getScriptCollection().addAll((Collection)newValue);
				return;
			case ModelPackage.INSTALLATION__ROLE:
				getRole().clear();
				getRole().addAll((Collection)newValue);
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
			case ModelPackage.INSTALLATION__SCRIPT_COLLECTION:
				getScriptCollection().clear();
				return;
			case ModelPackage.INSTALLATION__ROLE:
				getRole().clear();
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
			case ModelPackage.INSTALLATION__SCRIPT_COLLECTION:
				return scriptCollection != null && !scriptCollection.isEmpty();
			case ModelPackage.INSTALLATION__ROLE:
				return role != null && !role.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstallationImpl
