package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JLabel label;
	JPanel panel;
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.setup(); 
		
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void setup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		
		currentLetter = generateRandomLetter();
		
		label = new JLabel();
		label.setText(""+currentLetter);
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		
		frame.pack();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char letter = e.getKeyChar();
		if(letter == currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
		}
		
		else{
			System.out.println("Incorrect");
			panel.setBackground(Color.RED);
		}
		
		//System.out.println(e.getKeyChar());
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(""+currentLetter);

		
		
	}
	
}
