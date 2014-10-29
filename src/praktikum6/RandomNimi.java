package praktikum6;

import lib.TextIO;

public class RandomNimi {
	static void massiiviKoostamine() {
		String[] massiiv = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Sisesta nimi #" + i);
			massiiv[i] = TextIO.getlnString();

		}

		System.out.println("Suvaline nimi on: "+massiiv[praktikum6.Arva2ra.suvalineArv(0, 9)]);
	}
	

	public static void main(String[] args) {
		massiiviKoostamine();
	}

}





















