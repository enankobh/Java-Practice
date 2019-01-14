package overloading;

public class Methodoverloading {
	
	public static void main(String[] args) {
		Overload ov = new Overload();
		System.out.println(ov.method1(2, 2));
		System.out.println(ov.method1(2.0, 2.0));
		System.out.println(ov.method1('2', '2'));
		Overload.static1();
		System.out.println(Overload.static1("A", "B"));
	}
	public static int main(String a , String b) {
		return 0;
	}
	
}
class Overload{
	
	/**
	 * Method overloading is compile time polymorphism i.e. same function with different parameters .
	 * */
	public int method1(int a , int b) {
		System.out.println("Inside int method");
		return a+b;
	}
	public double method1(double a , double b) {
		System.out.println("Inside double method");
		return a+b;
	}
	public String method1(String a , String b) {
		System.out.println("Inside String method");
		return a+":"+b;
	}
	/**
	 * We cannot overload method on return type i.e. with same parameter but different return type will throw compilation error.
	 * Overloading methods on return type is possible in cases where data type of the function being called is explicitly specified. 
	 * (Check the previous method1 declaration)
	 * */
	/*public char method1(String a , String b) {
		return a+b;
	}*/
	
	/**
	 * We can overload static methods but with different parameters
	 * */
	public static void static1() {
		System.out.println("Inside static1 void method");
	}
	public static String static1(String a , String b) {
		return a+":"+b;
	}
	
}