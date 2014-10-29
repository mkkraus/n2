package praktikum3;

import praktikum1.TextIO;

public class Parool {

	public static void main(String[] args) {
		String parool = "mt23";

		System.out.println("Sisesta õige parool: ");
		if (TextIO.getln().equals(parool)) {
			System.out.println("Õige parool!");
		} else {
			System.out.println("Vale parool!");
		}

	}

}
