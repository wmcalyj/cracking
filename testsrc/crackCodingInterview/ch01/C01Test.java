package crackCodingInterview.ch01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import crackCodingInterview.ch01.C01;

public class C01Test {

	String s1 = "a";
	String s2 = "";
	String s3 = "aBc";
	String s4 = "abCDEFGhijklmnOPqrstuvwxzy";
	String s5 = "123abCDEFGhijklmnOPqrstuvwxzy";
	String s6 = "11";
	String s7 = "abca";

	@Test
	public void test() {
		assertTrue(C01.C01_HasAllUniqueChars(s1));
		assertTrue(C01.C01_HasAllUniqueChars(s2));
		assertTrue(C01.C01_HasAllUniqueChars(s3));
		assertTrue(C01.C01_HasAllUniqueChars(s4));
		assertTrue(C01.C01_HasAllUniqueChars(s5));
		assertFalse(C01.C01_HasAllUniqueChars(s6));
		assertFalse(C01.C01_HasAllUniqueChars(s7));
	}

	@Test
	public void test2() {
		assertTrue(C01.C01_HasAllUniqueChars_02(s1));
		assertTrue(C01.C01_HasAllUniqueChars_02(s2));
		assertTrue(C01.C01_HasAllUniqueChars_02(s3));
		assertTrue(C01.C01_HasAllUniqueChars_02(s4));
		assertTrue(C01.C01_HasAllUniqueChars_02(s5));
		assertFalse(C01.C01_HasAllUniqueChars_02(s6));
		assertFalse(C01.C01_HasAllUniqueChars_02(s7));
	}

}
