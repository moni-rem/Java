package selfStudy.INHERITANCE.inheritance4;

public class Employee {

    private int salary;

    // ✅ Proper constructor (no return type)
    public Employee(int salary) {
        this.salary = salary;
        System.out.println("Employee created with salary: " + salary);
    }

    public void work() {
        System.out.println("Employee works");
    }

    public int getSalary() {
        return salary;
    }
}
