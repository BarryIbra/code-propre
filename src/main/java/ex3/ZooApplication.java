package ex3;
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Animal animal1 = new Animal("Gazelle", "mamifère", "Herbivore");
		Animal animal2 = new Animal("Zèbre", "mamifère", "Herbivore");
		Animal animal3 = new Animal("Lion", "mamifère", "Carnivore");
		Animal animal4 = new Animal("Panthère", "mamifère", "Carnivore");
		Animal animal5 = new Animal("Requin blanc", "poisson", "Carnivore");
		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		zoo.addAnimal(animal4);
		zoo.addAnimal(animal5);
		zoo.afficherListeAnimaux();
	}

}