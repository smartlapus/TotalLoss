import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class KlantOverzichtFrame extends Hoofdmenu implements ActionListener{

	private JComboBox dropDownKlanten;
	private JTextField tfVoor, tfAchter, tfEmail, tfPostcode, tfPlaats, tfHuisnummer, tfTelnummer, tfAutomerk, tfAutojaar, tfAutotype;
	private JPanel contactPanel;
	private JButton pasAan, slaOp, verwijder;
	
	public KlantOverzichtFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Overzicht van klanten");
		setLayout(new BorderLayout());
		setSize(520, 500);
		
		dropDownKlanten = new JComboBox(hetBedrijf.getAlleKlanten().toArray(new Klant[0]));
		add(dropDownKlanten, BorderLayout.NORTH);
		dropDownKlanten.addActionListener(this);
		
		 contactPanel = new JPanel();
		 contactPanel.setBorder(new TitledBorder( "Gegevens van de klant" )); 
		 contactPanel.setLayout(new GridLayout(11, 2, 5, 5));
		 add(contactPanel, BorderLayout.SOUTH);
		 
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
		  
		  JLabel l8 = new JLabel("Automerk: "); contactPanel.add(l8); 
		  tfAutomerk = new JTextField(9); tfAutomerk.setEditable(false);   contactPanel.add(tfAutomerk);
		  
		  JLabel l9 = new JLabel("Type: "); contactPanel.add(l9); 
		  tfAutotype = new JTextField(9); tfAutotype.setEditable(false);   contactPanel.add(tfAutotype);
		  
		  JLabel l10 = new JLabel("Bouwjaar: "); contactPanel.add(l10); 
		  tfAutojaar = new JTextField(9); tfAutojaar.setEditable(false);   contactPanel.add(tfAutojaar); 
		  
		  pasAan = new JButton("Aanpassen"); contactPanel.add(pasAan); pasAan.addActionListener(this);
		  verwijder = new JButton("Verwijderen"); contactPanel.add(verwijder); verwijder.addActionListener(this);
		  slaOp = new JButton("Opslaan"); slaOp.addActionListener(this);
		
		  onSelectedItemChanged();
	}
	private void onSelectedItemChanged(){
		Object obj = dropDownKlanten.getSelectedItem();
		if (obj instanceof Klant){
			Klant k = (Klant)obj;
			tfVoor.setText(k.getVoornaam());
			tfAchter.setText(k.getAchternaam());
			tfEmail.setText(k.getEmail());
			tfPostcode.setText(k.getPostcode());
			tfHuisnummer.setText(k.getHuisnr());
			tfPlaats.setText(k.getPlaats());
			tfTelnummer.setText(k.getTelnummer());
			tfAutomerk.setText(k.auto.getMerk());
			tfAutotype.setText(k.auto.getType());
			tfAutojaar.setText(k.auto.getBouwjaar());
			}
		
		else{
			tfVoor.setText("");
			tfAchter.setText("");
			tfEmail.setText("");
			tfPostcode.setText("");
			tfHuisnummer.setText("");
			tfPlaats.setText("");
			tfTelnummer.setText("");
			tfAutomerk.setText("");
			tfAutotype.setText("");
			tfAutojaar.setText("");
			}
	}
		
		
	public void actionPerformed(ActionEvent click) {  
		  if (click.getSource() == dropDownKlanten){
			  onSelectedItemChanged();
		  } 
		  
		  if (click.getSource() == pasAan){
				tfVoor.setEditable(true);
				tfAchter.setEditable(true);
				tfEmail.setEditable(true);
				tfPostcode.setEditable(true);
				tfHuisnummer.setEditable(true);
				tfPlaats.setEditable(true);
				tfTelnummer.setEditable(true);
				tfAutomerk.setEditable(true);
				tfAutotype.setEditable(true);
				tfAutojaar.setEditable(true);
				pasAan.setVisible(false);
				contactPanel.remove(pasAan);
				contactPanel.add(slaOp);
			}
		  
		  if(click.getSource() == verwijder){
			  Object obj = dropDownKlanten.getSelectedItem();
				if (obj instanceof Klant){
					Klant k = (Klant)obj;
										
					int option = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u de klant '" + k  + "' wilt verwijderen?", "Bevestiging",JOptionPane.YES_NO_OPTION);
					
					if(option == JOptionPane.YES_OPTION){
						hetBedrijf.verwijderKlant(k);
						JOptionPane.showMessageDialog(null, "Klant '" + k + "' is verwijderd.");
						
					}
					else{
						return;
					}
					
					
				
					KlantOverzichtFrame klantoverzicht = new KlantOverzichtFrame(hetBedrijf);
					this.dispose();
				}
		  }
		  
		  if (click.getSource() == slaOp){
			  Object obj = dropDownKlanten.getSelectedItem();
				if (obj instanceof Klant){
					Klant k = (Klant)obj;
					k.setVoornaam(tfVoor.getText());
					k.setAchternaam(tfAchter.getText());
					k.setEmail(tfEmail.getText());
					k.setPostcode(tfPostcode.getText());
					k.setHuisnr(tfHuisnummer.getText());
					k.setPlaats(tfPlaats.getText());
					k.setTelnummer(tfTelnummer.getText());
					k.auto.setMerk(tfAutomerk.getText());
					k.auto.setType(tfAutotype.getText());
					k.auto.setBouwjaar(tfAutojaar.getText());
					JOptionPane.showMessageDialog(null, "Klant is succesvol aangepast");
					KlantOverzichtFrame klantoverzicht = new KlantOverzichtFrame(hetBedrijf);
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
