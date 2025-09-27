package day_5;

import java.util.Arrays;

public class Smal_num_arr {

	public static void main(String[] args) {
		int[] arr = {10,24,25,3,7};
		int sml = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(sml>arr[i]) {
				sml=arr[i];
			}
		}
		System.out.println("The smallest element in the array is : "+sml);
	}

}
