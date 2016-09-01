package cracking.ch02;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cracking.structures.Node;

public class C02Test {

	int[] n1 = { 1, 2, 3, 4, 5 };
	Integer a1 = 5; // 0

	Integer a2 = 4; // 1

	Integer a3 = 3; // 2

	Integer a4 = 2; // 3

	Integer a5 = 1; // 4

	Integer a6 = null;// 5

	Node h1;

	@Before
	public void setUp() throws Exception {
		h1 = Node.createLinkedList(n1);
	}

	@Test
	public void test() {
		assertEquals(a1, C02.findK(h1, 0));
		assertEquals(a2, C02.findK(h1, 1));
		assertEquals(a3, C02.findK(h1, 2));
		assertEquals(a4, C02.findK(h1, 3));
		assertEquals(a5, C02.findK(h1, 4));
		assertEquals(a6, C02.findK(h1, 5));

	}

}
