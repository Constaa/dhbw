package Semster_1;

import java.util.Scanner;

public class Aufgabe_Kreditrechner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Gewünschter Kreditbetrag in Euro: ");
		double kreditbetrag = s.nextDouble();
		System.out.print("Bitte Darlehenszins in Prozent eingeben: ");
		double zins = s.nextDouble();
		System.out.print("Bitte Tilgung in Prozent eingeben: ");
		double tilgung = s.nextDouble();

	}

}
