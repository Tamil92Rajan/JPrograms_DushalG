package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener16 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question7 t1q7 = new Test1Question7();
		if(t1q7.userText.equals("4")) {
			t1q7.s.setText("null");
		}else {
			t1q7.s.setText("CORRECT ANSWER = 4");
		}
		

	}

}
