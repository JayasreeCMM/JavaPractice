package august;

import java.util.Scanner;

public class IncrementArrayElementByOne {

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
        
        
        System.out.println("The incremented Array :");
        System.out.println("-----------------------");
        for (int i:arr) {
        	i=i+1;
        	System.out.print(i + " ");
		}
    }
}