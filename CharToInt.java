package august;

public class CharToInt {

	public static void main(String[] args) {
		
		char character1 = 'a';
		char character2 = '1';
		int integer1;
		int integer2;
		integer1 = Character.getNumericValue(character1);
		integer2 = Character.getNumericValue(character2);
		System.out.println("The numeric value of the Character " + character1 + " is Integer " + integer1);
		System.out.println("The numeric value of the Character " + character2 + " is Integer " + integer2);
	}

}
