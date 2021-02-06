package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.net.URI;

public class BinaryConverter implements ActionListener{

	public void run() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,100));
		
		JPanel panel = new JPanel();
		
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension(150,50));
		answer.setLocation(100, 50);
		
		JLabel label = new JLabel();
		
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(50,25));
		button.setLocation(250, 50);
		button.addActionListener(this);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String number = JOptionPane.showInputDialog("Enter a number");
		new binarystring().convert(number);
	}


}
	
