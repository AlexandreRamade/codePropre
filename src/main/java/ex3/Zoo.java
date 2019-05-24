package ex3;

import java.util.HashMap;
import java.util.List;

/**
 * @author DIGINAMIC
 */
public class Zoo {
	public static final String ZONE_SAVANE = "Savane Africaine";
	public static final String ZONE_CARNIVORE = "Zone des Carnivores";
	public static final String ZONE_REPTILES = "Ferme des Reptiles";
	public static final String ZONE_AQUARIUM = "Aquarium";
	
	
	private String nom;
	private HashMap<String, Zone> zones;
	
	public Zoo(String nom){
		this.nom = nom;
		zones = new HashMap<String, Zone>();
		zones.put(ZONE_SAVANE, new SavaneAfricaine(ZONE_SAVANE));
		zones.put(ZONE_CARNIVORE, new ZoneCarnivore(ZONE_CARNIVORE));
		zones.put(ZONE_REPTILES, new FermeReptile(ZONE_REPTILES));
		zones.put(ZONE_AQUARIUM, new Aquarium(ZONE_AQUARIUM));
	}
	
	
	public void addAnimal(Animal animal){
		if(animal.getClass().equals(Mamifere.class)) {
			if(animal.getComportement().getClass().equals(Carnivore.class)) {
				zones.get(ZONE_CARNIVORE).addAnimal(animal);
			} else {
				zones.get(ZONE_SAVANE).addAnimal(animal);
			}
		} else if(animal.getClass().equals(Reptile.class)) {
			zones.get(ZONE_REPTILES).addAnimal(animal);
		} else if (animal.getClass().equals(Poisson.class)) {
			zones.get(ZONE_AQUARIUM).addAnimal(animal);
		}
		
	}
	
	
	public void afficherListeAnimaux(){
		for(Zone zone : zones.values()) {
			zone.afficherListeAnimaux();
		}
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public HashMap<String, Zone> getZones() {
		return zones;
	}


	public void setZones(HashMap<String, Zone> zones) {
		this.zones = zones;
	}



	
}
