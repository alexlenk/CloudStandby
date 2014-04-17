/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ScriptCollection#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link model.ScriptCollection#getTemplateResource <em>Template Resource</em>}</li>
 *   <li>{@link model.ScriptCollection#getName <em>Name</em>}</li>
 *   <li>{@link model.ScriptCollection#getInstallationScript <em>Installation Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getScriptCollection()
 * @model
 * @generated
 */
public interface ScriptCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link model.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see model.ModelPackage#getScriptCollection_Attribute()
	 * @model type="model.Attribute" containment="true"
	 * @generated
	 */
	EList getAttribute();

	/**
	 * Returns the value of the '<em><b>Template Resource</b></em>' containment reference list.
	 * The list contents are of type {@link model.TemplateResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Resource</em>' containment reference list.
	 * @see model.ModelPackage#getScriptCollection_TemplateResource()
	 * @model type="model.TemplateResource" containment="true"
	 * @generated
	 */
	EList getTemplateResource();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getScriptCollection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.ScriptCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Installation Script</b></em>' containment reference list.
	 * The list contents are of type {@link model.InstallationScript}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Script</em>' containment reference list.
	 * @see model.ModelPackage#getScriptCollection_InstallationScript()
	 * @model type="model.InstallationScript" containment="true" required="true"
	 * @generated
	 */
	EList getInstallationScript();

} // ScriptCollection
