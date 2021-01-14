package tester;

import myStackApp.MyStack;
import java.util.Scanner;

public class TesterStack {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array");
			MyStack s = new MyStack(sc.nextInt());
			System.out.println("Size of the array is : " + s.getSize());

			while (true) {
				System.out.println("Press 1 for add the element in the stack");
				System.out.println("Press 2 to remove the element from the stack");
				System.out.println("Press 3 to display the elements of the stack");
				System.out.println("Press 4 to reverse and display the data of the stack");
				System.out.println("Press 5 for exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the number you want to push");
					s.push(sc.nextInt());
					break;

				case 2:
					if (s.isEmpty()) {
						System.out.println("Stack is empty !!");
					} else {
						System.out.println(s.pop() + "is popped out from the stack");
					}
					break;

				case 3:
					s.display();
					break;

				case 4:
					s.displayAndReverseStack();
					break;
				
				case 5:
					s.reverseTheStack();
					break;
					
				case 6:
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
