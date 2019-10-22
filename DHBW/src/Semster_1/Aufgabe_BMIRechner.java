package Semster_1;

import java.util.Scanner;

public class Aufgabe_BMIRechner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Bist du Männlich Tippe 1, bei Weiblich Tippe 2: ");
		int geschlecht = s.nextInt();
		boolean mann;
		if (geschlecht == 1) {
			mann = true;
		}
		else {
			mann = false;
		}
		System.out.print("Bitte Größe in cm eingeben: ");
		double groesse = s.nextDouble();
		groesse = groesse/100d;
		System.out.print("Bitte Gewicht in ganzen KG eingeben: ");
		int gewicht = s.nextInt();
		double gerundet = 0;
		
		double bmi = gewicht/(groesse*groesse);
		gerundet = Math.round(bmi*100d)/100d;
	   
		System.out.println("Folgende Werte wurden eingegeben: ");
		System.out.println("Sie sind "+groesse+"cm groß und wiegen "+gewicht+"kg.");
		System.out.println("Ihr BMI beträgt: "+gerundet);
		String ergebnis = " ";
		
		if (mann) {
			if (bmi > 40) {
				ergebnis = "starke Adipositas";
			}
			if (bmi <= 40 || bmi >= 31) {
				ergebnis = "Adipositas";
			}
			if (bmi <=30 || bmi >= 26) {
				ergebnis = "Übergewicht";
			}
			if (bmi <= 25 || bmi >= 20) {
				ergebnis = "Normalgewicht";
			}
			if (bmi < 20) {
				ergebnis = "Untergewicht";
			}
		} else {
			if (bmi > 40) {
				ergebnis = "starke Adipositas";
			}
			if (bmi <= 40 || bmi >= 31) {
				ergebnis = "Adipositas";
			}
			if (bmi <=30 || bmi >= 25) {
				ergebnis = "Übergewicht";
			}
			if (bmi <= 24 || bmi >= 19) {
				ergebnis = "Normalgewicht";
			}
			if (bmi < 19) {
				ergebnis = "Untergewicht";
			

		}
		
		
	}
		System.out.println("Ergebnis: "+ergebnis);

}}
