package ams;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestScreen {
	
	public TestScreen() {
		JFrame frame4 = new JFrame();
		JPanel panel3 = new JPanel();
		JButton button3 = new JButton("Test 1 - ");
		button3.addActionListener(new PlayButtonListener3());
		JButton button4 = new JButton("Test 2 - ");
		JButton button5 = new JButton("Test 3 - ");
		JButton button6 = new JButton("Test 4 - ");
		JButton button7 = new JButton("Test 5 - ");
		JButton button8 = new JButton("Test 6 - ");
		JButton button9 = new JButton("Test 7 - ");
		JButton button10 = new JButton("Test 8 - ");
		
		panel3.setBorder(BorderFactory.createEmptyBorder(250, 300, 250, 300));
		panel3.setLayout(new GridLayout (0, 1));
		panel3.add(button3);
		panel3.add(button4);
		panel3.add(button5);
		panel3.add(button6);
		panel3.add(button7);
		panel3.add(button8);
		panel3.add(button9);
		panel3.add(button10);
		frame4.add(panel3, BorderLayout.CENTER);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setTitle("Tests");
		frame4.pack();
		frame4.setVisible(true);
		
	}

}
