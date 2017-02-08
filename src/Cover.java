import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cover
{
	/**
	 * Initialize the contents of the frame.
	 */
	public void cover() 
	{
		final JFrame frame = new JFrame("Gwent");
		JLabel gwent = new JLabel();
		gwent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage loginPage = new LoginPage();
				loginPage.showLoginPage();
				frame.dispose();
			}
		});
		Image img=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Gwent.jpg"));
	    ImageIcon icon = new ImageIcon(img);
		gwent.setIcon(icon);
	    gwent.setVisible(true);
	    
	    frame.getContentPane().add(gwent);
	    frame.setSize(1920, 1200);
	    frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	
	public static void main(String args[])
	{
		Cover cover = new Cover();
		cover.cover();
	}
}
