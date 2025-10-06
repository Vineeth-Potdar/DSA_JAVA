package homework;

public class Merge_2_sort {
    public static void Merge(int arr[], int[] L, int[] R){
    	int i=0,j=0;
    	int k=1;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void MergeSort(int arr[],int arr2[]){
        
        if (l < r) {
            int m = l + (r - l) / 2;
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
            Merge(arr, l, m);
        }
    }
	public static void main(String[] args) {
		/

	}

}
