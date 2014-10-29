package praktikum5;

import lib.TextIO;

public class ArvuKuup {
	public static void arvuKuup(double arv) {
		System.out.println(arv + " astmes kolm on " + arv * arv * arv);
	}

	public static void main(String[] args) {
		System.out.println("Sisesta arv, mida soovid kuupi võtta: ");
		double arv = TextIO.getDouble();
		arvuKuup(arv);
	}

}
