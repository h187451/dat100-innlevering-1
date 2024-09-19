package no.hvl.dat100;



public class O3 {
	
	public static void main(String[] args) {
		
		fakultet(4);

	}
	
	public static void fakultet(int x) {
        String resultat_str = "";
        int resultat_int = 1;
        for (int i = 1; i <= x; i++) {
        	resultat_int *= i;
        	if (i != x) {
        		resultat_str += i + " * ";
        	} else {
        		resultat_str += i;
        	}
        }
        System.out.println(x + "! = " + resultat_str + " = " + resultat_int);
    }
}
