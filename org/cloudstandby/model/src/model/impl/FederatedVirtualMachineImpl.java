/**
 */
package model.impl;

import java.util.Collection;

import model.FederatedVirtualMachine;
import model.ModelPackage;
import model.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Federated Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FederatedVirtualMachineImpl#getVirtualMachine <em>Virtual Machine</em>}</li>
 *   <li>{@link model.impl.FederatedVirtualMachineImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FederatedVirtualMachineImpl extends EObjectImpl implements FederatedVirtualMachine {
	/**
	 * The cached value of the '{@link #getVirtualMachine() <em>Virtual Machine</em>}' reference list.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederatedVirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FEDERATED_VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVirtualMachine() {
		if (virtualMachine == null) {
			virtualMachine = new EObjectResolvingEList(VirtualMachine.class, this, ModelPackage.FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEDERATED_VIRTUAL_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE:
				return getVirtualMachine();
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__NAME:
				return getName();
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
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE:
				getVirtualMachine().clear();
				getVirtualMachine().addAll((Collection)newValue);
				return;
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__NAME:
				setName((String)newValue);
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
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE:
				getVirtualMachine().clear();
				return;
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__NAME:
				setName(NAME_EDEFAULT);
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
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__VIRTUAL_MACHINE:
				return virtualMachine != null && !virtualMachine.isEmpty();
			case ModelPackage.FEDERATED_VIRTUAL_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //FederatedVirtualMachineImpl
