package crackCodingInterview.ch09;

import org.junit.Before;
import org.junit.Test;

public class C02Test {
	C02 c02;

	@Before
	public void setUp() throws Exception {
		c02 = new C02();
	}

	@Test
	public void test() {
		int x1 = 1, y1 = 1;
		int x2 = 1, y2 = 10;
		System.out.println(c02.countWays(x1, y1));
		System.out.println(c02.countWays(x2, y2));
		int x = 10, y = 20;
		System.out.println(c02.countWays(10, 20));
	}

}
