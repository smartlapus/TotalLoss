import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;

public class KlusToevoegenFrame extends Hoofdmenu implements ActionListener{

	private JLabel naam, werkzaamheden, kenteken, datum;
	private JTextField naamInvoer, werkzaamhedenInvoer, kentekenInvoer, datumInvoer;
	private JButton cancelbutton, savebutton;

	public KlusToevoegenFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Klus Toevoegen");
		
		JLabel l;
	    JTextField t;
	    //JButton b;
	    Container cp = getContentPane();
	    cp.setLayout(new GridBagLayout());
	    cp.setBackground(UIManager.getColor("control"));
	    GridBagConstraints c = new GridBagConstraints();

	    c.gridx = 0;
	    c.gridy = GridBagConstraints.RELATIVE;
	    c.gridwidth = 1;
	    c.gridheight = 1;
	    c.insets = new Insets(2, 2, 2, 2);
	    c.anchor = GridBagConstraints.EAST;
	   
	    cp.add(l = new JLabel("Voornaam:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('n');
	    cp.add(l = new JLabel("Werkzaamheden:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('w');
	    cp.add(l = new JLabel("Kenteken:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('k');
	    cp.add(l = new JLabel("Datum:", SwingConstants.RIGHT), c);
	    l.setDisplayedMnemonic('s');
	    //cp.add(b = new JButton("Clear"), c);
	    //b.setMnemonic('1');
	    c.gridx = 1;
	    c.gridy = 0;
	    c.weightx = 1.0;
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.anchor = GridBagConstraints.CENTER;

	    cp.add(t = new JTextField(35), c);
	    t.setFocusAccelerator('n');
	    c.gridx = 1;
	    c.gridy = GridBagConstraints.RELATIVE;
	   
	    cp.add(t = new JTextField(35), c);
	    t.setFocusAccelerator('h');
	    cp.add(t = new JTextField(35), c);
	    t.setFocusAccelerator('c');
	    cp.add(t = new JTextField(35), c);
	    t.setFocusAccelerator('s');
	    c.weightx = 0.0;
	    c.fill = GridBagConstraints.NONE;
	    //cp.add(b = new JButton("OK"), c);
	   //b.setMnemonic('o');
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
