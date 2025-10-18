package selfStudy;
import java.util.Scanner;


public class SumOfTwoBinary {
    public static void main(String[] args) {
        //declare the variable
        int binary1, binary2;
        int i = 0, remainder = 0;
        //create an array to store the sum of 2value
        int[] sum = new int[30];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first Binary number");
        binary1 = sc.nextInt();
        System.out.println("enter the second Binary number");
        binary2 = sc.nextInt();

        if(binary1 == 0 && binary2 == 0){
            System.out.println("The sum is 0");
        }
        else{

        }

    }
}

