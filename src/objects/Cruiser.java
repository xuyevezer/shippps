package objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Constants;
import main.Position;

public class Cruiser extends Ship {

	public Cruiser(Position pos) {
		super(pos, Constants.CRUISER_SIZE_X, Constants.CRUISER_SIZE_Y, Constants.CRUISER_HEALTH, Constants.CRUISER_DAMAGE);
		try {
			image = ImageIO.read(new File("res/cruiser.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Cruiser(double x, double y, double orientation) {
		super(x, y, orientation, Constants.CRUISER_SIZE_X, Constants.CRUISER_SIZE_Y, Constants.CRUISER_HEALTH, Constants.CRUISER_DAMAGE);
		try {
			image = ImageIO.read(new File("res/cruiser.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
