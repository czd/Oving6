package oving6;

import java.util.ArrayList;

public class Kontor {
	private char bygning;
	private int etasje;
	private int romnummer;
	private int maksAntall;
	private ArrayList<Ansatt> ansatte;
	
	public char getBygning() {
		return bygning;
	}
	
	public void setBygning(char bygning) {
		this.bygning = bygning;
	}
	
	public int getEtasje() {
		return etasje;
	}
	
	public void setEtasje(int etasje) {
		this.etasje = etasje;
	}
	
	public int getRomnummer() {
		return romnummer;
	}
	
	public void setRomnummer(int romnummer) {
		this.romnummer = romnummer;
	}
	
	public Kontor(char bygning, int etasje, int romnummer) {
		this.bygning = bygning;
		this.etasje = etasje;
		this.romnummer = romnummer;
		this.maksAntall = 1;
		this.ansatte = new ArrayList<Ansatt>();
	}
	
	public Kontor(char bygning, int etasje, int romnummer, int maksAntall) {
		this.bygning = bygning;
		this.etasje = etasje;
		this.romnummer = romnummer;
		this.maksAntall = maksAntall;
		this.ansatte = new ArrayList<Ansatt>();
	}
	
	public void leggTilAnsatt (Ansatt e) {
		if (isBuildingFull())
			System.out.println("Bygningen har ikke flere ledige plasser!");
		else
			ansatte.add(e);
	}
		
	public String toString() {
		String resultat = bygning + "-" + etasje;
		if (romnummer < 10) resultat += "0";
		resultat += romnummer;
		return resultat;
	}
	
	public boolean isBuildingFull() {
		return !(this.ansatte.size() < this.maksAntall);
	}
	
	public void skrivUtAnsattListe() {
		for (Ansatt i : ansatte)
			System.out.println(i.toString());
	}
	
	public static void main(String[] args) {
		Kontor test = new Kontor('E', 4, 2);
		System.out.println(test);
	}
}
