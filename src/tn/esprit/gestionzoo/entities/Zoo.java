package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name,city;
    private static final int nbrCages=25;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals; // Tableau pour les animaux aquatiques
    private int nbrAquaticAnimals; // Nombre d'animaux aquatiques actuellement dans le zoo


    public Zoo() {
    }
    public  Zoo(String name,String city){
        animals = new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.aquaticAnimals = new Aquatic[10]; // Initialise le tableau pour 10 animaux aquatiques
        this.nbrAquaticAnimals = 0; // Au début, il n'y a pas d'animaux aquatiques
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The tn.esprit.gestionzoo.entities.Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals);
    }
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }


    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;

        for (int i = indexAnimal; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }
    boolean isZooFull(){
        return animals.length==nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            return z1;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < 10) { // Vérifie si le tableau n'est pas plein
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println("Added an aquatic animal to the zoo.");
        } else {
            System.out.println("The aquatic animals area is full. Cannot add more.");
        }
    }
    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }
    public Aquatic getAquaticAnimal(int index) {
        if (index >= 0 && index < nbrAquaticAnimals) {
            return aquaticAnimals[index];
        } else {
            return null; // Return null if the index is out of bounds
        }
    }

    // Ajoutez cette méthode pour trouver la profondeur maximale des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1.0f; // Initialise à une valeur négative pour trouver la profondeur maximale

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i]; // Cast vers Penguin
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numDolphins = 0;
        int numPenguins = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                numDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                numPenguins++;
            }
        }

        System.out.println("Number of Dolphins: " + numDolphins);
        System.out.println("Number of Penguins: " + numPenguins);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals;
    }
}
