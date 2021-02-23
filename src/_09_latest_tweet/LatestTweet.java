package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField text;
	JButton button;
	
	public void run() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("The Amazing Tweet Retriver");
		
		panel = new JPanel();
		frame.add(panel);
				
		text = new JTextField("", 10);
		text.setSize(30, 50);
		panel.add(text);
		
		button = new JButton();
		button.setText("Search the Twitterverse");
		panel.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tweet, Tweet");
		
	}

}
