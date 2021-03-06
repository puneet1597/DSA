package com.app.test;

import java.util.Scanner;

import com.app.circularLL.*;

public class TestCircularLL {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			CircularLinkList cll = new CircularLinkList();
			while (true) {
				System.out.println("Press 1 to add element");
				System.out.println("Press 2 to display the elements in sorted format");
				System.out.println("Press 3 to delete an element");
				System.out.println("Press 4 to display the elements in reverse order");
				System.out.println("Press 5 to exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("How many elements you want to enter?");
					int a = sc.nextInt();
					for (int i = 0; i < a; i++) {
						System.out.println("Enter the number");
						cll.addNode(sc.nextInt());
					}
					break;

				case 2:
					cll.printList();
					break;

				case 3:
					System.out.println("Enter the number");
					cll.delete(sc.nextInt());
					break;

				case 4:
					cll.reverseList();
					break;

				case 5:
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
