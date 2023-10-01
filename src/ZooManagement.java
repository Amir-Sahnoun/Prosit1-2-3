public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "Leonard";
        lion.age =16;
        lion.family = "Furry";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Zoogogo";
        myZoo.city = "Madagascar";
        //myZoo.nbrCages = 25;
        myZoo.animals = new Animal[22];

        Zoo myZoo1 = new Zoo();
        myZoo.name = "Wildren";
        myZoo.city = "Winston";
        //myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Plugy", "nappy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Plugy", "nappy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        Zoo zooAvecLePlusDAnimaux = Zoo.comparerZoo(myZoo, myZoo1);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecLePlusDAnimaux.displayZoo());
    }

}
