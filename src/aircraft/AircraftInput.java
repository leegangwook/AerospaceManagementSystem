package aircraft;

import java.util.Scanner;

public interface AircraftInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setType(String type);
	
	public void setManufacturer(String manufacturer);
	
	public void setCost(String cost);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
