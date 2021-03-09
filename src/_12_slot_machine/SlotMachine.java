package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	int randomNum1;
	int randomNum2;
	int randomNum3;
	JLabel slot1;
	JLabel slot2;
	JLabel slot3;
	
	public void run(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Slot Machine");
		
		panel = new JPanel();
		frame.add(panel);
		
		button = new JButton();
		panel.add(button);
		button.setText("Spin");
		button.addActionListener(this);	
		
		frame.setSize(200,70);
	}
		
	public void spin() {
		Random random = new Random();
		randomNum1 = random.nextInt(3);
		randomNum2 = random.nextInt(3);
		randomNum3 = random.nextInt(3);
		
		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Slot Machine");
		
		panel = new JPanel();
		frame.add(panel);
		
		slot1 = new JLabel();
		slot2 = new JLabel();
		slot3 = new JLabel();
		
		try{
			if(randomNum1 == 0) {
				slot1 = createLabelImage("cherry.png");
			}

			if(randomNum1 == 1) {
				slot1 = createLabelImage("orange3.png");
			}
		
			if(randomNum1 == 2) {
				slot1 = createLabelImage("lime.png");
			}
			
			if(randomNum2 == 0) {
				slot2 = createLabelImage("cherry.png");
			}

			if(randomNum2 == 1) {
				slot2 = createLabelImage("orange3.png");
			}
		
			if(randomNum2 == 2) {
				slot2 = createLabelImage("lime.png");
			}
			
			if(randomNum3 == 0) {
				slot3 = createLabelImage("cherry.png");
			}

			if(randomNum3 == 1) {
				slot3 = createLabelImage("orange3.png");
			}
		
			if(randomNum3 == 2) {
				slot3 = createLabelImage("lime.png");
			}
		
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);



		button = new JButton();
		panel.add(button);
		button.setText("Spin");
		button.addActionListener(this);
		
		frame.pack();
		
		if(randomNum1 == randomNum2 && randomNum1 == randomNum3) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		spin();
		
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
		}
	
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	
	}
    
}
