package model;

import java.util.ArrayList;
import java.util.List;

import main.Position;
import objects.Projectile;
import objects.Ship;
import view.Battlefield_view;

public class Battlefield_model extends Thread {
	
	private List<Battlefield_view> observers = new ArrayList<>();
	
	private List<Ship> ships = new ArrayList<>();
	
	private List<Projectile> all_projectiles = new ArrayList<>();
	
	public Battlefield_model(Battlefield_view battlefield_view) {
		super();
		
		addObserver(battlefield_view);
		
		ships.add(new Ship(new Position(100, 100), 50, 30, 100, 5));
		ships.add(new Ship(new Position(350, 300), 300, 100, 40, 5));

		//example projectiles
		all_projectiles.add(new Projectile(new Position(110, 110), 10, 10, 100));
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
		notifyObservers();
		
		// pause thread by a few millis
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	public List<Ship> getShips() {
		return ships;
	}
	
	public List<Projectile> getProjectiles() {
		return all_projectiles;
	}
}
