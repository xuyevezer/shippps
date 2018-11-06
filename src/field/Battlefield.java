package field;

import javax.swing.JFrame;
/**
 * The Battlefield class is the game window
 * @author moritz
 * date 06.11.2018
 */
public class Battlefield extends JFrame {
	/**
	 * serialVersionUID - randomly generated UID
	 */
	private static final long serialVersionUID = -5412007266546573232L;
	
	/**
	 * The width of the Game Window
	 */
	private int field_width = 400;
	
	/**
	 * The height of the Game Window
	 */
	private int field_height = 400;
	
	/**
	 * initialization of a Battlefield opens up a JFrame
	 */
	public Battlefield() {
		setSize(field_width, field_height);
		setTitle("Shippps");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
