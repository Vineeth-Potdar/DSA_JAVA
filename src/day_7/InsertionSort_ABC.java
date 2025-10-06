package day_7;

import java.util.Arrays;

public class InsertionSort_ABC {
	public static void main(String[] args) {
		String[] s = {"banana","apple","cherry"};
		System.out.println("The Unsorted Array : "+Arrays.toString(s));
		int n = s.length;
		for(int i=1;i<n;i++) {
			String curr = s[i];
			int j = i-1;
			while(j>=0 && s[j].compareTo(curr)>0) {
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = curr;
		}
		System.out.println("The Sorted Array : "+Arrays.toString(s));
	}
}