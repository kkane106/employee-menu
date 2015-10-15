package jets;

import org.junit.*;
import static org.junit.Assert.*;

public class HangarTest {
	@Test
	public void testHangarHasAListOfJets() {
		Hangar.setListOfJets(3);
		assertEquals(3, Hangar.getListofJets().length);
	}

	@Test
	public void testSetListOfJetsCreatesDefaultJets() {
		Hangar.setListOfJets(3);
		Jet jet = new Jet("Dodo", 123f, 321f);
		assertEquals(jet.toString(), Hangar.getListofJets()[0].toString());
	}

	@Test(expected = NullPointerException.class)
	public void testSetListOfJetsLeavesOneCustomJet() {
		Hangar.setListOfJets(3);
		fail(Hangar.getListofJets()[2].getModel());
	}
	
	@Test
	public void testCreateCustomJet() {
		Hangar.setListOfJets(3);
		Jet jet = new Jet("SuperJet", 4000f, 33000f);
		Hangar.setCustomJet(jet);
		assertEquals(jet.toString(), Hangar.getListofJets()[2].toString());
	}

}
