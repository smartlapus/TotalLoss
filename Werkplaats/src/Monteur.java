
public class Monteur {
	
	private String voornaam, achternaam, postcode, huisnr, plaats, email, telnummer, bsnnr, reknummer;

	public Monteur(String vnm, String anm, String pcode, String hnr, String plts, String mail, String telnr, String bsn, String reknr){
		voornaam = vnm;
		achternaam = anm;
		postcode = pcode;
		huisnr = hnr;
		plaats = plts;
		email = mail;
		telnummer = telnr;
		bsnnr = bsn;
		reknummer = reknr;
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

	public String getBsnnr() {
		return bsnnr;
	}

	public void setBsnnr(String bsnnr) {
		this.bsnnr = bsnnr;
	}

	public String getReknummer() {
		return reknummer;
	}

	public void setReknummer(String reknummer) {
		this.reknummer = reknummer;
	}
	
	public String toString(){
		String s = voornaam + " " + achternaam;
		return s;
	}
}