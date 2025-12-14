public class Student {
    String id;
    String name;
    double feesPaid;

    public Student(String id, String name, double feesPaid) {
        this.id = id;
        this.name = name;
        this.feesPaid = feesPaid;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}
