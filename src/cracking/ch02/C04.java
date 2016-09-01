package cracking.ch02;

import cracking.structures.Node;

/**
 * Write code to partition a linked list around a value x, such that all nodes
 * less than x come before all nodes greater than or equal to x
 * 
 * @author mengchaowang
 *
 */
public class C04 {
	public static Node partition(Node head, int x) {
		Node t1 = null, t2 = null;
		Node cur = head;
		Node newHead = null, headT2 = null;
		while (cur != null) {
			if (cur.value < x) {
				if (t1 == null) {
					t1 = cur;
					newHead = t1;
				} else {
					t1.next = cur;
					t1 = t1.next;
				}
			} else {
				if (t2 == null) {
					t2 = cur;
					headT2 = t2;
				} else {
					t2.next = cur;
					t2 = t2.next;
				}
			}
			cur = cur.next;
		}

		if (t1 == null) {
			return headT2;
		}
		if (t2 == null) {
			t1.next = null;
		} else {
			t1.next = headT2;
			t2.next = null;
		}
		return newHead;
	}
}
