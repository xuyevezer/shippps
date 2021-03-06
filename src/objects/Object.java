/**
 * General object class. An object has a position.
 */
package objects;

import java.awt.image.BufferedImage;

import main.Position;

public abstract class Object {
	/**
	 * The position of the object
	 */
	private Position position;
	
	/**
	 * The maximum size of the object in the x-direction of the object
	 */
	private int size_x;
	
	/**
	 * The maximum size of the object in the y-direction of the object
	 */
	private int size_y;
	
	/**
	 * The speed of the object
	 */
	private double speed;
	
	/**
	 * The image showing the object in the view
	 */
	protected BufferedImage image;
	
	/**
	 * Default constructor, that sets the speed to 0.
	 * @param position The position of the object
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 */
	public Object(Position position, int size_x, int size_y) {
		this.position = position;
		this.size_x = size_x;
		this.size_y = size_y;
		this.speed = 0;
	}

	/**
	 * Contructor that also creates a new position for the object and sets the speed to 0.
	 * @param x X-coordinate of the new position
	 * @param y Y-coordinate of the new position
	 * @param orientation Orientation of the new position
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 */
	public Object(double x, double y, double orientation, int size_x, int size_y) {
		this.position = new Position(x,y, orientation);
		this.size_x = size_x;
		this.size_y = size_y;
	}

	public void move() {
		position.setX(position.getX() + speed * Math.sin(Math.toRadians(position.getOrientation())));
		position.setY(position.getY() + speed * Math.cos(Math.toRadians(position.getOrientation())));
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getSize_x() {
		return size_x;
	}

	public void setSize_x(int size_x) {
		this.size_x = size_x;
	}

	public int getSize_y() {
		return size_y;
	}

	public void setSize_y(int size_y) {
		this.size_y = size_y;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public BufferedImage getImage() {
		return image;
	}
}
