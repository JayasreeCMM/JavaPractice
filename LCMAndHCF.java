package august;

public class LCMAndHCF {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 24;
		int max = num1 * num2;
		int temp, lcm, hcf = 0;
		
		int firstNum = num1;
		int secondNum = num2;
		
		while(num2 != 0) {
			temp = num2;
			num2 = num1 % num2;
			num1=temp;
		}
		
		hcf = num1;
		lcm = firstNum*secondNum/hcf;
		
		System.out.println("HCF of " + firstNum + " and " + secondNum + " is " + hcf);
		System.out.println("LCM of " + firstNum + " and " + secondNum + " is " + lcm);
	}
}