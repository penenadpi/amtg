/**
 */
package amtg.impl;

import amtg.AmtgPackage;
import amtg.Expectation;

import amtg.MockObject;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link amtg.impl.ExpectationImpl#getType <em>Type</em>}</li>
 *   <li>{@link amtg.impl.ExpectationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link amtg.impl.ExpectationImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link amtg.impl.ExpectationImpl#getMockobject <em>Mockobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpectationImpl extends MinimalEObjectImpl.Container implements Expectation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMockobject() <em>Mockobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMockobject()
	 * @generated
	 * @ordered
	 */
	protected MockObject mockobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmtgPackage.Literals.EXPECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.EXPECTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.EXPECTATION__PARAMETER, oldParameter,
					parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.EXPECTATION__METHOD_NAME, oldMethodName,
					methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MockObject getMockobject() {
		if (mockobject != null && mockobject.eIsProxy()) {
			InternalEObject oldMockobject = (InternalEObject) mockobject;
			mockobject = (MockObject) eResolveProxy(oldMockobject);
			if (mockobject != oldMockobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmtgPackage.EXPECTATION__MOCKOBJECT,
							oldMockobject, mockobject));
			}
		}
		return mockobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MockObject basicGetMockobject() {
		return mockobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMockobject(MockObject newMockobject) {
		MockObject oldMockobject = mockobject;
		mockobject = newMockobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.EXPECTATION__MOCKOBJECT, oldMockobject,
					mockobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AmtgPackage.EXPECTATION__TYPE:
			return getType();
		case AmtgPackage.EXPECTATION__PARAMETER:
			return getParameter();
		case AmtgPackage.EXPECTATION__METHOD_NAME:
			return getMethodName();
		case AmtgPackage.EXPECTATION__MOCKOBJECT:
			if (resolve)
				return getMockobject();
			return basicGetMockobject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AmtgPackage.EXPECTATION__TYPE:
			setType((String) newValue);
			return;
		case AmtgPackage.EXPECTATION__PARAMETER:
			setParameter((String) newValue);
			return;
		case AmtgPackage.EXPECTATION__METHOD_NAME:
			setMethodName((String) newValue);
			return;
		case AmtgPackage.EXPECTATION__MOCKOBJECT:
			setMockobject((MockObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AmtgPackage.EXPECTATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AmtgPackage.EXPECTATION__PARAMETER:
			setParameter(PARAMETER_EDEFAULT);
			return;
		case AmtgPackage.EXPECTATION__METHOD_NAME:
			setMethodName(METHOD_NAME_EDEFAULT);
			return;
		case AmtgPackage.EXPECTATION__MOCKOBJECT:
			setMockobject((MockObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AmtgPackage.EXPECTATION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case AmtgPackage.EXPECTATION__PARAMETER:
			return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
		case AmtgPackage.EXPECTATION__METHOD_NAME:
			return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
		case AmtgPackage.EXPECTATION__MOCKOBJECT:
			return mockobject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(')');
		return result.toString();
	}

} //ExpectationImpl
