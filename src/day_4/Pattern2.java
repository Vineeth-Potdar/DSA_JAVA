package day_4;

import java.util.Scanner;

public class Pattern2 {
	public static void hollow_rectangle(int row,int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1||i==row || j==1||j==col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array: ");
	        int row = 0;
	        int col = 0;
	        if (sc.hasNextInt()) {
	            row = sc.nextInt();
	            col = sc.nextInt();
	        }

	        // Initialize the array's
	        // size using user input
	        int[][] arr = new int[row][col];

	        // Take user elements for the array
	        System.out.println(
	            "Enter the elements of the array: ");
	        for (int i = 0; i < row; i++) {
	        	for(int j = 0;j<col;j++) {
	            if (sc.hasNextInt()) {
	                arr[i][j] = sc.nextInt();
	            }
	        	}
	        }
		hollow_rectangle(row, 5);
	}

}
