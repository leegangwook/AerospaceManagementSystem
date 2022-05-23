package aircraft;

import java.util.Scanner;

public class JetAircraft extends AirplaneAircraft{
	
	protected String foreignManufacturer;
	
	public JetAircraft(AircraftKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAircraftName(input);
		setAircraftType(input);
		setAircraftManufacturerwithYN(input);
		setAircraftCost(input);
	}
}
