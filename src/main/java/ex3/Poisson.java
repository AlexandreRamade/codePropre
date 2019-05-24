package ex3;

public class Poisson extends Animal {

	protected Poisson(String nom, ComportementAlimentaire comportementAlimentaire) {
		super(nom, comportementAlimentaire);
	}

	public String toString() {
		String msg = "(Poisson) " + super.toString();
		return msg;
	}
	
}
