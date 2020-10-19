package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener12 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question5 t1q5 = new Test1Question5();
		if(t1q5.userText.equals("8.1")) {
			t1q5.s.setText("null");
		}else {
			t1q5.s.setText("CORRECT ANSWER = 8.1");
		}
		

	}

}
