package crackCodingInterview.ch02;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import crackCodingInterview.structures.Node;

public class C05Test {

	int[] n11 = { 7, 1, 6 }, n12 = { 5, 9, 2 }, sum1 = { 2, 1, 9 }, sum12 = { 1, 3, 0, 8 };
	int[] n21 = { 0 }, n22 = { 5, 9, 2 }, sum2 = { 5, 9, 2 }, sum22 = { 5, 9, 2 };
	int[] n31 = {}, n32 = {}, sum3 = { 0 }, sum32 = { 0 };
	int[] n41 = { 1, 1, 1 }, n42 = { 2, 2, 2 }, sum4 = { 3, 3, 3 };

	Node h11, h12, a1, a12, h21, h22, a2, a22, h31, h32, a3, a32, h41, h42, a4, a42, m1, m2, m3, m4, m12, m22, m32, m42;

	@Before
	public void setUp() throws Exception {
		h11 = Node.createLinkedList(n11);
		h12 = Node.createLinkedList(n12);
		a1 = Node.createLinkedList(sum1);
		a12 = Node.createLinkedList(sum12);

		h21 = Node.createLinkedList(n21);
		h22 = Node.createLinkedList(n22);
		a2 = Node.createLinkedList(sum2);
		a22 = Node.createLinkedList(sum22);

		h31 = Node.createLinkedList(n31);
		h32 = Node.createLinkedList(n32);
		a3 = Node.createLinkedList(sum3);
		a32 = Node.createLinkedList(sum32);

		h41 = Node.createLinkedList(n41);
		h42 = Node.createLinkedList(n42);
		a4 = Node.createLinkedList(sum4);
		a42 = Node.createLinkedList(sum4);

		m1 = C05.sum(h11, h12);
		m2 = C05.sum(h21, h22);
		m3 = C05.sum(h31, h32);
		m4 = C05.sum(h41, h42);

		m12 = C05.sumForward(h11, h12);
		m22 = C05.sumForward(h21, h22);
		m32 = C05.sumForward(h31, h32);
		m42 = C05.sumForward(h41, h42);
	}

	@Test
	public void test() {
		assertTrue(Node.equal(a1, m1));
		assertTrue(Node.equal(a2, m2));
		assertTrue(Node.equal(a3, m3));
		assertTrue(Node.equal(a4, m4));

		Node.print(m12);
		assertTrue(Node.equal(a12, m12));
		assertTrue(Node.equal(a22, m22));
		assertTrue(Node.equal(a32, m32));
		assertTrue(Node.equal(a42, m42));
	}

}
