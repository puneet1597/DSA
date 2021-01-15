package com.app.test;

import java.util.Scanner;

import com.app.BST.BinarySearchTree;

public class TestTree {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			BinarySearchTree bst = new BinarySearchTree();

			while (true) {
				System.out.println("\nPress 1 for enter the elements in the binary search tree");
				System.out.println("Press 2 to print the elemets via InOrder function");
				System.out.println("Press 3 to print the elemets via PreOrder function");
				System.out.println("Press 4 to print the elemets via PostOrder function");
				System.out.println("Press 5 to find a particular element");
				System.out.println("Press 6 for exit !!");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter how many element you want to enter");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						System.out.println("Enter the element");
						bst.CreateTree(sc.nextInt());
					}

					break;

				case 2:
					bst.InOrder();
					break;

				case 3:
					bst.PreOrder();
					break;

				case 4:
					bst.PostOrder();
					break;

				case 5:
					System.out.println("Enter the element");
					int b = sc.nextInt();
					if (bst.findTheElement(b)) {
						System.out.println("Element found !!");
					} else {
						System.out.println("Element not found !!");
					}
					break;
					
				case 6:
					System.exit(0);

				default:
					System.out.println("Invalid Input !!");
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
