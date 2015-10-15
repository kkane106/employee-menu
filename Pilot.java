package jets;

public class Pilot {
	String name;
	int age, exp;
	
	public Pilot(String n, int a, int e) {
		this.name = n;
		this.age = a;
		this.exp = e;
	}
	
	public String toString() {
		return String.format("\nPilot: %1$s," + 
							" %2$d years old," + 
							" %3$d years experience.",
							name,
							age,
							exp
							);
	}
}
