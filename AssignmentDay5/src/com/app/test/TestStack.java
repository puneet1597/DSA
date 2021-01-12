package com.app.test;

import java.util.Scanner;
import com.app.stack.*;

public class TestStack {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			StackLL s = new StackLL();

			while (true) {
				System.out.println("Press 1 for add the element in the stack");
				System.out.println("Press 2 to remove the element from the stack");
				System.out.println("Press 3 to display the elements of the stack");
				System.out.println("Press 4 for exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("How many elements you want to enter?");
					int a = sc.nextInt();

					for (int i = 0; i < a; i++) {
						System.out.println("Enter the element");
						s.push(sc.nextInt());
					}
					break;

				case 2:
					if (s.isEmpty()) {
						System.out.println("Stack is empty !!");
					} else {
						System.out.println(s.pop() + " is popped out from the stack");
					}
					break;

				case 3:
					s.display();
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
