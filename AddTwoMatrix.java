package august;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows for the Matrix");
		int row=scan.nextInt();
		int r1=row, r2 =row;
		System.out.println("Enter the number of columns for the Matrix");
		int col=scan.nextInt();
		int c1=col, c2 =col;
		
		int [][] m1 = new int[r1][c1];
		int [][] m2 = new int[r2][c2];
		int [][] mAdd = new int[r2][c2];
		
		System.out.println("Enter the values for first Matrix");
		for(int i=0 ; i<r1 ; i++) {
			for(int j=0 ; j<c1 ; j++) {
				System.out.println("Enter the value of row " + (i+1) + " column " + (j+1));
				m1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter the values for second Matrix");
		for(int i=0 ; i<r1 ; i++) {
			for(int j=0 ; j<c1 ; j++) {
				System.out.println("Enter the value of row " + (i+1) + " column " + (j+1));
				m2[i][j]=scan.nextInt();
			}
		}
		
		
	}

}
