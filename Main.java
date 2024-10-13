import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDatabase studentDatabase = new StudentDatabase();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Information System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course to Student");
            System.out.println("3. View Student Courses");
            System.out.println("4. List All Students");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    studentDatabase.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    Student foundStudent = studentDatabase.getStudent(studentId);
                    if (foundStudent != null) {
                        System.out.print("Enter course code: ");
                        String courseCode = scanner.nextLine();
                        System.out.print("Enter course name: ");
                        String courseName = scanner.nextLine();
                        Course course = new Course(courseCode, courseName);
                        foundStudent.addCourse(course);
                        System.out.println("Course added successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    String searchId = scanner.nextLine();
                    Student searchStudent = studentDatabase.getStudent(searchId);
                    if (searchStudent != null) {
                        searchStudent.printCourses();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    studentDatabase.listStudents();
                    break;

                case 5:
                    System.out.print("Enter student ID: ");
                    String removeId = scanner.nextLine();
                    studentDatabase.removeStudent(removeId);
                    System.out.println("Student removed.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 6);

    }
}
