package tester;

import java.util.Scanner;
import myQueueApp.MyQueue;
import myQueueApp.MyCircularQueue;

public class TesterQueue {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the size of the queue");
			MyQueue q = new MyQueue(sc.nextInt());
			System.out.println("Enter the size of the circular queue");
			MyCircularQueue cq = new MyCircularQueue(sc.nextInt());
			System.out.println("Size of the queue is : " + q.getSize());
			System.out.println("Size of the circular queue is : " + cq.getSize());

			while (true) {
				System.out.println("Press 1 for add the element in the queue");
				System.out.println("Press 2 to remove the element from the queue");
				System.out.println("Press 3 to display the elements of the queue");
				System.out.println("Press 4 to add the elements in the circular queue");
				System.out.println("Press 5 to delete the element from the queue");
				System.out.println("Press 6 to display the elements of the circular queue");
				System.out.println("Press 7 for exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the number you want to add");
					q.add(sc.nextInt());
					break;

				case 2:
					if (q.isEmpty()) {
						System.out.println("Queue is empty !!");
					} else {
						System.out.println(q.delete() + " is deleted from the queue");
					}
					break;

				case 3:
					q.display();
					break;

				case 4:
					System.out.println("Enter the number you want to add");
					cq.add(sc.nextInt());
					break;

				case 5:
					if (cq.isEmpty()) {
						System.out.println("Circular Queue is empty !!");
					} else {
						System.out.println(cq.delete() + " is deleted from the circular queue");
					}
					break;

				case 6:
					cq.display();
					break;
					
				case 7:
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
