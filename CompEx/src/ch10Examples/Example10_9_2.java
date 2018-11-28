package ch10Examples;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_9_2 extends JFrame{
	public static void main(String[] args) {
		new Example10_9_2();
	}
	public Example10_9_2() {
		setTitle("�޺��ڽ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] animals = {"��", "�����", "��ѱ�"};
		ImageIcon[] images = {new ImageIcon("images/dog.png"),
				new ImageIcon("images/cat.png"),
				new ImageIcon("images/pigeon.png")};
		
		JComboBox<String> comboBox = new JComboBox<>(animals); //�޺��ڽ� ����
		JLabel imgLabel = new JLabel(images[0]); //�̹����� ����� ���̺� ����
		
		c.add(comboBox);
		c.add(imgLabel);
		
		//�޺��ڽ��� �������� ���õǸ� �� �������� �̹����� ���
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//�޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				int index = ((JComboBox<String>) e.getSource()).getSelectedIndex();
				
				//�ε����� �̹����� �̹��� ���̺� ���
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
}

