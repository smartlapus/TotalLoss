import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class KlantOverzichtFrame extends Hoofdmenu implements ActionListener{

	private JComboBox dropDownKlanten;
	private JTextField tfVoor, tfAchter, tfEmail, tfPostcode, tfPlaats, tfHuisnummer, tfTelnummer;
	private JPanel contactPanel;
	
	public KlantOverzichtFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Overzicht van klanten");
		setLayout(new BorderLayout());
		
		dropDownKlanten = new JComboBox(hetBedrijf.getAlleKlanten().toArray(new Klant[0]));
		add(dropDownKlanten, BorderLayout.NORTH);
		dropDownKlanten.addActionListener(this);
		
		 contactPanel = new JPanel();
		 contactPanel.setBorder(new TitledBorder( "Gegevens van de klant" )); 
		 contactPanel.setLayout(new GridLayout(7, 2, 5, 5));
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
			}
		
		else{
			tfVoor.setText("");
			tfAchter.setText("");
			tfEmail.setText("");
			tfPostcode.setText("");
			tfHuisnummer.setText("");
			tfPlaats.setText("");
			tfTelnummer.setText("");
			}
		}
	public void actionPerformed(ActionEvent ae) {  
		  if (ae.getSource() == dropDownKlanten){
			  onSelectedItemChanged();
		  } 
	}
}
