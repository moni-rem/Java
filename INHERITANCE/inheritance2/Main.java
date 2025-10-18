package selfStudy.INHERITANCE.inheritance2;

import selfStudy.INHERITANCE.Inherutance.Car;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Cat();
        System.out.println("The inherited animal is cat");
        cat.makeSound();
        cat.scratch();
        System.out.println("The inherited animal is Animal");


    }
}
