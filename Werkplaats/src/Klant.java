
public class Klant {
	
	private String voornaam, achternaam, postcode, huisnr, plaats, email, telnummer;

	public Klant(String vnm, String anm, String pcode, String hnr, String plts, String mail, String telnr){
		voornaam = vnm;
		achternaam = anm;
		postcode = pcode;
		huisnr = hnr;
		plaats = plts;
		email = mail;
		telnummer = telnr;	
	}
	
	public Klant(String vnm, String anm){
		voornaam = vnm;
		achternaam = anm;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getHuisnr() {
		return huisnr;
	}

	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelnummer() {
		return telnummer;
	}

	public void setTelnummer(String telnummer) {
		this.telnummer = telnummer;
	}
	
	
	public String toString(){
		String s = voornaam + " " + achternaam;
		return s;
		
	}
	
	public String toStringAlleGegevens(){
		String aG = voornaam + " " + achternaam + ". \n " + postcode + " " + huisnr + " " + plaats + ". \n " + email + ", " + telnummer; 
		return aG;
	}
}
