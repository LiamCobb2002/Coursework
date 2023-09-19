package lab10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener{
	
	ArrayList<Person> newlist = new ArrayList<Person>();
	static JPanel panel1;
	static JButton button1, button2, button3;
	static JTextField text1, text2, text3;
	static JTextArea a1;
	JLabel label1, label2, label3;
	public void Gui(){
		
		
		
		JFrame frame1= new JFrame();
		frame1.setVisible(true);
		frame1.setSize(500,400);
		//frame1.setTitle("HI");
		frame1.getContentPane().setBackground(Color.cyan);
		
	

		
		JPanel panel1 = new JPanel();
		frame1.add(panel1);
		panel1.setBackground(Color.pink);
		panel1.setLayout(new FlowLayout());
		
		text1 = new JTextField(6);
		panel1.add(text1);
		text1.setBackground(Color.lightGray);
		//text1.setText("Firstname");
		text1.setToolTipText("Firstname");
		
		
		text2 = new JTextField(6);
		panel1.add(text2);
		text2.setBackground(Color.lightGray);
		//text2.setText("Surname");
		text2.setToolTipText("Surname");
	
		
		text3 = new JTextField(6);
		panel1.add(text3);
		text3.setBackground(Color.lightGray);
		//text3.setText("City");
		text3.setToolTipText("City");
		
		button1 = new JButton();
		panel1.add(button1);
		button1.setBackground(Color.lightGray);
		button1.setText("Save");
		button1.setToolTipText("City");
		button1.addActionListener(this);
		
		button2 = new JButton();
		panel1.add(button2);
		button2.setBackground(Color.lightGray);
		button2.setText("Show all");
		button2.setToolTipText("City");
		button2.addActionListener(this);
		
		button3 = new JButton();
		panel1.add(button3);
		button3.setBackground(Color.lightGray);
		button3.setText("Delete");
		button3.setToolTipText("Delete");
		button3.addActionListener(this);
		
		a1 = new JTextArea();
		panel1.add(a1);
		a1.setBackground(Color.lightGray);
		//text1.setText("Firstname");
		a1.setToolTipText("Firstname");
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button1)
		{
			Person p= new Person(text1.getText(),text2.getText(), text1.getText());
			newlist.add(p);
			System.out.println("saved");
			
		}
		
		else if(e.getSource()==button2) {
			System.out.println(newlist);
			
			
			for(Person i: newlist)
			{
				
				a1.append(i.toString()+"\n");
			}
		}
		
		else if(e.getSource()==button3) {
				newlist.clear();
				a1.setText("");
	}
		
		
	}
}


