package myQueueApp;

public class MyCircularQueue implements QueueInterface {

	int[] arr;
	int rear;
	int front;
	int size;

	public MyCircularQueue(int s) {
		arr = new int[s];
		size = s;
		rear = 0;
		front = 0;
	}

	@Override
	public void add(int n) {
		if (isFull()) {
			return;
		} else {
			System.out.println("Element added in the circular queue");
			arr[rear] = n;
			rear = (rear + 1) % size;
		}

	}

	public int getSize() {
		return size;
	}

	@Override
	public int delete() {
		if (isEmpty()) {
			return -1;
		}
		int a = arr[front];
		arr[front] = 0;
		front = (front + 1) % size;
		return a;
	}

	@Override
	public boolean isEmpty() {
		if (front == rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (((rear + 1) % size) == front) {
			System.out.println("Circular Queue is full !!");
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		for (int i : arr) {
			if (i != 0)
				System.out.println(i);
		}
	}
}
