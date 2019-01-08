package methodoverriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Child extends Parent{
	
	/*
	 * 1. Access Modifier : Access can be downgraded but can not be upgraded 
		(Access modifier hierarchy 1. Private -> 2. default -> 3. protected -> 4. public)
	*/
	/**
	 * this is not possible
	 */
	 //String firstMethod() {
		//return "In Child First Method";
	//}
	/**
	 * This is possible
	 */
	protected String secondMethod() {
		return "In Child Second Method";
	}
	/*
	 * 2. final method can not be overridden
	 * */
	/**
	 * This will produce compile time error
	 * */
	//void finalMethod() {
		//System.out.println("In side child final method");
	//}
	/*
	 * 3. static method can not be overridden. But it wont allow method with same name of parent class but different return type.
	 * 	  (Because method is inherited so same signature different return type not allowed)
	 * 	  This is not called overriding , it's called method hiding
	 * */
	/**
	 * This method won't be called overridden method. It will behave as a static method for this class.
	 * */
	
	public static String staticMethod() {
		return null;	
	} 
	
	/*
	 * 4.  To invoke the method for a parent one should use super keyword.
	 * */
	public void invokeParent() {
		super.invokeParent();
		System.out.println("Inside Child invokeParent");
	}
	/*
	 * 5.  There are rules for throwing Exception in method overriding
	 * 		i. If parent method is not throwing any exception then 
	 * 		   child method can throw only "Unchecked Exception (Runtime Exception)". 
	 * 		   Throwing "Checked Exception" will throw a compile time error.
	 * 	   ii. If parent class thrown an exception, 
	 *         child class can throw same exception or sub class of that exception   
	 * */ 
	/**
	 * # rule 1
	 * This will throw compile time error
	 * */
	/*public void exceptionRuleOne() throws Exception{
		System.out.println("Inside Child exceptionRuleOne");
	}*/
	/**
	 * #rule 1 (Second Case)
	 * This will not throw an error (As it is an Unchecked Exception)
	 * **/
	public void exceptionRuleOneNormal() throws ArithmeticException{
		System.out.println("Inside Child exceptionRuleOneNormal");
	}
	/**
	 *#rule 2
	 *This will throw compile time error 
	 **/
	/*public void exceptionRuleTwoError() throws IOException{
		System.out.println("Inside Parent exceptionRuleTwoError");
	}*/
	/**
	 * #rule 2 (Second Case)
	 * This will not throw an error because Arithmetic exception is a type of Runtime Exception
	 * */
	public void exceptionRuleTwoNormal() throws ArithmeticException{
		System.out.println("Inside Parent exceptionRuleTwoNormal");
	}
	
	/**
	 * An abstract method has to be overridden 
	 * */
	@Override
	public void abstractMethod() {
		System.out.println("Inside Child abstractMethod");
	}
	
	/**
	 * P.S. synchronized or strictfp does not have any rule on method overriding 
	 * i.e. it’s possible that a synchronized/strictfp method can override a non synchronized/strictfp one and vice-versa.
	 * */
	
}
