package august;

public class StringElementsGreaterThanSize5 {

	public static void main(String[] args) {
		
		String[] strArray = {"Tamil", "English", "Mathematics", "Science", "History", "Geo"};
		
		System.out.println("The string array elements which are greater than 5 in size:");

		for (String str : strArray) {
			if(str.length()>5)
				System.out.println(str);
		}
		
	}

}
