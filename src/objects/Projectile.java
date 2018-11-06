package objects;

import main.Position;

public class Projectile extends Object{
	
	/**
	 * Default constructor
	 * @param position The position of the new projectile
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 */
	public Projectile(Position position, int size_x, int size_y) {
		super(position, size_x, size_y);
	}
	
	/**
	 * Constructor that also creates a new position for the projectile
	 * @param x X-coordinate of the new position
	 * @param y Y-coordinate of the new position
	 * @param orientation Orientation of the new position
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 */
	public Projectile(int x, int y, int orientation, int size_x, int size_y) {
		super(x, y, orientation, size_x, size_y);
	}
}
