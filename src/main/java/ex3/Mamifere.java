package ex3;

public class Mamifere extends Animal {

	protected Mamifere(String nom, ComportementAlimentaire comportementAlimentaire) {
		super(nom, comportementAlimentaire);
	}
	
	public String toString() {
		String msg = "(Mamifère) " + super.toString();
		return msg;
	}

}
