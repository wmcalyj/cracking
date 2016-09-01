package cracking.ch01;

import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * 
 * @author mengchaowang
 *
 */
public class C01 {
	public static boolean C01_HasAllUniqueChars(String s) {
		for (int i = 0, j = s.length(); i < j - 1; i++) {
			for (int z = i + 1; z < j; z++) {
				if (s.charAt(i) == s.charAt(z)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean C01_HasAllUniqueChars_02(String s) {
		char[] chars = s.toLowerCase().toCharArray();
		Arrays.sort(chars);
		for (int i = 1; i < chars.length; i++) {
			int difference = chars[i] - chars[i - 1];
			if (difference == 0) {
				return false;
			}
		}
		return true;
	}
}
