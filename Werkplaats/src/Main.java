
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bedrijf hetBedrijf = new Bedrijf("AutoTotaalDiensten", "Rozewolf 3");
		Klant k1 = new Klant("Dion", "Iseger", "1234FD", "12", "De Bilt", "dion@d.nl", "0623645712");
		hetBedrijf.voegKlantToe(k1);
		
		LogIn log = new LogIn(hetBedrijf);
		

	}

}
