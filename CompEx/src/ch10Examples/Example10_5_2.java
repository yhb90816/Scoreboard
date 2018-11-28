package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Example10_5_2 extends JFrame {
	public Example10_5_2() {
		Container c = getContentPane();
		setTitle("JRadioButton ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		ButtonGroup bg = new ButtonGroup();

		JRadioButton rb1 = new JRadioButton("Seoul Nat'l Univ.");
		JRadioButton rb2 = new JRadioButton("Korea Univ.");
		JRadioButton rb3 = new JRadioButton("Yonsei Univ.");
		        
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		c.add(rb1);
		c.add(rb2);
		c.add(rb3);// Components are here.

		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Example10_5_2 example = new Example10_5_2();
	}
}
