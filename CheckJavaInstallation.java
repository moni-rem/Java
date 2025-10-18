package selfStudy;

public class CheckJavaInstallation {
    public static void main(String[] args) {

        //display java version
        System.out.println("JAva version: " + System.getProperty("java.version"));
        //display java run time
         System.out.println("Java version: " + System.getProperty("java.runtime.version"));
         //display java home directory
        System.out.println("Java home: " + System.getProperty("java.home"));
        //display java vendor home
        System.out.println("Java ventor: " + System.getProperty("java.vendor"));
        //display java ventor URL
        System.out.println("Java version URL: " + System.getProperty("java.ventor.url"));
        //display class path
        System.out.println("Java path: " + System.getProperty("java.class.path "));
    }
}
