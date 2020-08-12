package august;

import java.util.Scanner;

public class BubbleSort
{
   public static void main(String args[])
   {
       int count, i, j, temp;
       int arr[] = new int[100];
       Scanner scan = new Scanner(System.in);
	   
       System.out.println("Enter Total Number of Elements : ");
       count = scan.nextInt();
	   System.out.println("Enter " + count + " Numbers : ");
	   for(i=0; i<count; i++){
           arr[i] = scan.nextInt();
       }
	   
	   System.out.println("Given Array");
	   for(i=0; i<count; i++){
           System.out.print(arr[i]+ "  ");
       }
	   System.out.println("\n---------------------");
	   System.out.println("---------------------");
	   
       for(i=0; i<(count-1); i++){
    	   
    	   for(j=0; j<(count-i-1); j++){
    		
    		   if(arr[j] > arr[j+1]){
            	
    			   temp = arr[j];
    			   arr[j] = arr[j+1];
    			   arr[j+1] = temp;
               }
           }
        }
	   
       System.out.println("Bubble Sorted Array in Descending Order");
       for(i=count-1; i>=0; i--){
           System.out.print(arr[i]+ "  ");
       }
   }
}