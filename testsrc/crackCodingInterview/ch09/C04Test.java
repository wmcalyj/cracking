package crackCodingInterview.ch09;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class C04Test {
	int[] n1 = { 1, 2, 3, 4, 5, 6 };
	int[] n2 = { 1 };
	int[] n3 = { 1, 2, 3 };
	int[] n4 = { 1, 5 };

	List<Integer> l1, l2, l3, l4;
	List<List<Integer>> m1, m2, m3, m4;

	@Before
	public void setUp() throws Exception {
		l1 = convertList(n1);
		l2 = convertList(n2);
		l3 = convertList(n3);
		l4 = convertList(n4);

		C04 c04 = new C04();

		m1 = c04.getAllSubSets(l1);
		m2 = c04.getAllSubSets(l2);
		m3 = c04.getAllSubSets(l3);
		m4 = c04.getAllSubSets(l4);

	}

	@Test
	public void test() {
		assertEquals((int) Math.pow(2, l1.size()), m1.size());
		assertEquals((int) Math.pow(2, l2.size()), m2.size());
		assertEquals((int) Math.pow(2, l3.size()), m3.size());
		assertEquals((int) Math.pow(2, l4.size()), m4.size());

		C04.print(m1);
		C04.print(m2);
		C04.print(m3);
		C04.print(m4);
	}

	protected List<Integer> convertList(int[] list) {
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			array.add(list[i]);
		}
		return array;
	}

}
