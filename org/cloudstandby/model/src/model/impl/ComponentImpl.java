/**
 */
package model.impl;

import java.util.Collection;

import model.Component;
import model.FederatedImage;
import model.FederatedInstance;
import model.FederatedVirtualMachine;
import model.InstallationTask;
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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ComponentImpl#getFederatedInstance <em>Federated Instance</em>}</li>
 *   <li>{@link model.impl.ComponentImpl#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}</li>
 *   <li>{@link model.impl.ComponentImpl#getFederatedImage <em>Federated Image</em>}</li>
 *   <li>{@link model.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.ComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link model.impl.ComponentImpl#getInstallationTask <em>Installation Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
	/**
	 * The cached value of the '{@link #getFederatedInstance() <em>Federated Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederatedInstance()
	 * @generated
	 * @ordered
	 */
	protected EList federatedInstance;

	/**
	 * The cached value of the '{@link #getFederatedVirtualMachine() <em>Federated Virtual Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederatedVirtualMachine()
	 * @generated
	 * @ordered
	 */
	protected FederatedVirtualMachine federatedVirtualMachine;

	/**
	 * The cached value of the '{@link #getFederatedImage() <em>Federated Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederatedImage()
	 * @generated
	 * @ordered
	 */
	protected FederatedImage federatedImage;

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
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList requires;

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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFederatedInstance() {
		if (federatedInstance == null) {
			federatedInstance = new EObjectContainmentEList(FederatedInstance.class, this, ModelPackage.COMPONENT__FEDERATED_INSTANCE);
		}
		return federatedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedVirtualMachine getFederatedVirtualMachine() {
		if (federatedVirtualMachine != null && federatedVirtualMachine.eIsProxy()) {
			InternalEObject oldFederatedVirtualMachine = (InternalEObject)federatedVirtualMachine;
			federatedVirtualMachine = (FederatedVirtualMachine)eResolveProxy(oldFederatedVirtualMachine);
			if (federatedVirtualMachine != oldFederatedVirtualMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMPONENT__FEDERATED_VIRTUAL_MACHINE, oldFederatedVirtualMachine, federatedVirtualMachine));
			}
		}
		return federatedVirtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedVirtualMachine basicGetFederatedVirtualMachine() {
		return federatedVirtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederatedVirtualMachine(FederatedVirtualMachine newFederatedVirtualMachine) {
		FederatedVirtualMachine oldFederatedVirtualMachine = federatedVirtualMachine;
		federatedVirtualMachine = newFederatedVirtualMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPONENT__FEDERATED_VIRTUAL_MACHINE, oldFederatedVirtualMachine, federatedVirtualMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedImage getFederatedImage() {
		if (federatedImage != null && federatedImage.eIsProxy()) {
			InternalEObject oldFederatedImage = (InternalEObject)federatedImage;
			federatedImage = (FederatedImage)eResolveProxy(oldFederatedImage);
			if (federatedImage != oldFederatedImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMPONENT__FEDERATED_IMAGE, oldFederatedImage, federatedImage));
			}
		}
		return federatedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatedImage basicGetFederatedImage() {
		return federatedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederatedImage(FederatedImage newFederatedImage) {
		FederatedImage oldFederatedImage = federatedImage;
		federatedImage = newFederatedImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPONENT__FEDERATED_IMAGE, oldFederatedImage, federatedImage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList(Component.class, this, ModelPackage.COMPONENT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInstallationTask() {
		if (installationTask == null) {
			installationTask = new EObjectResolvingEList(InstallationTask.class, this, ModelPackage.COMPONENT__INSTALLATION_TASK);
		}
		return installationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPONENT__FEDERATED_INSTANCE:
				return ((InternalEList)getFederatedInstance()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPONENT__FEDERATED_INSTANCE:
				return getFederatedInstance();
			case ModelPackage.COMPONENT__FEDERATED_VIRTUAL_MACHINE:
				if (resolve) return getFederatedVirtualMachine();
				return basicGetFederatedVirtualMachine();
			case ModelPackage.COMPONENT__FEDERATED_IMAGE:
				if (resolve) return getFederatedImage();
				return basicGetFederatedImage();
			case ModelPackage.COMPONENT__NAME:
				return getName();
			case ModelPackage.COMPONENT__REQUIRES:
				return getRequires();
			case ModelPackage.COMPONENT__INSTALLATION_TASK:
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
			case ModelPackage.COMPONENT__FEDERATED_INSTANCE:
				getFederatedInstance().clear();
				getFederatedInstance().addAll((Collection)newValue);
				return;
			case ModelPackage.COMPONENT__FEDERATED_VIRTUAL_MACHINE:
				setFederatedVirtualMachine((FederatedVirtualMachine)newValue);
				return;
			case ModelPackage.COMPONENT__FEDERATED_IMAGE:
				setFederatedImage((FederatedImage)newValue);
				return;
			case ModelPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.COMPONENT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection)newValue);
				return;
			case ModelPackage.COMPONENT__INSTALLATION_TASK:
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
			case ModelPackage.COMPONENT__FEDERATED_INSTANCE:
				getFederatedInstance().clear();
				return;
			case ModelPackage.COMPONENT__FEDERATED_VIRTUAL_MACHINE:
				setFederatedVirtualMachine((FederatedVirtualMachine)null);
				return;
			case ModelPackage.COMPONENT__FEDERATED_IMAGE:
				setFederatedImage((FederatedImage)null);
				return;
			case ModelPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.COMPONENT__REQUIRES:
				getRequires().clear();
				return;
			case ModelPackage.COMPONENT__INSTALLATION_TASK:
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
			case ModelPackage.COMPONENT__FEDERATED_INSTANCE:
				return federatedInstance != null && !federatedInstance.isEmpty();
			case ModelPackage.COMPONENT__FEDERATED_VIRTUAL_MACHINE:
				return federatedVirtualMachine != null;
			case ModelPackage.COMPONENT__FEDERATED_IMAGE:
				return federatedImage != null;
			case ModelPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.COMPONENT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case ModelPackage.COMPONENT__INSTALLATION_TASK:
				return installationTask != null && !installationTask.isEmpty();
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

} //ComponentImpl
