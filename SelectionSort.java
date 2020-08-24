package august;

import java.util.Scanner;

public class SelectionSort {
	  
	    public static void main(String[] args){
	    	
	    	System.out.println("Enter the size of the array");
	    	Scanner scan = new Scanner(System.in);
	    	int arrSize = scan.nextInt();
	    	int[] arr = new int[arrSize];
	    	System.out.println("Enter " + arrSize + " numbers:");
	    	for (int i = 0; i < arrSize; i++) {
	    		arr[i] = scan.nextInt();	
			}
	    		    	
	        System.out.println("Given Array");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        for (int i = 0; i < arrSize-1; i++)  
	        {  
	            int index = i;  
	            for (int j = i+1; j < arrSize; j++){  
	                if (arr[j] < arr[index])  
	                    index = j;  
	            }  
	            int temp = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = temp;  
	        }    
	        
	        System.out.println("----------------------");
	        System.out.println("Selection Sorted Array");  
	        for(int i:arr)  
	            System.out.print(i+" ");  
	     	}  
}