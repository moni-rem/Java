package selfStudy.AbstractClass.AnimalClass;

public class Main {
    public static void main(String[] args) {
      Animal lion = new Lion();
      //call the method sound
        lion.sound();
        lion.eat();

        Animal tiger = new Tiger();
        tiger.sound();
    }
}
