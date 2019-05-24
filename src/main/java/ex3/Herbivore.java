package ex3;

public class Herbivore implements ComportementAlimentaire{

	@Override
	public String boire() {
		System.out.println("Je bois de l'eau.");
		return null;
	}

	@Override
	public String manger() {
		System.out.println("Je mange de l'herbe.");
		return null;
	}

}
