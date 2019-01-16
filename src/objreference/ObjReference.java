package objreference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * In java obj reference are defined based on the garbage collection pattern. Base on the the way how they are garbage collecteed there are
 * four types of Object Reference 
 * 	1. Strong reference
 * 	2. Weak reference
 * 	3. Soft reference
 * 	4. Phantom reference
 * 
 * */
public class ObjReference {

	public static void main(String[] args) {
		
		/**
		 * Strong Reference
		 *  This is the default type/class of Reference Object. 
		 *  Any object which has an active strong reference are not eligible for garbage collection. 
		 *  The object is garbage collected only when the variable which was strongly referenced points to null. 
		 **/
		ObjReferenceTest strongReference1 = new ObjReferenceTest();
		ObjReferenceTest strongReference2 = new ObjReferenceTest();
		ObjReferenceTest strongReference3 = new ObjReferenceTest();
		ObjReferenceTest strongReference4 = new ObjReferenceTest();
		strongReference1.method();
		
		//strongReference.method();
		/**
		 * Weak Reference
		 * 
		 * Weak Reference Objects are not the default type/class of Reference Object and they
		 *  should be explicitly specified while using them.
		 *  	This type of reference is used in WeakHashMap to reference the entry objects .
		 *  	If JVM detects an object with only weak references 
		 *  (i.e. no strong or soft references linked to any object object), this object will be marked for garbage collection.
		 *  To create such references java.lang.ref.WeakReference class is used.
		 *  These references are used in real time applications while establishing a DBConnection which might be 
		 *  cleaned up by Garbage Collector when the application using the database gets closed.
		 * */
		WeakReference<ObjReferenceTest> weakref = new WeakReference<ObjReferenceTest>(strongReference2);
		//Now, ObjReferenceTest-type object to which 'strongReference' was pointing earlier 
        //is available for garbage collection. 
        //But, it will be garbage collected only when JVM needs memory. 
		strongReference2  = null;
		 // You can retrieve back the object which 
        // has been weakly referenced. 
        // It succesfully calls the method. 
		weakref.get().method();
		
		/**
		 * Soft Reference
		 * 
		 * In Soft reference, even if the object is free for garbage collection then also its not garbage collected,
		 * until JVM is in need of memory badly.The objects gets cleared from the memory when JVM runs out of memory.
		 * This is one kind of weak reference
		 * */
		SoftReference<ObjReferenceTest> softref = new SoftReference<ObjReferenceTest>(strongReference3);
		strongReference3 = null;
		softref.get().method();
		
		/**
		 * Phantom Reference
		 * 
		 * The objects which are being referenced by phantom references are eligible for garbage collection.
		 * But, before removing them from the memory, JVM puts them in a queue called ‘reference queue’ . 
		 * They are put in a reference queue after calling finalize() method on them.
		 * */
		//Creating reference queue 
        ReferenceQueue<ObjReferenceTest> refQueue = new ReferenceQueue<ObjReferenceTest>(); 
  
        //Creating Phantom Reference to ObjReferenceTest-type object to which 'strongReference4'  
        //is also pointing. 
        PhantomReference<ObjReferenceTest> phantomRef = null; 
          
        phantomRef = new PhantomReference<ObjReferenceTest>(strongReference4,refQueue); 
          
        //Now, ObjReferenceTest-type object to which 'strongReference4' was pointing 
        //earlier is available for garbage collection. 
        //But, this object is kept in 'refQueue' before  
        //removing it from the memory. 
        strongReference4 = null;  
          
        //It always returns null.  
        strongReference4 = phantomRef.get();  
          
        //It shows NullPointerException. 
        strongReference4.method(); 
	}
}
class ObjReferenceTest{
	
	public void method() {
		System.out.println("Hello World");
	}
	
}