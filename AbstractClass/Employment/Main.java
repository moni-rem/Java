package selfStudy.AbstractClass.Employment;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("lyly",1500,"IT",120,12,25);
        Programmer programmer = new Programmer("mony",1000,"IT",0,50,25);
        manager.diplayInfo();
        manager.Assigtask("Employee Management system","Mony");
        System.out.println();
        programmer.diplayInfo();
        programmer.trackWorking("Employee Management system");

    }
}
