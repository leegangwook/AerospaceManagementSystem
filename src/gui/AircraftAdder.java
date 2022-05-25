package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class AircraftAdder extends JFrame {
	public AircraftAdder() {
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
