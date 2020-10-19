package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener14 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question6 t1q6 = new Test1Question6();
		if(t1q6.userText.equals("7")) {
			t1q6.s.setText("null");
		}else {
			t1q6.s.setText("CORRECT ANSWER = 7");
		}
		

	}

}
