import java.util.Scanner;//Here is main function

public class Hello {

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		System.out.println(" Enter a number of floors ");
		int floors = keyboard.nextInt();
		System.out.println(" Enter a number of windows ");
		int windows = keyboard.nextInt();
		System.out.println(" Enter a number of bathrooms ");
		int bathrooms = keyboard.nextInt();
		System.out.println(" Enter a number of rooms");
		int roomNumber = keyboard.nextInt();
		
		
		House firstHouse = new House(floors, windows, bathrooms, roomNumber);
		
	
	
		Garage firstGarage = new Garage(1, 2, 2, "Gravel" , 4, 5);  // has carspace, floor type, length, width
		System.out.println(firstHouse);
		System.out.println(firstGarage);
		
		
		test(firstHouse);
		
	firstHouse.GetMLSListing();// MLSListing print screen implemented in the House class
		
		
		
		
	}

		public static void  test(MLSListable firstHouse){//test for if static method will accept a House object as a MLSListable  will simply return this works
		System.out.println("This works");
		
	}
	
}
