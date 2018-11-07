/**
 * General ship class. A ship has a position, health points and deals damage by shooting stuff.
 */
package objects;

import main.Position;

public abstract class Ship extends Object{
	private int health;
	private int damage;
	
	/**
	 * Default constructor
	 * @param pos Position of the new ship.
	 * @param size_x The maximum size of the ship in the x-direction
	 * @param size_y The maximum size of the ship in the y-direction
	 * @param health The amount of health points the ship has
	 * @param damage The amount of damage a single shot of the ships guns deal
	 */
	public Ship(Position pos, int size_x, int size_y, int health, int damage) {
		super(pos, size_x, size_y);
		this.health = health;
		this.damage = damage;
	}
	
	/**
	 * Constructor that also creates a new position for the ship
	 * @param x The x-coordinate of the new position
	 * @param y The y-coordinate of the new position
	 * @param orientation The orientation of the new position
	 * @param size_x The maximum size of the object in the x-direction
	 * @param size_y The maximum size of the object in the y-direction
	 * @param health The amount of health points the ship has
	 * @param damage The amount of damage a single shot of the ships guns deal
	 */
	public Ship(double x, double y, double orientation, int size_x, int size_y, int health, int damage) {
		super(x,y,orientation, size_x, size_y);
		this.health = health;
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
