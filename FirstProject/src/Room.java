
public class Room {// room class as per spec

	private float length;
	private float width;
	private String floorCover;
	private int closets;

	public Room(float length, float width, String floorCover, int closets) {
		super();

		setLength(length);
		setWidth(width);
		setFloorCover(floorCover);
		setClosets(closets);

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

	public String getFloorCover() {
		return floorCover;
	}

	public void setFloorCover(String floorCover) {
		this.floorCover = floorCover;
	}

	public int getClosets() {
		return closets;
	}

	public void setClosets(int closets) {
		this.closets = closets;
	}

	public boolean equals(Object obj) {

		if (!(obj instanceof Room)) {
			return false;

		}
		boolean result = false;
		if (this.getFloorCover() == ((Room) obj).getFloorCover()) {

			result = true;

		}

		result = false;

		return result;
	}

	public int compareTo(Object obj) {
		int result;
		result = getClosets() - ((Room) obj).getClosets();

		return result;

	}

	public String toString() {
		String result;
		result = "This room has a length of " + length + " , a width of " + width + " and a floor covering made of "
				+ floorCover + " with " + closets + " closets.";

		return result;
	}

}
