/**
 * A position consists of a set of 2D-coordinates and an orientation.
 */
package main;

public class Position {
	private double x;
	private double y;
	private double orientation;
	
	/**
	 * Default constructor that only needs coordinates. Orientation is set to 0.
	 * @param x The x-coordinate of the new position
	 * @param y The y-coordinate of the new position
	 */
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
		setOrientation(orientation);
	}
	
	/**
	 * Constructor that also sets the orientation.
	 * @param x The x-coordinate of the new position
	 * @param y The y-coordinate of the new position
	 * @param orientation The orientation of the new position
	 */
	public Position(double x, double y, double orientation) {
		this.x = x;
		this.y = y;
		setOrientation(orientation);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getOrientation() {
		return orientation;
	}

	public void setOrientation(double orientation) {
		this.orientation = 180 - (orientation % 360);
	}
}
