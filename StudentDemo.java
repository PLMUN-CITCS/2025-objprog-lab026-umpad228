class Student {
    private int studentID;
    private String name;
    private double gpa;
    private static int studentCount = 0;

    // Constructor
    public Student(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
        studentCount++;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", GPA: " + gpa);
    }

    // Method to get total student count
    public static int getStudentCount() {
        return studentCount;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student(101, "Alice", 3.8);
        Student student2 = new Student(102, "Bob", 3.5);
        Student student3 = new Student(103, "Charlie", 3.9);
        
        // Display student details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        
        // Display total number of students
        System.out.println("Total students: " + Student.getStudentCount());
    }
}