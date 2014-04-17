/**
 */
package model.impl;

import model.ModelPackage;
import model.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.VirtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.VirtualMachineImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.VirtualMachineImpl#getJsonDescription <em>Json Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineImpl extends EObjectImpl implements VirtualMachine {
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
	 * The default value of the '{@link #getJsonDescription() <em>Json Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonDescription() <em>Json Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDescription()
	 * @generated
	 * @ordered
	 */
	protected String jsonDescription = JSON_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VIRTUAL_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VIRTUAL_MACHINE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VIRTUAL_MACHINE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsonDescription() {
		return jsonDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonDescription(String newJsonDescription) {
		String oldJsonDescription = jsonDescription;
		jsonDescription = newJsonDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VIRTUAL_MACHINE__JSON_DESCRIPTION, oldJsonDescription, jsonDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.VIRTUAL_MACHINE__NAME:
				return getName();
			case ModelPackage.VIRTUAL_MACHINE__ID:
				return getId();
			case ModelPackage.VIRTUAL_MACHINE__JSON_DESCRIPTION:
				return getJsonDescription();
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
			case ModelPackage.VIRTUAL_MACHINE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.VIRTUAL_MACHINE__ID:
				setId((String)newValue);
				return;
			case ModelPackage.VIRTUAL_MACHINE__JSON_DESCRIPTION:
				setJsonDescription((String)newValue);
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
			case ModelPackage.VIRTUAL_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.VIRTUAL_MACHINE__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.VIRTUAL_MACHINE__JSON_DESCRIPTION:
				setJsonDescription(JSON_DESCRIPTION_EDEFAULT);
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
			case ModelPackage.VIRTUAL_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.VIRTUAL_MACHINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.VIRTUAL_MACHINE__JSON_DESCRIPTION:
				return JSON_DESCRIPTION_EDEFAULT == null ? jsonDescription != null : !JSON_DESCRIPTION_EDEFAULT.equals(jsonDescription);
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
		result.append(", id: ");
		result.append(id);
		result.append(", jsonDescription: ");
		result.append(jsonDescription);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl
