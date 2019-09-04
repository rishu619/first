package library;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;

import javax.swing.*;

public class Add_Book extends JFrame{
	
	public Add_Book()
	{
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 784, 661);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   ADD NEW BOOK");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 45));
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
		
		JLabel lblNewLabel_4 = new JLabel("Name of book : ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_4.setBounds(100, 271, 246, 36);
		add(lblNewLabel_4);
		
		JTextField txtPanchatatra = new JTextField();
		txtPanchatatra.setText("Panchatatra");
		txtPanchatatra.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		txtPanchatatra.setBounds(356, 271, 290, 36);
		add(txtPanchatatra);
		txtPanchatatra.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("    Author : ");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_5.setBounds(100, 352, 246, 29);
		add(lblNewLabel_5);
		
		 JTextField txtHcVerma = new JTextField();
		txtHcVerma.setText("hc verma");
		txtHcVerma.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		txtHcVerma.setBounds(356, 352, 290, 31);
		add(txtHcVerma);
		txtHcVerma.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("    Price : ");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_6.setBounds(126, 428, 185, 36);
		add(lblNewLabel_6);
		
		JTextField txtRs = new JTextField();
		txtRs.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		txtRs.setText("150 RS");
		txtRs.setBounds(356, 428, 290, 35);
		add(txtRs);
		txtRs.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("   Publisher : ");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_7.setBounds(100, 499, 213, 36);
		add(lblNewLabel_7);
		
		JTextField txtSkBooks = new JTextField();
		txtSkBooks.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		txtSkBooks.setText("Sk books");
		txtSkBooks.setBounds(356, 499, 290, 35);
		add(txtSkBooks);
		txtSkBooks.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("  Edition : ");
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_8.setBounds(126, 571, 169, 29);
		add(lblNewLabel_8);
		
		JTextField txtndEdition = new JTextField();
		txtndEdition.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		txtndEdition.setText("2nd edition");
		txtndEdition.setBounds(356, 571, 290, 31);
		add(txtndEdition);
		txtndEdition.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
		btnNewButton.setBounds(253, 625, 147, 36);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Added");
				new Admin_Home();
				dispose();
			}
		}); 
		
		JLabel label9 = new JLabel();
		label9.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\add.jpg"));
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

	
	
	



