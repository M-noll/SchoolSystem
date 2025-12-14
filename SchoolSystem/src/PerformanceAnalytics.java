import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerformanceAnalytics {
    private Map<String, List<String>> studentSubjects = new HashMap<>();

    public void addConnection(String studentName, String subject) {
        if (!studentSubjects.containsKey(studentName)) {
            studentSubjects.put(studentName, new ArrayList<>());
        }
        studentSubjects.get(studentName).add(subject);
        System.out.println("[Analytics] Linked " + studentName + " -> " + subject);
    }

    public void printConnections() {
        System.out.println("\n--- Student-Subject Graph Connections ---");
        for (String student : studentSubjects.keySet()) {
            System.out.println(student + " is taking: " + studentSubjects.get(student));
        }
    }
}
