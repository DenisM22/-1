package com.example.textTask;

import java.util.List;

public class Person {

    private String name;
    public List<Animal> animals;

    public Person(String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void showAnimals() {
        for (Animal animal : this.animals) {
            System.out.println(animal.getName());

        }
    }


}
