package hospital;

public class Treatment {
    private final String patientName;
    private final String treatmentDescription;
    private final String doctorName;

    public Treatment(String patientName, String treatmentDescription, String doctorName){
        this.patientName = patientName;
        this.treatmentDescription = treatmentDescription;
        this.doctorName = doctorName;

    }
    @Override 
    public String toString(){
        return "Patient: " + patientName + "Treatment: " + treatmentDescription + "Doctor Name: " + doctorName;
    }
}
