package day_6;

public class Binary {
	public static int BinarySearch(int[] a,int key) {
		int en = a.length-1,st = 0;
		while(st<en) {
			int mid = (st+en)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if(key>a[mid]) {
				st=mid+1;
			}
			else {
				en=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13,15,17};
		int k = 13;
		int index = BinarySearch(a,k);
		if(index==-1) {
			System.out.println("Element is not found ");
		}
		else {
			System.out.println("The element "+k+" is at index : "+index);
		}
	}
}
