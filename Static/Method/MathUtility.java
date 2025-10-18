package selfStudy.Static.Method;

public class MathUtility {
    //create method static that add 2 number together
    private static  int sum(int a, int b) {
        return a + b;
    }
    //Method for multiplication
    private static int multi(int a, int b) {
        return a * b;
    }
    //method that find the maximum number
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    //method find fuctorial
    public static int factorial(int n) {
      int result = 1;
      for (int i = 1; i <= n; i++) {
          result *= i;
      }
      return result;
    }

    //method of exponentiation
    public static int exponential(int n, int p) {
        int exponent = 1;
        for (int i = 1; i <= p; i++) {
            exponent *= n;
        }
        return exponent;
    }
    public static void main(String[] args) {
        //call the static method and add without creating an instance
        int Sum = MathUtility.sum(10,3);
        System.out.println("The Result of sum " + Sum);

        int Multi = MathUtility.multi(10,3);
        System.out.println("The Result of multi " + Multi);

        int Max = MathUtility.max(10,3);
        System.out.println("The Result of Max " + Max);

        int factorial = MathUtility.factorial(5);
        System.out.println("The Result of factorial " + factorial);

        int exponential = MathUtility.exponential(2,5);
        System.out.println("The Result of exponential " + exponential);
    }
}
