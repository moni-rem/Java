package selfStudy.AbstractClass.Shape;

public class Main {
    public static void main(String[] args) {
       double r = 1.0;

        Circle circle = new Circle(r);
        System.out.println(circle.CalculatePerimeter());
        System.out.println(circle.CalculateArea());

      double s1 = 1.0,s2 = 2.0,s3 = 3.0;
      Triangle t = new Triangle(s1,s2,s3);
      System.out.println(t.calculatePerimeter());
    }
}
