package objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Constants;
import main.Position;

public class Submarine extends Ship {

	public Submarine(Position pos) {
		super(pos, Constants.SUBMARINE_SIZE_X, Constants.SUBMARINE_SIZE_Y, Constants.SUBMARINE_HEALTH, Constants.SUBMARINE_DAMAGE);
		try {
			image = ImageIO.read(new File("res/submarinedark.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Submarine(double x, double y, double orientation) {
		super(x, y, orientation, Constants.SUBMARINE_SIZE_X, Constants.SUBMARINE_SIZE_Y, Constants.SUBMARINE_HEALTH, Constants.SUBMARINE_DAMAGE);
		try {
			image = ImageIO.read(new File("res/submarinedark.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
