package Board;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScoreBoard extends JFrame {
	
	public ScoreBoard() {
		setTitle("Basketball ScoreBoard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		ButtonGroup t = new ButtonGroup();
		ButtonGroup qn = new ButtonGroup();
		
		JRadioButton eight = new JRadioButton("8분");
		JRadioButton ten = new JRadioButton("10분");
		JRadioButton twelve = new JRadioButton("12분");
		JRadioButton none = new JRadioButton("시간제한 없음");
		eight.setBackground(Color.LIGHT_GRAY);
		
		t.add(eight); t.add(ten); t.add(twelve); t.add(none);
		
		JRadioButton one = new JRadioButton("1");
		JRadioButton two = new JRadioButton("2");
		JRadioButton three = new JRadioButton("3");
		JRadioButton four = new JRadioButton("4");
		
		qn.add(one); qn.add(two); qn.add(three); qn.add(four);
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.add(new JLabel("team 1 "));
		c.add(new JTextField(25));
		c.add(new JLabel("team 2 "));
		c.add(new JTextField(25));
		c.add(new JLabel("쿼터시간 "));
		c.add(eight); c.add(ten); c.add(twelve); c.add(none);
		c.add(new JLabel("쿼터 수"));
		c.add(one); c.add(two); c.add(three); c.add(four);
		c.add(new JButton("경기시작"));
		
		c.setBackground(Color.LIGHT_GRAY);
		setSize(350,300);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new ScoreBoard();
	}

}
