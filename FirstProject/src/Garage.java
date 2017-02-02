
public class Garage extends Building { // Building class

	private int carSpace;
	private String floorType;
	private float length;
	private float width;

	public Garage(int windows, int floors, int carSpace, String floorType, float length, float width) {
		super(floors, windows);
		setCarSpace(carSpace);
		setFloorType(floorType);
		setLength(length);
		setWidth(width);
	}

	public int getCarSpace() {
		return carSpace;
	}

	public void setCarSpace(int carSpace) {
		this.carSpace = carSpace;
	}

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void findArea() {
	}

	public float findArea(float length, float width) {
		float result = length * width;

		return result;

	}

	public String toString() {
		String result;
		result = "This garage can hold " + carSpace + " its area is: " + findArea(getLength(), getWidth())
				+ " The floor type is: " + floorType;

		return result;
	}

}
