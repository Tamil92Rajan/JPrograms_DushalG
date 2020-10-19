package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener20 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question9 t1q9 = new Test1Question9();
		if(t1q9.userText.equals("1")) {
			t1q9.s.setText("null");
		}else {
			t1q9.s.setText("CORRECT ANSWER = 1");
		}
		

	}

}
