package praktikum6;

import lib.TextIO;

public class PanustegaKullJaKiri {

	public static void main(String[] args) {
		int konto = 100;
		int myndiViskaja;
		System.out
				.println("Sul on 100�. Mis on sinu panus? (�ra sisesta � �hikut!)");
		int kasutajaPanus;// = TextIO.getInt();

		while (true) {
			kasutajaPanus = TextIO.getInt();
			if (kasutajaPanus > 25) {
				System.out.println("Sisesta 25� v�iksem panus!");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			myndiViskaja = praktikum6.Arva2ra.suvalineArv(0, 1);
			if (konto > 0) {
				if (myndiViskaja == 0) {
					System.out.println("Tuli kull, kaotasid oma panuse!");
					konto = kasutajaPanus;
					System.out
							.println("Sul on n��d "
									+ konto
									+ "�. Mis on sinu uus panus? (�ra sisesta � �hikut!)");
					continue;
				} else {
					System.out.println("Tuli kiri, saad 2xpanuse raha tagasi.");
					konto = +kasutajaPanus;
					System.out
							.println("Sul on n��d "
									+ konto
									+ "�. Mis on sinu uus panus? (�ra sisesta � �hikut!)");
					continue;
				}

			} else {
				System.out.println("Raha otsas!");
				break;
			}

		}
	}
}