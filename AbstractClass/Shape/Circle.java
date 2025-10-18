package selfStudy.AbstractClass.Shape;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double CalculateArea() {
        return Math.PI * radius *radius;
    }
    public double CalculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
