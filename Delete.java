package com.site6;

public class Delete {
  public static int[] deleteElement(int[] array, int index) {
	if (index < 0 || index >= array.length) {
	   System.out.println("Invalid index.");
	  return array;
	}
	 
	 int[] newArray = new int[array.length - 1];
	 int newIndex = 0;
	 for (int i = 0; i < array.length; i++) {
	 if (i != index) {
	    newArray[newIndex] = array[i];
	    newIndex++;
	  }
  }
	        
	   return newArray;
}
	 
	public static void main(String[] args) {
	  int[] array = {3, 7, 1, 9, 4};
	  int indexToDelete = 2; // Index of the element to delete
	     System.out.println("Original Array:");
	  for (int num : array) {
	     System.out.print(num + " ");
	        }
	   int[] modifiedArray = deleteElement(array, indexToDelete);
	 
	      System.out.println("\nModified Array:");
	   for (int num : modifiedArray) {
	      System.out.print(num + " ");
	        }
	    }

}
