package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener22 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question10 t1q10 = new Test1Question10();
		if(t1q10.userText.equals("1")) {
			t1q10.s.setText("null");
		}else {
			t1q10.s.setText("CORRECT ANSWER = 1");
		}
		

	}

}
