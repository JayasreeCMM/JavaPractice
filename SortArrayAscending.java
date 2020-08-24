package august;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAscending {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Total Number of Elements : ");
		int count = scan.nextInt();
		int arr[] = new int[count];

		System.out.println("Enter " + count + " Numbers : ");
		for(int i=0; i<count; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println("Given Array");
		for(int i=0; i<count; i++){
			System.out.print(arr[i]+ "  ");
		}
		System.out.println("\n---------------------");
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array");
		for(int i=0; i<count; i++){
			System.out.print(arr[i]+ "  ");
		}
	}
}