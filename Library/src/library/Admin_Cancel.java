package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Admin_Cancel extends JFrame  {
	
	public Admin_Cancel() {
	 
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 784, 661);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cancel Membership");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_1.setBounds(162, 34, 484, 79);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID : 645373");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 152, 169, 46);
		add(lblNewLabel_2);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  

		JLabel lblNewLabel_3 = new JLabel(formatter.format(date));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3.setBounds(550, 152, 224, 46);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student Full Name : ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_4.setBounds(80, 311, 295, 61);
		add(lblNewLabel_4);
		
		JTextField txtRishab = new JTextField();
		txtRishab.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		txtRishab.setText("rishab");
		txtRishab.setBounds(416, 311, 262, 47);
		add(txtRishab);
		txtRishab.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Student ID : ");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_5.setBounds(96, 420, 289, 36);
		add(lblNewLabel_5);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		textField.setText("7678");
		textField.setBounds(416, 420, 273, 36);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		btnNewButton.setBounds(338, 556, 177, 46);
		btnNewButton.setBackground(new Color(255,0,0));
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				int i=JOptionPane.showConfirmDialog(null,"Do you want to continue","confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(i==0)
				{
					JOptionPane.showMessageDialog(null,"Deleted");
				new Admin_Home();
				dispose();
				}
			}
		}
			);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\admin_cancel.jpg"));
		label.setBounds(0, 0, 784, 661);
		add(label);

		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(500,150);
		setSize(800,700);
	}
}



