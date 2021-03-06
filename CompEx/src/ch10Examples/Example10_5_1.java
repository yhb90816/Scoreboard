package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Example10_5_1 extends JFrame {
	public Example10_5_1() {
		Container c = getContentPane();
		setTitle("JRadioButton ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JRadioButton rb1 = new JRadioButton(new ImageIcon("images/snu.png"));
		JRadioButton rb2 = new JRadioButton("Korea Univ.", new ImageIcon("images/ku.png"));
		JRadioButton rb3 = new JRadioButton("Yonsei Univ.");

		c.add(rb1);
		c.add(rb2);
		c.add(rb3);// Components are here.

		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Example10_5_1 example = new Example10_5_1();
	}
}
