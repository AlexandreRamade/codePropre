package ex3;

public class Reptile extends Animal {

	protected Reptile(String nom, ComportementAlimentaire comportementAlimentaire) {
		super(nom, comportementAlimentaire);
	}

	public String toString() {
		String msg = "(Reptile) " + super.toString();
		return msg;
	}
}
