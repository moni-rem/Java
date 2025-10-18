package selfStudy.AbstractClass.Person;

abstract class Person {
    public abstract void eat();
    public abstract void exercise();
    public abstract double trackHour(int hours);

    protected String name;
    protected int age;
    protected double weight;
    protected double height;
    protected String gender;
    protected String activityLevel;

    public Person(String name,int age,double weight,double height,String gender,String activityLevel) {
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.height = height;
       this.gender = gender;
       this.activityLevel = activityLevel;
    }
    public abstract double calculateCalories();

    public abstract void DisplayInfo();


}
