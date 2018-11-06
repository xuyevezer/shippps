package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.Position;
import objects.Ship;

public class Battlefield_model {
	private Ship[] ships = {new Ship(new Position(100, 100), 50, 60, 100, 5)};
	private List<Ship> all_ships = new ArrayList(Arrays.asList(ships));
	
	public Battlefield_model() {
		
	}
	
	public List<Ship> getShips() {
		return all_ships;
	}
}
