package com.app.ListViaArray;

// Singly Linked List implemented through array
public class ListViaArray {

	public class Node {
		int data;
		int next;
		boolean isUsed;
	}

	private int head;
	private int size;
	private Node[] n;

	public ListViaArray(int s) {
		head = -1;
		size = s;
		n = new Node[size];
		for (int i = 0; i < size; i++) {
			n[i] = new Node();
			n[i].isUsed = false;
		}
	}

	private int getFreeNode() {
		for (int i = 0; i < size; i++) {
			if (!n[i].isUsed) {
				n[i].isUsed = true;
				return i;
			}
		}
		return -1;
	}

	public void add(int val) {
		int n1 = getFreeNode();
		if (n1 == -1) {
			return;
		}
		n[n1].data = val;
		n[n1].next = -1;

		if (head == -1) {
			head = n1;
			return;
		}

		int prev = -1;
		int curr = head;

		while ((curr != -1) && (n[curr].data < n[n1].data)) {
			prev = curr;
			curr = n[curr].next;
		}

		if (prev == -1) {
			n[n1].next = head;
			head = n1;
			return;
		}

		if (curr == -1) {
			n[prev].next = n1;
			return;
		}

		n[prev].next = n1;
		n[n1].next = curr;

	}

	public void printList() {
		int curr = head;
		while (curr != -1) {
			System.out.println(n[curr].data);
			curr = n[curr].next;
		}
	}
}
