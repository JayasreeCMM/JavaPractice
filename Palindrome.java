package august;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println("Given String is ");
		System.out.println("----------------");
		System.out.println(str);
		System.out.println();
		
		System.out.println("Method 1 - Using StringBuilder Class");
		System.out.println("------------------------------------");
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1.reverse();
		String revStr=str1.toString();
		if(str.compareTo(revStr)==0)
			System.out.println("The String is a Palindrome");
		else
			System.out.println("The String is not a Palindrome");
		System.out.println();
		
		System.out.println("Method 2 - Converting the String to Character Array");
		System.out.println("---------------------------------------------------");
		char[] charArray = str.toCharArray();
		boolean temp=false;
		for (int i = 0, j = charArray.length-1; i < (charArray.length) && j >=0; i++, j--) { 
				if(charArray[i] == charArray[j]) {
					temp = true;
				}
				else {
					temp=false;
					break;
				}
		}		
		if(temp == true)
			System.out.println("The String is a Palindrome");
			
		else
			System.out.println("The String is not a Palindrome");
		
	}

}
