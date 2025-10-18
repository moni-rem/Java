package selfStudy.AbstractClass.Shape;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;
    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public double calculatePerimeter() {
        return size1 + size2 + size3;
    }
    public double calculateArea() {
        double s =(size1+size2+size3)/2;
        return Math.sqrt(s*(s-size1)*(s-size2)*(s-size3));
    }
}
