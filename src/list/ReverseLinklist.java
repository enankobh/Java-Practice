package list;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinklist {
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("1");linkedList.add("2");linkedList.add("3");linkedList.add("4");linkedList.add("5");
		System.out.print("Before reversal---->  ");
		System.out.println(linkedList);
		System.out.print("After reversal----->  ");
		System.out.println(reverseLinkedList(linkedList));
		System.out.print("Before reversal---->  ");
		System.out.println(linkedList);
		Collections.reverse(linkedList);
		System.out.print("After reversal----->  ");
		System.out.println(linkedList);
	}
	public static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList){
		int listSize = linkedList.size();
		for(int i = 0;i<linkedList.size()/2;i++) {
			String s = linkedList.get(i);
			linkedList.set(i,linkedList.get(listSize - i-1));
			linkedList.set((listSize-i-1),s);
		}
		return linkedList;
	}
}
