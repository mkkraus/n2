package praktikum5;

import lib.TextIO;

public class Liisk {

	public static void main(String[] args) {
		System.out.println("Sisesta inimeste arv: ");
		int inimesteArv=TextIO.getInt();
		suvalineArv(1,inimesteArv);
	}
	public static double suvalineArv(int min, int max){
		double vastus= (int)Math.random()*max+min;
		while (true){
			System.out.println(vastus);
		}
	}

}
