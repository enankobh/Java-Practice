package methodoverloading;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MethodOverloading {

	public static void main(String[] args) throws FileNotFoundException {
		Child p = new Child();
		List<String> list = new ArrayList<String>();
		p.abstractMethod();
		p.exceptionRuleOneError();
		p.exceptionRuleOneNormal();
		p.exceptionRuleTwoError();
		p.exceptionRuleTwoNormal();
		p.finalMethod();
		p.firstMethod();
		p.invokeParent();
		p.secondMethod();
		p.thirdMethod(list);
		Child.staticMethod();
	}
}
