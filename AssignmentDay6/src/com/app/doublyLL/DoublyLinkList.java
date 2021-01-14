package com.app.doublyLL;

//insert a node in a doubly linked list in a sorted manner
//delete a node
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

	public void addNode(int val) {

		Node n = new Node();
		n.data = val;
		if (head == null) {
			head = n;
			last = n;
		} else {
			Node curr = head;
			while ((curr != null) && (curr.data < n.data)) {
				curr = curr.next;
			}
			if (curr == head) {
				curr.prev = n;
				n.next = curr;
				head = n;
			} else if (curr == null) {
				last.next = n;
				n.prev = last;
				last = n;
			} else {
				curr.prev.next = n;
				n.prev = curr.prev;
				n.next = curr;
				curr.prev = n;
			}
		}
	}

	public void deleteNode(int val) {
		Node curr = head;
		while ((curr != null) && curr.data != val) {

			curr = curr.next;
		}
		if (curr == null) {
			System.out.println("Element not found !!");

		} else if (curr == head) {
			if (curr == last) {
				head = null;
				last = null;
				System.out.println("Element deleted !!");
			} else {
				curr.next.prev = head;
				head = curr.next;
				System.out.println("Element deleted !!");
			}
		} else if (curr == last) {
			curr.prev.next = null;
			last = curr.prev;
			System.out.println("Element deleted !!");
		} else {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
			System.out.println("Element deleted !!");
		}
	}

	public void printElements() {

		Node curr = head;

		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	//reverse traversing of a sorted doubly linked list

	public void printReverse() {
		Node curr = last;
		
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.prev;
		}
	}
}
