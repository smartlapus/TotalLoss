import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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


public class LogIn extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -6748834332506278417L;
	private JTextField userName;
	private JPasswordField password;
	private JButton logInButton;
	private JPanel inputPanel;
	private JLabel userNameLabel, passwordLabel, space, space2;
	private String s; 
	
	
	public LogIn(){
		
		setLayout(new FlowLayout());
		setSize(500, 400);
		setLocationRelativeTo(null);
		space2 = new JLabel("                                            "); add(space2);
		ImageIcon imglogo = new ImageIcon("ATD logo.png");
		JLabel imageLabel = new JLabel(imglogo); add(imageLabel);
		
		inputPanel = new JPanel();
		
		//inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		inputPanel.setAlignmentX(CENTER_ALIGNMENT);
		inputPanel.setPreferredSize(new Dimension(200, 150));
		//TitledBorder lineBorder = BorderFactory.createTitledBorder("Log In");
		//inputPanel.setBorder(lineBorder);
		add(inputPanel);
		
		space = new JLabel("                   "); inputPanel.add(space);
		userName = new JTextField(15); inputPanel.add(userName);
		password = new JPasswordField(15); inputPanel.add(password);
		logInButton = new JButton("Log in"); inputPanel.add(logInButton);
		logInButton.addActionListener(this);
		
		
		setIconImage(imglogo.getImage());
		setTitle("AutoTotaalDiensten - Inloggen"); 
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		s = userName.getText();
		char[] p = password.getPassword();
		String a = String.copyValueOf(p);
		if(click.getSource() == logInButton && s.equals("Dion Iseger") && a.equals("123"))
		{
			Hoofdmenu ingelogd = new Hoofdmenu();
		} 
		
		else
		{
			 JOptionPane.showMessageDialog(null, "De login bestaat niet.");
		}
		
		
	}

}
