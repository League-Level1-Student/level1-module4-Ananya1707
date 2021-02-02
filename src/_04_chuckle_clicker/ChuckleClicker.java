package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1;
	JButton button2;
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
		
		
	}
	
	public void makeButtons() {
		//JOptionPane.showMessageDialog(null, "Make Buttons");
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		button1 = new JButton();
		button1.setText("joke");
		panel.add(button1);
		button1.addActionListener(this);
		
		button2 = new JButton();
		button2.setText("punchline");
		panel.add(button2);
		button2.addActionListener(this);
		
		frame.pack();
		


		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "hi");
		if(event.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Why did the M&M go to school?");
			
		}
		
		if(event.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "It wanted to be a Smartie." );
		}
		
	}

}
