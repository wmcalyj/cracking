package crackCodingInterview.ch01;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string.
 * 
 * @author mengchaowang
 *
 */
public class C05 {
	public static String Compress(String s) {
		int count = 1;
		char c = s.charAt(0);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++) {
			c = s.charAt(i);
			if (c == s.charAt(i + 1)) {
				count++;
			} else {
				result.append(c).append(count);
				count = 1;
			}
		}
		char last = s.charAt(s.length() - 1);
		if (last == c) {
			result.append(c).append(count);
		} else {
			result.append(last).append(count);
		}

		return result.toString().length() < s.length() ? result.toString() : s;

	}
}
