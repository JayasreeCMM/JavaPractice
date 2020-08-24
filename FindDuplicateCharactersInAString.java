package august;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateCharactersInAString {

	public static void main(String[] args) {
		String str = "SeleniumWorkout";
		char[] charArray = str.toCharArray();
		
		System.out.println("Method 1");
		System.out.println("--------");
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
				
		//Add characters to charSet without duplicates
		//and add duplicate characters to dupCharSet
		for (Character eachChar : charArray) {
			if(!charSet.add(eachChar)) {
				dupCharSet.add(eachChar);
			}
		}
		
		System.out.println("Given String \t\t\t\t\t" + str);
		System.out.println("Characters in the given String \t\t\t"+charSet);
		System.out.println("Duplicate characters in the given String \t"+dupCharSet);
		System.out.println();
		
		System.out.println("Method 2");
		System.out.println("--------");
		System.out.println("The given string is : \t\t\t\t" + str);
		System.out.print("The duplicate characters in the string are : ");
		
		for (int i = 0; i < charSet.size(); i++) {
			
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					System.out.print("\t" + charArray[i]);
					break;
				}
			}
		}
	}
}