import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;


public class Hoofdmenu extends JFrame implements ActionListener{
	private JMenu menuKlant, menuAgenda, menuMedewerker;
	private JMenuBar menuBar;
	private JMenuItem menuItemAgenda1, menuItemAgenda2, menuItemAgenda3;
	private JMenuItem menuItemKlant1, menuItemKlant2, menuItemKlant3;
	private JMenuItem menuItemMedewerker1, menuItemMedewerker2, menuItemMedewerker3;
	
	public Hoofdmenu(){
		setLayout(new FlowLayout());
		setSize(500, 400);
		setLocationRelativeTo(null);
		ImageIcon imglogo = new ImageIcon("ATD logo.png");
		ImageIcon imgklant = new ImageIcon("people-icon.png");
		ImageIcon imgagenda = new ImageIcon("icon-schedule-lg.png");
		ImageIcon imgmedewerker = new ImageIcon("ppl_icon.png");
		
		menuBar = new JMenuBar();
		menuKlant = new JMenu("Klanten"); menuBar.add(menuKlant);
		menuAgenda = new JMenu("Agenda"); menuBar.add(menuAgenda);
		menuMedewerker = new JMenu("Medewerkers"); menuBar.add(menuMedewerker);
		menuKlant.setIcon(imgklant);
		menuAgenda.setIcon(imgagenda);
		menuMedewerker.setIcon(imgmedewerker);
		
		//Menu Items voor Agenda
		menuItemAgenda1 = new JMenuItem("Overzicht"); menuAgenda.add(menuItemAgenda1);
		menuItemAgenda2 = new JMenuItem("Klus Toevoegen"); menuAgenda.add(menuItemAgenda2);
		menuItemAgenda3 = new JMenuItem("Klus Verwijderen"); menuAgenda.add(menuItemAgenda3);
		
		//Menu Items voor Klanten
		menuItemKlant1 = new JMenuItem("Overzicht"); menuKlant.add(menuItemKlant1);
		menuItemKlant2 = new JMenuItem("Klant Toevoegen"); menuKlant.add(menuItemKlant2);
		menuItemKlant3 = new JMenuItem("Klant Verwijderen"); menuKlant.add(menuItemKlant3);
		
		//Menu Items voor Medewerkers
		menuItemMedewerker1 = new JMenuItem("Overzicht"); menuMedewerker.add(menuItemMedewerker1);
		menuItemMedewerker2 = new JMenuItem("Medewerker Toevoegen"); menuMedewerker.add(menuItemMedewerker2);
		menuItemMedewerker3 = new JMenuItem("Medewerker Verwijderen"); menuMedewerker.add(menuItemMedewerker3);
		
		//ActionListeners voor de Menu Items
		menuItemAgenda1.addActionListener(this);
		menuItemAgenda2.addActionListener(this);
		menuItemAgenda3.addActionListener(this);
		menuItemKlant1.addActionListener(this);
		menuItemKlant2.addActionListener(this);
		menuItemKlant3.addActionListener(this);
		menuItemMedewerker1.addActionListener(this);
		menuItemMedewerker2.addActionListener(this);
		menuItemMedewerker3.addActionListener(this);
		
		setJMenuBar(menuBar);
		setIconImage(imglogo.getImage());
		setTitle("AutoTotaalDiensten - Hoofdmenu"); 
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		if(click.getSource() == menuItemAgenda1){
			KlusOverzichtFrame klusoverzicht = new KlusOverzichtFrame();
		}
		
		if(click.getSource() == menuItemAgenda3){
			KlusVerwijderenFrame klusverwijderen = new KlusVerwijderenFrame();
		}
		
		if(click.getSource() == menuItemAgenda2){
			KlusToevoegenFrame klustoevoegen = new KlusToevoegenFrame();
		}
		
		if(click.getSource() == menuItemKlant1){
			KlantOverzichtFrame klantoverzicht = new KlantOverzichtFrame();
		}
		
		if(click.getSource() == menuItemKlant2){
			KlantToevoegenFrame klanttoevoegen = new KlantToevoegenFrame();
		}
		
		if(click.getSource() == menuItemKlant3){
			KlantVerwijderenFrame klantverwijderen = new KlantVerwijderenFrame();
		}
		
		if(click.getSource() == menuItemMedewerker1){
			MedewerkerOverzichtFrame medewerkeroverzicht = new MedewerkerOverzichtFrame();
		}
		
		if(click.getSource() == menuItemMedewerker2){
			MedewerkerToevoegenFrame Medewerkertoevoegen = new MedewerkerToevoegenFrame();
		}
		
		if(click.getSource() == menuItemMedewerker3){
			MedewerkerVerwijderenFrame Medewerkerverwijderen = new MedewerkerVerwijderenFrame();
		}
		
	}

}
