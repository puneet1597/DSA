package com.core.begin;

import java.util.Scanner;

public class SinglyList {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			SinglyLinkedList sl = new SinglyLinkedList();

			while (true) {
				System.out.println("Press 1 to add the elements at the end of the list");
				System.out.println("Press 2 to display the list");
				System.out.println("Press 3 for exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("How many elements you want to enter?");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						System.out.println("Enter the element");
						sl.addNode(sc.nextInt());
					}
					break;

				case 2:
					System.out.println("list :");
					sl.printNode();
					break;

				case 3:
					System.exit(0);

				default:
					System.out.println("Invalid Input");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
