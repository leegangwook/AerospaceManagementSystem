package aircraft;

import java.util.Scanner;

public class Aircraft {
	protected AircraftKind kind = AircraftKind.Airliner;
	protected String Name;
	protected String Type;
	protected String Manufacturer;
	protected String Cost;


	public Aircraft(){

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
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
	public void printInfo() {
		System.out.println("Name:"+ Name + " Type:" + Type + " Manufacture:" + Manufacturer + " Cost:" + Cost);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Aircraft Name:");
		String Name = input.next();
		this.setName(Name);

		System.out.print("Aircraft Type:");
		String Type = input.next();
		this.setType(Type);

		System.out.print("Aircraft Manufacturer:");
		String Manufacturer = input.next();
		this.setManufacturer(Manufacturer);

		System.out.print("Aircraft Cost:");
		String Cost = input.next();
		this.setCost(Cost);
	}
}
