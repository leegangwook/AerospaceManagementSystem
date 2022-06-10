package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AircraftManager;

public class WindowFrame extends JFrame{
	
	AircraftManager aircraftManager;
	
	MenuSelection menuselection;		
	AircraftAdder aircraftadder;
	AircraftViewer aircraftviewer;
	
	public WindowFrame(AircraftManager aircraftManager) {
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.aircraftManager = aircraftManager;
		
		this.menuselection = new MenuSelection(this);		
		this.aircraftadder = new AircraftAdder(this, this.aircraftManager);
		this.aircraftviewer = new AircraftViewer(this, this.aircraftManager);
		
	
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AircraftAdder getAircraftadder() {
		return aircraftadder;
	}

	public void setAircraftadder(AircraftAdder aircraftadder) {
		this.aircraftadder = aircraftadder;
	}

	public AircraftViewer getAircraftviewer() {
		return aircraftviewer;
	}

	public void setAircraftviewer(AircraftViewer aircraftviewer) {
		this.aircraftviewer = aircraftviewer;
	}


}
