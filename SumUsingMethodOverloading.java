package august;

public class SumUsingMethodOverloading {

	public int sum(int x, int y) {
		return x+y;
	}
	public int sum(int x, int y, int z) {
		return x+y+z;
	}
	public double sum(double x, double y) {
		return x+y;
	}
	public double sum(double x, double y, double z) {
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		SumUsingMethodOverloading sum1= new SumUsingMethodOverloading(); 
		int sumOfInt2 = sum1.sum(1,2);
		int sumOfInt3 = sum1.sum(1,2,3);
		double sumOfDouble2 = sum1.sum(1.5,2.5);
		double sumOfDouble3 = sum1.sum(1.5,2.5,3.5);
		
		System.out.println("Sum of numbers using Method Overloading");
		System.out.println("---------------------------------------");
		System.out.println("Sum of Two Integers   : " + sumOfInt2);
		System.out.println("Sum of Three Integers : " + sumOfInt3);
		System.out.println("Sum of Two Double     : " + sumOfDouble2);
		System.out.println("Sum of Three Double   : " + sumOfDouble3);	
		
	}

}
