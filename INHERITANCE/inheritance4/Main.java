package selfStudy.INHERITANCE.inheritance4;

public class Main {
    public static void main(String[] args) {
        HRManagement hr = new HRManagement(100);
        hr.work();
        hr.addSalary();

        Employee employee = new Employee(200);
        System.out.println("Employee salary: " + employee.getSalary());
    }
}
