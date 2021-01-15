package com.app.BST;
// Binary Search Tree with the inorder, preorder and postorder function and find the element functionality.
public class BinarySearchTree {

	public class BSTnode {
		int data;
		BSTnode lChild;
		BSTnode rChild;
	}

	private BSTnode root;

	public BinarySearchTree() {
		root = null;
	}

	public void CreateTree(int elem) {

		BSTnode curr = root;
		BSTnode prev = null;

		while (curr != null) {
			prev = curr;
			if (elem < curr.data) {
				curr = curr.lChild;
			} else {
				curr = curr.rChild;
			}
		}
		if (prev == null) {
			root = new BSTnode();
			root.data = elem;
		} else if (elem < prev.data) {
			prev.lChild = new BSTnode();
			prev.lChild.data = elem;
		} else {
			prev.rChild = new BSTnode();
			prev.rChild.data = elem;
		}
	}

	private void InOrder(BSTnode node) {
		if (node == null) {
			return;
		} else {
			InOrder(node.lChild);
			System.out.print(node.data + " ");
			InOrder(node.rChild);
		}
	}

	public void InOrder() {
		InOrder(root);
	}

	public void PreOrder(BSTnode node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		PreOrder(node.lChild);
		PreOrder(node.rChild);
	}

	public void PreOrder() {
		PreOrder(root);
	}

	public void PostOrder(BSTnode node) {
		if (node == null) {
			return;
		}

		PostOrder(node.lChild);
		PostOrder(node.rChild);
		System.out.print(node.data + " ");
	}

	public void PostOrder() {
		PostOrder(root);
	}

	private boolean find(BSTnode node, int val) {

		while ((node != null) && (node.data != val)) {
			if (val < node.data) {
				node = node.lChild;
			} else {
				node = node.rChild;
			}
		}

		if (node == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean findTheElement(int val) {
		if (find(root, val)) {
			return true;
		} else {
			return false;
		}
	}
}
