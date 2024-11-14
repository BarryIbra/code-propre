package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Inventaire
 */

public class Inventaire {

	/** caisses: liste des caisses */

	private List<Caisse> caisses;

	/**
	 * Constructeur
	 */

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new CaissePetitItems("Petits objets"));
		caisses.add(new CaisseMoyenItems("Moyens objets"));
		caisses.add(new CaisseGrandItems("Grands objets"));
	}

	
	/**
	 * taille de l'inventaire
	 */
	public int taille() {
		
		int taille = 0;
		for (Caisse caisse : caisses) {
			taille += caisse.taille();
		}
		return taille;
	}
}
