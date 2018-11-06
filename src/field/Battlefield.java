package field;

import javax.swing.JFrame;

public class Battlefield extends JFrame {
	private int field_width = 400;
	private int field_height = 400;
	
	public Battlefield() {
		setSize(field_width, field_height);
		setTitle("Shippps");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
