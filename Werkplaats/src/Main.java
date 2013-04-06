
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bedrijf hetBedrijf = new Bedrijf("AutoTotaalDiensten", "Rozewolf 3");
		Klant k1 = new Klant("Dion", "Iseger", "1234FD", "12", "De Bilt", "dion@d.nl", "0623645712");
		Klant k2 = new Klant("Martin", "Bakker", "5634AD", "112", "Utrecht", "Martin@d.nl", "0612345678");
		Klant k3 = new Klant("Jason", "Koolman", "4561MN", "65", "Utrecht", "Jason@bricks.com", "0694769372");
		hetBedrijf.voegKlantToe(k1);
		hetBedrijf.voegKlantToe(k2);
		hetBedrijf.voegKlantToe(k3);
		
		Monteur m1 = new Monteur("Dion", "Iseger", "1234FD", "12", "De Bilt", "dion@d.nl", "0623645712", "1234567890", "1234567");
		Monteur m2 = new Monteur("Martin", "Bakker", "5634AD", "112", "Utrecht", "Martin@d.nl", "0612345678", "1234567890", "1234567");
		Monteur m3 = new Monteur("Jason", "Koolman", "4561MN", "65", "Utrecht", "Jason@bricks.com", "0694769372", "1234567890", "1234567");
		hetBedrijf.voegMonteurToe(m1);
		hetBedrijf.voegMonteurToe(m3);
		hetBedrijf.voegMonteurToe(m2);
		
		LogIn log = new LogIn(hetBedrijf);
		

	}

}
