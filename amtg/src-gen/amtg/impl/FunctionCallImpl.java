/**
 */
package amtg.impl;

import amtg.AmtgPackage;
import amtg.Argument;
import amtg.FunctionCall;
import amtg.RealObject;

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
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link amtg.impl.FunctionCallImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link amtg.impl.FunctionCallImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link amtg.impl.FunctionCallImpl#getRealobject <em>Realobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends MinimalEObjectImpl.Container implements FunctionCall {
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
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * The cached value of the '{@link #getRealobject() <em>Realobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealobject()
	 * @generated
	 * @ordered
	 */
	protected RealObject realobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmtgPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealObject getRealobject() {
		if (realobject != null && realobject.eIsProxy()) {
			InternalEObject oldRealobject = (InternalEObject) realobject;
			realobject = (RealObject) eResolveProxy(oldRealobject);
			if (realobject != oldRealobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmtgPackage.FUNCTION_CALL__REALOBJECT,
							oldRealobject, realobject));
			}
		}
		return realobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealObject basicGetRealobject() {
		return realobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealobject(RealObject newRealobject) {
		RealObject oldRealobject = realobject;
		realobject = newRealobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.FUNCTION_CALL__REALOBJECT, oldRealobject,
					realobject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmtgPackage.FUNCTION_CALL__METHOD_NAME, oldMethodName,
					methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argument>(Argument.class, this, AmtgPackage.FUNCTION_CALL__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AmtgPackage.FUNCTION_CALL__ARGUMENT:
			return ((InternalEList<?>) getArgument()).basicRemove(otherEnd, msgs);
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
		case AmtgPackage.FUNCTION_CALL__METHOD_NAME:
			return getMethodName();
		case AmtgPackage.FUNCTION_CALL__ARGUMENT:
			return getArgument();
		case AmtgPackage.FUNCTION_CALL__REALOBJECT:
			if (resolve)
				return getRealobject();
			return basicGetRealobject();
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
		case AmtgPackage.FUNCTION_CALL__METHOD_NAME:
			setMethodName((String) newValue);
			return;
		case AmtgPackage.FUNCTION_CALL__ARGUMENT:
			getArgument().clear();
			getArgument().addAll((Collection<? extends Argument>) newValue);
			return;
		case AmtgPackage.FUNCTION_CALL__REALOBJECT:
			setRealobject((RealObject) newValue);
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
		case AmtgPackage.FUNCTION_CALL__METHOD_NAME:
			setMethodName(METHOD_NAME_EDEFAULT);
			return;
		case AmtgPackage.FUNCTION_CALL__ARGUMENT:
			getArgument().clear();
			return;
		case AmtgPackage.FUNCTION_CALL__REALOBJECT:
			setRealobject((RealObject) null);
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
		case AmtgPackage.FUNCTION_CALL__METHOD_NAME:
			return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
		case AmtgPackage.FUNCTION_CALL__ARGUMENT:
			return argument != null && !argument.isEmpty();
		case AmtgPackage.FUNCTION_CALL__REALOBJECT:
			return realobject != null;
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(')');
		return result.toString();
	}

} //FunctionCallImpl
