package selfStudy.AbstractClass.Person;

public class Main {
    public static void main(String[] args) {
        Person athlete = new Athlete("mony",19,50,1.68,"Female","Medium");
       // Person lazyPerson = new LazyPerson();

        athlete.exercise();
        athlete.eat();
        athlete.DisplayInfo();

        double calories = athlete.calculateCalories(); // call method
        System.out.printf("%s's daily calorie need is: %.2f kcal%n", athlete.name, calories);


//        lazyPerson.exercise();
//        lazyPerson.eat();
//        lazyPerson.trackHour(5);
    }
}
