package methodoverriding;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class Parent {

	protected String firstMethod() {
		return "In Parent First Method";
	}
	String secondMethod() {
		return "In Parent Second Method";
	}
	final void finalMethod() {
		System.out.println("Inside Parent final");
	}
	public List<String> thirdMethod(List<String> list){
		return list;
	}
	public static String staticMethod() {
		return "Inside parent staticmethod";
	}
	public void invokeParent() {
		System.out.println("Inside Parent invokeParent");
	}
	public void exceptionRuleOneError() {
		System.out.println("Inside Parent exceptionRuleOneError");
	}
	public void exceptionRuleOneNormal() {
		System.out.println("Inside Parent exceptionRuleOneNormal");
	}
	public void exceptionRuleTwoError() throws FileNotFoundException{
		System.out.println("Inside Parent exceptionRuleTwoError");
	}
	public void exceptionRuleTwoNormal() throws RuntimeException{
		System.out.println("Inside Parent exceptionRuleTwoNormal");
	}
	public abstract void abstractMethod();
}

