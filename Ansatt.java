package oving6;

public class Ansatt extends Person {
	private String fornavn;
	private String etternavn;
	private String epostadresse;
	private String telefon;
	private Kontor kontor;
	
	public Ansatt(String fornavn, String etternavn, String epostadresse, String telefon, Kontor kontor) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.epostadresse = epostadresse;
		this.telefon = telefon;
		this.kontor = kontor;
		kontor.leggTilAnsatt(this);
	}
	
	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getEpostadresse() {
		return epostadresse;
	}

	public void setEpostadresse(String epostadresse) {
		this.epostadresse = epostadresse;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Kontor getKontor() {
		return kontor;
	}

	public void setKontor(Kontor kontor) {
		this.kontor = kontor;
	}
/*
	public String toString() {
		return "Fornavn:   " + fornavn + "\n"
			+ "etternavn: " + etternavn + "\n"
			+ "Epost:     " + epostadresse + "\n"
			+ "Telefon:   " + telefon + "\n"
			+ "Kontor:    " + kontor.toString() + "\n";
	}*/

	public String toString() {
		StringBuilder strengBygger = new StringBuilder(30);
		strengBygger.append("Fornavn:	");
		strengBygger.append(fornavn);
		strengBygger.append("\nEtternavn:	");
		strengBygger.append(etternavn);
		strengBygger.append("\nEpost:		");
		strengBygger.append(epostadresse);
		strengBygger.append("\nTelefon:	");
		strengBygger.append(telefon);
		strengBygger.append("\nKontor:		");
		strengBygger.append(kontor);
		strengBygger.append("\n");
		return strengBygger.toString();
	}
}
