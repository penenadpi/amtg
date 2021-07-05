/**
 */
package amtg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link amtg.FunctionCall#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link amtg.FunctionCall#getArgument <em>Argument</em>}</li>
 *   <li>{@link amtg.FunctionCall#getRealobject <em>Realobject</em>}</li>
 * </ul>
 *
 * @see amtg.AmtgPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Realobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realobject</em>' reference.
	 * @see #setRealobject(RealObject)
	 * @see amtg.AmtgPackage#getFunctionCall_Realobject()
	 * @model
	 * @generated
	 */
	RealObject getRealobject();

	/**
	 * Sets the value of the '{@link amtg.FunctionCall#getRealobject <em>Realobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realobject</em>' reference.
	 * @see #getRealobject()
	 * @generated
	 */
	void setRealobject(RealObject value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see amtg.AmtgPackage#getFunctionCall_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link amtg.FunctionCall#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link amtg.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see amtg.AmtgPackage#getFunctionCall_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArgument();

} // FunctionCall
