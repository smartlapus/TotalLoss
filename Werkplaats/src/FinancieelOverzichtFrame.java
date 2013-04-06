import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JComboBox;

public class FinancieelOverzichtFrame extends Hoofdmenu implements ActionListener {
	
	private JComboBox dropDownKwartaal;
	String[] kwartaalKeuze = { "Selecteer een kwartaal", "Eerste kwartaal", "Tweede kwartaal", "Derde kwartaal", "Vierde kwartaal" };

	public FinancieelOverzichtFrame(Bedrijf b)
	{
		super(b);
		setTitle("AutoTotaalDiensten - Financieel Overzicht");	
		setLayout(new BorderLayout());
		
		dropDownKwartaal = new JComboBox(kwartaalKeuze);
		add(dropDownKwartaal, BorderLayout.NORTH);
		dropDownKwartaal.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
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
    }
}
