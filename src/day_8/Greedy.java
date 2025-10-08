package day_8;

public class Greedy {
	public static void main(String[] args) {
		int[] start = {1,3,0,5,8,5};
		int[] end = {2,4,6,7,9,9};
		int n = start.length;
		int currst = Integer.MAX_VALUE;
		int curren = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
                if (end[i] > end[j]) {
                    int temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;
                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }
        int c = 0;
        int lastEnd = -1;
        System.out.print("Activities performed :");
        for (int i = 0; i < n; i++) {
            if (start[i] >= lastEnd) {
                c++;
                lastEnd = end[i];
                System.out.print("A"+i+" ");
            }
        }
        System.out.println();
		System.out.println("The number of activities that can be done by 1 person : "+c);
	}
}
