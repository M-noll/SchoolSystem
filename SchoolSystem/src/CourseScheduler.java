import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduler {
    private Queue<Student> waitlist = new LinkedList<>();

    public void addToQueue(Student s) {
        waitlist.add(s);
        System.out.println("[Scheduler] Added to waitlist: " + s.name);
    }

    public void processEnrollment() {
        System.out.println("\n--- Processing Enrollment ---");
        while (!waitlist.isEmpty()) {
            Student s = waitlist.poll(); // Dequeue
            System.out.println("Enrolled: " + s.name);
        }
    }
}