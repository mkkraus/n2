package praktikum5;

import lib.TextIO;

public class Vahemik {
	public static int kasutajaSisestus(int min, int max) {
		System.out.println("Sisesta arv, mis jääb piirkonda: "+min+" kuni "+max);
		int sisestus = TextIO.getInt();
		while (sisestus > max || sisestus < min) {
			System.out
					.print("Sisestasid arvu väljaspool piirkonda, proovi uuesti: ");
			sisestus = TextIO.getInt();
		}
		return sisestus;

	}

	public static void main(String[] args) {
		System.out.println("Õige arv! ("+ kasutajaSisestus(1,3)+")");

	}

}
