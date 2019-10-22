package Semster_1;

import java.util.Scanner;

public class Aufgabe_Guthabenentwicklung {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Guthaben: ");
		double guthaben = s.nextDouble();
		System.out.print("Zinssatz (in Prozent): ");
		double zins = s.nextDouble();
		zins = zins/10;
		double gerundet = 0;
		
		for (int i = 0; i < 10-1; i++) {
			guthaben = guthaben *(1+zins/100);
			gerundet = Math.round(guthaben *100d)/100d;
			System.out.println(gerundet+" im " +(i+1)+" Jahr");
		}
		
	}

}
