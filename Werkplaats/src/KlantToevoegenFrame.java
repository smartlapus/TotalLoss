import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class KlantToevoegenFrame extends Hoofdmenu implements ActionListener{

	private JLabel naam;
	private JTextField naaminvoer;
	
	public KlantToevoegenFrame(){
		super();
		setTitle("AutoTotaalDiensten - Klant Toevoegen");
		
		/* -- Naam -- */
		JLabel naam = new JLabel("Voornaam:");
		add(naam); naam.setVisible(true);
		JTextField naaminvoer = new JTextField(""); naaminvoer.setPreferredSize(new Dimension(80,20));
		add(naaminvoer); naaminvoer.setVisible(true);
		
		/* -- Achternaam -- */
		JLabel naam = new JLabel("Achternaam:");
		add(naam); naam.setVisible(true);
		JTextField naaminvoer = new JTextField(""); naaminvoer.setPreferredSize(new Dimension(80,20));
		add(naaminvoer); naaminvoer.setVisible(true);
		
	}

}
