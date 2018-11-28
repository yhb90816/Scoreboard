package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Example10_5_3 extends JFrame {
		JRadioButton rb[] = new JRadioButton[2];
	    String name[] = {"Papyrus", "Sans"};
	    JLabel label = new JLabel("WA! UNDERTALE!");
	    
	    public Example10_5_3() {
	        this.setTitle("JRadioButton ����");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLayout(new GridLayout(3, 2));
	        
	        ButtonGroup bg = new ButtonGroup();

	        for (int i = 0; i < rb.length; i++) {
	            rb[i] = new JRadioButton(name[i]);
	            rb[i].addItemListener(new myItemListener());
	            bg.add(rb[i]);
	            this.add(rb[i]);
	            this.add(new JLabel(new ImageIcon("images/img" + Integer.toString(i) + ".jpg")));
	        }
	        
	        this.add(label);
	        
	        this.setSize(300, 500);
	        this.setVisible(true);
	    }
	
	    public class myItemListener implements ItemListener {
	        public void itemStateChanged(ItemEvent e) {
	            for (int i = 0; i < rb.length; i++)
	                if (e.getItem() == rb[i])
	                    label.setText("WA! " + name[i] + "!");
	        }
	    }

	public static void main(String[] args) {
		 new Example10_5_3();
	}
}
