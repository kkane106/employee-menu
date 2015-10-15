package jets;

public class Hangar {
	private static Jet[] listOfJets;
	
	public static Jet[] getListofJets() {
		return listOfJets;
	}
	
	public static void setListOfJets(int numJets) {
		listOfJets = new Jet[numJets];
		for (int i = 0; i < (listOfJets.length - 1); i++) {
			Jet j = new Jet();
			listOfJets[i] = j;
		}
	}
	
	public static void setCustomJet(Jet jet) {
		listOfJets[listOfJets.length-1] = jet;
	}

}
