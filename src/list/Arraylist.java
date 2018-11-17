package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist {
	
	public static void checkarrayofArrayList() {

        int n = 5; 
  
        // Here al is an array of arraylist having 
        // n number of rows.The number of columns on 
        // each row depends on the user. 
        // al[i].size() will give the size of the 
        // i'th row 
        ArrayList<Integer>[] al = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        } 
  
        // We can add any number of columns to each 
        // rows as per our wish 
        al[0].add(1); 
        al[0].add(2); 
        al[1].add(5); 
        al[2].add(10); 
        al[2].add(20); 
        al[2].add(30); 
        al[3].add(56); 
        al[4].add(34); 
        al[4].add(67); 
        al[4].add(89); 
        al[4].add(12); 
  
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < al[i].size(); j++) { 
                System.out.print(al[i].get(j) + " "); 
            } 
            System.out.println(); 
        } 
	}
	public static void main(String[] args) {
		checkarrayofArrayList();
		List<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		arrList.add("E");
		arrList.add("F");
		arrList.remove("A");
		/* The following code will generate concurrent modification Exception*/
		/*ListIterator<String> i = arrList.iterator();
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
		System.out.println(list1);
		for(int x=0;x<list1.size(); x++) {
			System.out.print(list1.get(x));
			list1.remove(x); /* Updates the original list*/
			System.out.println("::"+list1.get(x));
		}
		System.out.println(list1);
		System.out.println(list1.indexOf("A"));
		System.out.println(list1.lastIndexOf("C"));
		System.out.println(list1.subList(0,3)); /* This method returns the elements between two index*/
		ListIterator<String> i=list1.listIterator();
		while(i.hasNext()) {
			int prevIndex = i.previousIndex();
			int nextindex = i.nextIndex();
			String nextval = i.next();
			//String prevval = i.previous();
			System.out.println(nextindex+"::"+prevIndex);
			System.out.print(nextval+","); /* Dont take the updated list . takes the list which was assigned to it earlier*/
			list1.remove(nextval);
			//list1.add("B");
		}
		/*i = list1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		System.out.println();
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		for (int it=1; it<=6; it++) 
            arrli.add(it); 
		System.out.println(arrli.size());
		//arrli.clear(); /* Clearing the arraylist i.e. removing all the element*/
		System.out.println(arrli.size());
		System.out.println(arrli);
		System.out.println(arrli.clone());
		Integer a[] = new Integer[arrli.size()];
		a = arrli.toArray(a); /* Converting into an array and defining the type of the array as a parameter*/
		for(Integer o  : a) {
			System.out.println(o);
		}
		
	}

}
