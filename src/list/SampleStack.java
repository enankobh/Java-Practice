package list;

import java.util.Stack;

public class SampleStack {

	public static void main(String[] args) {
		Stack<String> stck = new Stack<String>();
		stck.push("A");stck.push("A");stck.push("B");stck.push("C");stck.push("D");stck.push("E");stck.push("F");
		System.out.println("-------------------------------------pop------------------------------------------");
		System.out.println(stck);
		System.out.println(stck.pop());
		System.out.println(stck);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------peek------------------------------------------");
		System.out.println(stck);
		System.out.println(stck.peek());
		System.out.println(stck);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(stck.search("A")); /*returns the position of the element from the top of the stack (first occurance)*/
	}
}
