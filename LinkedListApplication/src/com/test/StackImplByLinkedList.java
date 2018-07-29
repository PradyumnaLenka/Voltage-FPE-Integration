package com.test;

public class StackImplByLinkedList {
	private Node head;
	
	private class Node{
		int data;
		Node next;
		
	}
	
	public StackImplByLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void push(int data){
		Node oldNode = head;
		head = new Node();
		head.data = data;
		head.next = oldNode;
	}
}
