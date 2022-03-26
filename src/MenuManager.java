import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner input = new Scanner(System.in);
		while(num!=6) {
			System.out.println("*AerospaceManagementSystem-Aircrafts*");
			System.out.println("1. Add Aircrafts");
			System.out.println("2. Delete Aircrafts");
			System.out.println("3. Edit Aircrafts");
			System.out.println("4. View Aircrafts");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6:");
			num = input.nextInt();
			
			switch(num) {
				case 1:
					AddAircrafts();
					break;
				case 2:
					DeleteAircrafts();
					break;
				case 3:
					EditAircrafts();
					break;
				case 4:
					ViewAircrafts();
					break;
			}
		}
	}
	public static void AddAircrafts() {
		Scanner input = new Scanner(System.in);	
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
		System.out.print("Aircraft Type:");
		String AircraftType = input.next();
		System.out.print("Aircraft Manufacturer:");
		String AircraftManufacturer = input.next();
		System.out.print("Aircraft Cost:");
		String AircraftCost = input.next(); 
	}
	public static void DeleteAircrafts() {
		Scanner input = new Scanner(System.in);	
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
	}
	public static void EditAircrafts() {
		Scanner input = new Scanner(System.in);	
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
	}
	public static void ViewAircrafts() {
		Scanner input = new Scanner(System.in);	
		System.out.print("Aircraft Name:");
		String AircraftName1 = input.next();
	}
}