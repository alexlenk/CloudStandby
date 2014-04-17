/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.TemplateDir;
import model.TemplateResource;
import model.TemplateRessource;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Dir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.TemplateDirImpl#getTemplateResource <em>Template Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateDirImpl extends TemplateResourceImpl implements TemplateDir {
	/**
	 * The cached value of the '{@link #getTemplateResource() <em>Template Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateResource()
	 * @generated
	 * @ordered
	 */
	protected EList templateResource;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateDirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TEMPLATE_DIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplateResource() {
		if (templateResource == null) {
			templateResource = new EObjectContainmentEList(TemplateResource.class, this, ModelPackage.TEMPLATE_DIR__TEMPLATE_RESOURCE);
		}
		return templateResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEMPLATE_DIR__TEMPLATE_RESOURCE:
				return ((InternalEList)getTemplateResource()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.TEMPLATE_DIR__TEMPLATE_RESOURCE:
				return getTemplateResource();
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
			case ModelPackage.TEMPLATE_DIR__TEMPLATE_RESOURCE:
				getTemplateResource().clear();
				getTemplateResource().addAll((Collection)newValue);
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
			case ModelPackage.TEMPLATE_DIR__TEMPLATE_RESOURCE:
				getTemplateResource().clear();
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
			case ModelPackage.TEMPLATE_DIR__TEMPLATE_RESOURCE:
				return templateResource != null && !templateResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateDirImpl
