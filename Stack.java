package com.site2;

public class Stack {
  int maxSize;
  int top;
  int[]numArray;
  public Stack(int size) {
	  maxSize = size;
	  top = -1;
	  numArray = new int[maxSize];
  }
  void push (int value) {
	  if ( top< maxSize-1) {
		  numArray[++top]= value;
	  }
	  else {
		  System.out.println("stack is full. ");
	  }
  }
  public int pop(int i) {
      if (top >= 0) {
          return numArray[top--];
      } else {
          System.out.println("Stack is empty.");
          return -1;
      }
  }
  public static void main(String[]args) {
	  Stack stack = new Stack(4);
	  stack.push(100);
	  stack.push(101);
	  stack.push(102);
	  stack.push(103);
	  for(int i=0 ;i < stack.maxSize;i++) {
		  System.out.println(stack.numArray[i]);
		  
		 
		  
	  }
  }
}
