/**
 */
package amtg.impl;

import amtg.AmtgPackage;
import amtg.Expectation;
import amtg.FunctionCall;
import amtg.MockObject;
import amtg.RealObject;
import amtg.TestMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link amtg.impl.TestMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link amtg.impl.TestMethodImpl#getMockobject <em>Mockobject</em>}</li>
 *   <li>{@link amtg.impl.TestMethodImpl#getExpectation <em>Expectation</em>}</li>
 *   <li>{@link amtg.impl.TestMethodImpl#getFunctioncall <em>Functioncall</em>}</li>
 *   <li>{@link amtg.impl.TestMethodImpl#getRealobject <em>Realobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestMethodImpl extends MinimalEObjectImpl.Container implements TestMethod {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMockobject() <em>Mockobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMockobject()
	 * @generated
	 * @ordered
	 */
	protected EList<MockObject> mockobject;

	/**
	 * The cached value of the '{@link #getExpectation() <em>Expectation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation()
	 * @generated
	 * @ordered
	 */
	protected EList<Expectation> expectation;

	/**
	 * The cached value of the '{@link #getFunctioncall() <em>Functioncall</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctioncall()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionCall> functioncall;

	/**
	 * The cached value of the '{@link #getRealobject() <em>Realobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealobject()
	 * @generated
	 * @ordered
	 */
	protected EList<RealObject> realobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmtgPackage.Literals.TEST_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.TEST_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MockObject> getMockobject() {
		if (mockobject == null) {
			mockobject = new EObjectContainmentEList<MockObject>(MockObject.class, this,
					AmtgPackage.TEST_METHOD__MOCKOBJECT);
		}
		return mockobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealObject> getRealobject() {
		if (realobject == null) {
			realobject = new EObjectContainmentEList<RealObject>(RealObject.class, this,
					AmtgPackage.TEST_METHOD__REALOBJECT);
		}
		return realobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expectation> getExpectation() {
		if (expectation == null) {
			expectation = new EObjectContainmentEList<Expectation>(Expectation.class, this,
					AmtgPackage.TEST_METHOD__EXPECTATION);
		}
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionCall> getFunctioncall() {
		if (functioncall == null) {
			functioncall = new EObjectContainmentEList<FunctionCall>(FunctionCall.class, this,
					AmtgPackage.TEST_METHOD__FUNCTIONCALL);
		}
		return functioncall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AmtgPackage.TEST_METHOD__MOCKOBJECT:
			return ((InternalEList<?>) getMockobject()).basicRemove(otherEnd, msgs);
		case AmtgPackage.TEST_METHOD__EXPECTATION:
			return ((InternalEList<?>) getExpectation()).basicRemove(otherEnd, msgs);
		case AmtgPackage.TEST_METHOD__FUNCTIONCALL:
			return ((InternalEList<?>) getFunctioncall()).basicRemove(otherEnd, msgs);
		case AmtgPackage.TEST_METHOD__REALOBJECT:
			return ((InternalEList<?>) getRealobject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AmtgPackage.TEST_METHOD__NAME:
			return getName();
		case AmtgPackage.TEST_METHOD__MOCKOBJECT:
			return getMockobject();
		case AmtgPackage.TEST_METHOD__EXPECTATION:
			return getExpectation();
		case AmtgPackage.TEST_METHOD__FUNCTIONCALL:
			return getFunctioncall();
		case AmtgPackage.TEST_METHOD__REALOBJECT:
			return getRealobject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AmtgPackage.TEST_METHOD__NAME:
			setName((String) newValue);
			return;
		case AmtgPackage.TEST_METHOD__MOCKOBJECT:
			getMockobject().clear();
			getMockobject().addAll((Collection<? extends MockObject>) newValue);
			return;
		case AmtgPackage.TEST_METHOD__EXPECTATION:
			getExpectation().clear();
			getExpectation().addAll((Collection<? extends Expectation>) newValue);
			return;
		case AmtgPackage.TEST_METHOD__FUNCTIONCALL:
			getFunctioncall().clear();
			getFunctioncall().addAll((Collection<? extends FunctionCall>) newValue);
			return;
		case AmtgPackage.TEST_METHOD__REALOBJECT:
			getRealobject().clear();
			getRealobject().addAll((Collection<? extends RealObject>) newValue);
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
		case AmtgPackage.TEST_METHOD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AmtgPackage.TEST_METHOD__MOCKOBJECT:
			getMockobject().clear();
			return;
		case AmtgPackage.TEST_METHOD__EXPECTATION:
			getExpectation().clear();
			return;
		case AmtgPackage.TEST_METHOD__FUNCTIONCALL:
			getFunctioncall().clear();
			return;
		case AmtgPackage.TEST_METHOD__REALOBJECT:
			getRealobject().clear();
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
		case AmtgPackage.TEST_METHOD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AmtgPackage.TEST_METHOD__MOCKOBJECT:
			return mockobject != null && !mockobject.isEmpty();
		case AmtgPackage.TEST_METHOD__EXPECTATION:
			return expectation != null && !expectation.isEmpty();
		case AmtgPackage.TEST_METHOD__FUNCTIONCALL:
			return functioncall != null && !functioncall.isEmpty();
		case AmtgPackage.TEST_METHOD__REALOBJECT:
			return realobject != null && !realobject.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestMethodImpl
