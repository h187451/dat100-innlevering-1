package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O1 {
	public static void main(String[] args) {
		
		int[] poengsummer_liste = {45, 80, -10, 120, 10};
		
		validerPoengsummer(poengsummer_liste);
		
	}
	
	public static void validerPoengsummer(int[] poengsummer) {
		for (int i = 0; i < poengsummer.length;i++) {
			boolean validert = false;
			int poengsum = poengsummer[i];
			while (!validert) {
				if (giKarakter(poengsum) != "Ugyldig") {
					System.out.println("Karakteren for poengsummen " + poengsum + " er " + giKarakter(poengsum));
					validert = true;
				} else {
					String ny_poengsum = showInputDialog(poengsum + " Er ugyldig, skriv inn ny verdi for poengsum:");
					poengsum = Integer.parseInt(ny_poengsum);
				}
			}
		}
	}
	
	public static String giKarakter(int poengsum) {
		if (poengsum <= 100 && poengsum >= 0) {
			if (poengsum >= 90) {
				return "A";
			} else if (poengsum >= 80) {
				return "B";
			} else if (poengsum >= 60) {
				return "C";
			} else if (poengsum >= 50) {
				return "D";
			} else if (poengsum >= 40) {
				return "E";
			} else {
				return "F";
			}
		}
		return "Ugyldig";
	}
}
