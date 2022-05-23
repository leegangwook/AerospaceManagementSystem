package aircraft;

import java.util.Scanner;

public class AirlinerAircraft extends AirplaneAircraft{
	
	protected String foreignManufacturer;
	
	public AirlinerAircraft(AircraftKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAircraftName(input);
		setAircraftType(input);
		setAircraftManufacturerwithYN(input);
		setAircraftCost(input);
	}
}
