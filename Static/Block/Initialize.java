package selfStudy.Static.Block;

public class Initialize {

    static int initialvalue;

    //static block to initialize initialvalue
    static {
        initialvalue = 1000;
        System.out.println(initialvalue);
    }

    public static void main(String[] args) {
        System.out.println(Initialize.initialvalue);
        System.out.println(Initialize.initialvalue);
    }
}
