package Semster_1;

import java.util.Scanner;

public class Aufgabe_Zahlenraten {

	public static void main(String[] args) {
	while(true) {
		Scanner s = new Scanner(System.in);
		int festgelegt = 6;
		int gegeben = s.nextInt();
		
		switch (gegeben) {
		case 6:
			System.out.println("Treffer!");
			break;
		case 4:
			System.out.println("Knapp daneben!");
			break;
		case 5:
			System.out.println("Knapp daneben!");
			break;
		case 7:
			System.out.println("Knapp daneben!");
			break;
		case 8:
			System.out.println("Knapp daneben!");
			break;

		default:
			System.out.println("Daneben!");
			break;
		}
	}

	}

}
