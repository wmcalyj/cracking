package crackCodingInterview.ch01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class C06Test {
	char[][] oneMatrix = { { 1 } };
	char[][] twoMatrix = { { 1, 2 }, { 3, 4 } };
	char[][] threeMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	char[][] fourMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	char[][] fiveMatrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } };

	char[][] a1Matrix = { { 1 } };
	char[][] a2Matrix = { { 3, 1 }, { 4, 2 } };
	char[][] a3Matrix = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
	char[][] a4Matrix = { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };
	char[][] a5Matrix = { { 21, 16, 11, 6, 1 }, { 22, 17, 12, 7, 2 }, { 23, 18, 13, 8, 3 }, { 24, 19, 14, 9, 4 },
			{ 25, 20, 15, 10, 5 } };

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		C06.rotate90(oneMatrix);
		assertTrue(equal(a1Matrix, oneMatrix));

		C06.rotate90(twoMatrix);
		assertTrue(equal(a2Matrix, twoMatrix));

		C06.rotate90(threeMatrix);
		assertTrue(equal(a3Matrix, threeMatrix));

		C06.rotate90(fourMatrix);
		assertTrue(equal(a4Matrix, fourMatrix));

		C06.rotate90(fiveMatrix);
		assertTrue(equal(a5Matrix, fiveMatrix));

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
