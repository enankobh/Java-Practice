package list;

import java.util.Vector;

public class SampleVector {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,2);
		v.ensureCapacity(1); /* setting minimum capacity for the vector */
		System.out.println(v.capacity());
		v.add("A");v.add("B");v.add("C");v.add("D");v.add("E");v.add(3, "11");
		v.trimToSize();
		System.out.println(v.capacity());
		System.out.println("---------------------------------------------------------------");
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.setElementAt("22", 1);
		v.insertElementAt("F", 6);
		v.removeElementAt(1);
		System.out.println(v);
		System.out.println("---------------------------------------------------------------");
		 Vector vecretain = new Vector(4); 
		 vecretain.add("A"); 
	     vecretain.add("11"); 
	     v.retainAll(vecretain); /* retains only the passed collections elements in the vector*/
	     System.out.println(v);
	     String arr[] = new String[7];
	     v.copyInto(arr); /* copy the vector into the array*/
	     System.out.println(arr[0]);
	     System.out.println("---------------------------------------------------------------");
	     v.setSize(7); /* setting size not the capacity*/
	}

}
