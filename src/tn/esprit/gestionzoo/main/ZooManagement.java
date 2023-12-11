package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);


        // Animal aquatique
//        Aquatic aquaticAnimal = new Aquatic("Ocean");

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial(4);

        // Dauphin
        Dolphin dolphin = new Dolphin("Ocean", 20.5f);

        // Pingouin
        Penguin penguin = new Penguin("Antarctica", 30.0f);

        // Affichez les objets créés en utilisant la méthode toString()
//        System.out.println("Aquatic Animal: " + aquaticAnimal);
        System.out.println("Terrestrial Animal: " + terrestrialAnimal);
        System.out.println("Dolphin: " + dolphin);
        System.out.println("Penguin: " + penguin);

//        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();

        // Créez des animaux aquatiques
//        Aquatic aquaticAnimal1 = new Aquatic("Ocean");
//        Aquatic aquaticAnimal2 = new Aquatic("Lake");

        // Ajoutez des animaux aquatiques au zoo
//        myZoo.addAquaticAnimal(aquaticAnimal1);
//        myZoo.addAquaticAnimal(aquaticAnimal2);

        // Affichez la méthode swim() de tous les animaux aquatiques dans le zoo
        for (int i = 0; i < myZoo.getNbrAquaticAnimals(); i++) {
            Aquatic aquatic = myZoo.getAquaticAnimal(i);
            aquatic.swim();
        }

        // Créez des dauphins et des pingouins
        Dolphin dolphin1 = new Dolphin("Ocean", 20.0f);
        Penguin penguin1 = new Penguin("Antarctica", 30.0f);
        Dolphin dolphin2 = new Dolphin("Ocean", 18.0f);
        Penguin penguin2 = new Penguin("Antarctica", 28.0f);

        // Ajoutez des dauphins et des pingouins au zoo
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin2);

        // Appelez la méthode maxPenguinSwimmingDepth() pour obtenir la profondeur maximale
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("Max Penguin Swimming Depth: " + maxDepth);
        // Appelez la méthode displayNumberOfAquaticsByType() pour afficher les nombres
        myZoo.displayNumberOfAquaticsByType();
    }


}