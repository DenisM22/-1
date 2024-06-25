package com.example.textTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {

    private String name;
    public List<Animal> animals;

    @Autowired
    public Person(List<Animal> animals) {
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
