package hospital;

public class PatientRecord {
    public int patientId; // This is the key we use to sort the tree
    private String name;
    private int age;

    public PatientRecord(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + patientId + " | Name: " + name + " | Age: " + age;
    }
}