package com.app.test;

import java.util.Scanner;

import com.app.queue.*;

public class TestQueue {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			QueueLL q = new QueueLL();

			while (true) {
				System.out.println("Press 1 for add the element in the queue");
				System.out.println("Press 2 to remove the element from the queue");
				System.out.println("Press 3 to display the elements of the queue");
				System.out.println("Press 4 for exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("How many elements you want to enter?");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						System.out.println("Enter the element");
						q.add(sc.nextInt());
					}
					break;

				case 2:
					if (q.isEmpty()) {
						System.out.println("Queue is empty !!");
					} else {
						System.out.println(q.remove() + " is deleted from the queue");
					}
					break;

				case 3:
					q.display();
					break;

				case 4:
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
