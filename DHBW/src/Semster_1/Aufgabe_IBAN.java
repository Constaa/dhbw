package Semster_1;

public class Aufgabe_IBAN {

	public static void main(String[] args) {
	
		final String keinDe = "Die eingegebene IBAN beginnt nicht mit DE (es handelt sich nicht um eine deutsche IBAN";
		final String zuKurz = "Die eingegebene IBAN ist zu kurz (<22 Stellen";
		final String zuLang = "Die eingegebene IBAN ist zu lang (>22 Stellen";
		final int laenge = 22;
		char[] liste = new char[22];

	}
	public static boolean pruefeIban(char[] a) {
		boolean laengestimmt = false;
		if (a.length == 22) {
			laengestimmt = true;
		}
		return laengestimmt;
		
	}
	public static boolean ersteZweiZiffernDE (char[] a) {
		boolean ziffern = false;
		if (a[0]=='D' && a[1]=='E') {
			ziffern = true;
		}
		return ziffern;
	}
	

}
