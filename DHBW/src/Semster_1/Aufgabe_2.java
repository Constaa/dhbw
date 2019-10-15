package Semster_1;
import javax.swing.JOptionPane;

public class Aufgabe_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tag = "Guten Tag";
		String abend = "Guten Abend";
		int zeit = 13;
		
		if (zeit < 18) {
			System.out.println(tag);
		}
		else {
			System.out.println(abend);
		}
		// Übersichtlicher, nur die erste Zeile wird ausgeführt 
		// mit Klammer ist vorteilhafter da übersichtlich und mehr Anweisungen möglich
		 
		switch (zeit) {
		case 18:
			;
			break;

		default:
			break;
		}
		// Einschränkung weil nur genaue Angaben, du musst wissen was raus kommt 
		
	/*	while (true) {
		System.out.println("Hallo Welt");
			
		}*/
		/*for (int i = 0; i < 10; i++) {
			System.out.println("Hallo Welt");
			System.out.println(i+1);
		}*/
	/*	for (int i = 0; i < 10; i++) {
			System.out.println("Abfahrt");
			i--;
		}*/
		int step = 10;
		for (int i = 100; i > 0-step; i = i-step) {
			//System.out.println(i);
			
		}
		int summe = 0;
		for (int i = 0; i <=100; i++) {
			summe = summe + i;
			System.out.println(i);
			
		}
		System.out.println(summe);
		
		int gegZahl = 7;
		int ergebnis;
		
		ausgabeZinseszinstabelle();
		tabelleUmrechnungUSDzuEUR();
		primmzahl(13);
		
			
		}

	private static void primmzahl(int zahl) {
		int anzahl = 0;
		for (int i = 1; i < zahl+1; i++) {
			if (zahl%i == 0) {
				anzahl++;
			}
			
		}
		if (anzahl > 2) {
			System.out.println("Keine Primzahl");
		}
		else {
			System.out.println("Primzahl");
		}
		
	}

	private static void tabelleUmrechnungUSDzuEUR() {
		double usdZuEur = 0.91;
		int untergrenze = 1;
		int obergrenze = 100;
		double rounded = 0;
		for (int i = untergrenze; i < obergrenze+1; i++) {
			rounded = Math.round(i*usdZuEur*100d)/100d;
			System.out.println(i+" Dollar entspricht "+(rounded)+" Euro");
		}
		
	}

	public static void ausgabeZinseszinstabelle() {
		int kapital = 1000;
		double zins = 1.10;
		int monate = 10*12;
		double vermoegen = 1000;
		double rounded = 0;
		
		System.out.println("Jahr:\t\t Gesamtbetrag");
		int i = 1;
		for (; i <= 10; i++) {
			vermoegen = vermoegen*zins;
			rounded = Math.round(100d*vermoegen) / 100d;
			System.out.println(+i+".Jahr: \t"+rounded);
			
		}
		
		byte test = 0;
		while(true){
		
		
		System.out.println(test++); //nach 128 Mal bzw nach der 127 
		if (test < 0 ) {
			break;
		}
		}
		
		
		
	}
		
	}


