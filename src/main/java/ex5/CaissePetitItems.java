package ex5;


/**
 * CaissePetitItems herite de Caisse et est une caisse pour les objets de petite taille
 */

public class CaissePetitItems extends Caisse {



    /**
     * Constructeur
     * @param nom
     */
    public CaissePetitItems(String nom) {
        super(nom);
    }

    @Override
    public void addItem(Item item) {
        if (item.getPoids() < 5) {
            getItems().add(item);
        }
    }

}
