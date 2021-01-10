package com.core.app;

import java.util.Scanner;

public class SinglyList {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			SinglyLinkedList sl = new SinglyLinkedList();

			while (true) {
				System.out.println("Press 1 to add the elements at the starting of the list");
				System.out.println("Press 2 to display the list");
				System.out.println("Press 3 for count the total number of elements present in the list");
				System.out.println("Press 4 to count the frequency of a particular element in the list");
				System.out.println("Press 5 to find a particular element in the list");
				System.out.println("Press 6 for exit !!");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("How many elements you want to enter?");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						System.out.println("Enter the element");
						sl.addElement(sc.nextInt());
					}
					break;

				case 2:
					System.out.println("list :");
					sl.printList();
					break;

				case 3:
					System.out.println("Total number of elements in the list are : " + sl.count());
					break;

				case 4:
					System.out.println("Enter the number of which you want to find the frequency");
					int b = sc.nextInt();
					System.out.println("Frequency of " + b + " is " + sl.countFrequency(b));
					break;

				case 5:
					System.out.println("Enter the number you want to find");
					int c = sc.nextInt();
					if (sl.find(c)) {
						System.out.println("Number found !!");
					} else {
						System.out.println("Number not found !!");
					}
					break;

				case 6:
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
