package Problem1;

public class ArrayQueue<E> implements Queue<E> {
	
private E[] data;
private int f = 0; //index front
private int sz = 0; // current number of elements
private int CAPACITY;


	public ArrayQueue(int CAPACITY) {
		this.CAPACITY = CAPACITY;
		data = (E[]) new Object[CAPACITY];
	}

	@Override
	public int size() {
		return sz;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void enqueue(E e) throws IllegalStateException {
		if(sz == data.length) throw new IllegalStateException("Queue is full");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}

	@Override
	public E first() {
		if((isEmpty())) return null;
		return data[f];
	}

	@Override
	public E dequeue() {
		if((isEmpty())) return null;
		E answer = data[f];
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}

}
