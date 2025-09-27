package day_6;

public class Largest_smallestInArray {
	public static void Larg_sml(int[] a) {
		int larg = Integer.MIN_VALUE;
		int sml = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(larg<a[i]) {
				larg=a[i];
			}
			if(sml>a[i]) {
				sml=a[i];
			}
		}
		System.out.println("The largest element is : "+larg);
		System.out.println("The smallest element is : "+sml);

	}
	public static void main(String[] args) {
		int[] a = {10,2,24,13,4,12,54,14};
		Larg_sml(a);
	}
}
