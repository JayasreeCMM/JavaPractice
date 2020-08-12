package august;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {

	public int getLastDigit(int num) {
		num = num % 10;
		return num;
	}
	
	public static void main(String[] args) {
		
		ReverseNumberUsingRecursion obj = new ReverseNumberUsingRecursion();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int number = scan.nextInt();
		int originalNumber = number;
		int lastDigit;
		int ctr=1, rn=0;
		
		while(number > 0) {
			lastDigit = obj.getLastDigit(number);
			rn=rn*ctr + lastDigit;
			number = number / 10;
			ctr=10;
		}
		
		System.out.println("The Original Number is " + originalNumber);
		System.out.println("The Reversed Number is " + rn);
	}
}
