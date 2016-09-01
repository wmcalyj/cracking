package crackCodingInterview.ch09;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to return all subsets of a set
 * 
 * @author mengchaowang
 *
 */
public class C04 {
	public List<List<Integer>> getAllSubSets(List<Integer> set) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getSubSet(set, result, new ArrayList<Integer>(), 0);
		return result;
	}

	public void getSubSet(List<Integer> original, List<List<Integer>> result, List<Integer> tmpResult, int index) {
		if (index >= original.size()) {
			result.add(tmpResult);
			return;
		}

		List<Integer> copy = new ArrayList<Integer>();
		copy.addAll(tmpResult);
		tmpResult.add(original.get(index));
		getSubSet(original, result, tmpResult, index + 1);
		getSubSet(original, result, copy, index + 1);
	}

	public static void print(List<List<Integer>> result) {
		System.out.println("Size of all subsets is " + result.size());
		System.out.print("[");
		for (List<Integer> list : result) {
			System.out.print("[");
			for (Integer i : list) {
				System.out.print(i + ", ");
			}
			System.out.print("]");
		}
		System.out.println("]");
	}
}
