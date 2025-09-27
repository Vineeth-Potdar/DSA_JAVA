package day_6;

public class Lsearching {
	public static int LinearSearch(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(key == a[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {10,2,24,13,4,12,54,14};
		int key = 24;
		int index=LinearSearch(a,key);
		if(index==-1) {
			System.out.println("The element is not found");
		}
		else {
			System.out.println("The element is found at : "+index);
		}
	}
}
