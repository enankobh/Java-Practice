package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Linkedlist {
	
	public static void main(String[] args) {
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("A");linkList.add("B");linkList.add("C");linkList.add("D");linkList.add("E");
		linkList.add(1,"1");
		linkList.set(0, "0");
		/*System.out.println(linkList);
		linkList.removeFirst();
		System.out.println(linkList);
		linkList.removeLast();
		System.out.println(linkList);*/
		System.out.println(linkList.removeLastOccurrence("A"));
		System.out.println(linkList.removeFirstOccurrence("A"));
		ListIterator<String> it = linkList.listIterator();
		while(it.hasNext()) {
			String  nextVal = it.next();
			//String prevVal = it.previous();
			int nextIndex = it.nextIndex();
			int prevIndex = it.previousIndex();
			//linkList.remove(nextVal);
		}
		System.out.println(linkList.get(2));
		System.out.println("----------------------------------------------------------------------------------");
		linkList.addFirst("First");
		linkList.addLast("Last");
		System.out.println(linkList.getFirst());
		System.out.println(linkList.getLast());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(linkList.contains("DD"));
		System.out.println(linkList.peek());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(linkList);
		System.out.println(linkList.poll());
		System.out.println(linkList);
		System.out.println("----------------------------------------------------------------------------------");
		Queue<String> list2 = new ConcurrentLinkedQueue();
		list2.addAll(linkList);list2.add("F");list2.add("G");list2.add("H");list2.add("I");
		linkList.addAll(list2);
		System.out.println("111111"+linkList);
		System.out.println(linkList.removeAll(list2));
		System.out.println("222222"+linkList);
		Iterator<String> itl = list2.iterator();
		while(itl.hasNext()) {
			list2.remove(itl.next());
		}
		System.out.println(list2);
		System.out.println("----------------------------------------------------------------------------------");
		linkList.clear();
		linkList.push("11");
		linkList.push("22");
		linkList.push("33");
		System.out.println(linkList);
		System.out.println(linkList.pop());
		System.out.println(linkList);
		
	}

}
