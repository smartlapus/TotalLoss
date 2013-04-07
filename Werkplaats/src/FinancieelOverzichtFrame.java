import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

public class FinancieelOverzichtFrame extends Hoofdmenu implements ActionListener {
	
	private JComboBox dropDownKwartaal;
	private JPanel p;
	String[] kwartaalKeuze = { "Selecteer een kwartaal", "Eerste kwartaal", "Tweede kwartaal", "Derde kwartaal", "Vierde kwartaal" };

	public FinancieelOverzichtFrame(Bedrijf b)
	{
		super(b);
		setTitle("AutoTotaalDiensten - Financieel Overzicht");	
		setLayout(new BorderLayout());
		
		p = new JPanel(); add(p, BorderLayout.CENTER); 
		p.setPreferredSize(new Dimension(250, 100)); 
		p.setBackground(Color.WHITE);
		
		dropDownKwartaal = new JComboBox(kwartaalKeuze);
		add(dropDownKwartaal, BorderLayout.NORTH);
		dropDownKwartaal.addActionListener(this);
	}

	public void actionPerformed(ActionEvent click) {
		Graphics g = p.getGraphics();
		if(dropDownKwartaal.getSelectedItem() == "Eerste kwartaal") {
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 1) { 
					System.out.println(f);
				} 
			}
		}else if(dropDownKwartaal.getSelectedItem() == "Tweede kwartaal") {
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 2) { 
					System.out.println(f);
				}
			}
		}else if(dropDownKwartaal.getSelectedItem() == "Derde kwartaal") {
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 3) { 
					System.out.println(f);
				} 
			}
		}else if(dropDownKwartaal.getSelectedItem() == "Vierde kwartaal") {
			for (Financien f : hetBedrijf.alleFinancien) { 
				if (f.getKwartaal() == 4) {
					System.out.println(f);
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
