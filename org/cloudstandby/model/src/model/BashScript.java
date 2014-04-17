/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bash Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.BashScript#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getBashScript()
 * @model
 * @generated
 */
public interface BashScript extends InstallationScript {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see model.ModelPackage#getBashScript_Code()
	 * @model default="" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link model.BashScript#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // BashScript
