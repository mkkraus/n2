package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {

		System.out.println("Sisesta kaalutud keskmine hinne: ");
		double keskmineH = TextIO.getDouble();

		System.out.println("Sisesta lõputöö hinne: ");
		double loputooH = TextIO.getDouble();
		if (keskmineH > 5 || loputooH > 5) {
			System.out.println("Sisestasid võimatu hinde!");
			return;
		} else if (keskmineH > 4.5 && loputooH == 5.0) {
			System.out.println("jah saad cum laude diplomile!");
		} else {
			System.out.println("Ei saa!");

		}
	}
}
