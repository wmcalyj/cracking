package cracking.ch04;

import cracking.structures.TreeNode;

public class S07_1 {
	boolean covers(TreeNode root, TreeNode p) {
		if (root == null)
			return false;
		if (root == p)
			return true;
		return covers(root.left, p) || covers(root.right, p);
	}

	TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;
		if (root == p || root == q)
			return root;

		boolean is_p_on_left = covers(root.left, p);
		boolean is_q_on_left = covers(root.left, q);

		if (is_p_on_left != is_q_on_left)
			return root;

		TreeNode child_side = is_p_on_left ? root.left : root.right;
		return commonAncestorHelper(child_side, p, q);
	}

	TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (!covers(root, p) || !covers(root, q)) {
			return null;
		}
		return commonAncestorHelper(root, p, q);
	}
}
