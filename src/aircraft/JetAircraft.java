package aircraft;

import java.util.Scanner;

public class JetAircraft extends Aircraft {

	public void getUserInput(Scanner input) {
		System.out.print("Aircraft Name:");
		String Name = input.next();
		this.setName(Name);

		System.out.print("Aircraft Type:");
		String Type = input.next();
		this.setType(Type);

		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer != 'n' && answer !='N')
		{
			System.out.print("Are you a Korean Aircraft Manufacturer? (Y/N)");
			answer = input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.print("Aircraft Manufacturer:");
				String Manufacturer = input.next();
				this.setManufacturer(Manufacturer);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setManufacturer("");
				break;
			}
			else {

			}
		}
		System.out.print("Aircraft Cost:");
		String Cost = input.next();
		this.setCost(Cost);
	}	
}
