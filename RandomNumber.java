package august;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		//using Math.random
		double num = Math.random();
		System.out.println("Random number using Math.random() : "+num);
		
		//using Math.random
		//min 10 max 50
		int min=10;
		int max=50;
		int num1 = (int) (Math.random()*(max-min+1)+min);
		System.out.println("Random number using max-50 and min-10 with Math.random : "+num1);
		
		//using java.util.Random
		//upperbound 100
		Random rand = new Random();
		int numRandom = rand.nextInt(100);
		System.out.println("Random number with upperbound-100 : "+numRandom);
	}

}
