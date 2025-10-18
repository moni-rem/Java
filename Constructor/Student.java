package selfStudy.Constructor;

public class Student {
    private int StudentID;
    private String StudentName;
    private int grade;

//    //defualt constructor
//    public  Student(){
//       //call the parameterized constructor with default values
//        this(0,"Unknown", 12);
//    }

    public  Student(int StudentID, String StudentName, int grade){
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.grade = grade;
    }

    //using function getter
    public int getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getGrade() {
        return grade;
    }

    //method that use to check if student pass the class
    public boolean isPassed(){
        if(this.grade >= 50){
            System.out.println("Passed");
            return true;
        }
        else {
            return false;
        }
    }

    //using the short cut
//    public boolean passed(){
//        return this.grade >= 50;
//    }


    public static void main(String[] args) {
        Student s1 = new Student(1, "John Doe", 1);
        Student s2 = new Student(2, "Jane Doe", 67);
        System.out.println(s1.isPassed());
        System.out.println(s2.isPassed());
    }
}
