package model;

import java.util.ArrayList;
import java.util.List;

import main.Position;
import objects.Battleship;
import objects.Carrier;
import objects.Cruiser;
import objects.Destroyer;
import objects.Patrol;
import objects.Projectile;
import objects.Ship;
import objects.Submarine;
import view.Battlefield_view;

public class Battlefield_model extends Thread {
	
	private List<Battlefield_view> observers = new ArrayList<>();
	
	private List<Ship> ships = new ArrayList<>();
	
	private List<Projectile> projectiles = new ArrayList<>();
	
	public Battlefield_model(Battlefield_view battlefield_view) {
		super();
		
		addObserver(battlefield_view);
		
		ships.add(new Battleship(new Position(100, 100)));
		ships.add(new Carrier(new Position(350, 300)));
		ships.add(new Cruiser(new Position(600, 400)));
		ships.add(new Destroyer(new Position(250, 200)));
		ships.add(new Submarine(new Position(150, 500)));
		ships.add(new Patrol(new Position(550, 50)));

		//example projectiles
		projectiles.add(new Projectile(new Position(110, 110), 10, 10, 100));
	}
	
   public void addObserver(Battlefield_view observer) {
		observers.add(observer);
	}

	public void removeObserver(Battlefield_view observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Battlefield_view observer : observers)
			observer.modelChanged();
	}
	
	@Override
	public void run() {
		while(true) {
			for(Ship ship : ships) {
				ship.move();
			}
			
			notifyObservers();
			
			// pause thread by a few millis
	        try {
	            Thread.sleep(4);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}
	}

	public List<Ship> getShips() {
		return ships;
	}
	
	public List<Projectile> getProjectiles() {
		return projectiles;
	}
}
