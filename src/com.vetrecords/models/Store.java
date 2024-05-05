package com.vetrecords.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Animal> animals;

    public Store() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
