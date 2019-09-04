package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Admin_Register extends JFrame{

		 JTextField txt1,txt2;
		 ButtonGroup buttonGroup = new ButtonGroup();
		 ButtonGroup buttonGroup_1 = new ButtonGroup();
		 ButtonGroup buttonGroup_2 = new ButtonGroup();
		 JTextField pnumber,user_name;
		 JPasswordField password_;
		 JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;
		 JRadioButton male,female ;
		 JComboBox state_;
		 JButton register_button;
		 
		public Admin_Register() {
			
			
			label1 = new JLabel("REGISTRATION FORM");
			label1.setFont(new Font("Times New Roman", Font.BOLD, 40));
			label1.setBounds(170, 22, 450, 70);
			add(label1);
			
			label2 = new JLabel("First Name");
			label2.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label2.setBounds(160, 150, 150, 30);
			add(label2);
			
			txt1 = new JTextField();
			txt1.setBounds(330, 150, 134, 30);
			add(txt1);
			//txt1.setColumns(10);
			
			label3 = new JLabel("Last Name");
			label3.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label3.setBounds(160, 200, 150, 29);
			add(label3);
			
			txt2 = new JTextField();
			txt2.setBounds(330, 200, 134, 30);
			add(txt2);
			//txt2.setColumns(10);
			
			label4 = new JLabel("Gender    :");
			label4.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label4.setBounds(160, 250, 150, 29);
			add(label4);
			
			male = new JRadioButton("MALE\r\n");
			buttonGroup_2.add(male);
			male.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			male.setBounds(300, 250, 81, 29);
			add(male);
			
			female = new JRadioButton("FEMALE");
			buttonGroup_2.add(female);
			female.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			female.setBounds(400, 250, 109, 29);
			add(female);
			
			label5 = new JLabel("STATE ");
			label5.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label5.setBounds(160, 300, 81, 29);
			add(label5);
			
			state_ = new JComboBox();
			state_.addItem("Punjab");
			state_.addItem("Haryana");
			state_.addItem("Chandigarh");
			state_.addItem("Delhi");
			state_.addItem("Rajasthan");
			state_.setSelectedItem(null);
			state_.setMaximumRowCount(10);
			state_.setToolTipText("");
			state_.setModel(new DefaultComboBoxModel(new String[] {"Select your state", "Punjab", "Haryana", "Chandigarh", "Delhi", "Rajasthan"}));
			state_.setSelectedIndex(0);
			state_.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
			state_.setBounds(300, 300, 185, 29);
			add(state_);
			
			label6 = new JLabel("Phone Number");
			label6.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label6.setBounds(160, 350, 150, 30);
			add(label6);
			
			pnumber = new JTextField();
			pnumber.setBounds(330, 350, 134, 30);
			add(pnumber);
			//pnumber.setColumns(10);
			
			label7 = new JLabel("USERNAME\r\n");
			label7.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label7.setBounds(160, 400, 150, 30);
			add(label7);
			
			user_name = new JTextField();
			user_name.setBounds(330, 400, 134, 30);
			add(user_name);
			//user_name.setColumns(10);
			
			label8 = new JLabel("PASSWORD");
			label8.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
			label8.setBounds(160, 450, 150, 29);
			add(label8);
			
			password_ = new JPasswordField();
			password_.setBounds(330, 450, 134, 30);
			add(password_);
			
			register_button = new JButton("register");
			register_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/*String number=pnumber.getText();
					String username=user_name.getText();
					String fname=txt1.getText();
					String lname=txt2.getText();
					String password=password_.getText();
					String gender="";
					if(male.isSelected())
					{
						gender="Male";
					}
					else if(female.isSelected())
					{
						gender="Female";
					}
					String state=(String)state_.getItemAt(state_.getSelectedIndex());
					
					boolean search=authentication.verify_no(number);
					if(search)
					{
						JOptionPane.showMessageDialog(null, "phone number already register");
						pnumber.setText(null);
					}
					if(!search)
					{
						boolean ucheck=authentication.verify_username(username);
							if(ucheck)
							{
								JOptionPane.showMessageDialog(null, "username is already taken");
								pnumber.setText(null);
							}
						 if((number=="") || (username=="") || (fname=="") || password=="" || lname=="" || gender=="") 
							{
							 JOptionPane.showMessageDialog(null, "All fields are mandatory");
							}
							else
							{
						authentication.insdata(fname, lname, number, state, username, password,gender);
						System.out.println(fname);*/
						new Admin_Home();
						dispose();
						
							//}
					//}		
					
					

				}
			});
			register_button.setBackground(new Color(255, 250, 205));
			register_button.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			register_button.setBounds(300, 540, 172, 44);
			add(register_button);
			
			label9 = new JLabel();
			label9.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\registration.jpg"));
			label9.setBounds(0, 0, 784, 661);
			add(label9);
			
			setLayout(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setLocation(500,150);
			setSize(800,700);
		}
		
		
	}








