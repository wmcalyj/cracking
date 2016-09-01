package crackCodingInterview.structures;

public class Node {
	public int value;
	public Node next;

	public Node(int i) {
		value = i;
		next = null;
	}

	public static Node createLinkedList(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		Node head = new Node(nums[0]);
		Node cur = head;
		for (int i = 1; i < nums.length; i++) {
			Node next = new Node(nums[i]);
			cur.next = next;
			cur = next;
		}
		return head;
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.print(head.value);
			head = head.next;
			if (head != null) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

	public static boolean equal(Node n1, Node n2) {
		while (n1 != null && n2 != null) {
			if (n1.value != n2.value) {
				return false;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		if (n1 != null || n2 != null) {
			return false;
		}
		return true;
	}
}
