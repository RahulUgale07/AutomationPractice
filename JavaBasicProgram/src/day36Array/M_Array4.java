package day36Array;
import java.util.Arrays;
public class M_Array4 {
	public static void main(String args[]) {
		int arr[] = { 33, 3, 4, 5 };
		//int darr[] = { 33, 3, 7, 5 };// comparing on basis of value and no of elements
		System.out.println("Printing original array:");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("Printing clone of the array:");
		int carr[] = arr.clone();
		for (int i : carr) {
			System.out.println(i);
		}
		System.out.println("Are both equal arr & carr ?");
		System.out.println(Arrays.equals(arr, carr));//equal elements true
		//System.out.println(Arrays.equals(arr, darr)); //not equal elements false
		System.out.println("******************************");
		int newCopiedArray[]=Arrays.copyOf(arr, arr.length);
		for (int i : newCopiedArray){
			System.out.println(i);
		}
		System.out.println("******************************");
		int newCopiedRangeArray[]=Arrays.copyOfRange(arr, 0, 3);
		for (int i : newCopiedRangeArray){
			System.out.println(i);
		}
		System.out.println("Comparing newCopiedRangeArray & newCopiedArray : "
							+Arrays.equals(newCopiedArray, newCopiedRangeArray));	
		System.out.println("**************************");
		Arrays.sort(arr);//sort the array elements in ascending order and stores the sorted element in the same array
		System.out.println("After sorting original array:");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
