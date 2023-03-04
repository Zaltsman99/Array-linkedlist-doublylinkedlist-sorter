package Problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem2.LinkedQueue;
import Problem2.Queue_2;

class TestClass {

	@Test
	void DoublyLinkedListTest() {
		Deque<Integer> Q = new DoublyLinkedList<>();
		Q.addFirst(5); // contents: (5)
		Q.addFirst(3); // contents: (3, 5)
		Q.addLast(7); // contents: (3, 5, 7)
		System.out.println(Q.first()); // contents: (3, 5, 7) outputs 3
		System.out.println(Q.last()); // contents: (3, 5, 7) outputs 7
		System.out.println(Q.size()); // contents: (3, 5, 7) outputs 3
		System.out.println(Q.removeFirst()); // contents: (5, 7) outputs 3
		System.out.println(Q.isEmpty()); // contents: (5, 7) outputs false
		System.out.println(Q.removeLast()); // contents: (5) outputs 7
		System.out.println(Q.removeFirst()); // contents: () outputs 5
		System.out.println(Q.isEmpty()); // contents: () outputs true
		System.out.println(Q.removeFirst()); // contents: () outputs null
		System.out.println(Q.removeLast()); // contents: () outputs null
	}

}
