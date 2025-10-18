package selfStudy;

import java.util.Scanner;

public class BasicArimeticOperation {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter first number");
int number1 = scanner.nextInt();
System.out.println("enter second number");
int number2 = scanner.nextInt();
System.out.println("Enter the operation (add, subtract, multiply, divide)");
String operation = scanner.next();
switch(operation){
    case "add":
        System.out.println(number1 + number2);
        break;
        case "subtract":
            System.out.println(number1 - number2);
            break;
            case "multiply":
                System.out.println(number1*number2);
                break;
                case "divide":
                    System.out.println(number1/number2);
                    break;
                    default:
                        System.out.println("Invalid operation");
                        break;
}
    }
}
