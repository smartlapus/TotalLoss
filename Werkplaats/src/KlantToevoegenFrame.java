import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class KlantToevoegenFrame extends Hoofdmenu implements ActionListener{

	private JLabel naam, achternaam, postcode, huisnummer, plaats, email, telnummer;
	private JTextField naaminvoer, achternaaminvoer, postcodeinvoer, huisnummerinvoer, plaatsinvoer, emailinvoer, telnummerinvoer;
	private JButton cancelbutton, savebutton;
	
	
	
	public KlantToevoegenFrame(){
		super();
		setTitle("AutoTotaalDiensten - Klant Toevoegen");
		
		 	JLabel l;
		    JTextField t;
		    JButton b;
		     Container cp = getContentPane();
		    cp.setLayout(new GridBagLayout());
		    cp.setBackground(UIManager.getColor("control"));
		    GridBagConstraints c = new GridBagConstraints();

		    c.gridx = 0;
		    c.gridy = GridBagConstraints.RELATIVE;
		    c.gridwidth = 1;
		    c.gridheight = 1;
		    c.insets = new Insets(2, 2, 2, 2);
		    c.anchor = GridBagConstraints.EAST;

		    cp.add(l = new JLabel("Voornaam:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('n');
		    cp.add(l = new JLabel("Achternaam:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('h');
		    cp.add(l = new JLabel("Postcode:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('c');
		    cp.add(l = new JLabel("Huisnummer:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('s');
		    cp.add(l = new JLabel("Plaats:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('z');
		    cp.add(l = new JLabel("Email:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('t');
		    cp.add(l = new JLabel("Tel.nummer:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('m');
		    cp.add(b = new JButton("Clear"), c);
		    b.setMnemonic('l');

		    c.gridx = 1;
		    c.gridy = 0;
		    c.weightx = 1.0;
		    c.fill = GridBagConstraints.HORIZONTAL;
		    c.anchor = GridBagConstraints.CENTER;

		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('n');
		    c.gridx = 1;
		    c.gridy = GridBagConstraints.RELATIVE;
		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('h');
		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('c');
		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('s');
		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('z');
		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('t');
		    cp.add(t = new JTextField(35), c);
		    t.setFocusAccelerator('m');
		    c.weightx = 0.0;
		    c.fill = GridBagConstraints.NONE;
		    cp.add(b = new JButton("OK"), c);
		    b.setMnemonic('o');

		    
		
		
	}
	
}
