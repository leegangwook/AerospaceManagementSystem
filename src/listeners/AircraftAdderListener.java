package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import aircraft.AircraftInput;
import aircraft.AircraftKind;
import aircraft.AirlinerAircraft;
import exception.ManufacturerFormatException;
import manager.AircraftManager;

public class AircraftAdderListener implements ActionListener {

	JTextField fieldName;
	JTextField fieldType;
	JTextField fieldManufacturer;
	JTextField fieldCost;
	
	AircraftManager aircraftManager;
	
	public AircraftAdderListener(
			JTextField fieldName, 
			JTextField fieldType, 
			JTextField fieldManufacturer,
			JTextField fieldCost,
			AircraftManager aircraftManager) 
	{
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.fieldManufacturer = fieldManufacturer;
		this.fieldCost = fieldCost;
		this.aircraftManager = aircraftManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldName.getText());
		System.out.println(fieldType.getText());
		System.out.println(fieldManufacturer.getText());
		System.out.println(fieldCost.getText());
		
		AircraftInput aircraft = new AirlinerAircraft(AircraftKind.Airliner);
		try {
			aircraft.setName(fieldName.getText());
			aircraft.setType(fieldType.getText());
			aircraft.setManufacturer(fieldManufacturer.getText());
			aircraft.setCost(fieldCost.getText());
			aircraftManager.AddAircraft(aircraft);
			putObject(aircraftManager, "aircraftmanager.ser");
			aircraft.printInfo();
		} catch (ManufacturerFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(AircraftManager aircraftManager, String filename) {
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
	}

}
