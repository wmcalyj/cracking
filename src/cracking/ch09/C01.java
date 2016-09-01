package cracking.ch09;

/**
 * A child is running up a staircase with n steps, and can hop either 1 step, 2
 * steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 * 
 * @author mengchaowang
 *
 */
public class C01 {
	public int climbStairs(int stairs) {
		int[] counts = new int[stairs + 1];

		return climbStairs(stairs, counts);
	}

	public int climbStairs(int stairs, int[] counts) {
		if (stairs <= 0) {
			return 0;
		}
		if (stairs == 1) {
			return 1;
		}
		if (stairs == 2) {
			return 2;
		}
		if (stairs == 3) {
			return 4;
		}
		if (counts[stairs] != 0) {
			return counts[stairs];
		}
		int one = climbStairs(stairs - 1, counts);
		counts[stairs - 1] = one;
		int two = climbStairs(stairs - 2, counts);
		counts[stairs - 2] = two;
		int three = climbStairs(stairs - 3, counts);
		counts[stairs - 3] = three;
		return one + two + three;

	}
}
