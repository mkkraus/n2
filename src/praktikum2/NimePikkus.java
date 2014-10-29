package praktikum2;

import praktikum1.TextIO;

public class NimePikkus {

	public static void main(String[] args) {
		System.out.println("Sisesta enda eesnimi: ");
		String nimi = TextIO.getln();
		int nimePikkus = nimi.length();
		System.out.println("Sinu eesnime pikkus on " + nimePikkus
				+ " tähemärki");

	}

}
