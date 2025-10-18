package selfStudy;

import java.util.Scanner;

public class compare2Number {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        if(number1 > number2) {
            System.out.println(number1 +"> " + number2);
        }
        else if(number1 < number2) {
            System.out.println(number1 + "< " + number2);
        }
        else if(number1 == number2) {
            System.out.println(number1 + "==" + number2);
        }
        else {
            System.out.println(number1 + "!=" + number2);
        }


    }
}
