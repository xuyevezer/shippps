package objects;

import main.Position;

public class Object {
	private Position position;
	private int size_x;
	private int size_y;
	
	public Object(Position position, int size_x, int size_y) {
		this.position = position;
		this.size_x = size_x;
		this.size_y = size_y;
	}
	
}
