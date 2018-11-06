/*
 * General object class. An object has a position.
 */
package objects;

import main.Position;

public class Object {
	private Position position;
	private int size_x;
	private int size_y;
	
	/*
	 * Default constructor
	 * @param position The position of the object
	 * @param size_x The maximum size in the x direction of the object
	 * @param size_y The maximum size in the y direction of the object
	 */
	public Object(Position position, int size_x, int size_y) {
		this.position = position;
		this.size_x = size_x;
		this.size_y = size_y;
	}

	public Object(int x, int y, int orientation, int size_x, int size_y) {
		this.position = new Position(x,y, orientation);
		this.size_x = size_x;
		this.size_y = size_y;
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
}
