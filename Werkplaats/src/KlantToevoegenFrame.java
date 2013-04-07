import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class KlantToevoegenFrame extends Hoofdmenu implements ActionListener{

	private JLabel naam, achternaam, postcode, huisnummer, plaats, email, telnummer;
	private JTextField naaminvoer, achternaaminvoer, postcodeinvoer, huisnummerinvoer, plaatsinvoer, emailinvoer, telnummerinvoer, merkinvoer, typeinvoer, bouwjaarinvoer;
	private JButton cancelbutton, savebutton;
	
	
	public KlantToevoegenFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Klant Toevoegen");
		
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
		    cp.add(l = new JLabel("Auto Merk:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('m');
		    cp.add(l = new JLabel("Type:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('m');
		    cp.add(l = new JLabel("Bouwjaar:", SwingConstants.RIGHT), c);
		    l.setDisplayedMnemonic('m');
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
		    cp.add(merkinvoer = new JTextField(35), c);
		    merkinvoer.setFocusAccelerator('m');
		    cp.add(typeinvoer = new JTextField(35), c);
		    typeinvoer.setFocusAccelerator('m');
		    cp.add(bouwjaarinvoer = new JTextField(35), c);
		    bouwjaarinvoer.setFocusAccelerator('m');
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
			merkinvoer.setText("");
			typeinvoer.setText("");
			bouwjaarinvoer.setText("");
			JOptionPane.showMessageDialog(null, "Toevoegen is geannuleerd");
		}
		
		if(click.getSource() == savebutton){
			Klant nwk = null; 
			Auto nwa = null;
			String vnm = naaminvoer.getText();  
			String anm = achternaaminvoer.getText();
			String pcode = postcodeinvoer.getText(); 
			String huisnr = huisnummerinvoer.getText(); 
			String plts = plaatsinvoer.getText(); 
			String mail = emailinvoer.getText(); 
			String telnr = telnummerinvoer.getText();
			String merk = merkinvoer.getText();
			String type = typeinvoer.getText();
			String bouwjaar = bouwjaarinvoer.getText();
			nwk = new Klant(vnm, anm, pcode, huisnr, plts, mail, telnr);
			nwa = new Auto(merk, type, bouwjaar);
			hetBedrijf.voegKlantToe(nwk);
			nwk.setAuto(nwa);
			JOptionPane.showMessageDialog(null, "Klant is succesvol toegevoegd");
			KlantOverzichtFrame klantoverzicht = new KlantOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		//Menu actionlisteners
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
		
		if(click.getSource() == menuItemKlant3){
			KlantVerwijderenFrame klantverwijderen = new KlantVerwijderenFrame(hetBedrijf);
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
		
		if(click.getSource() == menuItemMedewerker3){
			MedewerkerVerwijderenFrame Medewerkerverwijderen = new MedewerkerVerwijderenFrame(hetBedrijf);
			this.dispose();
		}
		if(click.getSource() == menuItemParkeergarage1){
			BezettingOpvragenFrame bezettingopvragen = new BezettingOpvragenFrame(hetBedrijf);
			this.dispose();
		}
		if(click.getSource() == menuItemBeheer1){
			FinancieelOverzichtFrame financieeloverzicht = new FinancieelOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		if(click.getSource() == menuItemBeheer2){
			VoorraadOverzichtFrame voorraadoverzicht = new VoorraadOverzichtFrame(hetBedrijf);
			this.dispose();
		}
	}
	
}
