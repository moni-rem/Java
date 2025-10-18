package selfStudy;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        int number;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Input  first number");
       int number1 = scanner.nextInt();
       System.out.println("Input  second number");
       int number2 = scanner.nextInt();
       System.out.println(number1 +"*"+ number2 +"="+number1*number2);
    }
}
