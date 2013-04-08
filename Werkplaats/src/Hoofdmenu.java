import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class Hoofdmenu extends JFrame implements ActionListener{
	protected JMenu menuKlant, menuAgenda, menuMedewerker, menuGarage, menuKlus, menuBeheer;
	protected JMenuBar menuBar;
	protected JMenuItem menuItemAgenda1;
	protected JMenuItem menuItemKlus1, menuItemKlus2;
	protected JMenuItem menuItemKlant1, menuItemKlant2, menuItemKlant3;
	protected JMenuItem menuItemMedewerker1, menuItemMedewerker2, menuItemMedewerker3;
	protected JMenuItem menuItemParkeergarage1;
	protected JMenuItem menuItemBeheer1, menuItemBeheer2, menuItemBeheer3;
	protected Bedrijf hetBedrijf;
	
	public Hoofdmenu(Bedrijf b){
		hetBedrijf = b;	
		setLayout(new FlowLayout());
		setSize(520, 400);
		setLocationRelativeTo(null);
		ImageIcon imglogo = new ImageIcon("ATD logo.png");
		ImageIcon imgklant = new ImageIcon("people-icon.png");
		ImageIcon imgagenda = new ImageIcon("icon-schedule-lg.png");
		ImageIcon imgmedewerker = new ImageIcon("ppl_icon.png");
		ImageIcon imggarage = new ImageIcon("garage-icon.png");
		ImageIcon imgklus = new ImageIcon("klus-icon.png");
		ImageIcon imgbeheer = new ImageIcon("beheer-icon.png");
		

		menuBar = new JMenuBar();
		menuAgenda = new JMenu("Agenda"); menuBar.add(menuAgenda);
		menuKlant = new JMenu("Klanten"); menuBar.add(menuKlant);
		menuKlus = new JMenu("Klus"); menuBar.add(menuKlus);
		menuMedewerker = new JMenu("Medewerkers"); menuBar.add(menuMedewerker);
		menuGarage = new JMenu("Parkeergarage"); menuBar.add(menuGarage);
		menuBeheer = new JMenu("Beheer"); menuBar.add(menuBeheer);
		
		menuGarage.setIcon(imggarage);
		menuKlant.setIcon(imgklant);
		menuKlus.setIcon(imgklus);
		menuAgenda.setIcon(imgagenda);
		menuMedewerker.setIcon(imgmedewerker);
		menuBeheer.setIcon(imgbeheer);
		
		//Menu Items voor Agenda
		menuItemAgenda1 = new JMenuItem("Dagplanning"); menuAgenda.add(menuItemAgenda1);
		
		//Menu Items voor Klanten
		menuItemKlant1 = new JMenuItem("Overzicht"); menuKlant.add(menuItemKlant1);
		menuItemKlant2 = new JMenuItem("Klant Toevoegen"); menuKlant.add(menuItemKlant2);
		menuItemKlant3 = new JMenuItem("Klant Verwijderen"); menuKlant.add(menuItemKlant3);
		
		// Menu Items voor Klus
		menuItemKlus1 = new JMenuItem("Klus toevoegen"); menuKlus.add(menuItemKlus1);
		menuItemKlus2 = new JMenuItem("Klus overzicht"); menuKlus.add(menuItemKlus2);
		
		//Menu Items voor Medewerkers
		menuItemMedewerker1 = new JMenuItem("Overzicht"); menuMedewerker.add(menuItemMedewerker1);
		menuItemMedewerker2 = new JMenuItem("Medewerker Toevoegen"); menuMedewerker.add(menuItemMedewerker2);
		menuItemMedewerker3 = new JMenuItem("Medewerker Verwijderen"); menuMedewerker.add(menuItemMedewerker3);
		
		//Menu Items voor Parkeergarage
		menuItemParkeergarage1 = new JMenuItem("Bezetting opvragen"); menuGarage.add(menuItemParkeergarage1);
		
		//Menu Items voor Beheer
		menuItemBeheer1 = new JMenuItem("Financieel overzicht"); menuBeheer.add(menuItemBeheer1);
		menuItemBeheer2 = new JMenuItem("Voorraad overzicht"); menuBeheer.add(menuItemBeheer2);
		menuItemBeheer3 = new JMenuItem("Lopende Rekeningen"); menuBeheer.add(menuItemBeheer3);
		
		//ActionListeners voor de Menu Items
		menuItemAgenda1.addActionListener(this);
		menuItemKlant1.addActionListener(this);
		menuItemKlant2.addActionListener(this);
		menuItemKlant3.addActionListener(this);
		menuItemMedewerker1.addActionListener(this);
		menuItemMedewerker2.addActionListener(this);
		menuItemMedewerker3.addActionListener(this);
		menuItemKlus1.addActionListener(this);
		menuItemKlus2.addActionListener(this);
		menuItemParkeergarage1.addActionListener(this);
		menuItemBeheer1.addActionListener(this);
		menuItemBeheer2.addActionListener(this);
		menuItemBeheer3.addActionListener(this);
		
		setJMenuBar(menuBar);
		setIconImage(imglogo.getImage());
		setTitle("AutoTotaalDiensten - Hoofdmenu"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent click) {      
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
		
		if(click.getSource() == menuItemBeheer3){
			LopendeRekeningenFrame lopenderekeningen = new LopendeRekeningenFrame(hetBedrijf);
			this.dispose();
		}
		
	}
	
	public void setHetBoek(Bedrijf nwb) { 
		hetBedrijf = nwb;
	}

}
