package cracking.ch01;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class C04Test {
	String s1 = "helloworld";
	String s2 = "testagainst";
	String s3 = "how are you";
	String s4 = "";
	String s5 = "     "; // Five spaces
	String s6 = "I feel so good. Thank you for asking!";

	char[] c1, c2, c3, c4, c5, c6;
	String a1, a2, a3, a4, a5, a6;

	@Before
	public void setUp() throws Exception {
		a1 = s1.replace(" ", "%20");
		a2 = s2.replace(" ", "%20");
		a3 = s3.replace(" ", "%20");
		a4 = s4.replace(" ", "%20");
		a5 = s5.replace(" ", "%20");
		a6 = s6.replace(" ", "%20");
		c1 = Arrays.copyOf(s1.toCharArray(), 5000);
		c2 = Arrays.copyOf(s2.toCharArray(), 5000);
		c3 = Arrays.copyOf(s3.toCharArray(), 5000);
		c4 = Arrays.copyOf(s4.toCharArray(), 5000);
		c5 = Arrays.copyOf(s5.toCharArray(), 5000);
		c6 = Arrays.copyOf(s6.toCharArray(), 5000);
	}

	@Test
	public void test() {
		// assertEquals(a1, C04.replaceWhiteSpace(c1, s1.length()));
		// assertEquals(a2, C04.replaceWhiteSpace(c2, s2.length()));
		assertEquals("how%20are%20you", C04.replaceWhiteSpace(c3, s3.length()));
		// assertEquals(a4, C04.replaceWhiteSpace(c4, s4.length()));
		// assertEquals(a5, C04.replaceWhiteSpace(c5, s5.length()));
		assertEquals(a6, C04.replaceWhiteSpace(c6, s6.length()));
	}

}
