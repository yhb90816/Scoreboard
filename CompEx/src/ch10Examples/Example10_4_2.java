package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Example10_4_2 extends JFrame {
	public Example10_4_2() {
		Container c = getContentPane();
		setTitle("JCheckBox ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JCheckBox cb = new JCheckBox("face", new ImageIcon("images/bt1.png"));
		cb.setSelectedIcon(new ImageIcon("images/bt2.png"));

		c.add(cb);// Components are here.

		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Example10_4_2 example = new Example10_4_2();
	}
}
