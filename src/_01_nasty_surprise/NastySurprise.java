package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	JButton trick;
	JButton treat;
	JFrame frame;
	
	public void run() {
		frame = new JFrame();
		// Need set visible to true on frame
		frame.setVisible(true);
		// Also need fream.setRelative to null
		frame.setLocationRelativeTo(null);
		// run it
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		trick = new JButton();
		trick.setText("Trick");
		trick.addActionListener(this);
		panel.add(trick);
		
		treat = new JButton();
		treat.setText("Treat");
		treat.addActionListener(this);
		panel.add(treat);
		
		frame.pack();
						
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource() == trick) {
			 showPictureFromTheInternet("https://www.petlandflorida.com/wp-content/uploads/2019/09/Petland_Florida_Cavalier_King_Charles_Spaniel_puppy.jpg");
						
		}
		
		if(arg0.getSource() == treat) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/92/d9/37/92d937399ca71b9c0caf934fb938c1a6.png");
		}
		
		frame.pack();
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

}
