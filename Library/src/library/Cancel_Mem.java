package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


public class Cancel_Mem extends JFrame{
	
public Cancel_Mem() {
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 784, 661);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CANCEL MEMBERSHIP");
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
		
		JLabel lblNewLabel_4 = new JLabel("Membership : ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_4.setBounds(101, 282, 198, 72);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("From : ");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		lblNewLabel_5.setBounds(304, 365, 103, 30);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("12 jun 2019");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		lblNewLabel_6.setBounds(441, 365, 162, 30);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("To : ");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		lblNewLabel_7.setBounds(323, 448, 65, 30);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("21 sept 2019");
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		lblNewLabel_8.setBounds(441, 439, 162, 39);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Cancel Membership : ");
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_9.setBounds(101, 550, 300, 39);
		add(lblNewLabel_9);
		
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBackground(new Color(255,0,0));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnNewButton.setBounds(480, 550, 160, 44);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				int i=JOptionPane.showConfirmDialog(null,"Do you want to continue","confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(i==0)
				{
					JOptionPane.showMessageDialog(null,"Canceled");
				new Student_Home();
				dispose();
				
			}}}
			);
		
		JLabel label5 = new JLabel();
		label5.setIcon(new ImageIcon("C:\\Users\\ribisht\\eclipse-workspace\\Library\\photos\\mem.png"));
		label5.setBounds(0, 0, 784, 661);
		add(label5);
		
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(500,150);
		setSize(800,700);
	}
}






