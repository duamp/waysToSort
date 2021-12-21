package model;

public class MergeSort {
	/*Merge sort 
	 * Best Case: nlog(n)
	 * Worst Case: nlog(n)
	 * */
	
	public void sort(int[] arr, int l, int r) {
		if(l < r) {
			int m = l + (r-l)/2;     //middle point
			sort(arr, l, m); 		 //sort first half
			sort(arr, m + 1, r);     //sort second half
			mergeSort(arr, l, m, r); //merge the sorted half	
			}
	}
	

	public void mergeSort(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;   //size of subArray 1
		int n2 = r - m;       //size of subArray 2
		
		/* create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		/* copy data to temp arrays */
		for(int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for(int i = 0; i < n2; i++) {
			R[i] = arr[m+1+i];
		}
		
		/*index of first and second sub array */
		int i = 0, j = 0;
		
		// Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
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
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
		
		
	}
}
