import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;

public class KlusToevoegenFrame extends Hoofdmenu implements ActionListener{

	private JLabel naam, werkzaamheden, kenteken, datum;
	private JTextField naamInvoer, werkzaamhedenInvoer, kentekenInvoer, datumInvoer;
	private JButton cancelbutton, savebutton;

	public KlusToevoegenFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Klus Toevoegen");
		
		JLabel l;
	    JTextField t;
	   // JButton b1, b2;
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
	    cp.add(l = new JLabel("Werkzaamheden:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('w');
	    cp.add(l = new JLabel("Kenteken:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('k');
	    cp.add(l = new JLabel("Datum:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('s');
	    cp.add(cancelbutton = new JButton("Clear"), c);
	    cancelbutton.setMnemonic('C');
	    c.gridx = 1;
	    c.gridy = 0;
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.anchor = GridBagConstraints.CENTER;

	    cp.add(naamInvoer = new JTextField(35), c);
	    naamInvoer.setFocusAccelerator('n');
	    c.gridx = 1;
	    c.gridy = GridBagConstraints.RELATIVE;
	   
	    cp.add(werkzaamhedenInvoer = new JTextField(35), c);
	    werkzaamhedenInvoer.setFocusAccelerator('h');
	    cp.add(kentekenInvoer = new JTextField(35), c);
	    kentekenInvoer.setFocusAccelerator('c');
	    cp.add(datumInvoer = new JTextField(35), c);
	    datumInvoer.setFocusAccelerator('s');
	    c.weightx = 0.0;
	    c.fill = GridBagConstraints.NONE;
	    cp.add(savebutton = new JButton("OK"), c);
	    savebutton.setMnemonic('o');
	    
	    cancelbutton.addActionListener(this);
	    savebutton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent click){
		if(click.getSource() == cancelbutton){
			naamInvoer.setText("");
			werkzaamhedenInvoer.setText("");
			kentekenInvoer.setText("");
			datumInvoer.setText("");
			JOptionPane.showMessageDialog(null, "Toevoegen is geannuleerd");
		}
		if(click.getSource() == savebutton){
			Klus nwk = null; 
			String vnm = naamInvoer.getText();  
			String werk = werkzaamhedenInvoer.getText(); 
			String kent = kentekenInvoer.getText(); 
			String dat = datumInvoer.getText(); 
			nwk = new Klus(vnm, werk, kent, dat);
			hetBedrijf.voegKlusToe(nwk);
			
			JOptionPane.showMessageDialog(null, "Klus is succesvol toegevoegd");
			KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame(hetBedrijf);
			this.dispose();
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
