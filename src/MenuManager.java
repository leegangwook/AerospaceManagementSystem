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
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("Aircraft Name:");
				String AircraftName = input.next();
				System.out.print("Aircraft Type:");
				String AircraftType = input.next();
				System.out.print("Aircraft Manufacturer:");
				String AircraftManufacturer = input.next();
				System.out.print("Aircraft Cost:");
				String AircraftCost = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("Aircraft Name:");
				String AircraftName2 = input.next();
				
			}
		}
	}

}
