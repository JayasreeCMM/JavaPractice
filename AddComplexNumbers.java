package august;

public class AddComplexNumbers {

	public static void main(String[] args) {
		String	num1 = "1+2i";
		String	num2 = "3+4i";
		//splitting the complex number string
		String[] arrNum1 = num1.split("\\+");
		String[] arrNum2 = num2.split("\\+");
		//removing non-integers
		arrNum1[1] = arrNum1[1].replaceAll("[^0-9]","");
		arrNum2[1] = arrNum2[1].replaceAll("[^0-9]","");
		//converting from string to integer 
		int realNum1 = Integer.parseInt(arrNum1[0]); 
		int compNum1 = Integer.parseInt(arrNum1[1]);
		int realNum2 = Integer.parseInt(arrNum2[0]); 
		int compNum2 = Integer.parseInt(arrNum2[1]); 
		//adding real and imaginary part 
		int sumReal = realNum1 + realNum2; 
		int sumComp = compNum1 + compNum2;
		System.out.println("The Complex numbers are " + num1 + " and " + num2);
		System.out.println("The sum of the Complex numbers is " + sumReal + "+" + sumComp + "i");
		
	}

}
