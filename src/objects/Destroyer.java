package objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Constants;
import main.Position;

public class Destroyer extends Ship {

	public Destroyer(Position pos) {
		super(pos, Constants.DESTROYER_SIZE_X, Constants.DESTROYER_SIZE_Y, Constants.DESTROYER_HEALTH, Constants.DESTROYER_DAMAGE);
		try {
			image = ImageIO.read(new File("res/destroyer.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Destroyer(double x, double y, double orientation) {
		super(x, y, orientation, Constants.DESTROYER_SIZE_X, Constants.DESTROYER_SIZE_Y, Constants.DESTROYER_HEALTH, Constants.DESTROYER_DAMAGE);
		try {
			image = ImageIO.read(new File("res/destroyer.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
