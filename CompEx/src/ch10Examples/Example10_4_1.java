package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Example10_4_1 extends JFrame {
	public Example10_4_1() {
		Container c = getContentPane();
		setTitle("JCheckBox ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JCheckBox cb1 = new JCheckBox("Korea Univ.");
		JCheckBox cb2 = new JCheckBox("Korea Univ.", true);
		JCheckBox cb3 = new JCheckBox("face", new ImageIcon("images/bt3.png"));
		JCheckBox cb4 = new JCheckBox("face", new ImageIcon("images/bt3.png"), true);

		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);// Components are here.

		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Example10_4_1 example = new Example10_4_1();
	}
}
