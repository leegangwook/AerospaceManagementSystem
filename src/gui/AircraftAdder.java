package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import listeners.AircraftAddcancelListener;
import listeners.AircraftAdderListener;
import manager.AircraftManager;

import javax.swing.*;

public class AircraftAdder extends JPanel {
	
	WindowFrame frame;
	
	AircraftManager aircraftManager;
	
	public AircraftAdder(WindowFrame frame, AircraftManager aircraftManager) {
		this.frame = frame;
		this.aircraftManager = aircraftManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelType = new JLabel("Type: ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelType.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		JLabel labelManufacturer = new JLabel("Manufacturer: ", JLabel.TRAILING);
		JTextField fieldManufacturer = new JTextField(10);
		labelType.setLabelFor(fieldManufacturer);
		panel.add(labelManufacturer);
		panel.add(fieldManufacturer);
		
		JLabel labelCost = new JLabel("Cost: ", JLabel.TRAILING);
		JTextField fieldCost = new JTextField(10);
		labelType.setLabelFor(fieldCost);
		panel.add(labelCost);
		panel.add(fieldCost);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AircraftAdderListener(fieldName, fieldType, fieldManufacturer, fieldCost, aircraftManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AircraftAddcancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
		this.add(panel);
		this.setVisible(true);
	}
}
