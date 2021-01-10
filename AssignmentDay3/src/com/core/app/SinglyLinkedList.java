package com.core.app;

//adding a node at the start of the singly linked list

public class SinglyLinkedList {

	public class SListNode {
		int data;
		SListNode next;
	}

	private SListNode head;

	public SinglyLinkedList() {
		head = null;
	}

	public void addElement(int n) {
		SListNode sln = new SListNode();
		sln.data = n;
		sln.next = head;
		head = sln;
	}

	public void printList() {
		SListNode current = head;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public int count() {
		SListNode current = head;
		int count = 0;
		while(current!=null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public int countFrequency(int n)
	{
		SListNode current = head;
		int count = 0;
		while(current!=null) {
			if(n==current.data) {
				count++;
			}
			current = current.next;
		}
		return count;
	}
	
	public boolean find(int n) {
		SListNode current = head;
		while(current!=null) {
			if(n == current.data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
}
