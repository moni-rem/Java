package selfStudy;
 import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter he number ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //calcluate and display the digit
        System.out.println("The sum of digit is: " + sumdigit(n));
    }

    public static int sumdigit(int n) {
        int sum = 0;                     /*example  456   sum = 0+ 6 = 6 ->  n 456/10 = 45  -> sum = 6+5 = 11 ->n= 45/10 = 4  ->sum =  11+4= 15*/
        while (n != 0){
            sum = sum + n  % 10;
            n = n / 10;
        }
        return sum;
    }
}
