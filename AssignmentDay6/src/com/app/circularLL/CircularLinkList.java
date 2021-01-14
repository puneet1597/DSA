package com.app.circularLL;

public class CircularLinkList {

	public class Node {
		int data;
		Node next;
		Node prev;
	}

	private Node head;

	public CircularLinkList() {
		head = new Node();
		head.next = head;
		head.prev = head;
	}

	public void addNode(int val) {
		Node n = new Node();
		n.next = null;
		n.prev = null;
		n.data = val;

		Node curr = head.next;

		while ((curr != head) && (curr.data < n.data)) {
			curr = curr.next;
		}

		curr.prev.next = n;
		n.next = curr;
		n.prev = curr.prev;
		curr.prev = n;
	}

	public void delete(int val) {
		Node curr = head.next;

		while ((curr != head) && (curr.data != val)) {
			curr = curr.next;
		}
		if (curr == head) {
			System.out.println("Element not found !!");
		} else {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
	}

	public void printList() {
		Node curr = head.next;

		while (curr != head) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public void reverseList() {
		Node curr = head.prev;

		while (curr != head) {
			System.out.println(curr.data);
			curr = curr.prev;
		}
	}
}
