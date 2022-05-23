package aircraft;

import java.util.Scanner;

import exception.ManufacturerFormatException;

public abstract class AirplaneAircraft extends Aircraft {
	
	public AirplaneAircraft(AircraftKind kind){
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String Skind = getKindString();
		System.out.println("Kind:" + Skind + " Name:"+ Name + " Type:" + Type + " Manufacture:" + Manufacturer + " Cost:" + Cost);
	}
	
	public void setAircraftManufacturerwithYN(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer != 'n' && answer !='N')
		{
			System.out.print("Are you a Korean Aircraft Manufacturer?(Y/N):");
			answer = input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				setAircraftManufacturer(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				setAircraftforeignManufacturer(input);
				break;
			}
		}
	}
}
