package august;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
		int ctr=0;
		boolean flag=true;
		System.out.println("The Alternative Prime Numbers less than 20 are :");
		System.out.println("2");
		
		for(int num=3 ; num<=20 ; num++) {
			
			for (int i = 2; i < num; i++) {
				if(num % i == 0) {
					flag = false;
					break;
				}
				else 
					flag = true;
			}

			if(flag==true)
				ctr++;
			
			if((flag == true) && (ctr%2 ==0)) 
					System.out.println(num);
		}
	}

}
