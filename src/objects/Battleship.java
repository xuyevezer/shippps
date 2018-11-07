package objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Constants;
import main.Position;

public class Battleship extends Ship {

	public Battleship(Position pos) {
		super(pos, Constants.BATTLESHIP_SIZE_X, Constants.BATTLESHIP_SIZE_Y, Constants.BATTLESHIP_HEALTH, Constants.BATTLESHIP_DAMAGE);
		try {
			image = ImageIO.read(new File("res/battleship.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Battleship(double x, double y, double orientation) {
		super(x, y, orientation, Constants.BATTLESHIP_SIZE_X, Constants.BATTLESHIP_SIZE_Y, Constants.BATTLESHIP_HEALTH, Constants.BATTLESHIP_DAMAGE);
		try {
			image = ImageIO.read(new File("res/battleship.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
