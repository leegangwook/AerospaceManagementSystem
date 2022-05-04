import java.util.ArrayList;
import java.util.Scanner;

import aircraft.Aircraft;
import aircraft.AircraftInput;
import aircraft.AircraftKind;
import aircraft.AirlinerAircraft;
import aircraft.HelicopterAircraft;
import aircraft.JetAircraft;

public class AircraftManager {
	ArrayList<AircraftInput> aircrafts = new ArrayList<AircraftInput>();
	Scanner input;
	AircraftManager(Scanner input){
		this.input=input;
	} 

	public void AddAircraft() {
		int kind = 0;
		AircraftInput aircraftInput;
		while(kind!=1 && kind !=2) {
			System.out.print("1 for Airliner, ");
			System.out.print("2 for Jet, ");
			System.out.println("3 for Helicopter ");
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

			}
		}
	}
	
	public void DeleteAircraft() {
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		int index = -1;
		for(int i=0; i<aircrafts.size(); i++) {
			if (aircrafts.get(i).getName().equals(AircraftName1)) {
				index = i;
				break;
			}
		}
		if(index >= 0) {	
			aircrafts.remove(index);
			System.out.println("The Aircraft" + AircraftName1 +"is deleted");
		}
		else
			System.out.println("The Aircraft has not been registered");
		return;
	}


	public void EditAircraft() {
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		for(int i=0; i<aircrafts.size(); i++) {
			AircraftInput aircraftInput = aircrafts.get(i);
			if (aircraftInput.getName().equals(AircraftName1)) {
				int num =-1;
				while(num!=5) {
					System.out.println("*Aircraft Info Edit Menu*");
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Type");
					System.out.println("3. Edit Manufacturer");
					System.out.println("4. Edit Cost");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1-6:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Aircraft Name:");
						String Name = input.next();
						aircraftInput.setName(Name);
					}
					else if (num==2) {
						System.out.print("Aircraft Type:");
						String Type = input.next();
						aircraftInput.setType(Type);
					}
					else if (num==3) {
						System.out.print("Aircraft Manufacturer:");
						String Manufacturer = input.next();
						aircraftInput.setManufacturer(Manufacturer);
					}
					else if (num==4) {
						System.out.print("Aircraft Cost:");
						String Cost = input.next();
						aircraftInput.setCost(Cost);
					}
					else {
						continue;
					} // if
				} //while
				break;
			} //if
		}
	}
	public void ViewAircrafts() { 	
		//		System.out.print("Aircraft Name:");
		//		String AircraftName1 = input.next();
		System.out.println("# of registered aircrafts:" + aircrafts.size());
		for(int i=0; i<aircrafts.size(); i++) {
			aircrafts.get(i).printInfo();
		}
	}
}
