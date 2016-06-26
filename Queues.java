package javaCollections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

///(Head) <--oooooooooooooooooooooooooo<--(tail)
		//FIFO Structure
		//first element which adding to the queue became the first element that will be 
		//removed from the queue.
		//linked list is kind of queue. 
		//a data structure where you add elements to the end of the queue and remove elements
		//to the beginning of the queue. 
		/*Remove=> at the beginnig of the queue
		 * Adding=> at the end of the queue; 
		 * ENQUEUE : adding an element to the end of the queue
		 * DEQUEUE: removing an element from the beginnig of the queue; 
		 * PEEK: see the first element of the queue
		 * OFFER: adds to queue if the space if offer. 
		 * Enqueue and Dequeue complexity is O(1)
		 * POLL: remove items until it became empty. 
		 * */


public class Queues {
	

	public static void main(String[] args)
	{
		//System.out.println("Head of the queue is: " +q1.element());
		//throws no element exception
	
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of the queue is: " +q1.element());
	
		try {
		
			// ArrayBlockingQueue<Integer>(3) defines the size. 
		
			q1.add(40);
			
			
		} catch (IllegalStateException e) {
			System.out.println("try to add to many items to the queue");
		}
		
		for(Integer value:q1)
		{
			System.out.println("Queue value "+ value);
		}
	
		//Integer value = q1.remove();
		System.out.println("Removed from a queue: " + q1.remove());
		System.out.println("Removed from a queue: " + q1.remove());
		System.out.println("Removed from a queue: " + q1.remove());
		try {
			
		} catch (NoSuchElementException e) {
			System.out.println("TRY TO REMOVE TO MANY ELEMENTS ");
		}
		
		System.out.println();
		
		for(Integer values:q1)
		{
			System.out.println("Queue value "+ values);
		}
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		System.out.println("Q PEAK " + q2.peek());
		
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		
		System.out.println("Q PEAK " + q2.peek());
		
		for(Integer values:q2)
		{
			System.out.println("Queue value "+ values);
		}
		
		System.out.println("Queue 2 poll " + q2.poll());
		System.out.println("Queue 2 poll " + q2.poll());
		System.out.println("Queue 2 poll " + q2.poll());
		System.out.println("Queue 2 poll " + q2.poll());
		
		
	}

}
