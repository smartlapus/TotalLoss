
public class Financien {
	
	private String soort, datum;
	private int kwartaal, bedrag;

	public Financien(int kw, String srt, int bd, String dt){
		kwartaal = kw;
		soort = srt;
		bedrag = bd;
		datum = dt;
	}

	public int getKwartaal() {
		return kwartaal;
	}

	public void setKwartaal(int kw) {
		this.kwartaal = kw;
	}

	public String getSoort() {
		return soort;
	}

	public void setSoort(String srt) {
		this.soort = srt;
	}

	public int getBedrag() {
		return bedrag;
	}

	public void setBedrag(int bd) {
		this.bedrag = bd;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String dt) {
		this.datum = dt;
	}

	public String toString(){
		String s = soort + " " + bedrag;
		return s;	
	}
}
