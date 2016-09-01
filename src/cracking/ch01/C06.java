package cracking.ch01;

/**
 * Given an image represented by an NxN matrix, where each pixle in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 * 
 * @author mengchaowang
 *
 */
public class C06 {
	static boolean left = false;

	public static void rotate90(char[][] matrix) {
		print(matrix);
		int n = matrix.length / 2;
		int length = matrix.length - 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < length - i; j++) {
				char tmp = matrix[i][j];
				if (left) {

				} else {
					matrix[i][j] = matrix[length - j][i];
					matrix[length - j][i] = matrix[length - i][length - j];
					matrix[length - i][length - j] = matrix[j][length - i];
					matrix[j][length - i] = tmp;
				}
				print(matrix);
			}
		}
		System.out.println("END");

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
