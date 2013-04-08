import java.awt.*; 
import java.awt.event.*; 
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FinancieelOverzichtFrame extends Hoofdmenu implements ActionListener {
	
	private JComboBox dropDownKwartaal;
	private JTable tabel;
	private JScrollPane scrollPane;
	private DefaultTableModel model = new DefaultTableModel(new Object[][] {
	{ "", "", "" } }, new Object[] { "Af/bij", "Bedrag", "Datum" });
	String[] kwartaalKeuze = { "Selecteer een kwartaal", "Eerste kwartaal", "Tweede kwartaal", "Derde kwartaal", "Vierde kwartaal" };

	public FinancieelOverzichtFrame(Bedrijf b)
	{
		super(b);
		setTitle("AutoTotaalDiensten - Financieel Overzicht");	
		setLayout(new BorderLayout());

		dropDownKwartaal = new JComboBox(kwartaalKeuze);
		add(dropDownKwartaal, BorderLayout.NORTH);
		dropDownKwartaal.addActionListener(this);
		
		tabel = new JTable(model); 
		add(new JScrollPane(tabel), BorderLayout.CENTER);
	}
	
	public void clearTable()
	{
		while (tabel.getRowCount() > 0) {
            ((DefaultTableModel) tabel.getModel()).removeRow(0);
        }
	}

	public void actionPerformed(ActionEvent click) {
		if(dropDownKwartaal.getSelectedItem() == "Eerste kwartaal") {
			clearTable();
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 1) {
					model.addRow(new Object[]{f.getSoort(), f.getBedrag(), f.getDatum()});
				} 
			}
		}else if(dropDownKwartaal.getSelectedItem() == "Tweede kwartaal") {
			clearTable();
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 2) { 
					model.addRow(new Object[]{f.getSoort(), f.getBedrag(), f.getDatum()});
				}
			}
		}else if(dropDownKwartaal.getSelectedItem() == "Derde kwartaal") {
			clearTable();
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 3) { 
					model.addRow(new Object[]{f.getSoort(), f.getBedrag(), f.getDatum()});
				} 
			}
		}else if(dropDownKwartaal.getSelectedItem() == "Vierde kwartaal") {
			clearTable();
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 4) {
					model.addRow(new Object[]{f.getSoort(), f.getBedrag(), f.getDatum()});
				} 
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
