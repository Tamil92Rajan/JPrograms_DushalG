package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener18 implements ActionListener {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Test1Question8 t1q8 = new Test1Question8();
		if(t1q8.userText.equals("0")) {
			t1q8.s.setText("null");
		}else {
			t1q8.s.setText("CORRECT ANSWER = 0");
		}
		

	}
}
