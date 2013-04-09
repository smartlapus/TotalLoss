import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MedewerkerOverzichtFrame extends Hoofdmenu implements ActionListener {

	private JComboBox dropDownMedewerkers;
	private JTextField tfVoor, tfAchter, tfEmail, tfPostcode, tfPlaats, tfHuisnummer, tfTelnummer, tfBSN, tfReknummer;
	private JPanel contactPanel;
	private JButton pasAan, slaOp, verwijder;
	
	public MedewerkerOverzichtFrame(Bedrijf b) {
		super(b);
		setTitle("AutoTotaalDiensten - Overzicht van Medewerkers");
		setLayout(new BorderLayout());
		setSize(520, 500);
		
		dropDownMedewerkers = new JComboBox(hetBedrijf.getAlleMonteurs().toArray(new Monteur[0]));
		add(dropDownMedewerkers, BorderLayout.NORTH);
		dropDownMedewerkers.addActionListener(this);
		
		//Panel
		contactPanel = new JPanel();
		contactPanel.setBorder(new TitledBorder( "Gegevens van de Medewerker" )); 
		contactPanel.setLayout(new GridLayout(10, 2, 5, 5));
		add(contactPanel, BorderLayout.SOUTH);
		 
		//Labels
		JLabel l1 = new JLabel("Voornaam: "); contactPanel.add(l1);
		tfVoor = new JTextField(9); tfVoor.setEditable(false); contactPanel.add(tfVoor);  
		  
		JLabel l2 = new JLabel("Achternaam: "); contactPanel.add(l2); 
		tfAchter = new JTextField(9); tfAchter.setEditable(false); contactPanel.add(tfAchter);  
		  
		JLabel l3 = new JLabel("Postcode: "); contactPanel.add(l3); 
		tfPostcode = new JTextField(9); tfPostcode.setEditable(false);   contactPanel.add(tfPostcode); 
		  
		JLabel l4 = new JLabel("Huisnummer: "); contactPanel.add(l4); 
		tfHuisnummer = new JTextField(9); tfHuisnummer.setEditable(false);   contactPanel.add(tfHuisnummer); 
		  
		JLabel l5 = new JLabel("Plaats: "); contactPanel.add(l5); 
		tfPlaats = new JTextField(9); tfPlaats.setEditable(false);   contactPanel.add(tfPlaats); 
		  
		JLabel l6 = new JLabel("Email-adres: "); contactPanel.add(l6); 
		tfEmail = new JTextField(9); tfEmail.setEditable(false);   contactPanel.add(tfEmail); 
		  
		JLabel l7 = new JLabel("Telefoonnummer: "); contactPanel.add(l7); 
		tfTelnummer = new JTextField(9); tfTelnummer.setEditable(false);   contactPanel.add(tfTelnummer);
		  
		JLabel l8 = new JLabel("BSN-nummer: "); contactPanel.add(l8); 
		tfBSN = new JTextField(9); tfBSN.setEditable(false);   contactPanel.add(tfBSN); 
		  
		JLabel l9 = new JLabel("Rekeningnummer: "); contactPanel.add(l9); 
		tfReknummer = new JTextField(9); tfReknummer.setEditable(false);   contactPanel.add(tfReknummer);
		  
		pasAan = new JButton("Aanpassen"); contactPanel.add(pasAan); pasAan.addActionListener(this);
		verwijder = new JButton("Verwijderen"); contactPanel.add(verwijder); verwijder.addActionListener(this);
		slaOp = new JButton("Opslaan"); slaOp.addActionListener(this);
		
		onSelectedItemChanged();
	}
	
	private void onSelectedItemChanged() {
		Object obj = dropDownMedewerkers.getSelectedItem();
		if (obj instanceof Monteur) {
			Monteur m = (Monteur)obj;
			tfVoor.setText(m.getVoornaam());
			tfAchter.setText(m.getAchternaam());
			tfEmail.setText(m.getEmail());
			tfPostcode.setText(m.getPostcode());
			tfHuisnummer.setText(m.getHuisnr());
			tfPlaats.setText(m.getPlaats());
			tfTelnummer.setText(m.getTelnummer());
			tfBSN.setText(m.getBsnnr());
			tfReknummer.setText(m.getReknummer());
		} else {
			tfVoor.setText("");
			tfAchter.setText("");
			tfEmail.setText("");
			tfPostcode.setText("");
			tfHuisnummer.setText("");
			tfPlaats.setText("");
			tfTelnummer.setText("");
			tfBSN.setText("");
			tfReknummer.setText("");
			}
		}
	public void actionPerformed(ActionEvent click) {  
		  if (click.getSource() == dropDownMedewerkers) {
			  onSelectedItemChanged();
		  } 
		  
		  if (click.getSource() == pasAan) {
				tfVoor.setEditable(true);
				tfAchter.setEditable(true);
				tfEmail.setEditable(true);
				tfPostcode.setEditable(true);
				tfHuisnummer.setEditable(true);
				tfPlaats.setEditable(true);
				tfTelnummer.setEditable(true);
				tfBSN.setEditable(true);
				tfReknummer.setEditable(true);
				pasAan.setVisible(false);
				contactPanel.remove(pasAan);
				contactPanel.add(slaOp);
			}
		  
		  	if(click.getSource() == verwijder) {
			  Object obj = dropDownMedewerkers.getSelectedItem();
				if (obj instanceof Monteur) {
					Monteur m = (Monteur)obj;
					
				int option = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u de medewerker '" + m  + "' wilt verwijderen?", "Bevestiging",JOptionPane.YES_NO_OPTION);
						
				if(option == JOptionPane.YES_OPTION) {
					hetBedrijf.verwijderMonteur(m);
					JOptionPane.showMessageDialog(null, "Medewerker '" + m + "' is verwijderd.");
					
				} else {
					return;
				}

				MedewerkerOverzichtFrame medewerkeroverzicht = new MedewerkerOverzichtFrame(hetBedrijf);
					this.dispose();
				}
		  }
		  
		  if (click.getSource() == slaOp) {
			  Object obj = dropDownMedewerkers.getSelectedItem();
			
					if(tfVoor.getText().equals("") || tfAchter.getText().equals("")
							 || tfPostcode.getText().equals("") || tfHuisnummer.getText().equals("") 
							 || tfPlaats.getText().equals("") || tfTelnummer.getText().equals("") 
							 || tfBSN.getText().equals("") || tfReknummer.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "AUB alle velden invoeren");
					}
					
					if(tfVoor.getText().matches(".*[0-9].*") || tfAchter.getText().matches(".*[0-9].*") 
							|| tfPlaats.getText().matches(".*[0-9].*"))
					{
						JOptionPane.showMessageDialog(null, "U heeft een cijfer ingevuld bij één of meerdere velden: \n"
								+ tfVoor.getText() + "\n" + tfAchter.getText() + "\n" + tfPlaats.getText());
					}
				    else if (obj instanceof Monteur) {
				    	Monteur k = (Monteur)obj;
						k.setVoornaam(tfVoor.getText());
						k.setAchternaam(tfAchter.getText());
						k.setEmail(tfEmail.getText());
						k.setPostcode(tfPostcode.getText());
						k.setHuisnr(tfHuisnummer.getText());
						k.setPlaats(tfPlaats.getText());
						k.setTelnummer(tfTelnummer.getText());
						k.setBsnnr(tfBSN.getText());
						k.setReknummer(tfReknummer.getText());
						JOptionPane.showMessageDialog(null, "Medewerker is succesvol aangepast");
						MedewerkerOverzichtFrame medewerkeroverzicht = new MedewerkerOverzichtFrame(hetBedrijf);
						this.dispose();
					}
		  }
		  
		  //Menu actionListeners
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
