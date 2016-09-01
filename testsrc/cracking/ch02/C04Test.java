package cracking.ch02;

import org.junit.Before;
import org.junit.Test;

import cracking.structures.Node;

public class C04Test {
	int[] n1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	int[] n2 = { 2, 4, 5, 6, 7, 91919, 2, 3, 4 };
	int[] n3 = { 1, 1, 1, 1, 1, 1, 1 };
	int[] n4 = { 5, 5, 5, 5, 5, 5, 5, 5 };

	int[] n5 = { 2, 2, 4, 4, 2, 2, 2, 2, 4, 4, 4 };
	int[] n6 = {};
	int[] n7 = { 2, 4, 1, 3, 5, 6, 2, 7, 2, 1, 6, 4, 2, 6, 1, 6, 1 };

	Node h1, h2, h3, h4, h5, h6, h7;
	Node m1, m2, m3, m4, m5, m6, m7;

	@Before
	public void setUp() throws Exception {
		h1 = Node.createLinkedList(n1);
		h2 = Node.createLinkedList(n2);
		h3 = Node.createLinkedList(n3);
		h4 = Node.createLinkedList(n4);
		h5 = Node.createLinkedList(n5);
		h6 = Node.createLinkedList(n6);
		h7 = Node.createLinkedList(n7);

		m1 = C04.partition(h1, 5);
		m2 = C04.partition(h2, 3);
		m3 = C04.partition(h3, 3);
		m4 = C04.partition(h4, 3);
		m5 = C04.partition(h5, 3);
		m6 = C04.partition(h6, 1);
		m7 = C04.partition(h7, 4);
	}

	@Test
	public void test() {
		Node.print(m1);
		Node.print(m2);
		Node.print(m3);
		Node.print(m4);
		Node.print(m5);
		Node.print(m6);
		Node.print(m7);
	}

}
