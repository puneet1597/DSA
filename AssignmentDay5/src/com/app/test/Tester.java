package com.app.test;

import java.util.Scanner;
import com.app.delete.*;
import com.app.doublyLL.*;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			SListDel sl = new SListDel();
			DoublyLinkList dlf = new DoublyLinkList();

			while (true) {
				System.out.println("Press 1 to add the elements at the end of the list");
				System.out.println("Press 2 to display the singly linked list");
				System.out.println("Press 3 to delete an element");
				System.out.println("Press 4 to add an element at the front of a doubly linked list");
				System.out.println("Press 5 to add an element at the last of a doubly linked list");
				System.out.println("Press 6 to print the doubly linked list");
				System.out.println("Press 7 for exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("How many elements you want to enter?");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						System.out.println("Enter the element");
						sl.add(sc.nextInt());
					}
					break;

				case 2:
					System.out.println("list :");
					sl.printNode();
					break;

				case 3:
					System.out.println("Enter the element");
					sl.delete(sc.nextInt());
					break;

				case 4:
					System.out.println("How many elements you want to enter?");
					int b = sc.nextInt();

					for (int i = 0; i < b; i++) {
						System.out.println("Enter the element");
						dlf.addAtFront(sc.nextInt());
					}
					break;

				case 5:
					System.out.println("How many elements you want to enter?");
					int c = sc.nextInt();

					for (int i = 0; i < c; i++) {
						System.out.println("Enter the element");
						dlf.addAtLast(sc.nextInt());
					}
					break;

				case 6:
					System.out.println("List is : ");
					dlf.printElements();
					break;

				case 7:
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
