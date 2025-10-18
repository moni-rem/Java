package selfStudy;
import java.util.Scanner;
public class AverOfThreeNum {
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = User.nextInt();
        System.out.println("Enter the second number ");
        int b = User.nextInt();
        System.out.println("Enter the third number ");
        int c = User.nextInt();
        float ave = (a+b+c)/3;
        System.out.println("The average of three numbers is "+ave);
    }
}
