package cracking.ch03;

import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class C06Test {
	Stack<Integer> s1, s2, s3, s4, a1, a2, a3, a4, m1, m2, m3, m4;

	@Before
	public void setUp() throws Exception {
		s1 = new Stack<Integer>();
		for (int i = 1; i < 5; i++) {
			s1.push(i);
		}

		s2 = new Stack<Integer>();
		for (int i = 5; i >= 1; i--) {
			s2.push(i);
		}

		s3 = new Stack<Integer>();
		s3.push(1);
		s3.push(3);
		s3.push(5);
		s3.push(4);
		s3.push(2);

		s4 = new Stack<Integer>();
		s4.push(5);
		s4.push(2);
		s4.push(1);
		s4.push(3);
		s4.push(4);

		a1 = new Stack<Integer>();
		for (int i = 1; i < 5; i++) {
			a1.push(i);
		}

		a2 = new Stack<Integer>();
		for (int i = 1; i < 5; i++) {
			a2.push(i);
		}

		a3 = new Stack<Integer>();
		for (int i = 1; i < 5; i++) {
			a3.push(i);
		}

		a4 = new Stack<Integer>();
		for (int i = 1; i < 5; i++) {
			a4.push(i);
		}

		m1 = C06.sort(s1);
		m2 = C06.sort(s2);
		m3 = C06.sort(s3);
		m4 = C06.sort(s4);

	}

	@Test
	public void test() {
		while (!m1.isEmpty()) {
			System.out.println(m1.pop());
		}
		assertTrue(equals(m1, a1));
		assertTrue(equals(m2, a2));
		assertTrue(equals(m3, a3));
		assertTrue(equals(m4, a4));
	}

	public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
		System.out.println("size - " + s1.size());
		if (s1.size() != s2.size()) {
			return false;
		}
		while (!s1.isEmpty() && !s2.isEmpty()) {
			Integer v1 = s1.pop();
			System.out.print(v1);
			if (v1 != s2.pop()) {
				return false;
			}
		}

		if (!s1.isEmpty() || !s2.isEmpty()) {
			return false;
		}
		return true;
	}

}
