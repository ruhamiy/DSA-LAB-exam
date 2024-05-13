package com.site4;

public class BubbleAlphabet {
 public static void bubbleSort(char[] arr) {
   int n = arr.length;
   for (int i = 0; i < n - 1; i++) {
	 for (int j = 0; j < n - i - 1; j++) {
	  if (arr[j] > arr[j + 1]) {
	     char temp = arr[j];
	     arr[j] = arr[j + 1];
	     arr[j + 1] = temp;
	   }
	  }
	}
 }
	 
 public static void main(String[] args) {
  char[] alphabets = {'A', 'S', 'C', 'I', 'I'};
	 System.out.println("Unsorted Array:");
	 for (char C : alphabets) {
	  System.out.print(C + " ");
	 }
	  bubbleSort(alphabets);
	  System.out.println("\nSorted Array:");
	  for (char C : alphabets) {
	   System.out.print(C + " ");
	  }
 }
}


