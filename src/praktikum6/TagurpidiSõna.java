package praktikum6;

public class TagurpidiSõna {

	public static void main(String[] args) {
		System.out.println(reverse("yolo"));
	}

	static String reverse(String str) {
		String copy;
		int i;
		copy = "";
		for (i = str.length() - 1; i >= 0; i--) {
			copy = copy + str.charAt(i);
		}
		return copy;
	}

}
