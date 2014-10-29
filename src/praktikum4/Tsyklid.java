package praktikum4;

public class Tsyklid {
	// Ülesanne 1 - Trükkida ühele reale numbrid 10 kuni 1

	public static void ykskymme() {
		System.out.println("Ülesanne1");
		int arv = 10;
		while (arv >= 0) {
			System.out.print(arv + "; ");
			arv--;
		}
		System.out.println();
	}

	// ülesanne 2 - Trükkida ühele reale paarisarvud 0 kuni 10 (0,2,4 jne.)

	public static void paaris() {
		System.out.println("Ülesanne2");
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.print(i + "; ");
		}
		System.out.println();

	}

	// Ülesanne 3 - Trükkida ühele reale kolmega jaguvad arvud vahemikus 30 kuni
	// 0 (30, 27, 24 jne.)

	public static void kolmegaJagatavus() {
		System.out.println("Ülesanne3");
		for (int i = 0; i <= 30; i = i + 3) {
			System.out.print(i + "; ");
		}
		System.out.println();
	}

	// Ülesanne 4 - Trükkida ekraanile selline tabel:
	//
	// 1 0 0 0 0 0 0
	// 0 1 0 0 0 0 0
	// 0 0 1 0 0 0 0
	// 0 0 0 1 0 0 0
	// 0 0 0 0 1 0 0
	// 0 0 0 0 0 1 0
	// 0 0 0 0 0 0 1
	//
	// Tabeli suurus olgu lihtsasti muudetav.

	public static void tabel1(int ridadeArv, int veergudeArv) {
		System.out.println("Ülesanne 4");

		for (int i = 0; i < veergudeArv; i++) {
			for (int j = 0; j < ridadeArv; j++) {
				if (i == j)
					System.out.print("1 ");
				else
					System.out.print("0 ");

			}
			System.out.println();
		}
	}

	// Trükkida ekraanile selline tabel koos ääristega. Tabeli kõrgus on sama
	// mis laius - see suurus küsi kasutaja käest.
	//
	// -----------------
	// | x 0 0 0 0 0 x |
	// | 0 x 0 0 0 x 0 |
	// | 0 0 x 0 x 0 0 |
	// | 0 0 0 x 0 0 0 |
	// | 0 0 x 0 x 0 0 |
	// | 0 x 0 0 0 x 0 |
	// | x 0 0 0 0 0 x |
	// -----------------

	public static void tabelHard(int ridadeArv, int veergudeArv) {
		System.out.println("Ülesanne 5");
		int k = 0;
		while (veergudeArv >= k) {
			System.out.print("-");
			k++;
		}
		System.out.println();
		for (int i = 0; i < veergudeArv; i++) {
			for (int j = 0; j < ridadeArv; j++) {
				if (i == j || i == veergudeArv - j - 1)
					System.out.print("x ");
				else
					System.out.print("0 ");

			}
			// while (veergudeArv >= k)
			// ;
			// System.out.print("-");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ykskymme();
		paaris();
		kolmegaJagatavus();
		tabel1(4, 5);
		tabelHard(5, 5);
	}

}
