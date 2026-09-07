package hospital;

public class EmergencyPatient {
    private String name;
    private String condition;

    public EmergencyPatient(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Patient: " + name + " | Condition: " + condition;
    }
}