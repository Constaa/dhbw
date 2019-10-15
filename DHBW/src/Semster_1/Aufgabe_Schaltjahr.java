package Semster_1;

import java.util.Scanner;

public class Aufgabe_Schaltjahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean schaltjahr;
		while(true) {
			schaltjahr = false;
			
			int zuPruefendesJahr = s.nextInt();
			
			if (zuPruefendesJahr%4==0) {
				schaltjahr=true;
				if (zuPruefendesJahr%100==0) {
					schaltjahr=false;
					if (zuPruefendesJahr%400==0) {
						schaltjahr=true;
					}
				}
			
			} 
			if (schaltjahr) {
			System.out.println(zuPruefendesJahr+" ist ein Schaltjahr!");	
			}
			else {
				System.out.println(zuPruefendesJahr+" ist kein Schaltjahr!");
			}
			
			

	}
	}
}


