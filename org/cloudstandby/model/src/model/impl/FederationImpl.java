/**
 */
package model.impl;

import java.util.Collection;

import model.FederatedImage;
import model.FederatedVirtualMachine;
import model.Federation;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Federation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FederationImpl#getFederatedImage <em>Federated Image</em>}</li>
 *   <li>{@link model.impl.FederationImpl#getFederatedVirtualMachine <em>Federated Virtual Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FederationImpl extends EObjectImpl implements Federation {
	/**
	 * The cached value of the '{@link #getFederatedImage() <em>Federated Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederatedImage()
	 * @generated
	 * @ordered
	 */
	protected EList federatedImage;

	/**
	 * The cached value of the '{@link #getFederatedVirtualMachine() <em>Federated Virtual Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederatedVirtualMachine()
	 * @generated
	 * @ordered
	 */
	protected EList federatedVirtualMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FEDERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFederatedImage() {
		if (federatedImage == null) {
			federatedImage = new EObjectContainmentEList(FederatedImage.class, this, ModelPackage.FEDERATION__FEDERATED_IMAGE);
		}
		return federatedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFederatedVirtualMachine() {
		if (federatedVirtualMachine == null) {
			federatedVirtualMachine = new EObjectContainmentEList(FederatedVirtualMachine.class, this, ModelPackage.FEDERATION__FEDERATED_VIRTUAL_MACHINE);
		}
		return federatedVirtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FEDERATION__FEDERATED_IMAGE:
				return ((InternalEList)getFederatedImage()).basicRemove(otherEnd, msgs);
			case ModelPackage.FEDERATION__FEDERATED_VIRTUAL_MACHINE:
				return ((InternalEList)getFederatedVirtualMachine()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.FEDERATION__FEDERATED_IMAGE:
				return getFederatedImage();
			case ModelPackage.FEDERATION__FEDERATED_VIRTUAL_MACHINE:
				return getFederatedVirtualMachine();
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
			case ModelPackage.FEDERATION__FEDERATED_IMAGE:
				getFederatedImage().clear();
				getFederatedImage().addAll((Collection)newValue);
				return;
			case ModelPackage.FEDERATION__FEDERATED_VIRTUAL_MACHINE:
				getFederatedVirtualMachine().clear();
				getFederatedVirtualMachine().addAll((Collection)newValue);
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
			case ModelPackage.FEDERATION__FEDERATED_IMAGE:
				getFederatedImage().clear();
				return;
			case ModelPackage.FEDERATION__FEDERATED_VIRTUAL_MACHINE:
				getFederatedVirtualMachine().clear();
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
			case ModelPackage.FEDERATION__FEDERATED_IMAGE:
				return federatedImage != null && !federatedImage.isEmpty();
			case ModelPackage.FEDERATION__FEDERATED_VIRTUAL_MACHINE:
				return federatedVirtualMachine != null && !federatedVirtualMachine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FederationImpl
