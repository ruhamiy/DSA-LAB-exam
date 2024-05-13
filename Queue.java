package com.site3;

public class Queue {
  int[] stack1;
  int[] stack2;
  int top1;
  int top2;
  int capacity;
  int size;
	 
public Queue(int capacity) {
  this.capacity = capacity;
  this.stack1 = new int[capacity];
  this.stack2 = new int[capacity];
  this.top1 = -1;
  this.top2 = -1;
  this.size = 0;
}
public void enqueue(int item) {
 if (size == capacity) {
  System.out.println("Queue is full.");
  return;
}
 while (top1 >= 0) {
  stack2[++top2] = stack1[top1--];
 }
  stack1[++top1] = item;
 while (top2 >= 0) {
  stack1[++top1] = stack2[top2--];
 }
  size++;
}
public int dequeue() {
  if (size == 0) {
   System.out.println("Queue is empty.");
   return -1;
  }
  int item = stack1[top1--];
   size--;
   return item;
}
	 
public int peek() {
  if (size == 0) {
   System.out.println("Queue is empty. Cannot peek.");
   return -1;
  }
   return stack1[top1];
}
public boolean isEmpty() {
  return size == 0;
}
	 
public static void main(String[] args) {
	Queue queue = new Queue(5);
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	 
	System.out.println("Dequeued item: " + queue.dequeue());
	System.out.println("Peeked item: " + queue.peek());
	System.out.println("Dequeued item: " + queue.dequeue());
	System.out.println("Dequeued item: " + queue.dequeue());
	System.out.println("Dequeued item: " + queue.dequeue());
}

}
