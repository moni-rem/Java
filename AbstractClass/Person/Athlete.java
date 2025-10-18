package selfStudy.AbstractClass.Person;

public class Athlete extends Person {
    private int hours;

    public Athlete(String name,int age,double weight,double height,String gender,String activityLevel) {
        super(name,age,weight,height,gender,activityLevel);
    }
    public double calculateCalories() {
        double bmr;
        if (gender.equalsIgnoreCase("male")) {
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }

        double multiplier = switch (activityLevel.toLowerCase()) {
            case "sedentary" -> 1.2;
            case "light" -> 1.375;
            case "moderate" -> 1.55;
            case "active" -> 1.725;
            case "very active" -> 1.9;
            default -> 1.55;
        };


        // Athletes have higher metabolism (+10%)
        return bmr * multiplier * 1.1;
    }
    public void eat() {
        System.out.println("Athlete is eating healthy");
    }
    public void exercise() {
        System.out.println("Athlete Training allow the body to build up strength and endurance improve skill and build movtivation" +
                ", ambition and confidence");
    }

    public double trackHour(int hours) {
        this.hours = hours;
        return hours;
    }
    public void DisplayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("ActivityLevel: " + activityLevel);
    }
}
