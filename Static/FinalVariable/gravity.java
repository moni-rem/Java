package selfStudy.Static.FinalVariable;

public class gravity {
    private static final double GRAVITY = 9.81;  //m/s^2
    private static final double SPEEDOFLIGHT = 3e8;   // m/s
    private static final double PLANCK_CONSTANT = 6.626e-34;  //Js

    //method to display constants
    public static void displayConstains(){
        System.out.println("Gravitational Force (g) = " + GRAVITY + " m/s^2");
        System.out.println("Speed of Light (c) = " + SPEEDOFLIGHT + " m/s");
        System.out.println("Planck Constant (h) = " + PLANCK_CONSTANT + " Js");
    }
      public static void main(String[] args) {
        displayConstains();
      }
}
