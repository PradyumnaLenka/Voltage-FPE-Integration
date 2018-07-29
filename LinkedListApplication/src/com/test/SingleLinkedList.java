package com.test;

public class SingleLinkedList {
	
	Node head; // head of the list
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	
	public void append(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		Node last = head;
			while(last.next != null){
				last = last.next;
			}
		last.next = new_node;
	}
	
	public void push(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		} else{
			new_node.next = head;
			head = new_node;
		}
	}
	
	public void insertAfter(Node prev_node, int data){
		if(prev_node == null){
			System.out.println(" Prevois Node can't be Null ");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
				
	}
	
	public void printList(){
		if(head != null){
			Node last = head;
			while(last.next != null){
				System.out.print(last.data);
				last = last.next;
			}
		}
	}
	
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.append(6);  
		singleLinkedList.push(7);
		singleLinkedList.push(1);
		singleLinkedList.append(4);
		singleLinkedList.insertAfter(singleLinkedList.head.next, 8);
		System.out.println("\nCreated Linked list is: ");
		singleLinkedList.printList();
	}

}
