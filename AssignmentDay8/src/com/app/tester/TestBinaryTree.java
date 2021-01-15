package com.app.tester;

import com.app.BinaryTree.BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		bt.CreateBinaryTree();
		System.out.print("InOrder : ");
		bt.InOrder();
		System.out.print("\nPreOrder : ");
		bt.PreOrder();
		System.out.print("\nPostOrder : ");
		bt.PostOrder();
		
		System.out.println("\nFind : " + bt.find());
	}

}
