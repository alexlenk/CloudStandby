/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rsync Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.RsyncJob#getLocal <em>Local</em>}</li>
 *   <li>{@link model.RsyncJob#getRemote <em>Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getRsyncJob()
 * @model
 * @generated
 */
public interface RsyncJob extends BackupJob {
	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(String)
	 * @see model.ModelPackage#getRsyncJob_Local()
	 * @model required="true"
	 * @generated
	 */
	String getLocal();

	/**
	 * Sets the value of the '{@link model.RsyncJob#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(String value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #setRemote(String)
	 * @see model.ModelPackage#getRsyncJob_Remote()
	 * @model required="true"
	 * @generated
	 */
	String getRemote();

	/**
	 * Sets the value of the '{@link model.RsyncJob#getRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(String value);

} // RsyncJob
