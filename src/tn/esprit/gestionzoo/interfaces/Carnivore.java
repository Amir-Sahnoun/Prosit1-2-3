package tn.esprit.gestionzoo.interfaces;

import  tn.esprit.gestionzoo.enums.Food;

public interface Carnivore<T extends Food> {
    void eatMeat(T food);
}


