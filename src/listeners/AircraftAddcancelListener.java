package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AircraftAdder;
import gui.AircraftViewer;
import gui.WindowFrame;

public class AircraftAddcancelListener implements ActionListener {
	
	WindowFrame frame;

	public AircraftAddcancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
		
	}

}
