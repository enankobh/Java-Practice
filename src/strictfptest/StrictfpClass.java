package strictfptest;

public class StrictfpClass implements Strictfp{

	@Override
	public double method1() {
		 double num1 = 0.0000005; 
	     double num2 = 0.0000006; 
         return (num1+num2); 
	  
	}

	/*@Override
	public strictfp double method2() {
		// TODO Auto-generated method stub
		return 0;
	}
*/
	
}
