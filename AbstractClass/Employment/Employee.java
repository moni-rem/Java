package selfStudy.AbstractClass.Employment;

abstract class Employee {
    protected String name;
    protected double baseSalary;
    protected String department;
    protected int overtimeHours;
    protected double hourRate;
    public Employee(String name, double baseSalary, String department, int overtimeHours, double hourRate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
        this.overtimeHours = overtimeHours;
        this.hourRate = hourRate;
    }
    public double getHourRate(){
        return hourRate;
    }
    public void setHourRate(double hourRate){
        this.hourRate = hourRate;
    }
    public int getOvertimeHours() {
            return overtimeHours;
    }
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public abstract double calculateSalary();
    public abstract void diplayInfo();

}
