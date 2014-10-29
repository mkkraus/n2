package harjutustund3;

import lib.TextIO;

public class Grade {

	public static void main(String[] p) {
		double percent;
		while (true) {
			System.out.print("Sisesta protsent: ");
			percent = TextIO.getlnDouble();
			System.out.print(percent + ": ");
			System.out.println(grade(percent));
		} // while
	} // main

	public static String grade(double d) {
		String grade = "not defined";
		if (d > 90 && d <= 100) {
			grade = "excellent";
		} else if (d > 80 && d <= 90) {
			grade = "very good";
		} else if (d > 70 && d <= 80) {
			grade = "good";
		} else if (d > 60 && d <= 70) {
			grade = "satisfactory";
		} else if (d > 50 && d <= 60) {
			grade = "sufficient";
		} else if (d >= 0 && d <= 50) {
			grade = "fail";
		} else if (d < 0) {
			throw new RuntimeException("Negatiivne protsent");
		} else if (d > 100) {
			throw new RuntimeException("protsent on suurem kui max võimalik");
		}
		return grade;
	}

}
