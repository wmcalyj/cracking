package crackCodingInterview.ch04;

import crackCodingInterview.structures.TreeNode;

public class S07_2 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (!covers(root, p) || !covers(root, q)) {
			return null;
		}
		return lowestCommonAncestorHelper(root, p, q);
	}

	boolean covers(TreeNode node, TreeNode p) {
		if (node == null)
			return false;
		if (node == p)
			return true;
		return (covers(node.left, p) || covers(node.right, p));
	}

	public TreeNode lowestCommonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (root == p && root == q) {
			return root;
		}

		TreeNode x = lowestCommonAncestorHelper(root.left, p, q);
		if (x != null && x != p && x != q) {
			return x;
		}
		TreeNode y = lowestCommonAncestorHelper(root.right, p, q);
		if (y != null && y != p && y != q) {
			return y;
		}

		if (x != null && y != null) {
			return root;
		} else if (root == p || root == q) {
			return root;
		} else {
			return x == null ? y : x;
		}
	}
}
