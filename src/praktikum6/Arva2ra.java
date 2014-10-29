package praktikum6;

import lib.TextIO;

public class Arva2ra {

	public static void main(String[] args) {
		int kasutajaM6tles = suvalineArv(1, 100);
		System.out.println("Hei, arva number ära! (1...100)");

		while (true) {
			int kasutajaPakkus = TextIO.getInt();
			if (kasutajaPakkus != kasutajaM6tles) {
				System.out.print("Panid mööda!");
				if (kasutajaPakkus < kasutajaM6tles) {
					System.out.print(" Äkki pakuksid suuremat arvu");
				} else {
					System.out.print(" Äkki pakuksid väiksemat arvu");
				}
			} else {
				System.out.println("Õige!");
				break;
			}
		}
	}

	public static int suvalineArv(int min, int max) {
		int vahemik = max - min;
		int suvaline = (int) (Math.random() * (vahemik + 1));
		return suvaline + min;
	}

}
