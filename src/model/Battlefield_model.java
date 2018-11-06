package model;

import java.util.ArrayList;
import java.util.List;

import objects.Ship;

public class Battlefield_model extends Thread {
	
	private List<Battlefield_view> observers = new ArrayList<>();
	
	private double width;
	private double height;
	
	private List<Ship> ships = new ArrayList<>();
	
	public Battlefield_model(double width, double heigth ) {
		this.width = width;
		this.height = height;
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public List<Ship> getShips() {
		return ships;
	}
}
