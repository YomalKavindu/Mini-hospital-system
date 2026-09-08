package hospital;

public class EmergencyNode {
    public EmergencyPatient data;
    public EmergencyNode next; // Points to the next person in line

    public EmergencyNode(EmergencyPatient data) {
        this.data = data;
        this.next = null;
    }
}