package hospital;

public class PatientVisit {
    private String patientName;
    private String date;
    private String reason;

    public PatientVisit(String patientName, String date, String reason) {
        this.patientName = patientName;
        this.date = date;
        this.reason = reason;
    }

    // A simple method to print the visit details nicely
    @Override
    public String toString() {
        return "Patient: " + patientName + " | Date: " + date + " | Reason: " + reason;
    }
}