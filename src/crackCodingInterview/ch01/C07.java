package crackCodingInterview.ch01;

public class C07 {
	public static void setZero(char[][] matrix) {
		int[] xs = new int[matrix.length];
		int[] ys = new int[matrix[0].length];
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) {
					xs[count] = i;
					ys[count] = j;
					count++;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			setRowColumnZero(matrix, xs[i], ys[i]);
		}
	}

	private static void setRowColumnZero(char[][] matrix, int x, int y) {
		for (int j = 0; j < matrix[x].length; j++) {
			matrix[x][j] = 0;
		}
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][y] = 0;
		}
	}

	private static void print(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(Integer.valueOf(matrix[i][j]) + ",");
			}
			System.out.println("]");
		}
		System.out.println();
	}
}
