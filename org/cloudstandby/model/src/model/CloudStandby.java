/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Standby</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.CloudStandby#getDistributedSystem <em>Distributed System</em>}</li>
 *   <li>{@link model.CloudStandby#getInstallation <em>Installation</em>}</li>
 *   <li>{@link model.CloudStandby#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link model.CloudStandby#getFederation <em>Federation</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCloudStandby()
 * @model
 * @generated
 */
public interface CloudStandby extends EObject {
	/**
	 * Returns the value of the '<em><b>Distributed System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distributed System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributed System</em>' containment reference.
	 * @see #setDistributedSystem(DistributedSystem)
	 * @see model.ModelPackage#getCloudStandby_DistributedSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DistributedSystem getDistributedSystem();

	/**
	 * Sets the value of the '{@link model.CloudStandby#getDistributedSystem <em>Distributed System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributed System</em>' containment reference.
	 * @see #getDistributedSystem()
	 * @generated
	 */
	void setDistributedSystem(DistributedSystem value);

	/**
	 * Returns the value of the '<em><b>Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation</em>' containment reference.
	 * @see #setInstallation(Installation)
	 * @see model.ModelPackage#getCloudStandby_Installation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Installation getInstallation();

	/**
	 * Sets the value of the '{@link model.CloudStandby#getInstallation <em>Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation</em>' containment reference.
	 * @see #getInstallation()
	 * @generated
	 */
	void setInstallation(Installation value);

	/**
	 * Returns the value of the '<em><b>Infrastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure</em>' containment reference.
	 * @see #setInfrastructure(Infrastructure)
	 * @see model.ModelPackage#getCloudStandby_Infrastructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Infrastructure getInfrastructure();

	/**
	 * Sets the value of the '{@link model.CloudStandby#getInfrastructure <em>Infrastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure</em>' containment reference.
	 * @see #getInfrastructure()
	 * @generated
	 */
	void setInfrastructure(Infrastructure value);

	/**
	 * Returns the value of the '<em><b>Federation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation</em>' containment reference.
	 * @see #setFederation(Federation)
	 * @see model.ModelPackage#getCloudStandby_Federation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Federation getFederation();

	/**
	 * Sets the value of the '{@link model.CloudStandby#getFederation <em>Federation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation</em>' containment reference.
	 * @see #getFederation()
	 * @generated
	 */
	void setFederation(Federation value);

} // CloudStandby
