package com.example.textTask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

@Component
class Cat extends Animal {

    public Cat(@Value("${cat.name}") String name) {
        super(name);
    }
}

@Component
class Dog extends Animal {

    public Dog(@Value("${dog.name}") String name) {
        super(name);
    }
}

@Component
class Parrot extends Animal {

    public Parrot(@Value("${parrot.name}") String name) {
        super(name);
    }
}

