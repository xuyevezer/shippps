package main;

public class Position {
	private int x;
	private int y;
	private int orientation;
	
	/**
	 * Default constructor that only needs coordinates. Orientation is set to 0.
	 * @param x The x-coordinate of the new position
	 * @param y The y-coordinate of the new position
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
		this.orientation = 0;
	}
	
	/**
	 * Constructor that also sets the orientation.
	 * @param x The x-coordinate of the new position
	 * @param y The y-coordinate of the new position
	 * @param orientation The orientation of the new position
	 */
	public Position(int x, int y, int orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
}
