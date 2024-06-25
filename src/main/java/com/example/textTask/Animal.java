package com.example.textTask;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}

class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }
}
