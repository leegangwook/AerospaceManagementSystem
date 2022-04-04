
public class Aerospace {

	String Name;
	String Type;
	String Manufacturer;
	String Cost;

	public Aerospace(){

	}
	public Aerospace(String Name, String Type) {
		this.Name=Name;
		this.Type=Type;
	}
	public Aerospace(String Name, String Type, String Manufacture, String Cost) {
		this.Name=Name;
		this.Type=Type;
		this.Manufacturer=Manufacture;
		this.Cost=Cost;
	}
	public void printInfo() {
		System.out.println("Name:"+ Name + " Type:" + Type + " Manufacture:" + Manufacturer + " Cost:" + Cost);
	}
}
