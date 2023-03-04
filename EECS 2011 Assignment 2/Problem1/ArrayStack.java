package Problem1;

public class ArrayStack<E> implements Stack<E> {

public int CAPACITY;
public Object[] data;
public int t = -1; // index for top

public ArrayStack(int CAPACITY) {
	this.CAPACITY = CAPACITY;
	data = new Object[CAPACITY];
}

public int size() {
	return t+1;
}

public boolean isEmpty() {
	return t == -1;
}

public void push(E e) throws IllegalStateException{
	if( size() == data.length) {
		throw new IllegalStateException("Stack is full");
	}
	data[++t] = e;
}

@Override
public E top() {
	if (isEmpty()) return null;
	return (E) data[t];
}

@Override
public E pop() {
	if (isEmpty()) return null;;
	return (E) data[t--];
}


}
