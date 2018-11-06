/**
 * General Projectile class. An projectile has a position and does damage, when it hits something.
 */
package objects;

import main.Position;

public class Projectile extends Object{
	/**
	 * The amount of damage a projectile deals
	 */
	private int damage;
	
	/**
	 * Default constructor
	 * @param position The position of the new projectile
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 */
	public Projectile(Position position, int size_x, int size_y, int damage) {
		super(position, size_x, size_y);
		this.damage = damage;
	}
	
	/**
	 * Constructor that also creates a new position for the projectile
	 * @param x X-coordinate of the new position
	 * @param y Y-coordinate of the new position
	 * @param orientation Orientation of the new position
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 */
	public Projectile(double x, double y, double orientation, int size_x, int size_y, int damage) {
		super(x, y, orientation, size_x, size_y);
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
