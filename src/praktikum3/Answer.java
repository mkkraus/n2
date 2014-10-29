package praktikum3;

public class Answer {

	public static void main(String[] param) {
		double a = 2.;
		double b = 5.;
		double c = 1.;
		double x = 2.;
		double y = 4;
		System.out.println("a=" + a + "  b=" + b + "  c=" + c + "   x=" + x
				+ "  y=" + y + "   mahub=" + mahub(a, b, c, x, y));
	} // main

	public static boolean mahub(double a, double b, double c, double x, double y) {
		if (a > x) {
			if (b > y || c > y) {
				return true;
			} else if (a > y) {
				if (b > x || c > x) {
					return true;
				} else if (b > x) {
					if (c > y || a > y) {
						return true;
					} else if (b > y) {
						if (c > x || a > x) {
							return true;
						} else if (c > x) {
							if (a > y || b > y) {
								return true;
							} else if (c > y) {
								if (a > x || b > x) {
									return true;
								} else
									return false;
							}
						}
					}
				}
			}
		}
		return false==false;
	}// mahub

} // Answer

