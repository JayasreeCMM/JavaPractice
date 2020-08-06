package august;

public class StarPyramid {

	public static void main(String[] args) {

		int numOfRows = 10;
		int numOfColumns = numOfRows*2-1;
		int lp=numOfRows,fp=numOfRows;
				
		for(int i=1; i<=numOfRows ; i++) {
			
			for(int j=1 ; j<=numOfColumns ; j++) {

				System.out.print(" ");
				
				while(j>=fp && j<=lp) {
				
					System.out.print("*");
					System.out.print(" ");
					j=j+2;
				}
			}
			
			System.out.println();
			lp++;
			fp--;
		}
			
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println(numOfRows);
//		System.out.println(numOfSpots);
//		int ctr=5;
//		for(int r=1; r<=5 ; r++) {
//			for(int c=1; c<=9 ; c++) {
//				if(i==r  && j==c) {
//					do {
//					System.out.print("*");
//					j=j+2;
//					}while(j<=ctr);
//				}
//				else
//					System.out.print(" ");
//			}
//			ctr++;
//			i++;
//			j--;
//			System.out.println();
//		}
//		for(int i=1 ; i<=numOfRows ; i++) {
//			for (int j=center ; j<center+i ; j=j+2) {
//				for(int t=numOfSpots ; t>=0 ; t--) {
//					System.out.print(" ");
//				}
//				System.out.print("*");
//				numOfSpots--;
//			}
//			center--;
//			System.out.println();
//		}
	

}
