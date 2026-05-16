package MANAGEMENT;

public class STUDENT {
    String name;
    int age;
    int Semester;
    String Department;
    String College;

    //CONSTRUCTOR

    public STUDENT(String name,int age,String Department, int Semester, String College){
        this.name = name;
        this.age = age;
        this.Department = Department;
        this.Semester = Semester;
        this.College = College;
        System.err.println("Student created: " + name);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + Department);
        System.out.println("Semester: " + Semester);
        System.out.println("College: " + College);
    }
    
    

}
