
public abstract class Building {// building abstract class as per spec
	private int floors;
	private int windows;

	public abstract void findArea();// abstract method to findArea

	public Building(int floors, int windows) {
		super();
		setFloors(floors);
		setWindows(windows);
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public float calcFloor(float length, float width) {
		float area;
		area = length * width;

		return area;
	}

	public String toString() {
		String result;
		result = "This building has " + getWindows() + " windows and " + getFloors() + "floors ";

		return result;
	}
}
