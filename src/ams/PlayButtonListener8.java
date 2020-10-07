package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener8 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question3 t1q3 = new Test1Question3();
		if(t1q3.userText.equals("17")) {
			t1q3.s.setText("null");
		}else {
			t1q3.s.setText("CORRECT ANSWER = 17");
		}
		

	}

}
