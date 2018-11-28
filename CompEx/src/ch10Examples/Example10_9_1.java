package ch10Examples;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Example10_9_1 extends JFrame{
	public static void main(String[] args) {
		new Example10_9_1();
	}
	public Example10_9_1() {
		setTitle("�޺��ڽ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] animals = {"��", "�����", "����", "ȣ����",
				"������", "�⸰", "��", "����", "��ѱ�"};
		
		JComboBox<String> strList = new JComboBox<>(animals); //���ڿ� �޺��ڽ�
		c.add(strList);
		
		setSize(300, 300);
		setVisible(true);
	}
}
