package ch10Examples;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Example10_7_2 extends JFrame{
	public static void main(String[] args) {
		new Example10_7_2();
	}
	public Example10_7_2() {		
		setTitle("�ؽ�Ʈ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField inputText = new JTextField(20); //�Է�â ����
		JTextArea outputText = new JTextArea(7, 20); //���â ����
		
		c.add(new JLabel("�̸��� ���� Enter�� �����ּ���."));
		c.add(inputText);
		c.add(new JScrollPane(outputText)); //JScrollPane �������� ��ũ�� ����
		
		//Enter Ű �Է� �� �׼� ������ �۵�
		inputText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				//���â �ؽ�Ʈ�� �Է�â �ؽ�Ʈ �߰�
				outputText.append(t.getText() + "\n");
				//�Է�â �ؽ�Ʈ �ʱ�ȭ
				t.setText("");
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
}
