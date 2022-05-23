package aircraft;

import java.io.Serializable;
import java.util.Scanner;

import exception.ManufacturerFormatException;

public abstract class Aircraft implements AircraftInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7825438161735492413L;
	protected AircraftKind kind = AircraftKind.Airliner;
	protected String Name;
	protected String Type;
	protected String Manufacturer;
	protected String Cost;


	public Aircraft(){	
	}
	
	public Aircraft(AircraftKind kind){
		this.kind = kind;
	}
	
	public Aircraft(String Name, String Type) {
		this.Name=Name;
		this.Type=Type;
	}
	
	public Aircraft(String Name, String Type, String Manufacture, String Cost) {
		this.Name=Name;
		this.Type=Type;
		this.Manufacturer=Manufacture;
		this.Cost=Cost;
	}
	
	public Aircraft(AircraftKind kind, String Name, String Type, String Manufacture, String Cost) {
		this.kind=kind;
		this.Name=Name;
		this.Type=Type;
		this.Manufacturer=Manufacture;
		this.Cost=Cost;
	}
	
	public AircraftKind getKind() {
		return kind;
	}
	
	public void setKind(AircraftKind kind) {
		this.kind = kind;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getType() {
		return Type;
	}
	
	public void setType(String type) {
		Type = type;
	}
	
	public String getManufacturer() {
		return Manufacturer;
	}
	
	public void setManufacturer(String manufacturer) throws ManufacturerFormatException{
		if (manufacturer.contains("@")) {
			throw new ManufacturerFormatException();
		}
		Manufacturer = manufacturer;
	}
	
	public String getCost() {
		return Cost;
	}
	
	public void setCost(String cost) {
		Cost = cost;
	}
	
	public abstract void printInfo();
	
	public void setAircraftName(Scanner input) {
		System.out.print("Aircraft Name:");
		String Name = input.next();
		this.setName(Name);
	}
	
	public void setAircraftType(Scanner input) {
		System.out.print("Aircraft Type:");
		String Type = input.next();
		this.setType(Type);
	}
	
	public void setAircraftManufacturer(Scanner input) {
		String Manufacturer = "@";
		while (Manufacturer.contains("@")) {
			System.out.print("Aircraft Manufacturer:");
			Manufacturer = input.next();
			try {
				this.setManufacturer(Manufacturer);
			} 
			catch (ManufacturerFormatException e) {
				System.out.println("Don't push @");
			}
		}
	}
	public void setAircraftforeignManufacturer(Scanner input) {
		String Manufacturer = "@";
		while (Manufacturer.contains("@")) {
			System.out.print("Aircraft foreignManufacturer:");
			Manufacturer = input.next();
			try {
				this.setManufacturer(Manufacturer);
			} 
			catch (ManufacturerFormatException e) {
				System.out.println("Don't push @");
			}
		}
	}
	
	public void setAircraftCost(Scanner input) {
		System.out.print("Aircraft Cost:");
		String Cost = input.next();
		this.setCost(Cost);
	}
	
	public String getKindString() {
		String Skind = "none";
		switch(this.kind) {
		case Airliner:
			Skind = "Airliner";
			break;
		case Jet:
			Skind = "Jet";
			break;
		case Helicopter:
			Skind = "Helicopter";
			break;
		case UAV:
			Skind = "UAV";
			break;
		default:	
		}
		return Skind;
	}
}
