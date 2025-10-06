package homework;

import java.util.Arrays;

public class Selection_sort_noofswaps {
	public static void SelSort(int[] a) {
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			int minpos = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[minpos]>a[j]) {
					minpos=j;
				}
			}
			if(minpos !=i) {
				int temp=a[minpos];
				a[minpos]=a[i];
				a[i]=temp;
				c++;
			}
			
		}
		System.out.println("The Selection sorted array is : "+Arrays.toString(a));
		System.out.println("The number of swaps : "+c);
	}

	public static void main(String[] args) {	
		int[] a = {29,10,14,37,13};
		SelSort(a);
	}

}
