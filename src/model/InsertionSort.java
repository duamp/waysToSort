package model;

public class InsertionSort{
	/* Insertion sort 
	 * Worst case: o(n^2) runtime
	 * Best Case: o(n) runtime
	 */
	
	public void insertionSort(int[] sort) {
		for(int j = 1; j < sort.length; j++) {
			int key = sort[j];
			int i = j - 1;
			while(i >= 0 && key > sort[i]) {
				sort[i + 1] = sort[i];
				i = i - 1;
				sort[i + 1] = key;
			}
		}
		
	}
}
