package crackCodingInterview.ch01;

import java.util.HashMap;
import java.util.Map;

public class C03 {
	/**
	 * Given two strings, write a method to decide if one is a permutation of
	 * the other
	 */

	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		Map<String, Integer> chars = new HashMap<String, Integer>();
		for (int i = 0, j = s1.length(); i < j; i++) {
			String c = String.valueOf(s1.charAt(i));
			Integer count = chars.get(c);
			if (count == null) {
				chars.put(c, 1);
			} else {
				chars.put(c, count + 1);
			}
		}

		for (int i = 0, j = s2.length(); i < j; i++) {
			String c = String.valueOf(s2.charAt(i));
			Integer count = chars.get(c);
			if (count == null) {
				return false;
			} else if (count == 1) {
				chars.remove(c);
			} else {
				chars.put(c, count - 1);
			}
		}
		if (chars.size() > 0) {
			return false;
		}
		return true;
	}
}
