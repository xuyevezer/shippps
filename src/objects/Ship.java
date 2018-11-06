package objects;

import main.Position;

public class Ship extends Object{
	private Position pos;
	private int size_x;
	private int size_y;
	private int health;
	private int damage;
	//private int speed;
	
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
	public Ship(int x, int y, int orientation, int size_x, int size_y, int health, int damage) {
		super(x,y,orientation, size_x, size_y);
		this.health = health;
		this.damage = damage;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
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
