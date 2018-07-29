package com.test;

public class StackImplByArray {

	int []a = new int[100];
	int top;
	
	StackImplByArray(){
		top = -1;
	}
	
	boolean isEmpty(){
		if(top < 0)
			return true;
		else 
			return false;
	}
	
	boolean push(int data){
		if(a.length >= 100){
			return false;
		}else{
			a[++top] = data;
			return true;
		}
	}
	
	int pop(){
		if(top < 0){
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}
	
	public static void main(String[] args) {
		StackImplByArray stack = new StackImplByArray();
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.pop() + " Popped from stack");
	}
}
