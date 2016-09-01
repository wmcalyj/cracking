package cracking.ch03;

import java.util.Stack;

/**
 * Write a program to sort a stack in ascending order (with biggest items on
 * top). You may use additional stacks to hold items, but you may not copy the
 * elements into any other data structure (such as an array). The stack supports
 * the following operations: push, pop, peek, and isEmpty.
 * 
 * @author mengchaowang
 *
 */
public class C06 {

	public static Stack<Integer> sort(Stack<Integer> original) {
		Stack<Integer> results = new Stack<Integer>();
		Stack<Integer> tmp = new Stack<Integer>();

		while (!original.isEmpty()) {
			Integer value = original.pop();
			if (results.isEmpty()) {
				results.push(value);
			} else {
				Integer cur = results.peek();
				if (value > cur) {
					results.push(value);
					System.out.println("Larger, push " + value + ", cur - " + cur);
				} else {
					cur = results.pop();
					while (value <= cur && !results.isEmpty()) {
						tmp.push(cur);
						cur = results.pop();
					}
					results.push(value);
					while (!tmp.isEmpty()) {
						results.push(tmp.pop());
					}
				}
			}
		}
		return results;
	}
}
