package crackCodingInterview.ch02;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import crackCodingInterview.structures.Node;

public class C01Test {
	int[] n1 = { 1, 2, 3, 4, 5 };
	int[] a1 = { 1, 2, 3, 4, 5 };

	int[] n2 = { 1, 1, 1 };
	int[] a2 = { 1 };

	int[] n3 = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5 };
	int[] a3 = { 1, 2, 3, 4, 5 };

	int[] n4 = {};
	int[] a4 = {};

	int[] n5 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5,
			5, 1, 1, 1, 1, 1, 1, 1 };

	Node h1, h2, h3, h4, h5, ha1, ha2, ha3, ha4, ha5, ma1, ma2, ma3, ma4, ma5, ma12, ma22, ma32, ma42, ma52;

	@Before
	public void setUp() throws Exception {
		h1 = Node.createLinkedList(n1);
		h2 = Node.createLinkedList(n2);
		h3 = Node.createLinkedList(n3);
		h4 = Node.createLinkedList(n4);
		h5 = Node.createLinkedList(n5);

		ha1 = Node.createLinkedList(a1);
		ha2 = Node.createLinkedList(a2);
		ha3 = Node.createLinkedList(a3);
		ha4 = Node.createLinkedList(a4);
		ha5 = Node.createLinkedList(a3);

		ma1 = C01.removeDuplicates(h1);
		ma2 = C01.removeDuplicates(h2);
		ma3 = C01.removeDuplicates(h3);
		ma4 = C01.removeDuplicates(h4);
		ma5 = C01.removeDuplicates(h5);

		ma12 = C01.removeDuplicates2(h1);
		ma22 = C01.removeDuplicates2(h2);
		ma32 = C01.removeDuplicates2(h3);
		ma42 = C01.removeDuplicates2(h4);
		ma52 = C01.removeDuplicates2(h5);

	}

	@Test
	public void test() {
		Node.print(ma1);
		assertTrue(Node.equal(ma1, ha1));

		Node.print(ma2);
		assertTrue(Node.equal(ma2, ha2));

		Node.print(ma3);
		assertTrue(Node.equal(ma3, ha3));

		Node.print(ma4);
		assertTrue(Node.equal(ma4, ha4));

		Node.print(ma5);
		assertTrue(Node.equal(ma5, ha5));

		Node.print(ma12);
		assertTrue(Node.equal(ma12, ha1));

		Node.print(ma22);
		assertTrue(Node.equal(ma22, ha2));

		Node.print(ma32);
		assertTrue(Node.equal(ma32, ha3));

		Node.print(ma42);
		assertTrue(Node.equal(ma42, ha4));

		Node.print(ma52);
		assertTrue(Node.equal(ma52, ha5));
	}

}
