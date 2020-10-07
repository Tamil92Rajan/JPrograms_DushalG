package ams;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test1Question2 {
	
	public JLabel userLabel;
	public JTextField userText;
	public JLabel s;
	
	public Test1Question2() {
		
		JFrame frame5 = new JFrame();
		JPanel panel5 = new JPanel();
		JLabel label5 = new JLabel("What is stored in the b variable after the code has run?");
		JLabel label6 = new JLabel(" ");
		JLabel label7 = new JLabel("int j, b");
		JLabel label8 = new JLabel("int p = 7");
		JLabel label9 = new JLabel("int x = 8");
		JLabel label10 = new JLabel("j = p + x");
		JLabel label11 = new JLabel("b = j * 3");
		
		userLabel = new JLabel("Answer");
		userLabel.setBounds(10, 20, 80, 25);
		panel5.add(userLabel);
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel5.add(userText);
		
		JLabel label12 = new JLabel(" ");
		JButton button5 = new JButton("Mark");
		button5.addActionListener(new PlayButtonListener6());
		JButton button6 = new JButton("Next");
		button6.addActionListener(new PlayButtonListener7());
		panel5.setBorder(BorderFactory.createEmptyBorder(250, 300, 250, 300));
		panel5.setLayout(new GridLayout (0, 1));
		panel5.add(label5);
		panel5.add(label6);
		panel5.add(label7);
		panel5.add(label8);
		panel5.add(label9);
		panel5.add(label10);
		panel5.add(label11);
		panel5.add(label12);
		panel5.add(button5);
		panel5.add(button6);
		frame5.add(panel5, BorderLayout.CENTER);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setTitle("AMS");
		frame5.pack();
		s = new JLabel("");
		s.setBounds(10, 110, 300, 25);
		panel5.add(s);
		frame5.setVisible(true);
		
	}
	
}
