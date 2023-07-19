package market.page;

import market.member.Admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdminLoginDialog extends JDialog {

	JTextField pwField, idField;
	public boolean isLogin = false;

	public AdminLoginDialog(JFrame frame, String str) {
		super(frame, "�����ڷα���", true);

		Font ft;
		ft = new Font("���ʷҵ���", Font.BOLD, 15);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 400) / 2, (screenSize.height - 300) / 2);
		setSize(400, 300);
		setLayout(null);

		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 20, 400, 50);
		add(titlePanel);
		JLabel titleLabel = new JLabel("������ �α���");
		titleLabel.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		titlePanel.add(titleLabel);

		JPanel idPanel = new JPanel();
		idPanel.setBounds(0, 70, 400, 50);
		add(idPanel);
		JLabel idLabel = new JLabel("�� �� �� : ");
		idLabel.setFont(ft);
		idField = new JTextField(10);
		idField.setFont(ft);
		idPanel.add(idLabel);
		idPanel.add(idField);

		JPanel pwPanel = new JPanel();
		pwPanel.setBounds(0, 120, 400, 50);
		add(pwPanel);
		JLabel pwLabel = new JLabel("��й�ȣ : ");
		pwLabel.setFont(ft);
		pwField = new JTextField(10);
		pwField.setFont(ft);
		pwPanel.add(pwLabel);
		pwPanel.add(pwField);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 170, 400, 50);
		add(buttonPanel);
		JLabel okLabel = new JLabel("Ȯ��");
		okLabel.setFont(ft);
		JButton okButton = new JButton();
		okButton.add(okLabel);
		buttonPanel.add(okButton);

		JLabel cancelLabel = new JLabel("���");
		cancelLabel.setFont(ft);
		JButton cancelBtn = new JButton();
		cancelBtn.add(cancelLabel);
		buttonPanel.add(cancelBtn);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Admin admin = new Admin();
				System.out.println(pwField.getText() + idField.getText());
				System.out.println(admin.getId() + admin.getPassword());
				if (admin.getId().equals(idField.getText()) && admin.getPassword().equals(pwField.getText())) {
					isLogin = true;
					dispose();
				} else
					JOptionPane.showMessageDialog(okButton, "������ ������ ��ġ���� �ʽ��ϴ�");
			}
		});

		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isLogin = false;
				dispose();
			}
		});
	}
}