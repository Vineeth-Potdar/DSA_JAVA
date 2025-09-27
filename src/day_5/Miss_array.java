package day_5;

public class Miss_array {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		int n = 6;
		int sum = n*(n+1)/2;
		int arrS = 0;
		for(int num:arr) {
			arrS += num;
			
		}
		System.out.println("Missing number : "+(sum-arrS));
	}

}
