package GamePlay;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Ui extends JFrame {
	
	public Ui() {
		setTitle("숫자 야구게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel l = new JLabel("숫자 야구");
		l.setFont(new Font("바탕",Font.PLAIN, 30));
		l.setSize(400,100);
		l.setLocation(220,10);
		c.add(l);
		ImageIcon img = new ImageIcon("images/1327133C50567A2728.jpg");
		JLabel imageLabel = new JLabel(img);
		imageLabel.setSize(600,600);
		imageLabel.setLocation(300,300);
		c.add(imageLabel);
		JButton easy = new JButton("하");
		easy.setSize(200, 50);
		easy.setLocation(180,350);
		easy.setBackground(Color.LIGHT_GRAY);
		c.add(easy);
		JButton medium = new JButton("중");
		medium.setSize(200,50);
		medium.setLocation(180,250);
		medium.setBackground(Color.LIGHT_GRAY);
		c.add(medium);
		JButton hard = new JButton("상");
		hard.setSize(200,50);
		hard.setLocation(180,150);
		hard.setBackground(Color.LIGHT_GRAY);
		c.add(hard);
		c.setBackground(Color.WHITE);
		c.addMouseListener(new MyMouseListener());
		
		
		
		setSize(600,600);
		setVisible(true);
		
		
	}
	
	class MyMouseListener extends MouseAdapter{
		
	}
	public static void main(String args[]) {
		new Ui();
	}

}
