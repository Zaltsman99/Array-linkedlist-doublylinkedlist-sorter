package Problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem1.ArrayQueue;
import Problem1.Queue;

class TestClass {

	@Test
	void LinkedQueueTest() {
		Queue_2<Integer> Q = new LinkedQueue<>();
		Q.enqueue(5); // contents: (5)
		Q.enqueue(3); // contents: (5, 3)
		System.out.println(Q.size()); // contents: (5, 3) outputs 2
		System.out.println(Q.dequeue()); // contents: (3) outputs 5
		System.out.println(Q.isEmpty()); // contents: (5) outputs false
		System.out.println(Q.dequeue()); // contents: () outputs 3
		System.out.println(Q.isEmpty()); // contents: () outputs true
		System.out.println(Q.dequeue()); // contents: () outputs null
		Q.enqueue(7); // contents: (7)
		Q.enqueue(9); // contents: (7, 9)
		System.out.println(Q.first()); // contents: (7, 9) outputs 7
		Q.enqueue(6); // contents: (7, 9, 6)
		Q.enqueue(8); // contents: (7, 9, 6, 8)
		System.out.println(Q.dequeue()); // contents: (9, 6, 8) outputs 7
	}

}
