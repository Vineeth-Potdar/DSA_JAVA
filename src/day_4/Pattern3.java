package day_4;

import java.util.Scanner;

public class Pattern3 {
	public static void hollow_triangle(int n) {
		for(int i= 0;i<=n;i++) {
			for(int j=0;j<=2*n;j++) {
				if(i+j==n||j-i==n||(i==n && j%2==0)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		hollow_triangle(n);
	}

}
