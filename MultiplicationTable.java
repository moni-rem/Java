package selfStudy;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the  number: ");
      int x = sc.nextInt();
      int y;
     for(int i = 1; i <=10; i++){
         y = x*(i) ;
         System.out.println(x+"*"+(i)+"="+y);
     }
    }
}
