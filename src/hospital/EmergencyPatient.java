package hospital;

public class EmergencyPatient {
    private final String name;
    private final String condition;

    public EmergencyPatient(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Patient: " + name + " | Condition: " + condition;
    }
}