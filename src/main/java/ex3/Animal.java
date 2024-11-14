package ex3;

/**
 * Représente un animal
 * 
 */

public class Animal {

    /**
     * nom : nom de l'animal
     */

    private String nom;
    /**
     * type : type de l'animal
     */
    private String type;
    /**
     * comportement : comportement de l'animal
     */
    private String comportement;

    /**
     * Constructeur
     * @param nom nom de l'animal
     * @param type type de l'animal
     * @param comportement comportement de l'animal
     */

    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComportement() {
        return comportement;
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return "Animal [nom=" + nom + ", type=" + type + ", comportement=" + comportement + "]";
    }

    



}
