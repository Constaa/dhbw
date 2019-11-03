package Semster_1;

import java.util.ArrayList;

public class Lottozahlen_Steuerung {

	private Aufgabe_Lottozahlen dieGui;
	public boolean eingabe = false;
	ArrayList<Integer>  dieZahl = new ArrayList<Integer>();
	int eingzahl1 = 0;
	int eingzahl2 = 0;
	int eingzahl3 = 0;
	int eingzahl4 = 0;
	int eingzahl5 = 0;
	int eingzahl6 = 0;

	
	public Lottozahlen_Steuerung() {
		dieZahl.add(eingzahl1);
		dieZahl.add(eingzahl2);
		dieZahl.add(eingzahl3);
		dieZahl.add(eingzahl4);
		dieZahl.add(eingzahl5);
		dieZahl.add(eingzahl6);
	
		dieGui = new Aufgabe_Lottozahlen(this);
		
		
	}
	
	public void pruefeZahl(int zahl) {
		
	}
	}

