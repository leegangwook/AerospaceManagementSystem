package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.AircraftViewer;
import gui.WindowFrame;
import manager.AircraftManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AircraftViewer aircraftViewer = frame.getAircraftviewer();
		AircraftManager aircraftManager = getObject("aircraftmanager.ser");
		aircraftViewer.setAircraftManager(aircraftManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(aircraftViewer);
		frame.revalidate();
		frame.repaint();
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

}
