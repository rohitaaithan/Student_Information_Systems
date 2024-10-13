import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void printCourses() {
        if (courses.isEmpty()) {
            System.out.println(name + " has not enrolled in any courses.");
        } else {
            System.out.println("Courses enrolled by " + name + ":");
            for (Course c : courses) {
                System.out.println(c.getCourseName());
            }
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
