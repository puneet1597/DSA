package com.app.delete;

public class SListDel {

	public class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node last;

	public SListDel() {
		head = null;
		last = null;
	}

	public void add(int val) {

		Node n = new Node();

		n.data = val;
		if (head == null) {
			head = n;
			last = n;
		} else {
			last.next = n;
			last = n;
		}
	}

	public void printNode() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public void delete(int val) {

		Node curr = head;
		Node prev = null;

		while ((curr != null) && (curr.data != val)) {
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			System.out.println("Element not found !!");
			return;
		} else if (prev == null) {
			head = curr.next;
			System.out.println("Element deleted !!");
			return;
		} else {
			prev.next = curr.next;
			System.out.println("Element deleted !!");
			return;
		}

	}
}
