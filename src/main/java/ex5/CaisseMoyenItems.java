package ex5;

/**
 * CaisseMoyenItems herite de Caisse et est une caisse pour les objets de taille moyenne
 */

public class CaisseMoyenItems extends Caisse {

    /**
     * Constructeur
     * @param nom
     */
    public CaisseMoyenItems(String nom) {
        super(nom);
    }

    @Override
    public void addItem(Item item) {
        if (item.getPoids() >= 5 && item.getPoids() <= 20) {
            getItems().add(item);
        }
    }

}
