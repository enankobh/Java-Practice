package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QUeue {

	/** Queue is an ordered list and it's functionalities are limited to FIFO
	 * All Queues except the Deques supports insertion and removal at the tail 
	 * and head of the queue respectively. The Deques support element insertion and removal at both ends.
	 * */
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		System.out.println(queue);
		/* This method shows the head element without removing the element*/
		System.out.println(queue.peek());
		/*This method is same as peek */
		System.out.println(queue.element());
		/*This method is used to remove element from the queue and it returns boolean*/
		System.out.println(queue.remove("E"));
		System.out.println(queue);
		/*This method will pop the head of the queue and remove the element*/
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.size());
		Deque<String> dequeue = new LinkedList<String>();
		dequeue.add("A");
		dequeue.add("B");
		dequeue.add("C");
		dequeue.add("D");
		dequeue.add("E");
		System.out.println(dequeue.removeFirstOccurrence("B"));
		System.out.println(dequeue.removeFirst());
		System.out.println(dequeue.removeLast());
		System.out.println(dequeue.offerFirst("A"));
		System.out.println(dequeue);
		
	}
}
