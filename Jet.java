package jets;

public class Jet {
	private String model;
	private float speed, range;
	private Pilot pilot;
	
	public Jet() {
		this("Dodo", 123f,321f, Barracks.getRandomPilot());
	}
	
	public Jet(String mod, float spd, float ran, Pilot pil) {
		this.model = mod;
		this.speed = convertSpeedToMach(spd);
		this.range = ran;
		this.pilot = pil;
	}
	
	public String toString() {
		return String.format("\nModel: %1$s\nTop Speed (mach): %2$.2f" + 
							"\nMaximum Range: %3$.2f miles", 
							model,
							speed,
							range
							) + pilot.toString();
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = convertSpeedToMach(speed);
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	
	public void setPilot(Pilot pil) {
		this.pilot = pil;
	}
	public Pilot getPilot() {
		return this.pilot;
	}
	private float convertSpeedToMach(float spd) {
		return  (spd/760);
	}
}
