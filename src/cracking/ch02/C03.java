package cracking.ch02;

import cracking.structures.Node;

/**
 * Implement an algorithm to delete a node in the middle of a singly linked
 * list, given only access to that node
 * 
 * @author mengchaowang
 *
 */
public class C03 {
	public static void deleteMiddle(Node node) {
		while (node.next != null) {
			node.value = node.next.value;
			node = node.next;
		}
		node = null;
	}
}
