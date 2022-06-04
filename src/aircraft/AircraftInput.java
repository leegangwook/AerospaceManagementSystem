package aircraft;

import java.util.Scanner;

import exception.ManufacturerFormatException;

public interface AircraftInput {
	
	public String getName();
	
	public void setName(String name);
	
	public String getType();
	
	public void setType(String type);
	
	public String getManufacturer();
	
	public void setManufacturer(String manufacturer) throws ManufacturerFormatException;
	
	public String getCost();
	
	public void setCost(String cost);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setAircraftName(Scanner input);
	
	public void setAircraftType(Scanner input);
	
	public void setAircraftManufacturer(Scanner input);
	
	public void setAircraftCost(Scanner input);
}
