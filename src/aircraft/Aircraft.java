package aircraft;

import java.util.Scanner;

public abstract class Aircraft {
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
	
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	
	public String getCost() {
		return Cost;
	}
	
	public void setCost(String cost) {
		Cost = cost;
	}
	
	public abstract void printInfo();	
}
