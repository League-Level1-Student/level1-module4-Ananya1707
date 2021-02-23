package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JButton buttonAdd;
	JButton buttonSub;
	JButton buttonMul;
	JButton buttonDiv;
	JTextField text1;
	JTextField text2;
	JLabel label;
	JFrame frame;
	JPanel panel;
	
	public void run() {
		frame  = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		
		panel = new JPanel();
		frame.add(panel);
				
		text1 = new JTextField("", 10);
		panel.add(text1);
		
		
		text2 = new JTextField("", 10);
		panel.add(text2);

		buttonAdd = new JButton();
		buttonAdd.setText("add");
		panel.add(buttonAdd);
		buttonAdd.addActionListener(this);
		
		buttonSub = new JButton();
		buttonSub.setText("sub");
		panel.add(buttonSub);
		buttonSub.addActionListener(this);
		
		buttonMul = new JButton();
		buttonMul.setText("mul");
		panel.add(buttonMul);
		buttonMul.addActionListener(this);
		
		buttonDiv = new JButton();
		buttonDiv.setText("div");
		panel.add(buttonDiv);
		buttonDiv.addActionListener(this);
		
		label = new JLabel();
		label.setText("Answer: ");
		panel.add(label);
		
		
		frame.pack();
				
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String stringNum1 = text1.getText();
		double num1 = Double.parseDouble(stringNum1);
		
		String stringNum2 = text2.getText();
		double num2 = Double.parseDouble(stringNum2);
		
		double answer = 0;
		
		if(e.getSource()== buttonAdd) {
			answer = num1 + num2;
			
		}
		
		if(e.getSource()== buttonSub) {
			answer = num1 - num2;
			
		}
		
		if(e.getSource()== buttonMul) {
			answer = num1 * num2;
			
		}
		
		if(e.getSource()== buttonDiv) {
			answer = num1 / num2;
			
		}
		
		String answerString = answer + "";
		
		label.setText("Answer: " + answerString);
		
		frame.pack();
		
		
	}


}
