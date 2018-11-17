package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
		/* The following code will generate concurrent mocification Exception*/
		List<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		arrList.add("E");
		arrList.add("F");
		arrList.remove("A");
		/*Iterator<String> i = arrList.iterator();
		while(i.hasNext()) {
			String ele = i.next();
			System.out.println(i.next());
			arrList.remove(ele);
		}*/
		/*
		 * This is one of the way to stop this exception
		 * */
		List<String> list1  = new CopyOnWriteArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("F");
		list1.add("G");
		list1.add(4, "X"); /* It will shift the indexes after adding*/
		list1.set(4, "E"); /* It will change the value at that position*/
		System.out.println(list1.get(4)); /* Getting value for an index*/
		list1.addAll(0,arrList); /* Adding Collection to anothoer collection*/
		System.out.println(list1.size());
		for(int x=0;x<list1.size(); x++) {
			System.out.print(list1.get(x));
			list1.remove(x); /* Updates the original list*/
			System.out.println("::"+list1.get(x));
		}
		System.out.println(list1.size());
		Iterator<String> i=list1.iterator();
		while(i.hasNext()) {
			String val = i.next();
			System.out.println(val); /* Dont take the updated list . takes the list which was assigned to it earlier*/
			list1.remove(val);
			//list1.add("B");
		}
		/*i = list1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
	}

}
