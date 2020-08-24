package august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWordsInString {

	public static void main(String[] args) {
		String str = "Welcome to the java practice session";
		String[] strArray = str.split(" ");
		System.out.println("The given string is");
		System.out.println("-------------------");
		for (String string : strArray) 
			System.out.print(string + "\t");	
		System.out.println();
		System.out.println();
		
		System.out.println("Method 1 - Sorting the Array");
		System.out.println("----------------------------");
		String[] strArray1 = str.split(" ");
		Arrays.sort(strArray1);
		for (String string : strArray1) 
			System.out.print(string + "\t");	
		System.out.println();
		System.out.println();
			
		System.out.println("Method 2 - Sorting the List");
		System.out.println("---------------------------");
		String[] strArray2 = str.split(" ");
		List<String> strList = new ArrayList<String>();
		for (String string : strArray2) 
			strList.add(string);	
		Collections.sort(strList);
		for (String string : strList) 
			System.out.print(string + "\t");
		System.out.println();
		System.out.println();
		
		System.out.println("Method 3 - Using Bubble Sort");
		System.out.println("----------------------------");
		String[] strArray3 = str.split(" ");
		for (int i=0; i<strArray3.length; i++) 
			for (int j=1; j<(strArray3.length)-i-1; j++) 
				if(strArray3[j].compareTo(strArray3[j+1]) > 0  ) {
					String tempStr = strArray3[j];
					strArray3[j]=strArray3[j+1];
					strArray3[j+1]=tempStr;					
				}
		for (String string : strArray3) 
			System.out.print(string + "\t");
	}
}
