/*import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LoginPage {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LoginPage() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\Downloads\\Gwent.jpg"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}*/
import java.awt.*;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage  {

	JFrame frame = new JFrame("Gwent");
	private JTextField textField;
	private JPasswordField passwordField;

	public void showLoginPage()
	{ 
		Image img = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Logo.jpg"));
		ImageIcon icon = new ImageIcon(img);
		
		Image name1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("username.jpg")); 
		ImageIcon nameicon = new ImageIcon(name1);
		
		Image password1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("password.png")); 
		ImageIcon passwordicon = new ImageIcon(password1);
		
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setSize(1920, 1200);
		frame.setVisible(true);
		
		JLabel logo = new JLabel();
		logo.setBounds(278, -146, 1377, 716);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(icon);
		logo.setVisible(true);
		
		JLabel username = new JLabel();
		username.setBounds(841, 349, 220, 325);
		username.setIcon(nameicon);
		username.setVisible(true);
		
		JLabel password = new JLabel();
		password.setIcon(passwordicon);
		password.setVisible(true);
		password.setBounds(1099, 556, 267, 407);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(username);
		frame.getContentPane().add(logo);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("微软雅黑", Font.PLAIN, 28));
		lblUsername.setBounds(775, 731, 176, 75);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(983, 753, 233, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("微软雅黑", Font.PLAIN, 28));
		lblPassword.setBounds(775, 860, 155, 31);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(983, 860, 233, 31);
		frame.getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.RED);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label.setBounds(936, 670, 72, 18);
		frame.getContentPane().add(label);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String iString = textField.getText().trim();
				if (!iString.equals("Geralt"))
				{
					label.setText("Error!");
				}
				else
				{
					Menu menu = new Menu();
					menu.showMenu();
					frame.dispose();
				}
			}
		});
		btnOk.setBounds(905, 954, 113, 27);
		frame.getContentPane().add(btnOk);
		
		SwingUtilities.updateComponentTreeUI(frame); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		LoginPage gui = new LoginPage();
		gui.showLoginPage();
	}
}

