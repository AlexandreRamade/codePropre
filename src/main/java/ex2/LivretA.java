package ex2;

/**
 * Repr�sente un compte bancaire de type Livret A
 * @author Formation
 *
 */
public class LivretA extends CompteBancaire {

	/** taux de r�mun�ration annuel du LivretA */
	private double tauxRemuneration;
	
	/**
	 * @param solde solde du compte
	 * @param tauxRemun�ration taux de r�mun�ration annuel
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
		
	/** Soustrait un montant au solde si le r�sultat est sup�rieur ou �gal � 0
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde -= montant;
		}	
	}
	
	/**
	 * ajoute au solde le montant selon le taux de r�mun�ration annuel du Livret A
	 */
	
	public void appliquerRemuAnnuelle(){
		this.solde += solde * tauxRemuneration / 100;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
