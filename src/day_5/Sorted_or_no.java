package day_5;

import java.util.Arrays;

public class Sorted_or_no {

	public static void main(String[] args) {
		int[] arr = {1,2,1,5,7};
		int[] copy = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copy[i]=arr[i];
		}
		System.out.println("The array is : "+Arrays.toString(arr));
		Arrays.sort(copy);
		int c=0;
		for(int i =0;i<arr.length;i++) {
			if(copy[i]==arr[i]) {
				c++;
			}
		}
		if(c==arr.length) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}

}
} 
