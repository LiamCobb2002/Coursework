package lab7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Gui_lab7 extends JFrame implements ActionListener, MouseListener{
	
	int count;
	JButton button1, button2, button3;
	JPanel panel1, panel2;
	JLabel label1, label2, label3;
	JTextArea area1;
	JTextField text;
	JRadioButton button;
	
	public Gui_lab7(String title) {
		
		JFrame frame1= new JFrame(title);
		frame1.setVisible(true);
		frame1.setSize(500,400);
		frame1.setLayout(new FlowLayout());
		
		
		/*panel1 = new JPanel();
		frame1.add(panel1);

		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.pink);*/
	
		
		text = new JTextField();
		text.setToolTipText("Input text");
		text.setText("Name");
		text.setOpaque(true);
		
		
		button1= new JButton();
		button1.setText("Message");
		button1.setToolTipText("Creates pop up message");
		
		
		button2 = new JButton("Up");
		
		label1 = new JLabel("Number");
		button2.setToolTipText("Adds one to the number");
		
		
		button3 = new JButton("Down");
		
		button3.setToolTipText("Removes one from number");
		
		area1 = new JTextArea("Please enter text here");
	    area1.setToolTipText("Used to enter text");
		
		button = new JRadioButton();
		button.setToolTipText("Toggle button");
		
		
		frame1.add(text);
		frame1.add(button1);
		frame1.add(button2);
		frame1.add(label1);
		frame1.add(button3);
		frame1.add(area1);
		frame1.add(button);
				
		text.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button.addActionListener(this);
		

		panel2 = new JPanel();
		frame1.add(panel2);
		label2 = new JLabel("clicks");
		label2.setBackground(Color.red);
		label2.setOpaque(true);		
		
		
		
		panel2.add(label2);
		
		
		label2.addMouseListener(this);
		
		
	}
	
	
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) 
		{
					
			JOptionPane.showMessageDialog(this, "hi");
		}
		
		else if(e.getSource()==button2) 
		{
					
			count++;
			label1.setText("count = " + count);
		}
		
		else if(e.getSource()==button3) 
		{
					
			count--;
			label1.setText("count = " + count);
		}
		
		else if(e.getSource()==text) 
		{
					
			JOptionPane.showMessageDialog(this, text.getText());
		}
		
		else if(e.getSource()==button) 
		{
					
			panel1.setBackground(Color.red);
		}
		
	
		
		
	}

@Override
public void mouseClicked(MouseEvent e) {
	if(e.getSource()==label2) 
	{
		if(e.getButton()== MouseEvent.BUTTON1)	{
			JOptionPane.showMessageDialog(this, "left click");
			
		}
		
		else if(e.getButton()== MouseEvent.BUTTON3)	{
			JOptionPane.showMessageDialog(this, "right click");
			
		}
		
		
	}
	
}



@Override
public void mouseEntered(MouseEvent e) {
	if(e.getSource()==label2) 
	{
				
		JOptionPane.showMessageDialog(this, "entered");
	}
	
}

@Override
public void mouseExited(MouseEvent e) {
	if(e.getSource()==label2) 
	{
				
		JOptionPane.showMessageDialog(this, "exited");
	}
	
}



@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
	
}
