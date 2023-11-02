package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial implements Omnivore<Food> {
    private String habitat;
    private String name;
    private int age;
    public Terrestrial(String habitat, String name, int age) {
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
//    @Override
//    public String toString() {
//        return "Number of Legs: " + nbrLegs;
//    }
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plant and meat.");
        } else if (food == Food.MEAT) {
            System.out.println("Terrestrial animal is eating meat.");
        } else if (food == Food.PLANT) {
            System.out.println("Terrestrial animal is eating plant.");
        } else {
            System.out.println("Terrestrial animal cannot eat this food.");
        }
    }
}
