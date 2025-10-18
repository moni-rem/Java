package selfStudy.INHERITANCE.inheritance4;

public class HRManagement extends Employee {

    public HRManagement(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HRManagement works");
    }

    public void addSalary() {
        System.out.println("HRManagement adds salary");
    }
}
