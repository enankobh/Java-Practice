package objreference;

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
		ObjReferenceTest strongReference = new ObjReferenceTest();
		
	}
}
class ObjReferenceTest{
	
}