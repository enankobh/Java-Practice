package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		HashSet<Integer> a = new LinkedHashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        a.add(6);
        System.out.println(a);
        LinkedHashSet linkedset = new LinkedHashSet<String>();   

        // Adding element to LinkedHashSet   
		linkedset.add("A");   
		linkedset.add("B");   
		linkedset.add("C");   
		linkedset.add("D");  
		
		// This will not add new element as A already exists  
		linkedset.add("A");  
		linkedset.add("E");   
		linkedset.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
		Iterator it = linkedset.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
		
		System.out.println("Size of LinkedHashSet = " + 
		                         linkedset.size());   
		System.out.println("Original LinkedHashSet:" + linkedset);   
		System.out.println("Removing D from LinkedHashSet: " + 
		                 linkedset.remove("D"));   
		System.out.println("Trying to Remove Z which is not "+ 
		                 "present: " + linkedset.remove("Z"));   
		System.out.println("Checking if A is present=" +  
		                 linkedset.contains("A")); 
		System.out.println("Updated LinkedHashSet: " + linkedset); 
		 
	}
}
