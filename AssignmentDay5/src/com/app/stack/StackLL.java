package com.app.stack;

public class StackLL implements StackViaLL {

	public class Node {
		int data;
		Node next;
	}

	private Node top;

	public StackLL() {
		top = null;
	}

	@Override
	public void push(int val) {

		Node n = new Node();
		n.data = val;

		if (isEmpty()) {
			top = n;
		} else {
			n.next = top;
			top = n;
		}

	}

	@Override
	public int pop() {

		if (isEmpty()) {
			return -1;
		} else {
			int n = top.data;
			top = top.next;
			return n;
		}
	}

	@Override
	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	@Override
	public void display() {

		if (isEmpty()) {
			System.out.println("Stack is empty !!");
		} else {
			Node curr = top;

			while (curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}

}
