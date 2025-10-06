package day_7;

import java.util.Arrays;

public class Quicksort {
	public static int Parts(int[] arr,int si,int ei) {
			int pivot = arr[ei];
			int i = si-1;
			for(int j=si; j<ei;j++) {
				if(arr[j]<pivot) {
					i++;
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			int temp=arr[i+1];
			arr[i+1]=arr[ei];
			arr[ei]=temp;
			return i+1;	
	}
	public static void QuickSort(int[] arr,int si,int ei) {
		if(si<ei){
			int p = Parts(arr,si,ei);
			QuickSort(arr,si,p-1);
			QuickSort(arr,p+1,ei);
		}
	}

	public static void main(String[] args) {
		int[] a = {6,3,9,8,2,5};
		int n=a.length;
		QuickSort(a,0,n-1);
		System.out.println("The Quick Sorted Array : "+Arrays.toString(a));
	}
}
