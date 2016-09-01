package cracking.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cracking.structures.Node;

public class C06Test {

	int[] n1 = { 1, 2, 3, 4, 5, 6, 7 };

	Node basic1, basic2, basic3, basic4, basic5;
	Node h1, h2, h3, h4, m1, m2, m3, m4;

	@Before
	public void setUp() throws Exception {
		basic1 = Node.createLinkedList(n1);
		basic2 = Node.createLinkedList(n1);
		basic3 = Node.createLinkedList(n1);
		basic4 = Node.createLinkedList(n1);
		basic5 = Node.createLinkedList(n1);
		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 1
		h1 = basic1;
		Node tmp = h1;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = h1;

		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 2
		h2 = basic2;
		Node beg = h2.next; // 2
		tmp = h2;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = beg;

		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 2
		h3 = basic3;
		beg = h3.next.next; // 3
		tmp = h3;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = beg;

		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 2
		h4 = basic4;
		beg = h4.next.next.next; // 4
		tmp = h4;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = beg;

	}

	@Test
	public void test() {
		Node m1 = C06.findBeginning(h1);
		Node m2 = C06.findBeginning(h2);
		Node m3 = C06.findBeginning(h3);
		Node m4 = C06.findBeginning(h4);
		Node m5 = C06.findBeginning(basic5);
		Assert.assertEquals(h1, m1);
		Assert.assertEquals(h2.next, m2);
		Assert.assertEquals(h3.next.next, m3);
		Assert.assertEquals(h4.next.next.next, m4);
		Assert.assertEquals(null, m5);

	}

}
