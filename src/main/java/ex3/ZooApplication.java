package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		

		
		zoo.addAnimal(new Mamifere("Gazelle", new Herbivore()));
		zoo.addAnimal(new Mamifere("Zèbre", new Herbivore()));
		zoo.addAnimal(new Mamifere("Lion", new Carnivore()));
		zoo.addAnimal(new Mamifere("Panthère", new Carnivore()));
		zoo.addAnimal(new Poisson("Requin blanc", new Carnivore()));
		zoo.addAnimal(new Poisson("Truite dorée", new Herbivore()));
		zoo.addAnimal(new Reptile("Boa constrictor", new Carnivore()));
		zoo.addAnimal(new Reptile("Python", new Carnivore()));

		zoo.afficherListeAnimaux();
		System.out.println("--------------");
		zoo.getZones().get(Zoo.ZONE_CARNIVORE).afficherListeAnimaux();
		
	}

}
