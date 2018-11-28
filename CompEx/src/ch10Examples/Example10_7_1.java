package ch10Examples;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Example10_7_1 extends JFrame{
	public static void main(String[] args) {
		new Example10_7_1();
	}
	public Example10_7_1() {		
		setTitle(""
				+ "�ؽ�Ʈ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea("�Է����ּ���", 7, 20); //�ؽ�Ʈ ���� ����
		c.add(textArea);
		
		JTextArea scrollArea = new JTextArea("��ũ�� ����", 7, 20); //��ũ�� ������ �ؽ�Ʈ ���� ����
		c.add(new JScrollPane(scrollArea)); // JScrollPane�� �������� ��ũ�� ����
		
		setSize(300, 300);
		setVisible(true);
	}
}
