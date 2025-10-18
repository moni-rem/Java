package selfStudy.INHERITANCE.Inherutance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        Bicycle bicycle = new Bicycle();
        bicycle.go();

        System.out.println(car.gear);
        System.out.println(bicycle.wheels);
    }
}
