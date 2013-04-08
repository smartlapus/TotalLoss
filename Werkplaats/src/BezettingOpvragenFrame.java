import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JComboBox;

public class BezettingOpvragenFrame extends Hoofdmenu implements ActionListener {
	// ArrayLists voor de dagen, maanden en jaren
	private static String[] dag = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
		"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	private static String[] maand = {"Januari", "Februari", "Maart", "April", "Mei", "Juni", 
		"Juli", "Augustus", "September", "Oktober", "November", "December"};
	private static String[] jaar = {"2011", "2012", "2013"};
	
	//ComboBox wordt gevuld met de inhoud van de ArrayList(s)
	private JComboBox boxDag = new JComboBox(dag);
	private JComboBox boxMaand = new JComboBox(maand);
	private JComboBox boxJaar = new JComboBox(jaar);
	JButton Opvragen;
	JLabel lDag, lMaand, lJaar;
	
	
	public BezettingOpvragenFrame(Bedrijf b)
	{
		super(b);
		setTitle("AutoTotaalDiensten - Bezettingen opvragen");
		Container cp = getContentPane();
		cp.setLayout(new GridBagLayout());
		cp.setBackground(UIManager.getColor("control"));
		GridBagConstraints c = new GridBagConstraints();

		//Labels, Comboboxen en button worden toegevoegd aan de container
		
		
		lDag = new JLabel("Dag");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 2;
		cp.add(lDag, c);
		
		lMaand = new JLabel("Maand");
		c.fill = GridBagConstraints.HORIZONTAL;
		cp.add(lMaand, c);
		
		lJaar = new JLabel("Jaar");
		c.fill = GridBagConstraints.HORIZONTAL;
		cp.add(lJaar, c);
		
		cp.add(boxDag);cp.add(boxMaand);cp.add(boxJaar);
		
		Opvragen = new JButton("Opvragen");
		c.weightx = 0.0;
		c.gridwidth = 0;
		c.gridx = 0;
		c.gridy = 4;
		cp.add(Opvragen, c);
	}
	
	public void ActionPerformed(ActionEvent click){
		
		if(click.getSource() == Opvragen)
		{
			Agenda nwa = null; 
			String dg = boxDag.getSelectedItem().toString();
			String md = boxMaand.getSelectedItem().toString();
			String jr = boxJaar.getSelectedItem().toString();
			nwa = new Agenda(dg, md, jr);
			hetBedrijf.vraagBezettingOp(); //Methode uit Bedrijf, dag maand en jaar opvragen
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
