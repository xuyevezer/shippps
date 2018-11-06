package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Battlefield_model;
import objects.Ship;
/**
 * The Battlefield class is the game window
 * @author moritz
 * date 06.11.2018
 */
public class Battlefield_view extends JPanel{
	/**
	 * serialVersionUID - randomly generated UID
	 */
	private static final long serialVersionUID = -5412007266546573232L;
	
	Battlefield_model battlefield_model = new Battlefield_model(); 
	
	JFrame frame = new JFrame();
	
	/**
	 * The width of the Game Window
	 */
	private int field_width = 1000;
	
	/**
	 * The height of the Game Window
	 */
	private int field_height = 800;
	
	/**
	 * initialization of a Battlefield opens up a Jframe
	 */
	public Battlefield_view()  {
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("shippps");
		frame.setSize(field_width, field_height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(this);
	}
	
	void paintShips(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		List<Ship> all_ships = battlefield_model.getShips();
		for(Ship ship : all_ships) {
			g2D.draw(new Rectangle2D.Double(ship.getPosition().getX(), 
											ship.getPosition().getY(), 
											ship.getSize_x(), 
											ship.getSize_y()));
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintShips(g);
	}
	
	public void modelChanged() {
	}
}
