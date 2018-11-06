package field;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private int field_width = 1000;
	
	/**
	 * The height of the Game Window
	 */
	private int field_height = 800;
	
	/**
	 * initialization of a Battlefield opens up a JFrame
	 */
	public Battlefield()  {
		setSize(field_width, field_height);
		setTitle("Shippps");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
//		try {
//			BufferedImage image = ImageIO.read(new File("/src/field/water.jpg"));
//			setContentPane(new JLabel(new ImageIcon(image)));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		setVisible(true);
	}
}
