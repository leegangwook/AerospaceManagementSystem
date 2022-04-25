import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		AircraftManager aircraftManager = new AircraftManager(input);

		while(num!=5) {
			System.out.println("*AircraftManagementSystem*");
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircrafts");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-6:");
			num = input.nextInt();

			switch(num) {
			case 1:
				aircraftManager.AddAircraft();
				break;
			case 2:
				aircraftManager.DeleteAircraft();
				break;
			case 3:
				aircraftManager.EditAircraft();
				break;
			case 4:
				aircraftManager.ViewAircrafts();
				break;
			}
		}
	}	
}