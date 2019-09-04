package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin_Login extends JFrame implements ActionListener {
	
	JLabel label1,label2,label3,label4,label5;
	JTextField username_admin;
	JPasswordField password_admin;
	JButton login;
	
	public Admin_Login() {
		
	    label1 = new JLabel(" ADMIN");
		label1.setFont(new Font("Algerian", Font.PLAIN, 60));
		label1.setBounds(300, 55, 214, 60);
		add(label1);
		
		label2 = new JLabel("AUTHENTICATION");
		label2.setFont(new Font("Algerian", Font.PLAIN, 55));
		label2.setBounds(200, 150, 450, 60);
		add(label2);
		
		label3 = new JLabel("USERNAME");
		label3.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		label3.setBounds(150, 300, 180, 50);
		add(label3);
		
		username_admin = new JTextField();
		username_admin.setBounds(350, 300, 188, 50);
		add(username_admin);
		//username_admin.setColumns(10);
		
		label4 = new JLabel("PASSWORD");
		label4.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		label4.setBounds(150, 400, 180, 50);
		add(label4);
		
		password_admin = new JPasswordField();
		password_admin.setBounds(350, 400, 195, 50);
		add(password_admin);
		
		login = new JButton("LOGIN");
		login.setBackground(new Color(250, 128, 114));
		login.setForeground(new Color(0, 0, 0));
		login.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		login.setBounds(330, 500, 107, 38);
		add(login);
		login.addActionListener(this);
			
		
		label5 = new JLabel();
		label5.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\admin_login.jpg"));
		label5.setBounds(0, 0, 784, 661);
		add(label5);
		
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(500,150);
		setSize(800,700);
	}


	public void actionPerformed(ActionEvent ae)
	{
		Object o=ae.getSource();
		if(o==login)
		{
			String username1=username_admin.getText();
			String password1=password_admin.getText();
		if(username1.equals("admin") && password1.equals("admin"))
			{
				Admin_Home ah=new Admin_Home();
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "invalid user");
			}

		}
	}
}





