package ex3;


import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo
 */
public class Zoo {

	/** nom : nom du zoo */

	private String nom;

	/** animaux: liste des d'animaux */
	private List<Animal> animaux;
	
	/** types: liste des types d'animaux */

	public Zoo(String nom){
		this.nom = nom;
		this.animaux = new ArrayList<>();
	}
	/**
	 * Ajoute un animal à la liste des animaux
	 * @param animal
	 */

	public void addAnimal(Animal animal){
		animaux.add(animal);
		
	}
	/**
	 * Affiche la liste des animaux
	 */
	
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {

			System.out.println(animal.toString());
			
		} 
	}
	
	
	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}
}
