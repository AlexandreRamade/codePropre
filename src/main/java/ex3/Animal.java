package ex3;

public abstract class Animal {
	protected String nom;
	
	protected ComportementAlimentaire comportementAlimentaire;

	protected Animal(String nom, ComportementAlimentaire comportementAlimentaire) {
		this.nom = nom;
		this.comportementAlimentaire = comportementAlimentaire;
	}
	
	public String toString() {
		String msg = nom;
		return msg;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ComportementAlimentaire getComportement() {
		return comportementAlimentaire;
	}

	public void setComportement(ComportementAlimentaire comportementAlimentaire) {
		this.comportementAlimentaire = comportementAlimentaire;
	}

	
}
