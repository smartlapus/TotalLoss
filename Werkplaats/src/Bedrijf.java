import java.util.ArrayList;


public class Bedrijf {

	private String naam;
	private String adres;
	protected ArrayList<Klant> alleKlanten;
	private ArrayList<Klus> alleKlussen;
	protected ArrayList<Monteur> alleMonteurs;
	
	
	public Bedrijf(String nm, String adrs){
		naam = nm;
		adres = adrs;
		alleKlanten = new ArrayList<Klant>();
		alleMonteurs = new ArrayList<Monteur>();
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
		if(!alleKlanten.contains(klant))
		{
			alleKlanten.add(klant);
			System.out.println("Klant is toegevoegd");
			System.out.println(alleKlanten);
		}
	}
	
	public void voegMonteurToe(Monteur medewerker){
		if(!alleMonteurs.contains(medewerker))
		{
			alleMonteurs.add(medewerker);
			System.out.println("Monteur is toegevoegd");
			System.out.println(alleMonteurs);
		}
	}
	
	public void voegAfspraakToe(){
		
	}
}
