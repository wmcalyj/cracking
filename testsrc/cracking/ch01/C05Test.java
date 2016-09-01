package cracking.ch01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C05Test {

	String s1 = "abc";
	String a1 = "abc";
	String s2 = "aa";
	String a2 = "aa";
	String s3 = "aabcccccaaa";
	String a3 = "a2b1c5a3";
	String s4 = "aaaaa";
	String a4 = "a5";
	String s5 = "aaaaaaaaaaaaaaaaaaaa";
	String a5 = "a20";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(a1, C05.Compress(s1));
		assertEquals(a2, C05.Compress(s2));
		assertEquals(a3, C05.Compress(s3));
		assertEquals(a4, C05.Compress(s4));
		assertEquals(a5, C05.Compress(s5));
	}

}
