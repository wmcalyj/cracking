package crackCodingInterview.ch02;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import crackCodingInterview.structures.Node;

public class C03Test {

	int[] n1 = { 1, 2, 3, 4, 5 };
	int[] a1 = { 1, 2, 4, 5 };
	int[] n2 = { 1, 2, 3, 4, 5, 6, 7 };
	int[] a2 = { 1, 2, 3, 5, 6, 7 };

	Node h1, h2, ah1, ah2, ma1, ma2;

	@Before
	public void setUp() throws Exception {
		h1 = Node.createLinkedList(n1);
		h2 = Node.createLinkedList(n2);
		ah1 = Node.createLinkedList(a1);
		ah2 = Node.createLinkedList(a2);
	}

	@Test
	public void test() {
		Node middle1 = h1.next.next;
		Node middle2 = h2.next.next.next;

		C03.deleteMiddle(middle1);
		C03.deleteMiddle(middle2);

		assertTrue(Node.equal(ah1, h1));
		assertTrue(Node.equal(ah2, h2));
	}

}
