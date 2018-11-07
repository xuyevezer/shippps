package objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Constants;
import main.Position;

public class Patrol extends Ship {

	public Patrol(Position pos) {
		super(pos, Constants.PATROL_SIZE_X, Constants.PATROL_SIZE_Y, Constants.PATROL_HEALTH, Constants.PATROL_DAMAGE);
		try {
			image = ImageIO.read(new File("res/patrol.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Patrol(double x, double y, double orientation) {
		super(x, y, orientation, Constants.PATROL_SIZE_X, Constants.PATROL_SIZE_Y, Constants.PATROL_HEALTH, Constants.PATROL_DAMAGE);
		try {
			image = ImageIO.read(new File("res/patrol.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
