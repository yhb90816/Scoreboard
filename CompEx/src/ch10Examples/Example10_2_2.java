package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Example10_2_2 extends JFrame {
	public Example10_2_2() {
		Container c = getContentPane();
		setTitle("JLabel ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(new BorderLayout());
        
		JLabel label1 = new JLabel("Pepe the Frog", new ImageIcon("images/frog.jpg"), SwingConstants.LEFT);

		this.add(label1);// Components are here.

		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Example10_2_2 example = new Example10_2_2();
	}
}
