
public class Klus {
	private String naam;
	private String werkzaamheden;
	private String kenteken;
	private String datum;
	protected Monteur monteur;
	
	public Klus (String nm, String werk, String kent, String dat){
		naam = nm;
		werkzaamheden = werk;
		kenteken = kent;
		datum = dat;
	}
	public String getNaam()
	{
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getWerkzaamheden()
	{
		return werkzaamheden;
	}
	public void setWerkzaamheden(String werkzaamheden) {
		this.werkzaamheden = werkzaamheden;
	}
	public String getKenteken()
	{
		return kenteken;
	}
	public void setKenteken(String kenteken) {
		this.kenteken = kenteken;
	}
	public String getDatum()
	{
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public void updateStatus(){
		
	}
	
	public Monteur getMonteur() {
		return monteur;
	}
	public void setMonteur(Monteur monteur) {
		this.monteur = monteur;
	}
	
	public String toString(){
		String s = naam + " " + werkzaamheden;
		return s;
		
	}
	
	public String toStringAlleGegevens(){
		String aG = naam + ". \n " + werkzaamheden + ". \n " + kenteken + ". \n " + datum; 
		return aG;
	}
	
}
