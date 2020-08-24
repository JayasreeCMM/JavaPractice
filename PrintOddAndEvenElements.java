package august;

import java.util.Scanner;

public class PrintOddAndEvenElements {

	public static void main(String[] args) {
		System.out.println("Enter the size of the Array");
		Scanner scan = new Scanner(System.in);
    	int arrSize = scan.nextInt();
    	int[] arr = new int[arrSize];
    	int sum=0;
    	System.out.println("Enter " + arrSize + " numbers:");
    	for (int i = 0; i < arrSize; i++) 
    		arr[i] = scan.nextInt();	
		    		    	
        System.out.println("Given Array :");
        System.out.println("-------------");
        for(int i:arr)  
            System.out.print(i + " ");  
        
        System.out.println();
        System.out.println();
               
        System.out.println("The Odd Elements :");
        System.out.println("------------------");
        for (int i=0; i<arrSize; i+=2) 
        	System.out.print(arr[i] + " ");
        
        System.out.println();
        System.out.println();	
        
        System.out.println("The Even Elements :");
        System.out.println("-------------------");
        for (int i=1; i<arrSize; i+=2) 
        	System.out.print(arr[i] + " ");        	
	}
}