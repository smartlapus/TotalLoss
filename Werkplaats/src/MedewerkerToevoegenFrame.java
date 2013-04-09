import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;

public class MedewerkerToevoegenFrame extends Hoofdmenu implements ActionListener{

	private JLabel naam, achternaam, postcode, huisnummer, plaats, email, telnummer;
	private JTextField naaminvoer, achternaaminvoer, postcodeinvoer, huisnummerinvoer, plaatsinvoer, emailinvoer, telnummerinvoer, bsninvoer, reknummerinvoer;
	private JButton cancelbutton, savebutton;
	
	
	public MedewerkerToevoegenFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Medewerker Toevoegen");
		
		 	JLabel l;
		    //JTextField t;
		    //JButton b;
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
		    cp.add(l = new JLabel("Tel. nummer:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('m');
		    cp.add(l = new JLabel("BSN nummer:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('s');
		    cp.add(l = new JLabel("Rekeningnummer:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('r');
		    cp.add(cancelbutton = new JButton("Clear"), c);
		    cancelbutton.setMnemonic('l');

		    c.gridx = 1;
		    c.gridy = 0;
		    c.weightx = 1.0;
		    c.fill = GridBagConstraints.HORIZONTAL;
		    c.anchor = GridBagConstraints.CENTER;

		    cp.add(naaminvoer = new JTextField(35), c);
		    naaminvoer.setFocusAccelerator('n');
		    c.gridx = 1;
		    c.gridy = GridBagConstraints.RELATIVE;
		    cp.add(achternaaminvoer = new JTextField(35), c);
		    achternaaminvoer.setFocusAccelerator('h');
		    cp.add(postcodeinvoer = new JTextField(35), c);
		    postcodeinvoer.setFocusAccelerator('c');
		    cp.add(huisnummerinvoer = new JTextField(35), c);
		    huisnummerinvoer.setFocusAccelerator('s');
		    cp.add(plaatsinvoer = new JTextField(35), c);
		    plaatsinvoer.setFocusAccelerator('z');
		    cp.add(emailinvoer = new JTextField(35), c);
		    emailinvoer.setFocusAccelerator('t');
		    cp.add(telnummerinvoer = new JTextField(35), c);
		    telnummerinvoer.setFocusAccelerator('m');
		    cp.add(bsninvoer = new JTextField(35), c);
		    bsninvoer.setFocusAccelerator('m');
		    cp.add(reknummerinvoer = new JTextField(35), c);
		    reknummerinvoer.setFocusAccelerator('m');
		    c.weightx = 0.0;
		    c.fill = GridBagConstraints.NONE;
		    cp.add(savebutton = new JButton("OK"), c);
		    savebutton.setMnemonic('o');

		    cancelbutton.addActionListener(this);
		    savebutton.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent click){
		if(click.getSource() == cancelbutton){
			naaminvoer.setText("");
			achternaaminvoer.setText("");
			postcodeinvoer.setText("");
			huisnummerinvoer.setText("");
			plaatsinvoer.setText("");
			emailinvoer.setText("");
			telnummerinvoer.setText("");
			bsninvoer.setText("");
			reknummerinvoer.setText("");
			JOptionPane.showMessageDialog(null, "Toevoegen is geannuleerd");
		}
		
		if(click.getSource() == savebutton)
		{
			Monteur nwm = null; 
			String vnm = naaminvoer.getText();  
			String anm = achternaaminvoer.getText();
			String pcode = postcodeinvoer.getText(); 
			String huisnr = huisnummerinvoer.getText(); 
			String plts = plaatsinvoer.getText(); 
			String mail = emailinvoer.getText(); 
			String telnr = telnummerinvoer.getText();
			String bsn = bsninvoer.getText();
			String reknr = reknummerinvoer.getText();
			if(vnm.equals("") || anm.equals("") || anm.equals("") || pcode.equals("") || huisnr.equals("") 
					 || plts.equals("") || mail.equals("") || telnr.equals("") || bsn.equals("") 
					 || reknr.equals(""))
			{
				JOptionPane.showMessageDialog(null, "AUB alle velden invoeren");
			}
			
			if(vnm.matches(".*[0-9].*") || anm.matches(".*[0-9].*") || plts.matches(".*[0-9].*"))
			{
				JOptionPane.showMessageDialog(null, "U heeft een cijfer ingevuld bij één of meerdere velden: \n"
						+ vnm + "\n" + anm + "\n" + plts);
			}
			else if(!vnm.equals("") && !anm.equals("") && !anm.equals("") && !pcode.equals("") && !huisnr.equals("") 
					 && !plts.equals("") && !mail.equals("") && !telnr.equals("") && !bsn.equals("") 
					 && !reknr.equals(""))
			{
				nwm = new Monteur(vnm, anm, pcode, huisnr, plts, mail, telnr, bsn, reknr);
				hetBedrijf.voegMonteurToe(nwm);
				JOptionPane.showMessageDialog(null, "Medewerker is succesvol toegevoegd");
				MedewerkerOverzichtFrame medewerkeroverzicht = new MedewerkerOverzichtFrame(hetBedrijf);
				this.dispose();
			}
		}
		
		
		if(click.getSource() == menuItemAgenda1){
			AgendaFrame agenda = new AgendaFrame(hetBedrijf);
			this.dispose();
		} 
		
		if(click.getSource() == menuItemKlus1){
			KlusToevoegenFrame klustoevoegen = new KlusToevoegenFrame(hetBedrijf);
			this.dispose();
		}
		if(click.getSource() == menuItemKlus2){
			KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemKlant1){
			KlantOverzichtFrame klantoverzicht = new KlantOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemKlant2){
			KlantToevoegenFrame klanttoevoegen = new KlantToevoegenFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemMedewerker1){
			MedewerkerOverzichtFrame medewerkeroverzicht = new MedewerkerOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemMedewerker2){
			MedewerkerToevoegenFrame Medewerkertoevoegen = new MedewerkerToevoegenFrame(hetBedrijf);
			this.dispose();
		}
		if(click.getSource() == menuItemBeheer1){
			FinancieelOverzichtFrame financieeloverzicht = new FinancieelOverzichtFrame(hetBedrijf);
			this.dispose();
		}
	}
	
}
