import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> registry = new HashMap<>();

    public void addStudent(String id, String name, double fees) {
        Student s = new Student(id, name, fees);
        registry.put(id, s);
        System.out.println("[Registry] Registered: " + s);
    }

    public Student getStudent(String id) {
        return registry.get(id);
    }
}
