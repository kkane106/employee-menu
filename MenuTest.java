package jets;

import org.junit.*;
import static org.junit.Assert.*;

public class MenuTest {
	@Test
	public void testMenuHasADisplayField() {
		assertNull(Menu.getDisplay());
	}

	@Test
	public void testDisplayFleetSizePrompt() {
		Menu.displayFleetSizePrompt();
		assertEquals("How many jets are in your fleet: ", Menu.getDisplay());
	}

	@Test
	public void testAssembleUserFleet() {
		Menu.assembleUserFleet();
		assertEquals(3, Hangar.getListofJets().length);
	}
	
	@Test 
	public void testCreateCustomJet() {
		Hangar.setListOfJets(2);
		Menu.createCustomJet();
		assertNotNull(Hangar.getListofJets()[1].getModel());
	}
	
	@Test
	public void testShowFleetOptions() {
		Menu.displayFleetOptions();
		assertEquals("\nSelect how you would like to view your fleet." +
				"\n1\tDisplay the entire fleet" +
				"\n2\tDisplay the fastest jet" +
				"\n3\tDisplay the jet with the longest range", Menu.getDisplay());
	}

}
