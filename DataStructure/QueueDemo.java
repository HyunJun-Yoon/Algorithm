package dataStructure;

import java.util.NoSuchElementException;

class Queue<T> {	
	
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void enqueue(T item) {
		Node<T> t = new Node<T>(item);
		
		if (last != null) {
		last.next = t;
		} 
		last = t;
		if (first == null) {
			first = last;
		}
	}
	
	public T dequeue() {
		if (first == null) {
				throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		
		if (first == null) {
			last = null;
		}
		
		return data;
	}
	
	public T peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		
	}

}
