package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic implements Carnivore<Food> {
    private String habitat;
    private String name;
    private int age;

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }
    public Aquatic(String habitat, String name, int age) {
        this.habitat = habitat;
        this.name = name;
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Déclarez la méthode swim() comme abstraite
    public abstract void swim();

    // Redéfinissez la méthode equals() pour comparer les animaux aquatiques
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return name.equals(other.name) && age == other.age && habitat.equals(other.habitat);
    }
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat this food.");
        }
    }
}
