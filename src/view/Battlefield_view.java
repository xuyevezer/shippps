package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	
	JFrame frame = new JFrame();
	
	private Battlefield_model battlefield_model;
	
	/**
	 * initialization of a Battlefield opens up a Jframe
	 */
	public Battlefield_view()  {
		frame.setTitle("shippps");
		frame.setSize(Constants.FIELD_WIDTH, Constants.FIELD_HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.add(this);
		
		battlefield_model = new Battlefield_model(this);
		battlefield_model.start();
	}
	
	void paintProjectiles(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		for(Projectile projectile : battlefield_model.getProjectiles()) {
			g2D.drawOval((int)projectile.getPosition().getX(), (int)projectile.getPosition().getY(), projectile.getSize_x(), projectile.getSize_y());
		}
	}
	
	void paintShips(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		for(int i = 0; i < battlefield_model.getShips().size(); i++) {
			Ship ship = battlefield_model.getShips().get(i);
				g2D.drawImage(ship.getImage(), (int)ship.getPosition().getX(), (int)ship.getPosition().getY(), ship.getSize_x(), ship.getSize_y(), this);
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		//drawing the background
		try {
			BufferedImage background = ImageIO.read(new File("res/water.png"));
			g2D.drawImage(background, 0, 0, Constants.FIELD_WIDTH, Constants.FIELD_HEIGHT, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//drawing other objects
		paintShips(g);
		paintProjectiles(g);
	}
	
	public void modelChanged() {
		repaint();
	}
}
