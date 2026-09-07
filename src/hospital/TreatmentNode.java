package hospital;

public class TreatmentNode {
    public Treatment data;
    public TreatmentNode next;  //point to the node below this one

    public TreatmentNode (Treatment data) {
        this.data = data;
        this.next = null;
    }
}