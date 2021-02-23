package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField text1;
	JTextField text2;
	JButton button;
	
	public void run() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Ananya'a Pig Latin Translator");
		
		panel = new JPanel();
		frame.add(panel);
		
		text1 = new JTextField("", 10);
		panel.add(text1);
		
		button = new JButton();
		button.setText("translate");
		panel.add(button);
		button.addActionListener(this);
		
		text2 = new JTextField("", 10);
		panel.add(text2);
		
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String word = text1.getText();
		

		
	}
}