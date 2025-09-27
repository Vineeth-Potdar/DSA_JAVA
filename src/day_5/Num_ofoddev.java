package day_5;

import java.util.Scanner;

public class Num_ofoddev {

	public static void main(String[] args) {
		System.out.print("Enter the number of elements in an array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int odd = 0,even = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd++;
			}
			else {
				even++;
			}
		}
		System.out.println("Number of odd numbers : "+odd);
		System.out.println("Number od even numbers : "+even);
		
	}
		
}
