package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import aircraft.Aircraft;
import aircraft.AircraftInput;
import aircraft.AircraftKind;
import aircraft.AirlinerAircraft;
import aircraft.HelicopterAircraft;
import aircraft.JetAircraft;

public class AircraftManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6156268863743565060L;
	
	ArrayList<AircraftInput> aircrafts = new ArrayList<AircraftInput>();
	transient Scanner input;
	AircraftManager(Scanner input){
		this.input=input;
	} 

	public void AddAircraft(String Name, String Type, String Manufacture, String Cost) {
		AircraftInput aircraftInput = new AirlinerAircraft(AircraftKind.Airliner);
		aircraftInput.getUserInput(input);
		aircrafts.add(aircraftInput);
	}
	
	public void AddAircraft(AircraftInput aircraftInput) {
		aircrafts.add(aircraftInput);
	}
	
	public void AddAircraft() {
		int kind = 0;
		AircraftInput aircraftInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Airliner.");
				System.out.println("2 for Jet.");
				System.out.println("3 for Helicopter.");
				System.out.print("Select num 1, 2 or 3 for Aircraft Kind:");
				kind = input.nextInt();
				if(kind==1) {
					aircraftInput = new AirlinerAircraft(AircraftKind.Airliner);
					aircraftInput.getUserInput(input);
					aircrafts.add(aircraftInput);
					break;
				}
				else if(kind==2) {
					aircraftInput = new JetAircraft(AircraftKind.Jet);
					aircraftInput.getUserInput(input);
					aircrafts.add(aircraftInput);
					break;
				}
				else if(kind==3) {
					aircraftInput = new HelicopterAircraft(AircraftKind.Helicopter);
					aircraftInput.getUserInput(input);
					aircrafts.add(aircraftInput);
					break;
				}
				else {
					System.out.print("Select num for Aircraft Kind between 1 and 3:");
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void DeleteAircraft() {
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		int index = findIndex(AircraftName1);
		removedfromAircrafts(index, AircraftName1);
	}
	
	public int findIndex(String AircraftName1) {
		int index = -1;
		for(int i=0; i<aircrafts.size(); i++) {
			if (aircrafts.get(i).getName().equals(AircraftName1)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removedfromAircrafts(int index, String AircraftName1) {
		if(index >= 0) {	
			aircrafts.remove(index);
			System.out.println("The Aircraft" + AircraftName1 +"is deleted");
			return 1;
		}
		else {
			System.out.println("The Aircraft has not been registered");
		return -1;
		}
	}

	public void EditAircraft() {
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		for(int i=0; i<aircrafts.size(); i++) {
			AircraftInput aircraft = aircrafts.get(i);
			if (aircraft.getName().equals(AircraftName1)) {
				int num =-1;
				while(num!=5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						aircraft.setAircraftName(input);
						break;
					case 2:
						aircraft.setAircraftType(input);
						break;
					case 3:
						aircraft.setAircraftManufacturer(input);
						break;
					case 4:
						aircraft.setAircraftCost(input);
						break;
					default:
						continue;
					}
				} //while
				break;
			} //if
		}
	}
	
	public void ViewAircrafts() { 
		System.out.println("# of registered aircrafts:" + aircrafts.size());
		for(int i=0; i<aircrafts.size(); i++) {
			aircrafts.get(i).printInfo();
		}
	}
	
	public int size() {
		return aircrafts.size();
	}
	
	public AircraftInput get(int index) {
		return (Aircraft) aircrafts.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("*Aircraft Info Edit Menu*");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Type");
		System.out.println("3. Edit Manufacturer");
		System.out.println("4. Edit Cost");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-6:");
	}

}
