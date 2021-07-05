/**
 */
package amtg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see amtg.AmtgFactory
 * @model kind="package"
 * @generated
 */
public interface AmtgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "amtg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/amtg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "amtg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmtgPackage eINSTANCE = amtg.impl.AmtgPackageImpl.init();

	/**
	 * The meta object id for the '{@link amtg.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.TestCaseImpl
	 * @see amtg.impl.AmtgPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Testmethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TESTMETHOD = 1;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link amtg.impl.TestMethodImpl <em>Test Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.TestMethodImpl
	 * @see amtg.impl.AmtgPackageImpl#getTestMethod()
	 * @generated
	 */
	int TEST_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mockobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD__MOCKOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Expectation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD__EXPECTATION = 2;

	/**
	 * The feature id for the '<em><b>Functioncall</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD__FUNCTIONCALL = 3;

	/**
	 * The feature id for the '<em><b>Realobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD__REALOBJECT = 4;

	/**
	 * The number of structural features of the '<em>Test Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Test Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link amtg.impl.MockObjectImpl <em>Mock Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.MockObjectImpl
	 * @see amtg.impl.AmtgPackageImpl#getMockObject()
	 * @generated
	 */
	int MOCK_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_OBJECT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Mock Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mock Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCK_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link amtg.impl.ExpectationImpl <em>Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.ExpectationImpl
	 * @see amtg.impl.AmtgPackageImpl#getExpectation()
	 * @generated
	 */
	int EXPECTATION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Mockobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__MOCKOBJECT = 3;

	/**
	 * The number of structural features of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link amtg.impl.RealObjectImpl <em>Real Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.RealObjectImpl
	 * @see amtg.impl.AmtgPackageImpl#getRealObject()
	 * @generated
	 */
	int REAL_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OBJECT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Real Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Real Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link amtg.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.FunctionCallImpl
	 * @see amtg.impl.AmtgPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 5;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Realobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__REALOBJECT = 2;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link amtg.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amtg.impl.ArgumentImpl
	 * @see amtg.impl.AmtgPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link amtg.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see amtg.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link amtg.TestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amtg.TestCase#getName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link amtg.TestCase#getTestmethod <em>Testmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testmethod</em>'.
	 * @see amtg.TestCase#getTestmethod()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Testmethod();

	/**
	 * Returns the meta object for class '{@link amtg.TestMethod <em>Test Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Method</em>'.
	 * @see amtg.TestMethod
	 * @generated
	 */
	EClass getTestMethod();

	/**
	 * Returns the meta object for the attribute '{@link amtg.TestMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amtg.TestMethod#getName()
	 * @see #getTestMethod()
	 * @generated
	 */
	EAttribute getTestMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link amtg.TestMethod#getMockobject <em>Mockobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mockobject</em>'.
	 * @see amtg.TestMethod#getMockobject()
	 * @see #getTestMethod()
	 * @generated
	 */
	EReference getTestMethod_Mockobject();

	/**
	 * Returns the meta object for the containment reference list '{@link amtg.TestMethod#getRealobject <em>Realobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realobject</em>'.
	 * @see amtg.TestMethod#getRealobject()
	 * @see #getTestMethod()
	 * @generated
	 */
	EReference getTestMethod_Realobject();

	/**
	 * Returns the meta object for the containment reference list '{@link amtg.TestMethod#getExpectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expectation</em>'.
	 * @see amtg.TestMethod#getExpectation()
	 * @see #getTestMethod()
	 * @generated
	 */
	EReference getTestMethod_Expectation();

	/**
	 * Returns the meta object for the containment reference list '{@link amtg.TestMethod#getFunctioncall <em>Functioncall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functioncall</em>'.
	 * @see amtg.TestMethod#getFunctioncall()
	 * @see #getTestMethod()
	 * @generated
	 */
	EReference getTestMethod_Functioncall();

	/**
	 * Returns the meta object for class '{@link amtg.MockObject <em>Mock Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mock Object</em>'.
	 * @see amtg.MockObject
	 * @generated
	 */
	EClass getMockObject();

	/**
	 * Returns the meta object for the attribute '{@link amtg.MockObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amtg.MockObject#getName()
	 * @see #getMockObject()
	 * @generated
	 */
	EAttribute getMockObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link amtg.MockObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see amtg.MockObject#getType()
	 * @see #getMockObject()
	 * @generated
	 */
	EAttribute getMockObject_Type();

	/**
	 * Returns the meta object for class '{@link amtg.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expectation</em>'.
	 * @see amtg.Expectation
	 * @generated
	 */
	EClass getExpectation();

	/**
	 * Returns the meta object for the attribute '{@link amtg.Expectation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see amtg.Expectation#getType()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_Type();

	/**
	 * Returns the meta object for the attribute '{@link amtg.Expectation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see amtg.Expectation#getParameter()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link amtg.Expectation#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see amtg.Expectation#getMethodName()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_MethodName();

	/**
	 * Returns the meta object for the reference '{@link amtg.Expectation#getMockobject <em>Mockobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mockobject</em>'.
	 * @see amtg.Expectation#getMockobject()
	 * @see #getExpectation()
	 * @generated
	 */
	EReference getExpectation_Mockobject();

	/**
	 * Returns the meta object for class '{@link amtg.RealObject <em>Real Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Object</em>'.
	 * @see amtg.RealObject
	 * @generated
	 */
	EClass getRealObject();

	/**
	 * Returns the meta object for the attribute '{@link amtg.RealObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amtg.RealObject#getName()
	 * @see #getRealObject()
	 * @generated
	 */
	EAttribute getRealObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link amtg.RealObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see amtg.RealObject#getType()
	 * @see #getRealObject()
	 * @generated
	 */
	EAttribute getRealObject_Type();

	/**
	 * Returns the meta object for class '{@link amtg.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see amtg.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link amtg.FunctionCall#getRealobject <em>Realobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realobject</em>'.
	 * @see amtg.FunctionCall#getRealobject()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Realobject();

	/**
	 * Returns the meta object for the attribute '{@link amtg.FunctionCall#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see amtg.FunctionCall#getMethodName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_MethodName();

	/**
	 * Returns the meta object for the containment reference list '{@link amtg.FunctionCall#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see amtg.FunctionCall#getArgument()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Argument();

	/**
	 * Returns the meta object for class '{@link amtg.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see amtg.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link amtg.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amtg.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link amtg.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see amtg.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmtgFactory getAmtgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link amtg.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.TestCaseImpl
		 * @see amtg.impl.AmtgPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__NAME = eINSTANCE.getTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Testmethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__TESTMETHOD = eINSTANCE.getTestCase_Testmethod();

		/**
		 * The meta object literal for the '{@link amtg.impl.TestMethodImpl <em>Test Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.TestMethodImpl
		 * @see amtg.impl.AmtgPackageImpl#getTestMethod()
		 * @generated
		 */
		EClass TEST_METHOD = eINSTANCE.getTestMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_METHOD__NAME = eINSTANCE.getTestMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Mockobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_METHOD__MOCKOBJECT = eINSTANCE.getTestMethod_Mockobject();

		/**
		 * The meta object literal for the '<em><b>Realobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_METHOD__REALOBJECT = eINSTANCE.getTestMethod_Realobject();

		/**
		 * The meta object literal for the '<em><b>Expectation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_METHOD__EXPECTATION = eINSTANCE.getTestMethod_Expectation();

		/**
		 * The meta object literal for the '<em><b>Functioncall</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_METHOD__FUNCTIONCALL = eINSTANCE.getTestMethod_Functioncall();

		/**
		 * The meta object literal for the '{@link amtg.impl.MockObjectImpl <em>Mock Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.MockObjectImpl
		 * @see amtg.impl.AmtgPackageImpl#getMockObject()
		 * @generated
		 */
		EClass MOCK_OBJECT = eINSTANCE.getMockObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOCK_OBJECT__NAME = eINSTANCE.getMockObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOCK_OBJECT__TYPE = eINSTANCE.getMockObject_Type();

		/**
		 * The meta object literal for the '{@link amtg.impl.ExpectationImpl <em>Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.ExpectationImpl
		 * @see amtg.impl.AmtgPackageImpl#getExpectation()
		 * @generated
		 */
		EClass EXPECTATION = eINSTANCE.getExpectation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__TYPE = eINSTANCE.getExpectation_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__PARAMETER = eINSTANCE.getExpectation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__METHOD_NAME = eINSTANCE.getExpectation_MethodName();

		/**
		 * The meta object literal for the '<em><b>Mockobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPECTATION__MOCKOBJECT = eINSTANCE.getExpectation_Mockobject();

		/**
		 * The meta object literal for the '{@link amtg.impl.RealObjectImpl <em>Real Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.RealObjectImpl
		 * @see amtg.impl.AmtgPackageImpl#getRealObject()
		 * @generated
		 */
		EClass REAL_OBJECT = eINSTANCE.getRealObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_OBJECT__NAME = eINSTANCE.getRealObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_OBJECT__TYPE = eINSTANCE.getRealObject_Type();

		/**
		 * The meta object literal for the '{@link amtg.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.FunctionCallImpl
		 * @see amtg.impl.AmtgPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Realobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__REALOBJECT = eINSTANCE.getFunctionCall_Realobject();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__METHOD_NAME = eINSTANCE.getFunctionCall_MethodName();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENT = eINSTANCE.getFunctionCall_Argument();

		/**
		 * The meta object literal for the '{@link amtg.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amtg.impl.ArgumentImpl
		 * @see amtg.impl.AmtgPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

	}

} //AmtgPackage
