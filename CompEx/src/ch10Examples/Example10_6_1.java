package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Example10_6_1 extends JFrame {
	public Example10_6_1() {
		Container c = getContentPane();
		setTitle("JTextField ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField("Korea Univ.");
		JTextField tf3 = new JTextField(10);
		JTextField tf4 = new JTextField("Korea Univ.", 10);
		        
		c.add(tf1);
		c.add(tf2);
		c.add(tf3);
		c.add(tf4);// Components are here.

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Example10_6_1 example = new Example10_6_1();
	}
}
