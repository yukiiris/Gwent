import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Menu {

	JFrame frame = new JFrame("Gwent");
	
	public void showMenu()
	{	
		Image image1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("10000icon.png"));
		ImageIcon icon1 = new ImageIcon(image1);
		
		Image image2 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("50034icon.png"));
		ImageIcon icon2 = new ImageIcon(image2);
		
		Image image3 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("40002icon.png"));
		ImageIcon icon3 = new ImageIcon(image3);
		
		Image image4 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("50001icon.png"));
		ImageIcon icon4 = new ImageIcon(image4);
		
		Image image5 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("30002icon.png"));
		ImageIcon icon5 = new ImageIcon(image5);
		
		JLabel Scoiatael = new JLabel();
		Scoiatael.setIcon(icon5);
		Scoiatael.setVisible(true);
		
		JLabel Neutral = new JLabel();
		Neutral.setIcon(icon2);
		Neutral.setVisible(true);
		
		JLabel Monsters = new JLabel();
		Monsters.setIcon(icon3);
		Monsters.setVisible(true);
		
		JLabel Skellige = new JLabel();
		Skellige.setIcon(icon4);
		Skellige.setVisible(true);
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel NorthernRealms = new JLabel();
		NorthernRealms.setIcon(icon1);
		NorthernRealms.setVisible(true);
		
		CardLayout cardLayout = new CardLayout();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(302, 13, 239, 516);
		panel.setLayout(cardLayout);
		panel.add("1", NorthernRealms);
		panel.add("2", Neutral);
		panel.add("3",Monsters);
		panel.add("4", Skellige);
		panel.add("5", Scoiatael);
		frame.getContentPane().add(panel);
		
		JButton btnNorthern = new JButton("Northern Realms");
		btnNorthern.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NorthernRealms northernRealms = new NorthernRealms();
				northernRealms.show();
				frame.dispose();
			}
		});
		btnNorthern.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardLayout.show(panel, "1");
			}
		});
		btnNorthern.setForeground(Color.BLACK);
		btnNorthern.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		btnNorthern.setBounds(66, 53, 169, 45);
		frame.getContentPane().add(btnNorthern);
		
		JButton btnNewButton = new JButton("Neutral");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardLayout.show(panel, "2");
			}
		});
		btnNewButton.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		btnNewButton.setBounds(66, 148, 169, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Monsters");
		btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardLayout.show(panel, "3");
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		btnNewButton_1.setBounds(66, 246, 169, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Skellige");
		btnNewButton_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardLayout.show(panel, "4");
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		btnNewButton_2.setBounds(66, 345, 169, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Scoiatael");
		btnNewButton_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardLayout.show(panel, "5");
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		btnNewButton_3.setBounds(66, 447, 169, 45);
		frame.getContentPane().add(btnNewButton_3);
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		Menu menu = new Menu();
		menu.showMenu();
	}
}