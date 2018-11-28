package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Example10_8_2 extends JFrame{
	public static void main(String[] args) {
		new Example10_8_2();
	}
	public Example10_8_2() {
		setTitle("����Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] animals = {"��", "�����", "��ѱ�"};
		ImageIcon[] images = {new ImageIcon("images/dog.png"),
				new ImageIcon("images/cat.png"),
				new ImageIcon("images/pigeon.png")};
		
		JList<String> strList = new JList<>(animals); //���ڿ� ����Ʈ
		JLabel animal = new JLabel(images[0]); //�̹����� ����� ���̺� ����
		
		c.add(strList);
		c.add(animal);
		
		//����Ʈ�� �������� ���õǸ� �� �������� �̹����� ���
		strList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				//�޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				int index = ((JList<String>) e.getSource()).getSelectedIndex();
				
				//�ε����� �̹����� �̹��� ���̺� ���
				animal.setIcon(images[index]);
			}
		});										//Components are here.
		
		setSize(300, 300);
		setVisible(true);
	}
}
