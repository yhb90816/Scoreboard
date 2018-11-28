package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Example10_8_1 extends JFrame{
	public static void main(String[] args) {
		new Example10_8_1();
	}
	public Example10_8_1() {
		setTitle("����Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] animals = {"��", "�����", "����", "ȣ����",
				"������", "�⸰", "��", "����", "��ѱ�"};
		ImageIcon[] images = {new ImageIcon("images/home.png"),
				new ImageIcon("images/key.png"),
				new ImageIcon("images/magnifier.png"),
				new ImageIcon("images/wifi.png")};
		
		JList<String> strList = new JList<>(animals); //���ڿ� ����Ʈ
		JList<ImageIcon> imageList = new JList<>(); //�̹��� ����Ʈ
		imageList.setListData(images); //setListData�� �̿��� ������ �߰�
		JList<String> scrollList = new JList<>(animals); //��ũ�� ������ ���ڿ� ����Ʈ
		
		c.add(strList);
		c.add(imageList);
		c.add(new JScrollPane(scrollList)); //JScrollPane�� �������� ��ũ�� ����
		//Components are here.
		setSize(500, 500);
		setVisible(true);
	}
}
