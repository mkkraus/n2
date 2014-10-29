package praktikum2;

import praktikum1.TextIO;

public class Korrutis {

	public static void main(String[] args) {
		int arv1;
		int arv2;
		
		System.out.println("Sisesta 1. arv: ");
		arv1 = TextIO.getlnInt();
		System.out.println("Sisesta 2. arv: ");
		arv2 = TextIO.getlnInt();

		int korrutis = arv1 * arv2;
		
		System.out.println("kahe arvu korrutis on " + korrutis);
	}
}
