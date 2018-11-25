package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		 	Set a = new HashSet(); 
	        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
	        a.add("A");
	        a.add(6);
	        Set<Integer> b = new HashSet<Integer>(); 
	        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
	        System.out.println("Set A :::::::"+a);
	        System.out.println("Set B :::::::"+b);
	        System.out.println("---------------------------------------------------------------------");
	        // To find union 
	        Set<Integer> union = new HashSet<Integer>(a); 
	        union.addAll(b); 
	        Iterator it = union.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next());
	        }
	        System.out.print("Union of the two Set"); 
	        System.out.println(union); 
	        System.out.println("---------------------------------------------------------------------");
	        // To find intersection 
	        Set<Integer> intersection = new HashSet<Integer>(a); 
	        intersection.retainAll(b); 
	        System.out.print("Intersection of the two Set"); 
	        System.out.println(intersection); 
	        System.out.println("---------------------------------------------------------------------");
	        // To find the symmetric difference 
	        Set<Integer> difference = new HashSet<Integer>(a); 
	        difference.removeAll(b); 
	        System.out.print("Difference of the two Set"); 
	        System.out.println(difference); 
	        System.out.println("---------------------------------------------------------------------");
	        
	        System.out.println("		Number of stored elements in the table");
	        System.out.println("load factor = -------------------------------------------");
	        System.out.println("                       Size of the hash table			 "); 
	        
	        Set<String> elementSet = new HashSet<String>();
	        elementSet.add("abc");//to populate
	        elementSet.add("pqr");
	        System.out.println(Collections.unmodifiableSet(elementSet));
	        
	}
}
