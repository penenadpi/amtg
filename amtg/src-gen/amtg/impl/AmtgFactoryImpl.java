/**
 */
package amtg.impl;

import amtg.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmtgFactoryImpl extends EFactoryImpl implements AmtgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmtgFactory init() {
		try {
			AmtgFactory theAmtgFactory = (AmtgFactory) EPackage.Registry.INSTANCE.getEFactory(AmtgPackage.eNS_URI);
			if (theAmtgFactory != null) {
				return theAmtgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmtgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmtgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AmtgPackage.TEST_CASE:
			return createTestCase();
		case AmtgPackage.TEST_METHOD:
			return createTestMethod();
		case AmtgPackage.MOCK_OBJECT:
			return createMockObject();
		case AmtgPackage.EXPECTATION:
			return createExpectation();
		case AmtgPackage.REAL_OBJECT:
			return createRealObject();
		case AmtgPackage.FUNCTION_CALL:
			return createFunctionCall();
		case AmtgPackage.ARGUMENT:
			return createArgument();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMethod createTestMethod() {
		TestMethodImpl testMethod = new TestMethodImpl();
		return testMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MockObject createMockObject() {
		MockObjectImpl mockObject = new MockObjectImpl();
		return mockObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expectation createExpectation() {
		ExpectationImpl expectation = new ExpectationImpl();
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealObject createRealObject() {
		RealObjectImpl realObject = new RealObjectImpl();
		return realObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmtgPackage getAmtgPackage() {
		return (AmtgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmtgPackage getPackage() {
		return AmtgPackage.eINSTANCE;
	}

} //AmtgFactoryImpl
