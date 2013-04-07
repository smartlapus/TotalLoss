import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class VoorraadOverzichtFrame extends Hoofdmenu implements ActionListener {

	public VoorraadOverzichtFrame(Bedrijf b)
	{
		super(b);
		setTitle("AutoTotaalDiensten - Voorraad");
		
		JLabel l;
	    JButton button;
	    Container cp = getContentPane();
	    cp.setLayout(new GridBagLayout());
	    cp.setBackground(UIManager.getColor("control"));
	    GridBagConstraints c = new GridBagConstraints();

	    c.gridx = 0;
	    c.gridy = GridBagConstraints.RELATIVE;
	    c.gridwidth = 1;
	    c.gridheight = 1;
	    c.insets = new Insets(0, 0, 2, 2);
	    
	   
	    cp.add(l = new JLabel("Geen onderdeel", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Geen onderdeel", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('w');
	    cp.add(l = new JLabel("Geen onderdeel", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('k');
	    cp.add(l = new JLabel("Geen onderdeel", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('s');
	    
	    c.gridx = 1;
	    c.gridy = 0;
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.anchor = GridBagConstraints.CENTER;

	    c.gridx = 1;
	    c.gridy = GridBagConstraints.RELATIVE;
	   
	    c.weightx = 7.0;
	    c.fill = GridBagConstraints.NONE;
	    
	    cp.add(l = new JLabel("Geen prijs", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Geen Prijs", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Geen prijs", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Geen prijs", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    
	    c.gridx = 1;
	    c.gridy = 0;
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.anchor = GridBagConstraints.CENTER;

	    c.gridx = 5;
	    c.gridy = GridBagConstraints.RELATIVE;
	   
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.NONE;
	    cp.add(l = new JLabel("Leverancier: Geen gegevens", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Leverancier: Geen gegevens", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Leverancier: Geen gegevens", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Leverancier: Geen gegevens", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    
	    c.gridx = 1;
	    c.gridy = 0;
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.anchor = GridBagConstraints.CENTER;

	    c.gridx = 0;
	    c.gridy = GridBagConstraints.RELATIVE;
	   
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.NONE;
	    cp.add(button = new JButton("Bestelling plaatsen"), c);
	    button.setMnemonic('1');
	    cp.add(button = new JButton("Voorraad aanpassen"), c);
	    button.setMnemonic('1');
	    
	}
		public void ActionPerformed(ActionEvent click){
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
