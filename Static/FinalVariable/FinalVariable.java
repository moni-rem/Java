package selfStudy.Static.FinalVariable;

public class FinalVariable {
    public static double PI = 3.14159;

    public static double area(double a, double b) {
        return PI * a * b;
    }
    public static void main(String[] args) {
        double Area = FinalVariable.area(5,5);
        System.out.println(Area);
    }
}
