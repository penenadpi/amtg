/**
 */
package amtg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link amtg.TestCase#getName <em>Name</em>}</li>
 *   <li>{@link amtg.TestCase#getTestmethod <em>Testmethod</em>}</li>
 * </ul>
 *
 * @see amtg.AmtgPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see amtg.AmtgPackage#getTestCase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link amtg.TestCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Testmethod</b></em>' containment reference list.
	 * The list contents are of type {@link amtg.TestMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testmethod</em>' containment reference list.
	 * @see amtg.AmtgPackage#getTestCase_Testmethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestMethod> getTestmethod();

} // TestCase
