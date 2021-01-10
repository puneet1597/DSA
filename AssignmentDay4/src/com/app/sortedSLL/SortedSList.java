package com.app.sortedSLL;

public class SortedSList {

	public class Node {
		int data;
		Node next;
	}

	private Node head;

	public SortedSList() {
		head = null;
	}

	public void addNode(int n) {

		Node n1 = new Node();
		Node prev;

		n1.data = n;
		if (head == null) {
			head = n1;
		} else {
			prev = null;
			Node curr = head;
			while ((curr != null) && (curr.data < n1.data)) {
				prev = curr;
				curr = curr.next;
			}
			if (prev == null) {
				n1.next = head;
				head = n1;
			} else if (curr == null) {
				prev.next = n1;
			} else {
				prev.next = n1;
				n1.next = curr;
			}
		}
	}

	public void printNode() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}
