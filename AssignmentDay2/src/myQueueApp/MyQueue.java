package myQueueApp;

public class MyQueue implements QueueInterface {

	int[] arr;
	int rear;
	int front;
	int size;
	public MyQueue(int s) {
		arr = new int[s];
		size = s;
		rear = -1;
		front = -1;
	}
	
	@Override
	public void add(int n) {
		if(isFull()) {
			return;
		}
		else {
			System.out.println("Element added in the queue");
			++rear;
			arr[rear] = n;
		}

	}

	public int getSize() {
		return size;
	}

	@Override
	public int delete() {
		if(isEmpty()) {
			return -1; 
		}
		++front;
		int a = arr[front];
		arr[front] = 0;
		return a;
	}

	@Override
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == (size - 1)) {
			System.out.println("Queue is full !!");
			return true;
		}
		return false;
	}
	
	@Override
	public void display() {
		for(int i : arr) {
			if(i!=0)
			System.out.println(i);
		}
	}
}
