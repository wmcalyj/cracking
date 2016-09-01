package crackCodingInterview.ch02;

import crackCodingInterview.structures.Node;

/**
 * You have two numbers represented by a linked list, where each node contains a
 * gingle digit. The digits are stored in reverse order, such that the 1's digit
 * is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list.
 * 
 * FOLLOW UP
 * 
 * Suppose the digits are stored in forward order. Repeat the above problem
 * 
 * @author mengchaowang
 *
 */
public class C05 {
	public static Node sum(Node first, Node second) {
		int number1 = 0, number2 = 0, sum = 0;
		int power = 0;
		while (first != null) {
			number1 += first.value * Math.pow(10, power++);
			first = first.next;
		}

		power = 0;
		while (second != null) {
			number2 += second.value * Math.pow(10, power++);
			second = second.next;
		}

		sum = number1 + number2;

		Node result = null;
		Node head = null;
		result = new Node(sum % 10);
		head = result;
		result.next = null;

		sum /= 10;
		while (sum != 0) {
			Node newNode = new Node(sum % 10);
			sum /= 10;
			result.next = newNode;
			result = result.next;
		}
		result.next = null;
		return head;
	}

	public static Node sumForward(Node first, Node second) {
		int number1 = 0, number2 = 0, sum = 0;
		while (first != null) {
			number1 = (int) (number1 * 10 + first.value);
			System.out.println("n1 - " + number1);

			first = first.next;
		}
		System.out.println("n1 - " + number1);

		while (second != null) {
			number2 = (int) (number2 * 10 + second.value);
			second = second.next;
		}
		System.out.println("n2 - " + number2);

		sum = number1 + number2;
		System.out.println("sum - " + sum);

		Node cur = new Node(sum % 10);
		sum /= 10;
		cur.next = null;
		while (sum != 0) {
			Node tmp = new Node(sum % 10);
			sum /= 10;
			tmp.next = cur;
			cur = tmp;
		}
		return cur;
	}
}
