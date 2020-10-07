package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener6 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question2 t1q2 = new Test1Question2();
		if(t1q2.userText.equals("45")) {
			t1q2.s.setText("null");
		}else {
			t1q2.s.setText("CORRECT ANSWER = 45");
		}
		

	}
}
