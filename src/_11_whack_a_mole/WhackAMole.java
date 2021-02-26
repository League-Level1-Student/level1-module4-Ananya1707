package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24;
	JButton button;
	int randomNum;
	
	public void run(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(300,300);
		
		panel = new JPanel();
		frame.add(panel);
				
		button1 = new JButton(); button2 = new JButton(); button3= new JButton(); button4 = new JButton(); button5 = new JButton(); button6 = new JButton(); button7 = new JButton(); button8 = new JButton(); button9 = new JButton(); button10 = new JButton(); button11 = new JButton(); button12 = new JButton(); button13 = new JButton(); button14 = new JButton(); button15 = new JButton(); button16 = new JButton(); button17 = new JButton(); button18 = new JButton(); button19 = new JButton(); button20 = new JButton(); button21 = new JButton(); button22 = new JButton(); button23 = new JButton(); button24 = new JButton();
		panel.add(button1); panel.add(button2); panel.add(button3); panel.add(button4); panel.add(button5); panel.add(button6); panel.add(button7); panel.add(button8); panel.add(button9); panel.add(button10); panel.add(button11); panel.add(button12); panel.add(button13); panel.add(button14); panel.add(button15); panel.add(button16); panel.add(button17); panel.add(button18); panel.add(button19); panel.add(button20); panel.add(button21); panel.add(button22); panel.add(button23); panel.add(button24);
		
		button1.addActionListener(this); button2.addActionListener(this); button3.addActionListener(this); button4.addActionListener(this); button5.addActionListener(this); button6.addActionListener(this); button7.addActionListener(this); button8.addActionListener(this); button9.addActionListener(this); button10.addActionListener(this); button11.addActionListener(this); button12.addActionListener(this); button13.addActionListener(this); button14.addActionListener(this); button15.addActionListener(this); button16.addActionListener(this); button17.addActionListener(this); button18.addActionListener(this); button19.addActionListener(this); button20.addActionListener(this); button21.addActionListener(this); button22.addActionListener(this); button23.addActionListener(this); button24.addActionListener(this);
		
		Random random = new Random();
		randomNum = random.nextInt(25);
		drawButton(randomNum);
		
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void drawButton(int num) {
		
		
		
		
		
	}

}
