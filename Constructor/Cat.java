package selfStudy.Constructor;

//trying to use defualt constructor
public class Cat {

    private String name;
    private int age;

    //this is the defualt Constructor
    public Cat(){
        //Initialize name to "unknown"
        this.name = "Unknown";
        this.age = 0;
    }
    //using getting
    public String getName() {
        return name;
    }
    public int getage(){
        return age;
    }

    public static void main(String[] args) {
        Cat mycat = new Cat();
        System.out.println(mycat.getName());
        System.out.println(mycat.getage());
    }
}
