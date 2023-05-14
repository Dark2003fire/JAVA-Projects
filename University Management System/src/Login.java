

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
	
	JButton login , cancel;
	JTextField jft , jft2;
	Login(){
		
		
		getContentPane().setBackground(Color.green); // this method is used to set the background color
		
		setLayout(null);
		
		JLabel username = new JLabel("Username");
		username.setBounds(50 , 30 , 100 , 20);
		add(username);
		
		
		jft = new JTextField(); // this method is used to create the Text field 
		jft.setBounds(150 , 30 , 150 , 20); // This setBounds method is used to set the field with custom values which takes four parameters width , height , length, values.
		add(jft);
		
		
		JLabel password = new JLabel("Password");
		password.setBounds(50 , 80 , 100 ,20);
		add(password);
		
		jft2 = new JPasswordField();// I've taken a password class so users can't view the passowrds/
		jft2.setBounds(150 , 80 , 150 , 20);
		add(jft2);
		
		
		login = new JButton("Login");//This is used to create the button
		login.setBounds(40 , 140 , 120, 30);
		login.addActionListener(this);// this method is used to add event on the buttons
		login.setFont(new Font("Tahoma" ,Font.BOLD ,15)); // This is used to app;y the fonts
		add(login);
		
		cancel = new JButton("Cancel");//This is used to create the button
		cancel.setBounds(180, 140 , 120, 30);
		cancel.addActionListener(this);
		login.setFont(new Font("Tahoma" ,Font.BOLD ,15));
		add(cancel);
		
		/*
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));// This method id used to add the image or icon in the Application
		//JLabel image = new JLabel(i1); //To add image directly on the Frame we have use this method;
		Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);// To set the image with proper height and width we can use this method.
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(350 , 0 , 200 , 300);
		add(image);
		*/
		
		setSize(600  , 300);
		setLocation(700 , 300);
		setVisible(true);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		
		// This class is used to implement the interface of ActionListener 
		// actionPerformed internally calls the ActionListener.
		// We have used this because I've to apply click event on cancel buttons.
		
		if(ae.getSource()==login) {
			
			
			String username = jft.getText();
			String password = jft2.getText();
			
			String query = "Select * From login where username = '"+username+"' and password = '"+password+"' ";
			
			
			try {
				Conn c = new Conn();
				ResultSet res = c.s.executeQuery(query);
				
				
				if(res.next()) {
					
					setVisible(false);
					new Project();
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Invalid Username and Password");
					setVisible(false);
					
				}
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}else if(ae.getSource()==cancel) {
			setVisible(false);
		}
		
		
		
		
		
	}
	public static void main(String[]args) {
		
		new Login();
	}

}
