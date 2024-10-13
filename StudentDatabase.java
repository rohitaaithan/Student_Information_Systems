import java.util.HashMap;

public class StudentDatabase {
    private HashMap<String, Student> students;

    public StudentDatabase() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students.values()) {
                System.out.println(s);
            }
        }
    }
}
