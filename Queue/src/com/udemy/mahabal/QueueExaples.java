/* Queue 
 * 1)ArrayBacked Queue 
 * 2)LinkedList Queue
 * 3)Priority Queue
 * 4)Blocked Queue -- not allow null values:
 * 
 * By using ArrayBlocked Queue we can give paricular size to the queue.
 * if the elements are inserted greater than the Size then it will through error.
 * 
 * Dequeue is same as the Queue and in Queue we are able to add remove elements only one side but in Dequeue we are able to remove& add the elements from both the ends.
 * Methods
 * 1)add();  --offer();   --offerfirst()  offerlast()
 * 2)remove();-- poll();  --pollfirst();   polllast();
 * 3)element();-- element(); --getFirst()  getlast();
 * 
 * 
 * 
 */



package com.udemy.mahabal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExaples {
	public static void main(String[] args) {
		//Queue<String> list=new LinkedBlockingQueue<>();
		Queue<String> list= new ArrayBlockingQueue<>(5);
		try {
			list.remove();
		} catch (NoSuchElementException e) {
			System.out.println("Queue is empty:");;
		}
		
		System.out.println(list.poll());
		try {
			list.add("null");
			list.add("Sam");
			list.add("Sammed");
			list.add("Sagar");
			list.add("Sunil");
			list.add("Sagar");
			list.add("SOmaething");
		} catch (IllegalStateException e) {
			System.out.println("Queue is full");
		}
		QueueExaples ex=new QueueExaples();
		ex.display(list);
		System.out.println("********");
		list.offer("Sangamesh");
		ex.display(list);
		System.out.println("********");
		list.remove();
		ex.display(list);
		System.out.println("********");
		list.poll();
		ex.display(list);
		System.out.println("********");
		System.out.println(list.element());
		
		System.out.println("********");
		System.out.println(list.peek());
		
		
	}
	
	public void display(Queue<String> list) {
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
