import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class LogIn extends JFrame implements ActionListener, KeyListener {
	
	private static final long serialVersionUID = -6748834332506278417L;
	private JTextField userName;
	private JPasswordField password;
	private JButton logInButton;
	private JPanel inputPanel;
	private JLabel userNameLabel, passwordLabel, space, space2;
	private String s; 
	private Bedrijf hetBedrijf;
	
	
	public LogIn(Bedrijf b){
		hetBedrijf = b;
		setLayout(new FlowLayout());
		setSize(500, 400);
		setLocationRelativeTo(null);
		
		space2 = new JLabel("                                            "); add(space2);
		ImageIcon imglogo = new ImageIcon("atd.png");
		JLabel imageLabel = new JLabel(imglogo); add(imageLabel);
		
		
		inputPanel = new JPanel();
		
		inputPanel.setAlignmentX(CENTER_ALIGNMENT);
		inputPanel.setPreferredSize(new Dimension(200, 150));
		add(inputPanel);
		
		space = new JLabel("                   "); inputPanel.add(space);
		userName = new JTextField(15); inputPanel.add(userName);
		password = new JPasswordField(15); inputPanel.add(password); password.addKeyListener(this);
		logInButton = new JButton("Log in"); inputPanel.add(logInButton);
		logInButton.addActionListener(this);
		
		
		setIconImage(imglogo.getImage());
		setTitle("AutoTotaalDiensten - Inloggen"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		s = userName.getText();
		char[] p = password.getPassword();
		String a = String.copyValueOf(p);
		if(click.getSource() == logInButton && s.equals("") && a.equals(""))
		{
			Hoofdmenu ingelogd = new Hoofdmenu(hetBedrijf);
			this.dispose();
		} 
		
		else
		{
			 JOptionPane.showMessageDialog(null, "De login bestaat niet.");
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent type) {
		s = userName.getText();
		char[] p = password.getPassword();
		String a = String.copyValueOf(p);
		if(type.getKeyCode() == KeyEvent.VK_ENTER && s.equals("admin") && a.equals("admin")){
			Hoofdmenu ingelogd = new Hoofdmenu(hetBedrijf);
			this.dispose();
		}
		
		if(type.getKeyCode() == KeyEvent.VK_ENTER && !s.equals("admin") && !a.equals("admin")){
			 JOptionPane.showMessageDialog(null, "De login bestaat niet.");
		}
		
		if(type.getKeyCode() == KeyEvent.VK_ENTER && s.equals("admin") && !a.equals("admin")){
			 JOptionPane.showMessageDialog(null, "De login bestaat niet.");
		}
		
		if(type.getKeyCode() == KeyEvent.VK_ENTER && !s.equals("admin") && a.equals("admin")){
			 JOptionPane.showMessageDialog(null, "De login bestaat niet.");
		}
		
	}
		
	public void setHetBoek(Bedrijf nwb) { 
		hetBedrijf = nwb;
	} 

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent type) {
		
	}
}
