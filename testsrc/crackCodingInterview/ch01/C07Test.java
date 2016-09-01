package crackCodingInterview.ch01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class C07Test {
	char[][] oneMatrix = { { 1 } };
	char[][] oneMatrix0 = { { 0 } };

	char[][] twoMatrix = { { 1, 2 }, { 3, 0 } };
	char[][] threeMatrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
	char[][] fourMatrix = { { 1, 2, 0, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	char[][] fiveMatrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } };

	char[][] a1Matrix = { { 1 } };
	char[][] a1Matrix0 = { { 0 } };

	char[][] a2Matrix = { { 1, 0 }, { 0, 0 } };
	char[][] a3Matrix = { { 1, 0, 3 }, { 0, 0, 0 }, { 7, 0, 9 } };
	char[][] a4Matrix = { { 0, 0, 0, 0 }, { 5, 6, 0, 8 }, { 9, 10, 0, 12 }, { 13, 14, 0, 16 } };
	char[][] a5Matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } };

	char[][] threeFourMatrix = { { 1, 2, 3, 4 }, { 5, 6, 0, 8 }, { 9, 10, 11, 12 } };
	char[][] a34Matrix = { { 1, 2, 0, 4 }, { 0, 0, 0, 0 }, { 9, 10, 0, 12 } };

	char[][] threeFourMatrix2 = { { 1, 0, 3, 4 }, { 5, 6, 0, 8 }, { 9, 10, 11, 12 } };
	char[][] a34Matrix2 = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 9, 0, 0, 12 } };

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		C07.setZero(oneMatrix);
		assertTrue(equal(a1Matrix, oneMatrix));

		C07.setZero(oneMatrix0);
		assertTrue(equal(a1Matrix0, oneMatrix0));

		C07.setZero(twoMatrix);
		assertTrue(equal(a2Matrix, twoMatrix));

		C07.setZero(threeMatrix);
		assertTrue(equal(a3Matrix, threeMatrix));

		C07.setZero(fourMatrix);
		assertTrue(equal(a4Matrix, fourMatrix));

		C07.setZero(fiveMatrix);
		assertTrue(equal(a5Matrix, fiveMatrix));

		C07.setZero(threeFourMatrix);
		assertTrue(equal(a34Matrix, threeFourMatrix));

		C07.setZero(threeFourMatrix2);
		assertTrue(equal(a34Matrix2, threeFourMatrix2));

	}

	public boolean equal(char[][] expected, char[][] actual) {
		for (int i = 0; i < actual.length; i++) {
			for (int j = 0; j < actual[i].length; j++) {
				if (expected[i][j] != actual[i][j]) {
					System.out.println("Position (" + i + "," + j + ") is incorrect. Expected - "
							+ Integer.valueOf(expected[i][j]) + ". Actual - " + Integer.valueOf(actual[i][j]));
					return false;
				}
			}
		}
		return true;
	}

}
