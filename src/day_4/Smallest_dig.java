package day_4;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_dig {

	public static void main(String[] args) {
		System.out.print("Enter a large number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int g=n;
		int sml=9;
		if(n==0) {
			System.out.println("The smallest digit is 0");
			
		}
		else {
			if(n<0) {
				n=-n;
				g=n;
			}
			while(n>0) {
				if(sml>(n%10)) {
					sml=n%10;
				}
				n=n/10;
			}
			System.out.println("The smallest digit in "+g+ " is : "+sml);
		}
		}


}
