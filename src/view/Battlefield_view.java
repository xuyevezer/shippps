package view;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.List;

import javax.swing.JFrame;

import model.Battlefield_model;
import objects.Ship;
/**
 * The Battlefield class is the game window
 * @author moritz
 * date 06.11.2018
 */
public class Battlefield_view {
	/**
	 * serialVersionUID - randomly generated UID
	 */
	private static final long serialVersionUID = -5412007266546573232L;
	
	/**
	 * The JFrame as Container of the gameview objects
	 */
	private JFrame frame = new JFrame("Shippps");
	
	Battlefield_model battlefield_model = new Battlefield_model(); 
	
	/**
	 * The width of the Game Window
	 */
	private int field_width = 1000;
	
	/**
	 * The height of the Game Window
	 */
	private int field_height = 800;
	
	/**
	 * initialization of a Battlefield opens up a JFrame
	 */
	public Battlefield_view()  {
		frame.setSize(field_width, field_height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void paintShips(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		List<Ship> all_ships = battlefield_model.getShips();
		Stroke stroke = new BasicStroke(12); 
		for(Ship ship : all_ships) {
			g2D.setStroke(stroke);
			g2D.drawRect((int)ship.getPos().getX(), (int)ship.getPos().getY(), ship.getSize_x(), ship.getSize_y());
		}
		
	}
	
	public void paint(Graphics g) {
		frame.paint(g);
		paintShips(g);
	}
	
	public void modelChanged() {
		paint(frame.getGraphics());
	}
}
