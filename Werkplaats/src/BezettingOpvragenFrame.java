import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JComboBox;

public class BezettingOpvragenFrame extends Hoofdmenu implements ActionListener {
	// ArrayLists voor de dagen, maanden en jaren
	private static String[] dag = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
		"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	private static String[] maand = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	private static String[] jaar = {"2011", "2012", "2013"};
	
	//ComboBox wordt gevuld met de inhoud van de ArrayList(s)
	private JComboBox boxDag = new JComboBox(dag);
	private JComboBox boxMaand = new JComboBox(maand);
	private JComboBox boxJaar = new JComboBox(jaar);
	private JLabel lDag = new JLabel("dag"); 
	private JLabel lMaand = new JLabel("maand"); 
	private JLabel lJaar = new JLabel("jaar"); 
	private JButton Opvragen = new JButton("Opvragen");
	public BezettingOpvragenFrame()
	{
		super();
		setTitle("AutoTotaalDiensten - Bezettingen opvragen");
		Container cp = getContentPane();
		cp.setLayout(new GridBagLayout());
		cp.setBackground(UIManager.getColor("control"));
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = GridBagConstraints.RELATIVE;
		c.gridwidth = 1;
		c.gridheight = 2;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.EAST;
		
		//Labels, Comboboxen en button worden toegevoegd aan de container
		cp.add(lDag); cp.add(lMaand);cp.add(lJaar);
		cp.add(boxDag);cp.add(boxMaand);cp.add(boxJaar);
		cp.add(Opvragen);
	}
}
