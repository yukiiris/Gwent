import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NorthernRealms {

	JFrame frame = new JFrame("Northern Realms");
	
	public void show()
	{
		Image add = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("add.jpg"));
		ImageIcon addicon = new ImageIcon(add);
		
		Image image1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("N-Henselt.png"));
		ImageIcon icon1 = new ImageIcon(image1);
		
		Image image2 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("N-Keira Metz.png"));
		ImageIcon icon2 = new ImageIcon(image2);
		
		Image image3 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("N-Promote.png"));
		ImageIcon icon3 = new ImageIcon(image3);
		
		Image image4 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("N-Radovid.png"));
		ImageIcon icon4 = new ImageIcon(image4);
		
		Image image5 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("N-Ves.png"));
		ImageIcon icon5 = new ImageIcon(image5);
		
		JLabel jadd = new JLabel();
		jadd.setSize(235, 122);
		jadd.setLocation(82, 418);
		jadd.setIcon(addicon);
		jadd.setVisible(true);
		frame.getContentPane().add(jadd);
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon1);
		label1.setVisible(true);
		
		JLabel label2 = new JLabel();
		label2.setIcon(icon2);
		label2.setVisible(true);
		
		JLabel label3 = new JLabel();
		label3.setIcon(icon3);
		label3.setVisible(true);
		
		JLabel label4 = new JLabel();
		label4.setIcon(icon4);
		label4.setVisible(true);
		
		JLabel label5 = new JLabel();
		label5.setIcon(icon5);
		label5.setVisible(true);
		
		
		
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setSize(600, 600);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		JPanel picpanel = new JPanel();
		picpanel.setBackground(SystemColor.window);
		CardLayout piccardLayout = new CardLayout();
		picpanel.setLayout(piccardLayout);
		picpanel.add("1", label1);
		picpanel.add("2", label2);
		picpanel.add("3", label3);
		picpanel.add("4", label4);
		picpanel.add("5", label5);
		picpanel.setBounds(36, 48, 281, 293);
		frame.getContentPane().add(picpanel);
		
		
		
		JLabel wlabel1 = new JLabel("Henselt");
		wlabel1.setFont(new Font("Brush Script Std", Font.PLAIN, 26));
		
		JLabel wlable2 = new JLabel("Keira Metz");
		wlable2.setFont(new Font("Brush Script Std", Font.PLAIN, 25));
		
		JLabel wlabel3 = new JLabel("Promote");
		wlabel3.setFont(new Font("Brush Script Std", Font.PLAIN, 25));
		
		JLabel wlabel4 = new JLabel("Radovid");
		wlabel4.setFont(new Font("Brush Script Std", Font.PLAIN, 25));
		
		JLabel wlabel5 = new JLabel("Ves");
		wlabel5.setFont(new Font("Brush Script Std", Font.PLAIN, 25));
		
		JPanel wordpanel = new JPanel();
		wordpanel.setBackground(SystemColor.textHighlightText);
		CardLayout wordcardLayout = new CardLayout();
		wordpanel.setLayout(wordcardLayout);
		wordpanel.add(wlabel1);
		wordpanel.add(wlable2);
		wordpanel.add(wlabel3);
		wordpanel.add(wlabel4);
		wordpanel.add(wlabel5);
		wordpanel.setBounds(124, 354, 150, 59);
		frame.getContentPane().add(wordpanel);
		
		JTextArea textArea1 = new JTextArea("    Convert all units on one of your rows to Gold until removed from the battlefield or the round ends.");
		textArea1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 21));
		textArea1.setLineWrap(true);
		textArea1.setEditable(false);
		JTextArea textArea2 = new JTextArea("Give a shield to all non-Gold units on the row. "
				+ "The shield protects its bearer from one strength-removing effect.");
		textArea2.setFont(new Font("微软雅黑 Light", Font.PLAIN, 21));
		textArea2.setEditable(false);
		textArea2.setLineWrap(true);
		
		JTextArea textArea3 = new JTextArea("Convert all instances of a non-Gold unit on your "
				+ "side of the battlefield to Gold until removed from the battlefield or the round ends.");
		textArea3.setFont(new Font("微软雅黑 Light", Font.PLAIN, 21));
		textArea3.setEditable(false);
		textArea3.setLineWrap(true);
		
		JTextArea textArea4 = new JTextArea("Remove 8 strength from any unit.");
		textArea4.setEditable(false);
		textArea4.setFont(new Font("微软雅黑 Light", Font.PLAIN, 21));
		textArea4.setLineWrap(true);
		
		JTextArea textArea5 = new JTextArea("Play a Blue Stripes Commando from your "
				+ "deck whenever a Gold card appears on your side.");
		textArea5.setEditable(false);
		textArea5.setFont(new Font("微软雅黑 Light", Font.PLAIN, 21));
		textArea5.setLineWrap(true);
		
		JPanel textpanel = new JPanel();
		CardLayout text = new CardLayout();
		textpanel.setLayout(text);
		textpanel.add(textArea1);
		textpanel.add(textArea2);
		textpanel.add(textArea3);
		textpanel.add(textArea4);
		textpanel.add(textArea5);
		textpanel.setBounds(361, 98, 156, 265);
		frame.getContentPane().add(textpanel);
		
		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				piccardLayout.next(picpanel);
				wordcardLayout.next(wordpanel);
				text.next(textpanel);
			}
		});
		
		btnNext.setFont(new Font("微软雅黑 Light", Font.PLAIN, 17));
		btnNext.setBounds(404, 431, 113, 27);
		frame.getContentPane().add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				piccardLayout.previous(picpanel);
				wordcardLayout.previous(wordpanel);
				text.previous(textpanel);
			}
		});
		btnPrevious.setFont(new Font("微软雅黑 Light", Font.PLAIN, 17));
		btnPrevious.setBounds(404, 492, 113, 27);
		SwingUtilities.updateComponentTreeUI(frame); 
		frame.getContentPane().add(btnPrevious);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu menu = new Menu();
				menu.showMenu();
				frame.dispose();
			}
		});
		btnMenu.setFont(new Font("微软雅黑 Light", Font.PLAIN, 17));
		btnMenu.setBounds(404, 376, 113, 27);
		frame.getContentPane().add(btnMenu);
	}
	
	public static void main(String args[])
	{
		NorthernRealms i = new NorthernRealms();
		i.show();
	}
}
