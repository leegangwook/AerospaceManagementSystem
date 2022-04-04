import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		AerospaceManager aerospaceManager = new AerospaceManager(input);

		while(num!=5) {
			System.out.println("*AerospaceManagementSystem-Aircrafts*");
			System.out.println("1. Add Aircrafts");
			System.out.println("2. Delete Aircrafts");
			System.out.println("3. Edit Aircrafts");
			System.out.println("4. View Aircrafts");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-6:");
			num = input.nextInt();

			switch(num) {
			case 1:
				aerospaceManager.AddAircrafts();
				break;
			case 2:
				aerospaceManager.DeleteAircrafts();
				break;
			case 3:
				aerospaceManager.EditAircrafts();
				break;
			case 4:
				aerospaceManager.ViewAircrafts();
				break;
			}
		}
	}	
}