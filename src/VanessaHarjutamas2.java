public class VanessaHarjutamas2 {

	// muuda meetodit "arvuta" nii, et tagastataks (!) nende arvude summa
	// ruut. Kontrolli seda main meetodis meetodi erinevate sisenditega
	// väljatrükkimise teel

	static int arvuta(int a, int b) {
		if (a == 0) {
			return 2;

		} else {
			return 3;
		}

		return 1;
	}

	public static void main(String[] args) {
		System.out.println(arvuta(1, 2));
	}

}