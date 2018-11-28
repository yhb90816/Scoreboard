package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Example10_4_3 extends JFrame {
	public Example10_4_3() {
		Container c = getContentPane();
		setTitle("JCheckBox ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());

		JCheckBox cb = new JCheckBox("");
		JLabel label = new JLabel();

		cb.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED)
		            label.setText("true");
		        else
		            label.setText("false");
		    }
		});

		this.add(cb);
		this.add(label);// Components are here.

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Example10_4_3 example = new Example10_4_3();
	}
}