package tn.esprit.gestionzoo.interfaces;

import tn.esprit.gestionzoo.enums.Food;

public interface Omnivore<T extends Food> {
    void eatPlantAndMeat(T food);
}



