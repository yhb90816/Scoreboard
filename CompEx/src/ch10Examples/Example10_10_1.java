package ch10Examples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Example10_10_1 extends JFrame{
	public static void main(String[] args) {
		new Example10_10_1();
	}
	public Example10_10_1() {
		setTitle("�޴� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar(); //�޴��� ����
		JMenu screenMenu = new JMenu("Screen"); //�޴� ����
		menuBar.add(screenMenu); //�޴��ٿ� �޴� ����
		
		String[] item = {"Load", "Hide", "Reshow", "Exit"}; //�޴� ������ �̸� ����
		JMenuItem[] menuItem = new JMenuItem[4]; //�޴� ������ �迭 ����
		ImageIcon image = new ImageIcon("images/food.png");
		JLabel imageLabel = new JLabel(); //�̹��� ���̺� ����
		c.add(imageLabel);
		
		for(int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(item[i]); //�޴� ������ ����
			
			//�޴� �����޿� �׼� ������ ���
			menuItem[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//������ �޴� �������� ���ڿ� ����
					String itemName = e.getActionCommand();
					//�޴� �������� ���ڿ��� ���� �ٸ� �׼�
					switch(itemName) { 
					case "Load":
						//�̹� �ε��Ǿ����� ��ŵ
						if(imageLabel.getIcon() != null)
							return;
						imageLabel.setIcon(image);
						break;
					case "Hide":
						imageLabel.setVisible(false);
						break;
					case "Reshow":
						imageLabel.setVisible(true);
						break;
					case "Exit":
						System.exit(0);
						break;
					}
				}
			});
			screenMenu.add(menuItem[i]); //�޴��� �޴� ������ ����
		}
		
		setJMenuBar(menuBar); //�޴��ٸ� �����ӿ� ����
		setSize(650, 500);
		setVisible(true);
	}
}
