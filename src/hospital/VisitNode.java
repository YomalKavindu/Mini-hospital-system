package hospital;

public class VisitNode {

    public PatientVisit visitDate; //visit actual date
    public VisitNode next;   //the next node pointer

    public VisitNode(PatientVisit visitData) {
        this.visitDate = visitData;
        this.next = null; //null node created

    }
}