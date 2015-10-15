package jets;

import java.util.Random;

public class Barracks {
	private static Pilot ben = new Pilot("Ben Benjaminson", 43, 15);
	private static Pilot jerry = new Pilot("Jerry Calgrove", 22, 2);
	private static Pilot hannah = new Pilot("Hannah Hillman", 28, 5);
	private static Pilot[] pilots = {ben, jerry, hannah};
	
	public static Pilot getRandomPilot() {
		int index = new Random().nextInt(pilots.length);
		return pilots[index];
	}
}
