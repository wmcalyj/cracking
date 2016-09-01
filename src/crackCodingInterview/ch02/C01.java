package crackCodingInterview.ch02;

import java.util.HashSet;
import java.util.Set;

import crackCodingInterview.structures.Node;

/**
 * Write code to remove duplicates from an unsorted linked list
 *
 * FOLLOW UP How would you solve this problem if a temporary buffer is not
 * allowed?
 * 
 * @author mengchaowang
 *
 */
public class C01 {
	public static Node removeDuplicates(Node head) {

		System.out.println("Start:");
		Set<Integer> duplicates = new HashSet<Integer>();
		if (head == null) {
			return null;
		}
		duplicates.add(head.value);
		Node cur = head;
		Node next = head.next;
		while (next != null) {
			if (!duplicates.contains(next.value)) {
				duplicates.add(next.value);
				cur = next;
				next = next.next;
			} else {
				while (next != null && duplicates.contains(next.value)) {
					next = next.next;
				}
				if (next != null) {
					duplicates.add(next.value);
				}
				cur.next = next;
				cur = next;
				if (cur != null) {
					next = cur.next;
				}
			}
			Node.print(head);
		}
		System.out.println("\n\n");
		return head;
	}

	public static Node removeDuplicates2(Node head) {
		if (head == null) {
			return null;
		}
		Node cur = head;
		Node next = head.next;

		while (cur != null) {
			Node prev = cur;
			while (next != null) {
				if (next.value == cur.value) {
					prev.next = next.next;
				} else {
					prev = next;
				}
				next = next.next;
			}
			cur = cur.next;
		}
		return head;
	}
}
