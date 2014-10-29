package harjutustund3;

public class TelliseMahtumine {
	public static void mahub(int a, int b, int c, int x, int y) {
		if (x > a) {
			if (y > b || y > c) {
				System.out.println("Mahub küll!");
			}

		}
		else if (x > b) {
			if (y > a || y > c) {
				System.out.println("Mahub küll!");

			}

		}
		else if (x > c) {
			if (y > b || y > a) {
				System.out.println("Mahub küll!");
			}

		} else {
			System.out.println("Ei mahu ikka küll!");
		}
	}

	public static void main(String[] args) {
		mahub(3, 1, 1, 2, 2);
	}
}
