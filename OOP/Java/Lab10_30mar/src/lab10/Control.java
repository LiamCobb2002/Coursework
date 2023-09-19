package lab10;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Control{


	//private static final long serialVersionUID = 1L;
	static JPanel panel1;
	static JButton button1, button2;
	static JTextField text1, text2, text3;
	JLabel label1, label2, label3;
	int count=0;
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();
		
		Person p1 =new Person("Jeff", "Hardy", "Dublin");
		Person p2 =new Person("Bob", "Ross", "Cork");
		Person p3 =new Person("Richard", "White", "Belfast");
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		System.out.println("size is: " + pList.size());
		System.out.println(pList);
		ArrayList<String> copyList = (ArrayList<String>) pList.clone();
		
		Gui g1=new Gui();
		g1.Gui();

	}
}
