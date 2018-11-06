package field;

import javax.swing.JFrame;
/**
 * The Battlefield class is the game window
 * @author moritz
 * date 06.11.2018
 */
public class BattlefieldView {
	/**
	 * serialVersionUID - randomly generated UID
	 */
	private static final long serialVersionUID = -5412007266546573232L;
	
	/**
	 * The JFrame as Container of the gameview objects
	 */
	private JFrame frame = new JFrame("Shippps");
	
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
	public BattlefieldView()  {
		frame.setSize(field_width, field_height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
