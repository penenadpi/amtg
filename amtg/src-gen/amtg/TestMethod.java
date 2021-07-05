/**
 */
package amtg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link amtg.TestMethod#getName <em>Name</em>}</li>
 *   <li>{@link amtg.TestMethod#getMockobject <em>Mockobject</em>}</li>
 *   <li>{@link amtg.TestMethod#getExpectation <em>Expectation</em>}</li>
 *   <li>{@link amtg.TestMethod#getFunctioncall <em>Functioncall</em>}</li>
 *   <li>{@link amtg.TestMethod#getRealobject <em>Realobject</em>}</li>
 * </ul>
 *
 * @see amtg.AmtgPackage#getTestMethod()
 * @model
 * @generated
 */
public interface TestMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see amtg.AmtgPackage#getTestMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link amtg.TestMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mockobject</b></em>' containment reference list.
	 * The list contents are of type {@link amtg.MockObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mockobject</em>' containment reference list.
	 * @see amtg.AmtgPackage#getTestMethod_Mockobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<MockObject> getMockobject();

	/**
	 * Returns the value of the '<em><b>Realobject</b></em>' containment reference list.
	 * The list contents are of type {@link amtg.RealObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realobject</em>' containment reference list.
	 * @see amtg.AmtgPackage#getTestMethod_Realobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<RealObject> getRealobject();

	/**
	 * Returns the value of the '<em><b>Expectation</b></em>' containment reference list.
	 * The list contents are of type {@link amtg.Expectation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectation</em>' containment reference list.
	 * @see amtg.AmtgPackage#getTestMethod_Expectation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expectation> getExpectation();

	/**
	 * Returns the value of the '<em><b>Functioncall</b></em>' containment reference list.
	 * The list contents are of type {@link amtg.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functioncall</em>' containment reference list.
	 * @see amtg.AmtgPackage#getTestMethod_Functioncall()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionCall> getFunctioncall();

} // TestMethod
