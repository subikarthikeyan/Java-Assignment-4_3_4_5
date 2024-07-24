import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {

    // HashMap to store student names and their grades
    private HashMap<String, Integer> studentGrades = new HashMap<>();

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added student: " + name + " with grade: " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }

    // Method to display a student's grade by name
    public void displayStudentGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println("Student: " + name + ", Grade: " + grade);
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }

    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        // Example usage
        while (true) {
            System.out.println("Options: 1. Add Student 2. Remove Student 3. Display Student Grade 4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int gradeToAdd = scanner.nextInt();
                    grades.addStudent(nameToAdd, gradeToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    grades.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display: ");
                    String nameToDisplay = scanner.nextLine();
                    grades.displayStudentGrade(nameToDisplay);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
