package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Example10_2_1 extends JFrame{
    public Example10_2_1() {  	
    	Container c = getContentPane();
        setTitle("JLabel ����");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Mona Lisa");
        JLabel label2 = new JLabel(new ImageIcon("images/monalisa.jpg"));
        JLabel label3 = new JLabel("by Leonardo da Vinci", new ImageIcon("images/davinci.jpg"), SwingConstants.CENTER);
                
        c.add(label1);
        c.add(label2);
        c.add(label3);									//Components are here.
 
        setSize(300, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Example10_2_1();
    }
}
