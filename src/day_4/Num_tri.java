package day_4;

public class Num_tri {
	public static void main(String[] args) {
		int n = 5;
		//Number triangle
		for(int l=1;l<=n;l++) {
			for(int s = 1;s<=l;s++) {
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println();
		//Inverted number triangle
		for(int l=n;l>=1;l--) {
			for(int s = 1;s<=l;s++) {
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println();
		//Same number triangle
		for(int l=1;l<=n;l++) {
			for(int s = 1;s<=l;s++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
