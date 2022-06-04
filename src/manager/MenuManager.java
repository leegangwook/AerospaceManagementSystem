package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		AircraftManager aircraftManager = getObject("aircraftmanager.ser");
		if(aircraftManager == null) {
			aircraftManager = new AircraftManager(input);
		}
		
		WindowFrame frame = new WindowFrame(aircraftManager);
		selectMenu(input, aircraftManager);
		putObject(aircraftManager, "aircraftmanager.ser");
	}
	
	public static void selectMenu(Scanner input, AircraftManager aircraftManager) {
		int num = -1;
		while(num!=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					aircraftManager.AddAircraft();
					logger.log("add a aircraft");
					break;
				case 2:
					aircraftManager.DeleteAircraft();
					logger.log("delete a aircraft");
					break;
				case 3:
					aircraftManager.EditAircraft();
					logger.log("edit a list of aircraft");
					break;
				case 4:
					aircraftManager.ViewAircrafts();
					logger.log("view a aircraft");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*AircraftManagementSystem*");
		System.out.println("1. Add Aircraft");
		System.out.println("2. Delete Aircraft");
		System.out.println("3. Edit Aircraft");
		System.out.println("4. View Aircrafts");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-6:");
	}
	
	public static AircraftManager getObject(String filename) {
		AircraftManager aircraftManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			aircraftManager = (AircraftManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return aircraftManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aircraftManager;
	}
	
	public static AircraftManager putObject(AircraftManager aircraftManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(aircraftManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aircraftManager;
	}
}