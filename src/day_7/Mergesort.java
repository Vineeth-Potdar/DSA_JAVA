package day_7;

import java.util.Arrays;

public class Mergesort {
	    static void merge(int arr[], int l, int m, int r){
	        int a = m - l + 1;
	        int b = r - m;
	        int L[] = new int[a];
	        int R[] = new int[b];
	        for (int i = 0; i < a; ++i) {
	            L[i] = arr[l + i];
	        }
	        for (int j = 0; j < b; ++j) {
	            R[j] = arr[m + 1 + j];
	        }
	        int i = 0, j = 0;
	        int k = l;
	        while (i < a && j < b) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < a) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < b) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	    static void mergeSort(int arr[], int l, int r){
	        
	        if (l < r) {
	            int m = l + (r - l) / 2;
	            mergeSort(arr, l, m);
	            mergeSort(arr, m + 1, r);
	            merge(arr, l, m, r);
	        }
	    }
	    public static void main(String args[]){
	        
	        int arr[] = {6,3,9,5,2,8};
	        
	        mergeSort(arr, 0, arr.length - 1);
	        System.out.println("The Merge Sorted Array : "+Arrays.toString(arr));
	    }
	}
