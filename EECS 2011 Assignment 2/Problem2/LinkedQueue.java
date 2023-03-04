package Problem2;

public class LinkedQueue<E> implements Queue_2<E>{

	private SinglyLinkedList<E> list = new SinglyLinkedList<>(); // an empty list
	public LinkedQueue() { }
	
	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(E e) {
		list.addLast(e);
	}

	public E first() {
		return list.first();
	}

	public E dequeue() {
		return list.removeFirst();
	}

}
