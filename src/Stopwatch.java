import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Stopwatch implements ActionListener{

	JFrame frame = new JFrame();
	JButton startButton = new JButton("Start");
	JButton resetButton = new JButton("Reset");
	JLabel timeLabel = new JLabel();
	int elapsedTime = 0;
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	boolean started = false;
	String seconds_String = String.format("%02d", seconds);
	String minutes_String = String.format("%02d", minutes);
	String hourss_String = String.format("%02d", hours);
	
	Stopwatch(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	void start() {
		
	}
	
	void stop() {
		
	}

	void reset() {
		
	}
	
}
