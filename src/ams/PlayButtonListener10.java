package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener10 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question4 t1q4 = new Test1Question4();
		if(t1q4.userText.equals("15.2")) {
			t1q4.s.setText("null");
		}else {
			t1q4.s.setText("CORRECT ANSWER = 15.2");
		}
		

	}

}
