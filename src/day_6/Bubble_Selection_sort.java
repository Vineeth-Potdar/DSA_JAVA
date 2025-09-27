package day_6;

import java.util.Arrays;

public class Bubble_Selection_sort {
	public static void bubbleSort(int[] arr) {
		System.out.println("Unsorted array : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("The Bubble sorted array : "+Arrays.toString(arr));
	}
	public static void SelectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int minpos = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[minpos]>a[j]) {
					minpos=j;
				}
				int temp=a[minpos];
				a[minpos]=a[i];
				a[i]=temp;
			}
		}
		System.out.println("The Selection sorted array is : "+Arrays.toString(a));
	}
	public static void main(String[] args) {
		int[] a = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
		bubbleSort(a);
		SelectionSort(a);
	}

}
