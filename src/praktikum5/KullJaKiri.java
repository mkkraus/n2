package praktikum5;

public class KullJaKiri {
	static int sisestus;

	public static void kullikas(String kysimus, int min, int max) {
		praktikum5.Vahemik.kasutajaSisestus(0, 1);
		int arvuti = (int) (Math.random() * 2);
		if (arvuti == sisestus) {
			System.out.println("Ära arvasid!");
		} else {
			System.out.println("Ei jopanud!" + "Arvuti arvas: " + arvuti);
		}
	}

	public static void main(String[] args) {
		kullikas("Sisesta kull (0) või kiri(1)!", 0, 1);
	}
}
