package model;

public class Sort {
	/*Over-Ridden String Method*/
	public static String toString(int[] sort) {
		String s = "";
		for(int i = 0; i < sort.length; i++) {
			s += sort[i];
			if(i < sort.length - 1) {
				s+=", ";
			}
		}
		return s;
		
	}
	
	public static void main(String args[]){
		InsertionSort s = new InsertionSort();
		int[] sort = {5, 2, 4, 6, 1, 3};
		s.insertionSort(sort);
		System.out.println(toString(sort));
		
		int[] sort2 = {4,3,2,1};
		MergeSort s1 = new MergeSort();
		s1.sort(sort2, 0, sort2.length -1);
		System.out.println(toString(sort2));
		
		BubbleSort s2 = new BubbleSort();
		s2.bubbleSort(sort2);
		System.out.println(toString(sort2));
	}
}
