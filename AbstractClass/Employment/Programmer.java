package selfStudy.AbstractClass.Employment;

 class Programmer extends Employee {
     private String CurrentProject;
     private String projectName;
     private double bonus;


     public Programmer(String name, double baseSalary, String department, double bonus, int overtimeHours, double hourRate) {
         super(name, baseSalary, department, overtimeHours, hourRate);
         this.bonus = bonus;

     }
     public double calculateSalary() {
         return baseSalary + (overtimeHours * hourRate);
     }

     @Override
     public void diplayInfo() {
         System.out.println("Name: " + name);
         System.out.println("ROle : PROGRAMMER ");
         System.out.println("Overtime hours: " + overtimeHours);
         System.out.println("Hour rate: " + hourRate);
         System.out.println("baseSalary: " + baseSalary);
         System.out.println("total Salary: " + calculateSalary());
         System.out.println("Current Project: " + CurrentProject);
         System.out.println("Project Name: " + projectName);
     }



     public void workingHours(double hours) {
         this.overtimeHours = overtimeHours;
         this.hourRate = hourRate;
         if (hours > 0) {
             System.out.println("No working overtime");
         } else {
             System.out.println("Working overtime" + overtimeHours);
         }

     }

     public void trackWorking(String completeProject) {
         this.CurrentProject = projectName;
         System.out.println("The is now working :" + completeProject);
     }

     public void completeProject(String completeProject) {
         this.CurrentProject = completeProject;
         if (completeProject != null) {
             System.out.println("The Employee have completed the project :" + completeProject);
         } else {
             System.out.println("The Employee have not completed the project :" + completeProject);
         }
     }

     public boolean hasovertime() {
         return overtimeHours >= 0;
     }
 }




