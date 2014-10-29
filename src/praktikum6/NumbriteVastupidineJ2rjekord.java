package praktikum6;

import lib.TextIO;

public class NumbriteVastupidineJ2rjekord {
	public static void liisuHeitmine() {
		int[] numbridVastupidi = new int[10];
		for (int i = 1; i < 11; i++) {
			System.out.println("Sisesta arv #" + i);
			numbridVastupidi[10 - i] = TextIO.getInt();

		}
		for (int number : numbridVastupidi) {
			System.out.print(number+";");
		}
	}

	public static void main(String[] args) {
		liisuHeitmine();
	}

}
