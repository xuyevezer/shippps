package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Constants;
import model.Battlefield_model;
import objects.Projectile;
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
	 * initialization of a Battlefield opens up a Jframe
	 */
	public Battlefield_view()  {
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("shippps");
		frame.setSize(Constants.FIELD_WIDTH, Constants.FIELD_HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(this);
	}
	
	void paintProjectiles(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		for(Projectile projectile : battlefield_model.getProjectiles()) {
			g2D.drawOval((int)projectile.getPosition().getX(), (int)projectile.getPosition().getY(), projectile.getSize_x(), projectile.getSize_y());
		}
	}
	
	void paintShips(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		for(Ship ship : battlefield_model.getShips()) {
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
		paintProjectiles(g);
	}
	
	public void modelChanged() {
	}
}
