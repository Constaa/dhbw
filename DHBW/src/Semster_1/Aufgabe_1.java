package Semster_1;

public class Aufgabe_1 {

	/**
	 * hallo leute was geht
	 */
	
	static int a = 2;
	public static void main(String[] args) {
		
		double b = 1.2;
		String c = "jonas";
		boolean entscheidung = false;
		System.out.println("Hallo Welt moin");
		System.out.println("Was geht ab berlin"); //beim weglassen von ln wird keine neue line geprinted
		System.out.println("Was geth ab berlin ya "+a);
		
		int d =1;
		double e = 4.20; // man kann auch deklarieren und initialisieren separat machen
		d= 2;
		e= 4.21;
		System.out.println(d*e);
		
		int i = 10;
		long j = 500000;
		double k = 3.14;
		float l =  100.0815f; //unbedingt f hinterher
		double ergebnis = i*j*k*l;
		System.out.println("Ergebnis von 5 "+ ergebnis);
		//zuweisen bei int zu 3.14 geht nur mit casten, ansonsten geht das nicht
		
		int m = 10;
		double n = 47.11;
		System.out.println(++m);
		System.out.println(n++);
		
		
		System.out.println(m -= 1);
		System.out.println(n);
		n = n-1;
		
		if (n!=m) {
			System.out.println("n und m ungleich");
		}
		if (n<m) {
			System.out.println("n kleiner m");
		}
		else {
			System.out.println("m kleiner n");
		}
		 // a = a*b
	
		
		
		
	
		
		
	
		
		System.out.println(48%7);
		
		boolean eins = true;
		boolean zwei = true;
		boolean drei = true;
		boolean vier = true;
		
		if (eins && zwei) {
			
		}
	
		
		if (eins || zwei) {
			
		}
		zwei = !zwei;
		vier = !vier;
		
		eins = eins & zwei;
		System.out.println(eins);
		drei &= vier;
		System.out.println(drei);
		
		

	}

}
