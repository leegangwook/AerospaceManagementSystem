package aircraft;

import java.util.Scanner;

public class HelicopterAircraft extends AirplaneAircraft{
	
	protected String foreignManufacturer;
	
	public HelicopterAircraft(AircraftKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAircraftName(input);
		setAircraftType(input);
		setAircraftManufacturerwithYN(input);
		setAircraftCost(input);
	}
}
