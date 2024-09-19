package no.hvl.dat100;

public class O2 {
	
	public static void main(String[] args) {
		
		double bruttoinntekt = 300000; // Eksempel
		
		double trinnskatt1 = trinnskatt(bruttoinntekt);
		
		System.out.println("Trinnskatt for bruttoinntekt " + bruttoinntekt + " kr er " + trinnskatt1 + " kr");
		
	}

	public static double trinnskatt(double bruttolønn) {
		double trinnskatt = 0;
		if (bruttolønn > 208050) {
			if (bruttolønn > 292850) {
				trinnskatt += (292850 - 208050) * 0.017;
			} else {
				trinnskatt += (bruttolønn - 208050) * 0.017;
			}
		}
		if (bruttolønn > 292850) {
			if (bruttolønn > 670000) {
				trinnskatt += (670000 - 292851) * 0.04;
			} else {
				trinnskatt += (bruttolønn - 292851) * 0.04;
			}
		}
		if (bruttolønn > 670000) {
			if (bruttolønn > 937900) {
				trinnskatt += (937900 - 670001) * 0.136;
			} else {
				trinnskatt += (bruttolønn - 670001) * 0.136;
			}
		}
		if (bruttolønn > 937900) {
			if (bruttolønn > 1350000) {
				trinnskatt += (1350000 - 937901) * 0.166;
			} else {
				trinnskatt += (bruttolønn - 937901) * 0.166;
			}
		}
		if (bruttolønn > 1350000) {
			trinnskatt += (bruttolønn - 1350001) * 0.176;
		}
		return trinnskatt;
	}
}