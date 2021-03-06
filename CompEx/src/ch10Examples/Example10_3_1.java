package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Example10_3_1 extends JFrame {
	public Example10_3_1() {
		Container c = getContentPane();
		setTitle("JButton ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JButton button1 = new JButton("OK");
		JButton button2 = new JButton(new ImageIcon("images/bt1.png"));
		JButton button3 = new JButton("face", new ImageIcon("images/bt1.png"));

		c.add(button1);
		c.add(button2);
		c.add(button3);// Components are here.

		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Example10_3_1 example = new Example10_3_1();
	}
}
