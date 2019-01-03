package strictfptest;
/* It ensures same result for floating point calculation for different bits*/
public strictfp interface Strictfp {

	double method1();
	/* If an interface/class is defined as strictfp , there is no need to define method as strictfp*/
	//strictfp double method2();
}
