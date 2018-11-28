package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Example10_3_2 extends JFrame {
	public Example10_3_2() {
		Container c = getContentPane();
		setTitle("JButton ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JButton button = new JButton("face", new ImageIcon("images/bt1.png"));
		button.setRolloverIcon(new ImageIcon("images/bt2.png"));
		button.setPressedIcon(new ImageIcon("images/bt3.png"));

		c.add(button);// Components are here.

		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Example10_3_2 example = new Example10_3_2();
	}
}
