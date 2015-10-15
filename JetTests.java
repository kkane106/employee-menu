package jets;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JetTests {
	
	@Test
	public void testJetModel() {
		Jet jet = new Jet();
		jet.setModel("Leer");
		assertEquals("Leer", jet.getModel());
	}
	@Test
	public void testJetSpeed() {
		Jet jet = new Jet();
		jet.setSpeed(3000f);
		assertEquals(3.947f, jet.getSpeed(), 0.001f);
	}
	@Test
	public void testJetRange() {
		Jet jet = new Jet();
		jet.setRange(10000f);
		assertEquals(10000f, jet.getRange(), 0.001f);
	}
	@Test
	public void testSpeedConversionToMach() {
		Jet jet = new Jet();
		jet.setSpeed(3000f);
		jet.convertSpeedToMach(jet.getSpeed());
		assertEquals(3.947f, jet.getSpeed(), 0.001f);
	}
	// Test parameterized constructor
	@Test
	public void test3ParameterConstructorModel() {
		Jet jet = new Jet("Dodo", 123f, 321f);
		assertEquals("Dodo", jet.getModel());
	}
	@Test
	public void test3ParameterConstructorSpeed() {
		Jet jet = new Jet("Dodo", 123f, 321f);
		assertEquals(0.16, jet.getSpeed(), 0.01);
	}
	@Test
	public void test3ParameterConstructorRange() {
		Jet jet = new Jet("Dodo", 123f, 321f);
		assertEquals(321f, jet.getRange(), 0.01);
	}
	@Test
	public void testToString() {
		Jet jet = new Jet("Dodo", 123f, 321f);
		assertEquals("\nModel: Dodo\nTop Speed (mach): 0.16\nMaximum Range: 321.00 miles", jet.toString());
	}
	

}
