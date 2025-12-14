public class SchoolManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== MERU UNIVERSITY MANAGEMENT SYSTEM PROTOTYPE ===\n");

        // Initialize Modules
        StudentRegistry registry = new StudentRegistry();
        CourseScheduler scheduler = new CourseScheduler();
        FeeTracker fees = new FeeTracker();
        LibrarySystem library = new LibrarySystem();
        PerformanceAnalytics analytics = new PerformanceAnalytics();

        // 1. Register Students
        registry.addStudent("S001", "Alice", 5000.00);
        registry.addStudent("S002", "Bob", 3000.00);
        registry.addStudent("S003", "Charlie", 5000.00);

        // 2. Schedule Courses
        scheduler.addToQueue(registry.getStudent("S001"));
        scheduler.addToQueue(registry.getStudent("S002"));
        scheduler.processEnrollment();

        // 3. Fee Tracking
        fees.recordPayment(registry.getStudent("S001"));
        fees.recordPayment(registry.getStudent("S002"));
        fees.recordPayment(registry.getStudent("S003"));
        fees.generateClearanceReport();

        // 4. Library
        library.returnBook("Data Structures in Java");
        library.returnBook("Operating Systems Concepts");
        library.viewRecentReturns();

        // 5. Analytics
        analytics.addConnection("Alice", "CS101");
        analytics.addConnection("Alice", "MATH202");
        analytics.addConnection("Bob", "CS101");
        analytics.printConnections();
    }
}