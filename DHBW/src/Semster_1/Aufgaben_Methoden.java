package Semster_1;



public class Aufgaben_Methoden {

	public static void main(String[] args) {
		String[] liste = {"Julia","Leonie","Jonas","Steven"};
		String test = "Hallo du Fisch";
		
		ausgabeArray(liste);
		System.out.println(cmtoinch(2.54));
		System.out.println(jahresEndKapital(1000, 10));
		zeichenketteAusgabe(test);
		String amk = Double.toString(jahresEndKapital(1000, 2.5));
		zeichenketteAusgabe(amk);
		

	}
//AUFGABE 2
	private static double cmtoinch(double cm) {
		double inch = cm/2.54;
		return inch;
		
		
	}

	//AUFGABE 1
	private static void ausgabeArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	//AUFGABE 3
	// 5
	// 9
	
	//AUFGABE 4
	//a)
	public static double jahresEndKapital (double kapital, double zinssatz) {
		double endkapital = (kapital*((zinssatz/100)+1));
		
		return endkapital;	
	}
	//b)
	public static void zeichenketteAusgabe(String d) {
	System.out.println(d);	
	}
	//c)
	
	}


