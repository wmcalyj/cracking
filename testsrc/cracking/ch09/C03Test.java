package cracking.ch09;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C03Test {
	int[] a1 = { -1, 0, 1, 2, 3, 4, 5, 6, 8 };
	int[] a2 = { 0, 2, 3, 4, 5, 6, 7, 8 };
	int[] a3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int[] a4 = { -2, -1, 2, 4, 5, 6 };

	C03 c03;

	@Before
	public void setUp() throws Exception {
		c03 = new C03();
	}

	@Test
	public void test() {
		assertEquals(8, c03.findMagicIndex(a1));
		assertEquals(0, c03.findMagicIndex(a2));
		assertEquals(-1, c03.findMagicIndex(a3));
		assertEquals(2, c03.findMagicIndex(a4));

	}

}
