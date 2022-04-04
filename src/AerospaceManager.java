import java.util.Scanner;

public class AerospaceManager {
	Aerospace aerospace;
	Scanner input;
	AerospaceManager(Scanner input){
		this.input=input;
	} 

	public void AddAircrafts() {
		aerospace = new Aerospace();
		System.out.print("Aircraft Name:");
		aerospace.Name = input.next();
		System.out.print("Aircraft Type:");
		aerospace.Type = input.next();
		System.out.print("Aircraft Manufacturer:");
		aerospace.Manufacturer = input.next();
		System.out.print("Aircraft Cost:");
		aerospace.Cost = input.next(); 
	}
	public void DeleteAircrafts() {
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		if (aerospace == null) {
			System.out.println("The Aircraft has not been registered");
			return;
		}
		if (aerospace.Name.equals(AircraftName1)) {
			aerospace = null;
			System.out.println("The Aircraft is deleted");

		}
	}
	public void EditAircrafts() {
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		if (aerospace.Name.equals(AircraftName1)) {
			System.out.println("The Aircraft to be edited" + AircraftName1);
		}
	}
	public void ViewAircrafts() { 	
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		if (aerospace.Name.equals(AircraftName1)) {
			aerospace.printInfo();
		}
	}
}
