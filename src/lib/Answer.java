package lib;


public class Answer {

	public static void main(String[] args) {
		System.out.println(keskmisestParemaid(new double[] { 0. }));
		System.out.println(keskmisestParemaid(new double[] { 1, 2, 3. }));
		System.out.println(keskmisestParemaid(new double[] { 1, 2, 3, 4, 5. }));

	}

	public static int keskmisestParemaid(double[] d) {
		double summa = 0;
		for (int i = 0; i < d.length; i++) {
			summa += d[i];
		}
		int keskmisestSuuremateElementideArv = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] > summa / d.length) {
				keskmisestSuuremateElementideArv += 1;
			} else {

			}

		}
		return keskmisestSuuremateElementideArv;
	}

}