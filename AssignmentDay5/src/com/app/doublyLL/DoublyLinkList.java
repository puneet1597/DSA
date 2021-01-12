package com.app.doublyLL;

public class DoublyLinkList {

	public class Node {
		int data;
		Node next;
		Node prev;
	}

	private Node head;
	private Node last;

	public DoublyLinkList() {
		head = null;
		last = null;
	}

	public void addAtFront(int val) {

		Node n = new Node();
		n.data = val;

		if (head == null) {
			n.next = head;
			head = n;
			last = n;
		} else {
			n.next = head;
			head.prev = n;
			head = n;
			n.prev = null;
		}
	}
	
	public void addAtLast(int val) {

		Node n = new Node();
		n.data = val;

		if (head == null) {
			last = n;
			head = n;
		} else {
			last.next = n;
			n.prev = last;
			last = n;
		}
	}

	public void printElements() {

		Node curr = head;

		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}
