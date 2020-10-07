package ams;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TitleScreen {
	
	
	
	public TitleScreen() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Tests with Automatic Marking");
		JButton button = new JButton("Click Here");
		button.addActionListener(new PlayButtonListener());
		label.setToolTipText("Automatic Marking System integration");
		panel.setBorder(BorderFactory.createEmptyBorder(250, 300, 250, 300));
		panel.setLayout(new GridLayout (0, 1));
		panel.add(label);
		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AMS");
		frame.pack();
		frame.setVisible(true);
		
	}

}
