package homework;

import java.util.Arrays;

public class First_half_sort {
	   public static void main(String[] args) { 
	        int[] arr1 = {1, 3, 5}; 
	        int[] arr2 = {2, 4, 6}; 
	 
	        int n1 = arr1.length; 
	        int n2 = arr2.length; 
	        int[] merged = new int[n1 + n2]; 
	 
	        int i = 0, j = 0, k = 0; 
	 
	        // Merge logic 
	        while (i < n1 && j < n2) { 
	            if (arr1[i] < arr2[j]) { 
	                merged[k++] = arr1[i++]; 
	            } else { 
	                merged[k++] = arr2[j++]; 
	            } 
	        } 
	 
	        // Copy remaining elements (if any) 
	        while (i < n1) { 
	            merged[k++] = arr1[i++]; 
	        } 
	 
	        while (j < n2) { 
	            merged[k++] = arr2[j++]; 
	        } 
	 
	        System.out.println("Merged Array: " + Arrays.toString(merged)); 
	    } 
} 
