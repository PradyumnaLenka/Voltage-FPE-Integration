package com.test;


// create a linked List

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void listPrint(){
		if(head != null){
			Node n = head;
			while(n.next != null){
				System.out.println(n.data);
				n = n.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		linkedList.head = node1;
		node1.next = node2;
		node2.next = node3;
		System.out.println("from git1");
		linkedList.listPrint();
		System.out.println("from git2 2nd line" );
		
	}
}
