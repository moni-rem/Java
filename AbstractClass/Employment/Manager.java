package selfStudy.AbstractClass.Employment;

class Manager extends Employee {
    private double bonus;


    public Manager(String name, double baseSalary, String department, double bonus, int overtimeHours, double hourRate) {
        super(name, baseSalary, department, overtimeHours, hourRate);
        this.bonus = bonus;
    }
    public double calculateSalary() {
        return baseSalary+(overtimeHours * hourRate) +bonus;
    }

    public void diplayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ROle : manager " );
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total salary: " + calculateSalary());
    }
    public void Assigtask(String task, String EmpName) {
        System.out.println("Task: " + task + " to : " + EmpName);
    }

    public void  workingHours(double hours) {
        this.overtimeHours = overtimeHours;
        this.hourRate = hourRate;
        if(hours > 0) {
            System.out.println("No working overtime");
        }else{
            System.out.println("Working overtime" + overtimeHours);
        }

    }

}
