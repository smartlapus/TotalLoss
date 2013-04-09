import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.text.DecimalFormat;

public class KlusToevoegenFrame extends Hoofdmenu implements ActionListener {
	private JLabel naam, werkzaamheden, kenteken, datum;
	private JTextField naamInvoer, werkzaamhedenInvoer, kentekenInvoer, datumInvoer;
	private JButton cancelbutton, savebutton;
	private JComboBox dropDownMonteurs;
	private JTextField tfNaam, tfWerkzaamheden, tfKenteken, tfDatum;
	private JPanel contactPanel;

	public KlusToevoegenFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Klus Toevoegen");
		
		//Panel
		contactPanel = new JPanel();
		//contactPanel.setBorder(new TitledBorder( "Klus toevoegen" )); 
		contactPanel.setLayout(new GridLayout(6, 2, 5, 5));
		add(contactPanel, BorderLayout.NORTH);
		
		//Labels & Textfields
	    JLabel l1 = new JLabel("Naam: "); contactPanel.add(l1); // test
		tfNaam = new JTextField(9); contactPanel.add(tfNaam);  
		  
		JLabel l2 = new JLabel("Werkzaamheen: "); contactPanel.add(l2); 
		tfWerkzaamheden = new JTextField(9); contactPanel.add(tfWerkzaamheden);  
		  
		JLabel l3 = new JLabel("Kenteken: "); contactPanel.add(l3); 
		tfKenteken = new JTextField(9); contactPanel.add(tfKenteken); 
		  
		JLabel l4 = new JLabel("Datum: "); contactPanel.add(l4); 
		tfDatum = new JTextField(9); contactPanel.add(tfDatum); 
		  
		JLabel l5 = new JLabel("Uitvoerende Monteur: "); contactPanel.add(l5); 
		dropDownMonteurs = new JComboBox(hetBedrijf.getAlleMonteurs().toArray(new Monteur[0]));
		dropDownMonteurs.addActionListener(this); contactPanel.add(dropDownMonteurs);
		  
		savebutton = new JButton("Opslaan"); contactPanel.add(savebutton); savebutton.addActionListener(this);
		cancelbutton = new JButton("Annuleren"); contactPanel.add(cancelbutton); cancelbutton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent click) {
		if(click.getSource() == cancelbutton) {
			naamInvoer.setText("");
			werkzaamhedenInvoer.setText("");
			kentekenInvoer.setText("");
			datumInvoer.setText("");
			JOptionPane.showMessageDialog(null, "Toevoegen is geannuleerd");
		}
		
		
		
		
		if(click.getSource() == savebutton) {
			
			Klus nwk = null; 
			Object obj = dropDownMonteurs.getSelectedItem();
			Monteur m = (Monteur)obj;
			String vnm = tfNaam.getText();  
			String werk = tfWerkzaamheden.getText(); 
			String kent = tfKenteken.getText(); 
			String dat = tfDatum.getText();
			nwk = new Klus(vnm, werk, kent, dat);
			
		
			int date_check = tfDatum.getText().length();
			
			//Input Checks
			if(vnm.equals("") || werk.equals("") || kent.equals("") || dat.equals("")) {
				JOptionPane.showMessageDialog(null, "AUB alle velden invoeren");
			} 
			else if(date_check < 10)
			{
				JOptionPane.showMessageDialog(null, "Datum format: dd-mm-yyyy");
			}
			else if(vnm.matches(".*[0-9].*")) {
				JOptionPane.showMessageDialog(null, "De naam van de klus mag geen cijfer bevatten.");
			} else if (obj instanceof Monteur) {
				hetBedrijf.voegKlusToe(nwk);
				nwk.setMonteur(m);
				JOptionPane.showMessageDialog(null, "Klus is succesvol toegevoegd");
				KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame(hetBedrijf);
				this.dispose();
			}	
		}
		
		//Menu actionListeners
		if(click.getSource() == menuItemAgenda1) {
			AgendaFrame agenda = new AgendaFrame(hetBedrijf);
			this.dispose();
		} 
		
		if(click.getSource() == menuItemKlus1) {
			KlusToevoegenFrame klustoevoegen = new KlusToevoegenFrame(hetBedrijf);
			this.dispose();
		}
		if(click.getSource() == menuItemKlus2) {
			KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemKlant1) {
			KlantOverzichtFrame klantoverzicht = new KlantOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemKlant2) {
			KlantToevoegenFrame klanttoevoegen = new KlantToevoegenFrame(hetBedrijf);
			this.dispose();
		}
		
		
		if(click.getSource() == menuItemMedewerker1) {
			MedewerkerOverzichtFrame medewerkeroverzicht = new MedewerkerOverzichtFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemMedewerker2) {
			MedewerkerToevoegenFrame Medewerkertoevoegen = new MedewerkerToevoegenFrame(hetBedrijf);
			this.dispose();
		}
		
		if(click.getSource() == menuItemBeheer1) {
			FinancieelOverzichtFrame financieeloverzicht = new FinancieelOverzichtFrame(hetBedrijf);
			this.dispose();
		}
	}
}
