package august;

import java.util.Scanner;

public class LargestAndSmallestElements {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the Array");
		Scanner scan = new Scanner(System.in);
    	int arrSize = scan.nextInt();
    	int[] arr = new int[arrSize];
    	int temp=0;
    	System.out.println("Enter " + arrSize + " numbers:");
    	for (int i = 0; i < arrSize; i++) {
    		arr[i] = scan.nextInt();	
		}
    		    	
        System.out.println("Given Array");   
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        for (int i = 0; i < arrSize; i++)  
        {  
            for (int j = i+1; j < arrSize; j++){  
                if (arr[j] < arr[i]) {  
                	temp=arr[i];
                	arr[i] = arr[j];
                	arr[j]=temp;
                }
            }  
        }    
        System.out.println("The smallest element is "+ arr[0]);
        System.out.println("The largest element is "+ arr[arrSize-1]);
	}

}
