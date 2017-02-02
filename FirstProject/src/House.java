import java.util.Scanner;

public class House extends Building implements MLSListable {// House class as
															// per spec extends
															// Building and
															// implements
															// MLSListable

	Scanner keyboard = new Scanner(System.in);

	private int bathrooms;
	private Room[] rooms;
	public float area = 0;
	public int roomNumber;

	public House(int floors, int windows, int bathrooms, Room[] rooms) {// constructor
																		// method
																		// will
																		// not
																		// be
																		// used.
																		// Overloaded
																		// constructor
																		// will
																		// be
																		// used

		super(floors, windows);

		setFloors(floors);
		setWindows(windows);

		setRooms(rooms);
		setBathrooms(bathrooms);

	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {

		this.rooms = rooms;
	}

	public void makeRoom() {
	}

	public void makeRoom(int roomCount) {

		// a room has a length, width, floor cover, and number of closets
		float length = 0, width = 0;
		String floorCover = "NULL";
		int closets = 0;

		Room[] rooms = new Room[roomCount]; // Room creator using implemented
											// interface

		for (int i = 0; i < roomCount; i++) {

			System.out.println("Enter a length");
			length = keyboard.nextFloat();
			System.out.println("Enter a width");
			width = keyboard.nextFloat();
			System.out.println("Enter a floor type");
			floorCover = keyboard.next();
			System.out.println("Enter a number of closets");
			closets = keyboard.nextInt();

			findArea(length, width); // calculates area sum during runtime
			rooms[i] = new Room(length, width, floorCover, closets);
			System.out.println(rooms[i]);

		}
		roomNumber = roomCount;
		setRooms(rooms);

	}

	public House(int floors, int windows, int bathrooms, int roomNumber) {// overloaded
																			// constructor
																			// for
																			// the
																			// purpose
																			// of
																			// implementing
																			// the
																			// makeRoom
																			// method

		super(floors, windows);

		makeRoom(roomNumber); // generates rooms, implemented from the Creator
								// interface to create rooms on runtime
		setFloors(floors);
		setWindows(windows);

		setRooms(rooms);
		setBathrooms(bathrooms);

	}

	public void findArea() {
	}

	public void findArea(float length, float width) {
		area += (length * width);

	}

	public void GetMLSListing() {
		System.out.println("This home has " + getRooms().length + " rooms, " + getBathrooms()
				+ " bathrooms and a square footage of " + area);

	}

	public String toString() {
		String result;
		result = "The total area of the house is " + area + " the total number rooms are " + roomNumber
				+ " the number of bathrooms is " + getBathrooms() + " the number of windows are " + getWindows()
				+ " the floors are " + getFloors();

		return result;
	}

}
