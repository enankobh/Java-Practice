package set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {

	
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet<>();
		treeSet.add("A");
		treeSet.add(1);
		treeSet.add(true);
		treeSet.add(4.0f);
		treeSet.add(100L);
		System.out.println(treeSet); /* throws  ClassCastException as it needs homogenous and comparable implemented elements*/
		SortedSet<String> sites = new TreeSet<>(); 
        sites.add("practice"); 
        sites.add("geeksforgeeks"); 
        sites.add("quiz"); 
        sites.add("code"); 
        
        Iterator it = sites.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
		
	}
}
