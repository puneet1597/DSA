package com.app.BinaryTree;
// Binary Tree with hard coded values !!!
public class BinaryTree {

	public class BTnode {
		int data;
		BTnode lChild;
		BTnode rChild;
	}

	public static BTnode root;

	public BinaryTree() {
		root = null;
	}

	public void CreateBinaryTree() {

		root = new BTnode();
		root.data = 7;
		root.lChild = new BTnode();
		root.lChild.data = 9;
		root.lChild.lChild = new BTnode();
		root.lChild.lChild.data = 1;
		root.lChild.rChild = new BTnode();
		root.lChild.rChild.data = 5;
		root.lChild.rChild.lChild = new BTnode();
		root.lChild.rChild.lChild.data = 3;
		root.rChild = new BTnode();
		root.rChild.data = 4;
		root.rChild.rChild = new BTnode();
		root.rChild.rChild.data = 2;
		root.rChild.rChild.lChild = new BTnode();
		root.rChild.rChild.lChild.data = 6;
	}

	private void InOrder(BTnode node) {
		if (node == null) {
			return;
		}

		InOrder(node.lChild);
		System.out.print(node.data + " ");
		InOrder(node.rChild);
	}

	public void InOrder() {
		InOrder(root);
	}

	public void PreOrder(BTnode node) {
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

	public void PostOrder(BTnode node) {
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

	private boolean find(BTnode node, int val) {
		if (node == null) {
			return false;
		}

		if (node.data == val) {
			return true;
		}
		if (node.lChild != null) {
			if (find(node.lChild, val)) {
				return true;
			}
		}
		if (node.rChild != null) {
			if (find(node.rChild, val)) {
				return true;
			}
		}
		return false;

	}

	public boolean find() {
		return find(root, 1);
	}
}
