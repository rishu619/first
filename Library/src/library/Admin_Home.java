package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin_Home extends JFrame implements ActionListener {
	
	JLabel label1;
	JButton acc,check,return_,add,renew,update,cancel;
	
	public Admin_Home()
	{
		label1 = new JLabel("Hello! Admin");
		label1.setFont(new Font("Trebuchet MS", Font.BOLD, 45));
		label1.setBounds(270, 50, 500, 37);
		add(label1);
		
		acc = new JButton("Account");
		acc.setBackground(new Color(255, 222, 173));
		acc.setFont(new Font("Arial Black",Font.BOLD, 16));
		acc.setBounds(80, 200, 130, 110);
		acc.addActionListener(this);
        add(acc);
        
        check = new JButton("Available Books");
		check.setBackground(new Color(224, 255, 255));
		check.setFont(new Font("Arial Black",Font.BOLD, 16));
		check.setBounds(280, 200, 210, 110);
		check.addActionListener(this);
        add(check);
        
        return_ = new JButton("Fine");
		return_.setBackground(new Color(240, 230, 140));
		return_.setFont(new Font("Arial Black",Font.BOLD, 16));
		return_.setBounds(580, 200, 130, 110);
		return_.addActionListener(this);
        add(return_);
        
        add = new JButton("Add Book");
		add.setBackground(new Color(240, 230, 140));
		add.setFont(new Font("Arial Black",Font.BOLD, 16));
		add.setBounds(80, 400, 130, 110);
		add.addActionListener(this);
        add(add);
        
        update= new JButton("Register Member");
		update.setBackground(new Color(224, 255, 255));
		update.setFont(new Font("Arial Black",Font.BOLD, 14));
		update.setBounds(280, 400, 210, 110);
		update.addActionListener(this);
        add(update);
        
        cancel= new JButton("Cancel Membership");
		cancel.setBackground(new Color(255, 222, 173));
		cancel.setFont(new Font("Arial Black",Font.BOLD, 15));
		cancel.setBounds(560, 400, 215, 120);
		cancel.addActionListener(this);
        add(cancel);
        
        JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\home.png"));
		label.setBounds(0, 0, 784, 661);
		add(label);

		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(500,150);
		setSize(800,700);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Object o = ae.getSource();
		
		if(o==cancel)
		{
			new Admin_Cancel();
			dispose();
		}
		if(o==update)
		{
			new Admin_Register();
			dispose();
		}
		if(o==add)
		{
			new Add_Book();
			dispose();
		}
	}
	
	public static void main(String[] args) {
		new Admin_Home();
	}

}



