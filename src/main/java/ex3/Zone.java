package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected String nomZone;
	protected double masseNouritureParAnimal;
	protected List<Animal> animaux;
	
	protected Zone(String nomZone) {
		this.nomZone = nomZone;
		this.masseNouritureParAnimal = 0.0;
		this.animaux = new ArrayList<Animal>();
	}
	
	protected Zone(String nomZone, double masseNouritureParAnimal) {
		this.nomZone = nomZone;
		this.masseNouritureParAnimal = masseNouritureParAnimal;
		this.animaux = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal : animaux){
			System.out.println(animal.toString());
		}
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * masseNouritureParAnimal;
	}

	public String getNomZone() {
		return nomZone;
	}

	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	public double getMasseNouritureParAnimal() {
		return masseNouritureParAnimal;
	}

	public void setMasseNouritureParAnimal(double masseNouritureParAnimal) {
		this.masseNouritureParAnimal = masseNouritureParAnimal;
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	
}
