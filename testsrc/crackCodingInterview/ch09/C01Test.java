package crackCodingInterview.ch09;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C01Test {

	int stairs = 15;
	C01 c01;

	@Before
	public void setUp() throws Exception {
		c01 = new C01();
	}

	@Test
	public void test() {
		int[] array = new int[stairs + 1];
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
		int answer = c01.climbStairs(stairs);
		System.out.println(answer);
		assertEquals(S01.countWaysDP(stairs, array), answer);
		// assertEquals(S01.countWays(stairs), S01.countWaysDP(stairs, array));
	}

}
