package MANAGEMENT;
import java.util.*;
public class APP{
    public static void main (String[] args){
        System.out.println("----------WELCOME TO COLLEGE MANAGEMENT PORTAL----------");
        Map<String, String> CDet = new HashMap<>();
        Map<String, String> DDet = new HashMap<>();
        Map<String, Integer> SDet = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while(running){
            System.out.println("Select your choice: ");
            System.out.println("1. New Admission");
            System.out.println("2. Student Details");
            System.out.println("3. View Department Details");
            System.out.println("4. View Semester Details");
            System.out.println("5. Exit");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch(choice){
            case 1:
                System.out.println("----------New Admission----------");
                System.out.println("Enter your College: ");
                String College = sc.nextLine();
                System.out.println("Enter your name: ");
                String name = sc.nextLine();
                System.out.println("Enter your age: ");
                int age;
                try { age = Integer.parseInt(sc.nextLine()); } catch (Exception ex) { age = 0; }
                System.out.println("Enter your Department: ");
                String Department = sc.nextLine();
                System.out.println("Enter your Semester: ");
                int Semester;
                try { Semester = Integer.parseInt(sc.nextLine()); } catch (Exception ex) { Semester = 0; }
                System.out.println("-------Admission Successful !!!!-----------");
                STUDENT s1 = new STUDENT(name, age, Department, Semester, College);
                SDet.put(name, Semester);
                CDet.put(name, College);
                DDet.put(name, Department);

                System.out.println("\nPress Enter to Return to the main Menu.....");
                sc.nextLine();
                break;
            case 2:
                System.out.println("Enter student's name: ");
                String studentNameForCollege = sc.nextLine();
                System.out.println("College Details:");
                System.out.println("College: " + CDet.get(studentNameForCollege) + "\nSemester: " + SDet.get(studentNameForCollege) + "\nDepartment: " + DDet.get(studentNameForCollege));
                System.out.println("\nPress Enter to Return to the main Menu.....");
                sc.nextLine();
                break;
            case 3:
                System.out.println("Enter student's name: ");
                String studentNameForDept = sc.nextLine();
                System.out.println("Department Details:");
                System.out.println("Department: " + DDet.get(studentNameForDept));
                System.out.println("\nPress Enter to Return to the main Menu.....");
                sc.nextLine();
                break;
            case 4:
                System.out.println("Enter student's name: ");
                String studentNameForSem = sc.nextLine();
                System.out.println("Semester Details:");
                System.out.println("Semester: " + SDet.get(studentNameForSem));
                System.out.println("\nPress Enter to Return to the main Menu.....");
                sc.nextLine();
                break;
            case 5:
                System.out.println("----------THANK YOU FOR USING THE PORTAL----------");
                running = false;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        }
        sc.close();
    }
}

