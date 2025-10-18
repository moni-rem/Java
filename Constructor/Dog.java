package selfStudy.Constructor;


public class Dog {
    private String name;
    private String color;
    private double weight;
    private boolean trained;
    private int BarkCount;


    //tring to use parameter COnstructor
    public Dog(String name, String color, double weight, boolean trained) {
        this.name = name;
        this.color = color;
        this.trained = trained;
        this.weight = weight;
        this.BarkCount = 0;

    }


    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isTrained() {
        return trained;
    }

    public int getBarkCount() {
        return BarkCount;
    }

    // write a method to check if the dog is more than 20 kg
    public boolean isLargeBreed() {
        return weight > 20.0;
    }

    //write the method of bark
    public void Bark() {
        BarkCount++;
        System.out.println("Bark Count: " + BarkCount);
    }

    // Compare colors of two dogs
    public static void compareColor(Dog d1, Dog d2) {
        if (d1.color.equalsIgnoreCase(d2.color)) {
            System.out.println(d1.name + " and " + d2.name + " have the same color: " + d1.color);
        } else {
            System.out.println(d1.name + " is " + d1.color + " and " + d2.name + " is " + d2.color);
        }
    }

        public static void main (String[]args){
            //create a new dog object using the paremeterized constructor
            Dog dog1 = new Dog("Dog", "blue", 0.5, true);
            Dog dog2 = new Dog("Dog", "red", 30, false);

            //Barking
            dog1.Bark();
            dog1.Bark();
            dog2.Bark();

            // Compare colors
            Dog.compareColor(dog1, dog2);

            // Check large breed
            System.out.println(dog1.getName() + " is large breed? " + dog1.isLargeBreed());
            System.out.println(dog2.getName() + " is large breed? " + dog2.isLargeBreed());
        }

}
