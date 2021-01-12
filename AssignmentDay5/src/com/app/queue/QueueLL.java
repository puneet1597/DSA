package com.app.queue;

public class QueueLL implements QueueViaLL {

	public class Node {
		int data;
		Node next;
	}

	private Node rear;
	private Node front;

	public QueueLL() {
		rear = null;
		front = null;
	}

	@Override
	public void add(int val) {
		Node n = new Node();
		n.data = val;

		if (rear == null) {
			rear = n;
			front = n;
		} else {
			rear.next = n;
			rear = n;
		}

	}

	@Override
	public int remove() {
		if (isEmpty()) {
			return -1;
		} else {
			int n = front.data;
			front = front.next;
			return n;
		}
	}

	@Override
	public boolean isEmpty() {
		if (front == rear) {
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		Node curr = front;

		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}
