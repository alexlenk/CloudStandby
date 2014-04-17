/**
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provider Id</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see model.ModelPackage#getProviderId()
 * @model
 * @generated
 */
public final class ProviderId extends AbstractEnumerator {
	/**
	 * The '<em><b>Amazon EC2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amazon EC2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMAZON_EC2_LITERAL
	 * @model name="AmazonEC2" literal="aws-ec2"
	 * @generated
	 * @ordered
	 */
	public static final int AMAZON_EC2 = 0;

	/**
	 * The '<em><b>Rackspace Cloudservers US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rackspace Cloudservers US</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RACKSPACE_CLOUDSERVERS_US_LITERAL
	 * @model name="RackspaceCloudserversUS" literal="rackspace-cloudservers-us"
	 * @generated
	 * @ordered
	 */
	public static final int RACKSPACE_CLOUDSERVERS_US = 1;

	/**
	 * The '<em><b>Amazon EC2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMAZON_EC2
	 * @generated
	 * @ordered
	 */
	public static final ProviderId AMAZON_EC2_LITERAL = new ProviderId(AMAZON_EC2, "AmazonEC2", "aws-ec2");

	/**
	 * The '<em><b>Rackspace Cloudservers US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACKSPACE_CLOUDSERVERS_US
	 * @generated
	 * @ordered
	 */
	public static final ProviderId RACKSPACE_CLOUDSERVERS_US_LITERAL = new ProviderId(RACKSPACE_CLOUDSERVERS_US, "RackspaceCloudserversUS", "rackspace-cloudservers-us");

	/**
	 * An array of all the '<em><b>Provider Id</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProviderId[] VALUES_ARRAY =
		new ProviderId[] {
			AMAZON_EC2_LITERAL,
			RACKSPACE_CLOUDSERVERS_US_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Provider Id</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provider Id</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderId get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProviderId result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provider Id</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderId getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProviderId result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provider Id</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderId get(int value) {
		switch (value) {
			case AMAZON_EC2: return AMAZON_EC2_LITERAL;
			case RACKSPACE_CLOUDSERVERS_US: return RACKSPACE_CLOUDSERVERS_US_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProviderId(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProviderId
