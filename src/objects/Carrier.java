package objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Constants;
import main.Position;

public class Carrier extends Ship {

	public Carrier(Position pos) {
		super(pos, Constants.CARRIER_SIZE_X, Constants.CARRIER_SIZE_Y, Constants.CARRIER_HEALTH, Constants.CARRIER_DAMAGE);
		try {
			image = ImageIO.read(new File("res/carrier.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Carrier(double x, double y, double orientation) {
		super(x, y, orientation, Constants.CARRIER_SIZE_X, Constants.CARRIER_SIZE_Y, Constants.CARRIER_HEALTH, Constants.CARRIER_DAMAGE);
		try {
			image = ImageIO.read(new File("res/carrier.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
