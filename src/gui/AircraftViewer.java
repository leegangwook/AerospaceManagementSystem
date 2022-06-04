package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import aircraft.AircraftInput;
import manager.AircraftManager;

public class AircraftViewer extends JPanel {
	
	WindowFrame frame;
	
	AircraftManager aircraftManager;
	
	public AircraftViewer(WindowFrame frame, AircraftManager aircraftManager) {
		this.frame = frame;
		this.aircraftManager = aircraftManager;
		
		System.out.println("***" + aircraftManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Manufacturer");
		model.addColumn("Cost");

		
		for(int i=0; i<aircraftManager.size();i++) {
			Vector row = new Vector();
			AircraftInput si = aircraftManager.get(i);
			row.add(si.getName());
			row.add(si.getType());
			row.add(si.getManufacturer());
			row.add(si.getCost());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
