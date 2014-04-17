/**
 */
package model.impl;

import java.util.Collection;

import model.Attribute;
import model.InstallationScript;
import model.ModelPackage;
import model.ScriptCollection;
import model.TemplateResource;
import model.TemplateRessource;

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
 * An implementation of the model object '<em><b>Script Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ScriptCollectionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link model.impl.ScriptCollectionImpl#getTemplateResource <em>Template Resource</em>}</li>
 *   <li>{@link model.impl.ScriptCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.ScriptCollectionImpl#getInstallationScript <em>Installation Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptCollectionImpl extends EObjectImpl implements ScriptCollection {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList attribute;

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
	 * The cached value of the '{@link #getInstallationScript() <em>Installation Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationScript()
	 * @generated
	 * @ordered
	 */
	protected EList installationScript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SCRIPT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList(Attribute.class, this, ModelPackage.SCRIPT_COLLECTION__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplateResource() {
		if (templateResource == null) {
			templateResource = new EObjectContainmentEList(TemplateResource.class, this, ModelPackage.SCRIPT_COLLECTION__TEMPLATE_RESOURCE);
		}
		return templateResource;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCRIPT_COLLECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInstallationScript() {
		if (installationScript == null) {
			installationScript = new EObjectContainmentEList(InstallationScript.class, this, ModelPackage.SCRIPT_COLLECTION__INSTALLATION_SCRIPT);
		}
		return installationScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SCRIPT_COLLECTION__ATTRIBUTE:
				return ((InternalEList)getAttribute()).basicRemove(otherEnd, msgs);
			case ModelPackage.SCRIPT_COLLECTION__TEMPLATE_RESOURCE:
				return ((InternalEList)getTemplateResource()).basicRemove(otherEnd, msgs);
			case ModelPackage.SCRIPT_COLLECTION__INSTALLATION_SCRIPT:
				return ((InternalEList)getInstallationScript()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SCRIPT_COLLECTION__ATTRIBUTE:
				return getAttribute();
			case ModelPackage.SCRIPT_COLLECTION__TEMPLATE_RESOURCE:
				return getTemplateResource();
			case ModelPackage.SCRIPT_COLLECTION__NAME:
				return getName();
			case ModelPackage.SCRIPT_COLLECTION__INSTALLATION_SCRIPT:
				return getInstallationScript();
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
			case ModelPackage.SCRIPT_COLLECTION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection)newValue);
				return;
			case ModelPackage.SCRIPT_COLLECTION__TEMPLATE_RESOURCE:
				getTemplateResource().clear();
				getTemplateResource().addAll((Collection)newValue);
				return;
			case ModelPackage.SCRIPT_COLLECTION__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.SCRIPT_COLLECTION__INSTALLATION_SCRIPT:
				getInstallationScript().clear();
				getInstallationScript().addAll((Collection)newValue);
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
			case ModelPackage.SCRIPT_COLLECTION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case ModelPackage.SCRIPT_COLLECTION__TEMPLATE_RESOURCE:
				getTemplateResource().clear();
				return;
			case ModelPackage.SCRIPT_COLLECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.SCRIPT_COLLECTION__INSTALLATION_SCRIPT:
				getInstallationScript().clear();
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
			case ModelPackage.SCRIPT_COLLECTION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case ModelPackage.SCRIPT_COLLECTION__TEMPLATE_RESOURCE:
				return templateResource != null && !templateResource.isEmpty();
			case ModelPackage.SCRIPT_COLLECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.SCRIPT_COLLECTION__INSTALLATION_SCRIPT:
				return installationScript != null && !installationScript.isEmpty();
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

} //ScriptCollectionImpl
