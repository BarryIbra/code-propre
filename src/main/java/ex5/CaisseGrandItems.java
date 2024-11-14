package ex5;



/**
 * CaisseGrandItems herite de Caisse et est une caisse pour les objets de grande taille
 */

public class CaisseGrandItems extends Caisse{



    /**
     * Constructeur
     * @param nom
     */
    public CaisseGrandItems(String nom) {
        super(nom);
    }

    @Override
    public void addItem(Item item) {
        if (item.getPoids() >= 20) {
            getItems().add(item);
        }
    }

}
