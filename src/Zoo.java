import java.util.Arrays;

class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int nbrCages=25;
    int nbrAnimals;


    public Zoo() {
    }
    public  Zoo(String name,String city){
        animals = new Animal[nbrCages];
        this.name=name;
        this.city=city;
    }
    public String displayZoo(){
        return "Name: "+name+" ciy: "+city+"nb de cages"+nbrCages;
    }
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++)
            if (animal.name.equals(animals[i].name))
                return i;
        return index;
    }
    //Prosit 3
    boolean isZooFull(){
        return animals.length==nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            // Si les deux zoos ont le même nombre d'animaux, renvoyez l'un des deux (par exemple, z1).
            return z1;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }
}
