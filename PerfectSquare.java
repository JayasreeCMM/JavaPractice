package august;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int num = 101;
		double squareRoot = Math.sqrt(num); 
		double roundValue = Math.floor(squareRoot);
		if(squareRoot == roundValue)
			System.out.println("The number is a perfect square");
		else
			System.out.println("The number is not a perfect square");
	}

}
