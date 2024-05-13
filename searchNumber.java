package com.site1;
import java.util.Scanner;

public class searchNumber {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the size of the array: ");
	  int capacity = scanner.nextInt();
	  int[]numbers = new int[capacity];
		System.out.println("Enter the elements of the array:");
	  for (int i = 0; i < capacity; i++) {
		 numbers[i] = scanner.nextInt();
      }
		 System.out.print("Enter a number to be searched: ");
      int numbersearch = scanner.nextInt();
	  int count = 0;
	  for (int enterednum : numbers) {
		 if (enterednum == numbersearch) {
		    count++;
		 }
	  }
		 if (count > 0) {
		   System.out.println(numbersearch + " is present in the array " + count + " times.");
		 } else {
		   System.out.println(numbersearch + " is not present in the array.");
		    }
 scanner.close();
 }

}


