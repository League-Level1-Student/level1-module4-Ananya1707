package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	public void run() {
		JFrame frame  = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		
		JPanel panel = new JPanel();
		frame.add(panel);
				
		JTextField text1 = new JTextField("", 10);
		text1.setSize(30, 50);
		panel.add(text1);
		
		JTextField text2 = new JTextField("", 10);
		panel.add(text2);

		
		JButton buttonAdd = new JButton();
		buttonAdd.setText("add");
		panel.add(buttonAdd);
		
		JButton buttonSub = new JButton();
		buttonSub.setText("sub");
		panel.add(buttonSub);
		
		JButton buttonMul = new JButton();
		buttonMul.setText("mul");
		panel.add(buttonMul);
		
		JButton buttonDiv = new JButton();
		buttonDiv.setText("div");
		panel.add(buttonDiv);
		
		JLabel label = new JLabel();
		label.setText("hello");
		panel.add(label);
		
		
		frame.pack();

		
		
		
	}


}
