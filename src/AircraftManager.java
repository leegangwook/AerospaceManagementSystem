import java.util.ArrayList;
import java.util.Scanner;

import aircraft.Aircraft;
import aircraft.JetAircraft;

public class AircraftManager {
	ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
	Scanner input;
	AircraftManager(Scanner input){
		this.input=input;
	} 

	public void AddAircraft() {
		int kind = 0;
		Aircraft aircraft;
		while(kind!=1 && kind !=2) {
			System.out.print("1 for Airliner, ");
			System.out.println("2 for Jet ");
			System.out.print("Select num for Aircraft Kind between 1 and 2:");
			kind = input.nextInt();
			if(kind==1) {
				aircraft = new Aircraft();
				aircraft.getUserInput(input);
				aircrafts.add(aircraft);
				break;
			}
			else if(kind==2) {
				aircraft = new JetAircraft();
				aircraft.getUserInput(input);
				aircrafts.add(aircraft);
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
			Aircraft aircraft = aircrafts.get(i);
			if (aircrafts.get(i).getName().equals(AircraftName1)) {
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
						aircraft.setName(Name);
					}
					else if (num==2) {
						System.out.print("Aircraft Type:");
						String Type = input.next();
						aircraft.setType(Type);
					}
					else if (num==3) {
						System.out.print("Aircraft Manufacturer:");
						String Manufacturer = input.next();
						aircraft.setManufacturer(Manufacturer);
					}
					else if (num==4) {
						System.out.print("Aircraft Cost:");
						String Cost = input.next();
						aircraft.setCost(Cost);
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
