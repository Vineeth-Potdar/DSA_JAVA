package day_7;

import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {
	public static void main(String[] args) {
		int arr[] = {5,1,4,3,2};
		Arrays.sort(arr,0,3);
		System.out.println(Arrays.toString(arr));
		Integer a[] = {5,4,1,3,2};
		Arrays.sort(a,0,3,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}