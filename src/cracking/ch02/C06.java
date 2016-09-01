package cracking.ch02;

import java.util.HashSet;
import java.util.Set;

import cracking.structures.Node;

/**
 * Given a circular linked list, implement an algorithm which returns the node
 * at the beginning of the loop
 * 
 * @author mengchaowang
 *
 */
public class C06 {
	public static Node findBeginning(Node head) {
		Set<Node> nodes = new HashSet<Node>();
		while (head != null) {
			System.out.println(head.value);
			if (!nodes.add(head)) {
				return head;
			}
			head = head.next;
		}
		return null;
	}
}
