package com.site5;
import java.util.Scanner;
public class Merge {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter the size of the array: ");
	  int capacity = scanner.nextInt();
	  int[] numbers = new int[capacity];
	  System.out.println("Enter the elements of the array:");
	  for (int i = 0; i < capacity; i++) {
	     numbers[i] = scanner.nextInt();
	        }
	 
	        mergeSort(numbers, 0, capacity - 1);
	 
	        System.out.println("Sorted array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	 
	        scanner.close();
	    }
	 
	    public static void mergeSort(int[] arr, int leftHalf, int rightHalf) {
	        if (leftHalf < rightHalf) {
	            int mid = (leftHalf + rightHalf) / 2;
	            mergeSort(arr, leftHalf, mid);
	            mergeSort(arr, mid + 1, rightHalf);
	            merge(arr, leftHalf, mid, rightHalf);
	        }
	    }
	 
	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	 
	        int[] L = new int[n1];
	        int[] R = new int[n2];
	 
	        for (int i = 0; i < n1; i++) {
	            L[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            R[j] = arr[mid + 1 + j];
	        }
	 
	        int i = 0, j = 0;
	        int k = left;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

 
 


}
}
