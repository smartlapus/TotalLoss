
public class Auto {

	private String merk;
	private String type;
	private String bouwjaar;
	
	public Auto(String mk, String typ, String bjaar){
		merk = mk;
		type = typ;
		bouwjaar = bjaar;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBouwjaar() {
		return bouwjaar;
	}

	public void setBouwjaar(String bouwjaar) {
		this.bouwjaar = bouwjaar;
	}
	
	public String toString(){
		return merk + " " + type + ", bouwjaar: " + bouwjaar;
	}
	
	
}
