package august;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//get the size of the number array
		System.out.println("Enter the size of the array of numbers");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int searchNum;
		
		//get the numbers
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the number " + (i+1) + " : ");
			arr[i] = scan.nextInt();
		}

		//get the number to be searched
		System.out.println("Enter the Number to be searched in the array");
		searchNum = scan.nextInt();

		//print the array of numbers
		System.out.println("The given numbers are ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		//print the positions where the number is found
		for (int i = 0; i < size; i++) {
			if(arr[i] == searchNum)
				System.out.println("The Number " + searchNum + " is found at position " + (i+1));
		}
	}
}
