package day_7;

import java.util.Arrays;

public class Insertion_sort {
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int prev = i-1;
			int curr = arr[i];
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = curr;
		}
		System.out.println("Sorted array : "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] a = {5,2,4,1,3,6};
		insertionSort(a);
	}

}
