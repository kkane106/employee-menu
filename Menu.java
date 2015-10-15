package jets;

import java.util.*;

public class Menu {
	private static Scanner scanner = new Scanner(System.in);
	private static String display;
	
	private static String getDisplay(){
		return display;
	}
	
	private static void displayToUser() {
		System.out.println(display);
	}
	
	private static void displayFleetSizePrompt() {
		display = "How many jets are in your fleet: ";
	}
	
	private static void assembleUserFleet() {
		Hangar.setListOfJets(takeUserInput());
	}
	
	private static void createCustomJet() {
		System.out.println("Now it's time to create a custom jet (sweet!).");
		Jet customJet = new Jet();
		customJet.setPilot(Barracks.getRandomPilot());
		System.out.print("Enter the model name: ");
		customJet.setModel(scanner.next());
		System.out.print("Enter the top speed (mph): ");
		customJet.setSpeed(scanner.nextFloat());
		System.out.print("Enter the maximum range (miles): ");
		customJet.setRange(scanner.nextFloat());
		Hangar.setCustomJet(customJet);
	}
	
	private static void displayFleetOptions() {
		display = 	"\nSelect how you would like to view your fleet." +
					"\n1\tDisplay the entire fleet" +
					"\n2\tDisplay the fastest jet" +
					"\n3\tDisplay the jet with the longest range" +
					"\n4\tQuit";
	}
	
	private static int takeUserInput() {
		return scanner.nextInt();
	}
	
	private static void displayEntireFleet() {
		Jet[] jets = Hangar.getListofJets();
		for (Jet j: jets) {
			System.out.println(j.toString());
		}
	}
	
	private static void displayFastestJet() {
		Jet[] jets = Hangar.getListofJets();
		Jet fastest = jets[0];
		for (Jet j:jets) {
			if (j.getSpeed() > fastest.getSpeed()) {
				fastest = j;
			}
		}
		System.out.println(fastest.toString());
	}
	
	private static void displayJetWithMostRange() {
		Jet[] jets = Hangar.getListofJets();
		Jet furthestFlying = jets[0];
		for (Jet j:jets) {
			if (j.getRange() > furthestFlying.getRange()) {
				furthestFlying = j;
			}
		}
		System.out.println(furthestFlying.toString());
	}
	
	private static void displayViewingOptionsToUser() {
		switch (takeUserInput()) {
		case 1: 
			displayEntireFleet();
			break;
		case 2:
			displayFastestJet();
			break;
		case 3:
			displayJetWithMostRange();
			break;
		case 4:
			System.out.println("You have selected Option 4, to quit." +
								"Thank you for flying with BerzerkerAir," +
								"we wish you an epically berserk day."
								);
			Menu.scanner.close();
			System.exit(0);
		default:
			System.out.println("invalid input");
		}
	}
	
	public static void runFleetProgram() {
		displayFleetSizePrompt();
		displayToUser();
		assembleUserFleet();
		createCustomJet();
		displayFleetOptions();
		displayToUser();
		displayViewingOptionsToUser();
	}
	
}
