package crackCodingInterview.ch02;

import java.util.Stack;

import crackCodingInterview.structures.Node;

/**
 * Implement an algorithm to find the kth to last element of a singly linked
 * list
 * 
 * @author mengchaowang
 *
 */
public class C02 {

	public static Integer findK(Node head, int k) {
		Stack<Node> stack = new Stack<Node>();

		if (head == null) {
			return null;
		}

		Node cur = head;
		while (cur != null) {
			stack.push(cur);
			cur = cur.next;
		}

		Node result = stack.pop();

		for (int i = 0; i < k; i++) {
			if (stack.isEmpty()) {
				return null;
			}
			result = stack.pop();
		}
		return result.value;
	}
}
