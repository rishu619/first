package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Faculty_Login extends JFrame implements ActionListener{
	

	JLabel label1,label2,label3,label4,label5;
	JTextField textField;
	JPasswordField passwordField;
    JButton login,signup;
	
	 public Faculty_Login() { 
		
		label1 = new JLabel("USERNAME\r\n");
		label1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		label1.setBounds(180, 270, 130, 40);
		add(label1);
		
		textField = new JTextField();
		textField.setBounds(340, 270, 151, 40);
		add(textField);
		//textField.setColumns(10);
		
	    label2 = new JLabel("PASSWORD");
		label2.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		label2.setBounds(180, 360, 130, 40);
		add(label2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(340, 360, 151, 40);
		add(passwordField);
		
		login = new JButton("LOGIN");
		login.setBackground(new Color(224, 255, 255));
		login.setFont(new Font("Arial Black",Font.BOLD, 16));
		login.setBounds(350, 450, 119, 37);
		login.addActionListener(this);
        add(login);
		
		
		label3 = new JLabel("NEW USER");
		label3.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		label3.setBounds(180, 540, 130, 37);
		add(label3);
		
		signup = new JButton("SIGN UP");
		signup.setBackground(new Color(250, 128, 114));
		signup.setFont(new Font("Arial Black", Font.BOLD, 16));
		signup.setBounds(350, 540, 119, 37);
		signup.addActionListener(this);
		add(signup);
		
		
		label4 = new JLabel();
		label4.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\faculty.png"));
		label4.setBounds(280, 30, 250, 200);
		add(label4);
		
		JLabel label5 = new JLabel();
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
			/*Object o=ae.getSource();
			if(o==login)
			{
				String username=textField.getText();
				String password=passwordField.getText();
				
				System.out.println(username+ "   "+password);
				boolean status=authentication.verifyperson(username, password);
				if(status)
				{
					UserHome lp=new UserHome();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "invalid user");
					textField.setText("");
					passwordField.setText("");
				}
			}
			
			if(o==signup)
			{
				new user_registration();
				dispose();
			}*/
		}
}








