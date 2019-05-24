package ex3;

public class Carnivore implements ComportementAlimentaire {

	@Override
	public String boire() {
		System.out.println("Je bois du sang");
		return null;
	}

	@Override
	public String manger() {
		System.out.println("Je mange d'autres animaux");
		return null;
	}

}
