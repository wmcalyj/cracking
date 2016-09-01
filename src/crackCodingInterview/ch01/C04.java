package crackCodingInterview.ch01;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume
 * that the string has sufficient space at the end of the string to hold the
 * additional characters, and that you are given the "true" length of the
 * string. (Note:if implementing in Java, please use a character array so that
 * you can perform this operation in place.)
 * 
 * @author mengchaowang
 *
 */
public class C04 {
	public static String replaceWhiteSpace(char[] str, int length) {
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				count++;
			}
		}
		int tail = length + 2 * count;
		str[tail--] = 0;
		for (int i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[tail] = '0';
				str[tail - 1] = '2';
				str[tail - 2] = '%';
				tail -= 3;
			} else {
				str[tail--] = str[i];
			}
		}
		return String.valueOf(str);
	}
}
