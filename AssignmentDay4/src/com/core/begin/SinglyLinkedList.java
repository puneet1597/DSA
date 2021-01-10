package com.core.begin;

//adding a node at the end of the singly linked list

public class SinglyLinkedList {

	public class Node {

		int data;
		Node next;
	}
	
	private Node head;
	private Node last;
	
	public SinglyLinkedList() {
		head = null;
		last = null;
	}
	
	public void addNode(int n) {
		
		Node n1 = new Node();
		n1.data = n;
		if(head == null) {
			last = n1;
			head = n1;
		}
		else {
			last.next = n1;
			last = n1;
		}
	}
	
	public void printNode() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}
