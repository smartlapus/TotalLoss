import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.UIManager;


public class AgendaFrame extends Hoofdmenu implements ActionListener{
	private static String[] dag = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
		"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	private static String[] maand = {"1", "2", "3", "4", "5", "6", 
		"7", "8", "9", "10", "11", "12"};
	private static String[] jaar = {"2011", "2012", "2013"};
	
	//ComboBox wordt gevuld met de inhoud van de ArrayList(s)
	private JComboBox boxDag = new JComboBox(dag);
	private JComboBox boxMaand = new JComboBox(maand);
	private JComboBox boxJaar = new JComboBox(jaar);
	private JButton opvragen;
	JLabel lDag, lMaand, lJaar;
	
	public AgendaFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Agenda");
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
		
		opvragen = new JButton("Opvragen");
		opvragen.addActionListener(this);
		
		c.weightx = 0.0;
		c.gridwidth = 0;
		c.gridx = 0;
		c.gridy = 4;
		cp.add(opvragen, c);
	}
	
	public void actionPerformed(ActionEvent click){
		if(click.getSource() == menuItemAgenda1){
			AgendaFrame agenda = new AgendaFrame(hetBedrijf);
			this.dispose();
		} 
		if(click.getSource() == opvragen)
		{
			String dg = boxDag.getSelectedItem().toString();
			String md = boxMaand.getSelectedItem().toString();
			String jr = boxJaar.getSelectedItem().toString();
			
			String select  = dg + "-" + md + "-" + jr;
			String select2 = dg + "/" + md + "/" + jr;
			
			for (Klus k : hetBedrijf.alleKlussen) {
				if(select.equals(k.getDatum()) || select2.equals(k.getDatum()))
				{
					System.out.println("Klussen op deze datum:");
					System.out.println("- " + k);
				}
			}

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
		if(click.getSource() == menuItemBeheer1){
			FinancieelOverzichtFrame financieeloverzicht = new FinancieelOverzichtFrame(hetBedrijf);
			this.dispose();
		}
	}

}
