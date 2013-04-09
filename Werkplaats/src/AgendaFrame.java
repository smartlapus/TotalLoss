import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class AgendaFrame extends Hoofdmenu implements ActionListener {
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
	private JTable tabel;
	JLabel lDag, lMaand, lJaar;
	
	private DefaultTableModel model = new DefaultTableModel(
			new Object[][] { { "", "", "" } }, new Object[] { "Klus", "Werkzaamheden", "Monteur" });
	
	public AgendaFrame(Bedrijf b) {
		super(b);
		setTitle("AutoTotaalDiensten - Agenda");
		setLayout(new FlowLayout());
		
		//Labels, Comboboxen en button worden toegevoegd aan de container
		
		add(boxDag); 
		add(boxMaand);  
		add(boxJaar); 
		
		opvragen = new JButton("Opvragen");
		opvragen.addActionListener(this);
		add(opvragen);
		
		tabel = new JTable(model); 
		add(new JScrollPane(tabel));
	}
	
	//ClearTable functie
	public void clearTable() {
		while (tabel.getRowCount() > 0) {
            ((DefaultTableModel) tabel.getModel()).removeRow(0);
        }
	}
	
	public void actionPerformed(ActionEvent click) {
		if(click.getSource() == opvragen) {
			
			//Datum ophalen
			String dg = boxDag.getSelectedItem().toString();
			String md = boxMaand.getSelectedItem().toString();
			String jr = boxJaar.getSelectedItem().toString();
			
			//Formatten
			DecimalFormat df = new DecimalFormat("00");
			dg = df.format(Integer.parseInt(dg));
			md = df.format(Integer.parseInt(md));
			jr = df.format(Integer.parseInt(jr));
			
			String select  = dg + "-" + md + "-" + jr;
			String select2 = dg + "/" + md + "/" + jr;
			
			clearTable();
			
			for (Klus k : hetBedrijf.alleKlussen) {
				if(select.equals(k.getDatum()) || select2.equals(k.getDatum())) {
					model.addRow(new Object[]{k.getNaam(), k.getWerkzaamheden(), k.getMonteur()});
				}
			}

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
