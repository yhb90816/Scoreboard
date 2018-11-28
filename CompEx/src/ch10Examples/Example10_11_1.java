package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Example10_11_1 extends JFrame{
	public static void main(String[] args) {
		new Example10_11_1();
	}
	public Example10_11_1() {
		setTitle("�˾� ���̾�α� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		JButton inputBtn = new JButton("�Է�");
		JButton confirmBtn = new JButton("Ȯ��");
		JButton messageBtn = new JButton("�޽���");
		JTextField text = new JTextField(10);
		panel.add(inputBtn);
		panel.add(confirmBtn);
		panel.add(messageBtn);
		panel.add(text);

		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է� ���̾�α� ����
				String name = JOptionPane.showInputDialog(null, "�̸��� �Է��ϼ���");
				if(name != null)
					//�Էµ� ���ڿ� ���
					text.setText(name);
			}
		});
		
		confirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Ȯ�� ���̾�α� ����
				int result = JOptionPane.showConfirmDialog(null, "����� ���Դϱ�?", "Ȯ��", JOptionPane.YES_NO_OPTION);
				//���õ� ��ư�� ���� ���ڿ� ���
				if(result == JOptionPane.YES_OPTION)
					text.setText("Yes");
				else if(result == JOptionPane.NO_OPTION)
					text.setText("NO");
				else
					text.setText("Closed without selection");
			}
		});
		
		messageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�޽��� ���̾�α� ����
				JOptionPane.showMessageDialog(null, "�����ϼ���", "�޽���", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		c.add(panel, BorderLayout.NORTH);
		
		//Components are here.
		setSize(500, 500);
		setVisible(true);
	}
}
