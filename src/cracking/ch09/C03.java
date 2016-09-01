package cracking.ch09;

/**
 * A magic index in an array A[0,..., n-1] is defined to be an index such taht
 * A[i] = i. Given a sorted array, write a method to find a magic index, if one
 * exists, in array A.
 * 
 * FOLLOW UP
 * 
 * What if the values are not distinct
 * 
 * @author mengchaowang
 *
 */
public class C03 {
	public int findMagicIndex(int[] a) {
		return findMagicIndex(a, 0, a.length - 1);
	}

	public int findMagicIndex(int[] a, int start, int end) {
		if (start > end) {
			return -1;
		}
		if (start == end) {
			if (a[start] == start) {
				return start;
			} else {
				return -1;
			}
		}
		int middle = (start + end) / 2;
		System.out.println("Check - " + a[middle]);
		if (a[middle] == middle) {
			return middle;
		}
		if (a[middle] > middle) {
			return findMagicIndex(a, start, middle);
		} else {
			return findMagicIndex(a, middle + 1, end);
		}
	}
}
