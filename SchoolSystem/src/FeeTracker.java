import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FeeTracker {
    // Map fees (Double) to List of Students (to handle students with same fee amount)
    private TreeMap<Double, List<String>> feeRecords = new TreeMap<>();

    public void recordPayment(Student s) {
        // If no list exists for this fee amount, create one
        if (!feeRecords.containsKey(s.feesPaid)) {
            feeRecords.put(s.feesPaid, new ArrayList<>());
        }
        feeRecords.get(s.feesPaid).add(s.name);
    }

    public void generateClearanceReport() {
        System.out.println("\n--- Fee Clearance Report (Sorted Low to High) ---");
        // In-order traversal is automatic in TreeMap entrySet
        for (Map.Entry<Double, List<String>> entry : feeRecords.entrySet()) {
            System.out.println("Amount Paid: $" + entry.getKey() + " - Students: " + entry.getValue());
        }
    }
}