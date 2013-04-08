import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class KlusOverzichtFrame extends Hoofdmenu implements ActionListener{

	private JComboBox dropDownKlus;
	private JTextField tfNaam, tfWerkzaamheden, tfKenteken, tfDatum, tfMonteur;
	private JPanel contactPanel;
	private JButton pasAan, slaOp, verwijder;
	public KlusOverzichtFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Overzicht van klussen");
		
		setLayout(new BorderLayout());
		setSize(520, 300);
		
		dropDownKlus = new JComboBox(hetBedrijf.getAlleKlussen().toArray(new Klus[0]));
		add(dropDownKlus, BorderLayout.CENTER);
		dropDownKlus.addActionListener(this);
		
		 contactPanel = new JPanel();
		 contactPanel.setBorder(new TitledBorder( "Gegevens van de Klus" )); 
		 contactPanel.setLayout(new GridLayout(7, 2, 5, 5));
		 add(contactPanel, BorderLayout.SOUTH);
		
		 JLabel l1 = new JLabel("Naam: "); contactPanel.add(l1);
		 tfNaam = new JTextField(9); tfNaam.setEditable(false); contactPanel.add(tfNaam); 
		 
		 JLabel l2 = new JLabel("Werkzaamheden: "); contactPanel.add(l2);
		 tfWerkzaamheden = new JTextField(9); tfWerkzaamheden.setEditable(false); contactPanel.add(tfWerkzaamheden); 
		 
		 JLabel l3 = new JLabel("Kenteken: "); contactPanel.add(l3);
		 tfKenteken = new JTextField(9); tfKenteken.setEditable(false); contactPanel.add(tfKenteken); 
		 
		 JLabel l4 = new JLabel("Datum: "); contactPanel.add(l4);
		 tfDatum = new JTextField(9); tfDatum.setEditable(false); contactPanel.add(tfDatum); 
		 
		 JLabel l5 = new JLabel("Uitvoerende Monteur: "); contactPanel.add(l5);
		 tfMonteur = new JTextField(9); tfMonteur.setEditable(false); contactPanel.add(tfMonteur); 
		 
		 pasAan = new JButton("Aanpassen"); contactPanel.add(pasAan); pasAan.addActionListener(this);
		 verwijder = new JButton("Verwijderen"); contactPanel.add(verwijder); verwijder.addActionListener(this);
		 slaOp = new JButton("Opslaan"); slaOp.addActionListener(this);
		 
		 onSelectedItemChanged();
	}
	
	private void onSelectedItemChanged()
	{
		Object obj = dropDownKlus.getSelectedItem();
		if (obj instanceof Klus)
		{
			Klus k = (Klus)obj;
			tfNaam.setText(k.getNaam());
			tfWerkzaamheden.setText(k.getWerkzaamheden());
			tfKenteken.setText(k.getKenteken());
			tfDatum.setText(k.getDatum());
			tfMonteur.setText(k.monteur.getVoornaam() + k.monteur.getAchternaam());
		}
		else
		{
			tfNaam.setText("");
			tfWerkzaamheden.setText("");
			tfKenteken.setText("");
			tfDatum.setText("");
			tfMonteur.setText("");
		}
	}
	public void actionPerformed(ActionEvent click){
		
		if (click.getSource() == dropDownKlus){
			  onSelectedItemChanged();
		  } 
		  
		  if (click.getSource() == pasAan){
				tfNaam.setEditable(true);
				tfWerkzaamheden.setEditable(true);
				tfKenteken.setEditable(true);
				tfDatum.setEditable(true);
				pasAan.setVisible(false);
				contactPanel.remove(pasAan);
				contactPanel.add(slaOp);
			}
		  
		  if(click.getSource() == verwijder){
			  Object obj = dropDownKlus.getSelectedItem();
				if (obj instanceof Klus){
					Klus k = (Klus)obj;
					hetBedrijf.verwijderKlus(k);
					JOptionPane.showMessageDialog(null, "Klus is succesvol verwijderd");
					KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame(hetBedrijf);
					this.dispose();
				}
		  }
		  
		  if (click.getSource() == slaOp){
			  Object obj = dropDownKlus.getSelectedItem();
				if (obj instanceof Klus){
					Klus k = (Klus)obj;
					k.setNaam(tfNaam.getText());
					k.setWerkzaamheden(tfWerkzaamheden.getText());
					k.setKenteken(tfKenteken.getText());
					k.setDatum(tfDatum.getText());
					JOptionPane.showMessageDialog(null, "Klus is succesvol aangepast");
					KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame(hetBedrijf);
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
