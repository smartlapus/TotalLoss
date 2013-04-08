import java.util.ArrayList;


public class Bedrijf {

	private String naam;
	private String adres;
	protected ArrayList<Klant> alleKlanten;
	protected ArrayList<Klus> alleKlussen;
	protected ArrayList<Monteur> alleMonteurs;
	protected ArrayList<Financien> alleFinancien;
	
	public Bedrijf(String nm, String adrs){
		naam = nm;
		adres = adrs;
		alleKlanten = new ArrayList<Klant>();
		alleMonteurs = new ArrayList<Monteur>();
		alleFinancien = new ArrayList<Financien>();
		alleKlussen = new ArrayList<Klus>();
	}
	
	public ArrayList<Klant> getAlleKlanten() {
		return alleKlanten;
	}

	public ArrayList<Klus> getAlleKlussen() {
		return alleKlussen;
	}

	public ArrayList<Monteur> getAlleMonteurs() {
		return alleMonteurs;
	}
	
	public ArrayList<Financien> getAlleFinancien() {
		return alleFinancien;
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public void voegKlantToe(Klant klant){
		if(!alleKlanten.contains(klant)){
			alleKlanten.add(klant);
			System.out.println("Klant is toegevoegd");
			System.out.println(alleKlanten);
		}
	}
	
	public void verwijderKlant(Klant klant){
		if(alleKlanten.contains(klant)){
			alleKlanten.remove(klant);
			System.out.println("Klant is verwijderd");
			System.out.println(alleKlanten);
		}
	}
	
	public void voegMonteurToe(Monteur medewerker){
		if(!alleMonteurs.contains(medewerker)){
			alleMonteurs.add(medewerker);
			System.out.println("Monteur is toegevoegd");
			System.out.println(alleMonteurs);
		}
	}
	public void voegKlusToe(Klus klus){
		if(!alleKlussen.contains(klus))
		{
			alleKlussen.add(klus);
			System.out.println("Klus is toegevoegd");
			System.out.println(alleKlussen);
		}
	}
	
	public void verwijderMonteur(Monteur monteur){
		if(alleMonteurs.contains(monteur)){
			alleMonteurs.remove(monteur);
			System.out.println("Monteur is verwijderd");
			System.out.println(alleMonteurs);
		}
	}
	
	public void verwijderKlus(Klus klus){
		if(alleKlussen.contains(klus)){
			alleKlussen.remove(klus);
			System.out.println("Klus is verwijderd");
			System.out.println(alleKlussen);
		}
	}
	
	public void voegFinancienToe(Financien fin){
		if(!alleFinancien.contains(fin))
		{
			alleFinancien.add(fin);
		}
	}
	
	public void vraagAgendaOp()
	{
		// Agenda dag + maand + jaar equals dag + maand + jaar van klus.
	}
	public void vraagBezettingOp()
	{
		//Bezetting dag + maand + jaar worden opgevraagd.
	}
}
