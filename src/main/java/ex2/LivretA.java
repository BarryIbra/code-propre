package ex2;

/**
 * Représente un compte bancaire de type livret A (type=LA)
 * 
 * @author DIGINAMIC
 */

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * @param solde
	 * @param tauxRemuneration
	 */

	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Méthode qui applique la rémunération annuelle
	 */

	public void appliquerRemuAnnuelle() {
		if (type.equals("LA")) {
			this.solde = solde + solde * tauxRemuneration / 100;
		}
	}

	
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
