package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {

	/** Masse moyenne en kg de nourriture consomm� par 1 carnivore */
	private static final double MASSE_NOURRITURE = 10;

	public ZoneCarnivore(String nomZone) {
		super(nomZone, MASSE_NOURRITURE);
	}

	
}
