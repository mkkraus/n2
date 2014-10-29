package praktikum2;

import praktikum1.TextIO;

public class Grupid {

	public static void main(String[] args) {
		int inimesteArv;
		int grupiSuurus;
		System.out.println("Sisesta inimeste arv: ");
		inimesteArv = TextIO.getlnInt();
		System.out.println("Sisesta grupi suurus: ");
		grupiSuurus = TextIO.getlnInt();
		System.out.println("Gruppe tuleks: " + inimesteArv / grupiSuurus);
		System.out.println("Jääk on: " + inimesteArv % grupiSuurus);

	}

}
