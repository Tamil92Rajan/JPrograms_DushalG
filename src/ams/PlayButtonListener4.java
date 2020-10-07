package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class PlayButtonListener4 implements ActionListener {

	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question1 t1q1 = new Test1Question1();
		if(t1q1.userText.equals("6.0")) {
			t1q1.s.setText("null");
		}else {
			t1q1.s.setText("CORRECT ANSWER = 6.0");
		}
		

	}

}
