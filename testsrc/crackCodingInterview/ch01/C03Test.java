package crackCodingInterview.ch01;

import static org.junit.Assert.*;

import org.junit.Test;

public class C03Test {

	String s1_o = "hello world";
	String s1_t = "world hello";

	String s2_o = "abc world";
	String s2_t = "abc world";

	// False
	String s3_o = "face world";
	String s3_t = "ceaf hello";

	// False
	String s4_o = "abc def";
	String s4_t = "aabc def";

	// False
	String s5_o = "aab aab";
	String s5_t = "bba bba";

	// False
	String s6_o = "abc";
	String s6_t = "def";

	// False
	String s7_o = "abb";
	String s7_t = "ab";

	@Test
	public void test() {
		assertTrue(C03.isPermutation(s1_o, s1_t));
		assertTrue(C03.isPermutation(s2_o, s2_t));
		assertFalse(C03.isPermutation(s3_o, s3_t));
		assertFalse(C03.isPermutation(s4_o, s4_t));
		assertFalse(C03.isPermutation(s5_o, s5_t));
		assertFalse(C03.isPermutation(s6_o, s6_t));
		assertFalse(C03.isPermutation(s7_o, s7_t));
	}

}
