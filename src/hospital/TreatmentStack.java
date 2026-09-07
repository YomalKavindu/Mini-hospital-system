package hospital

public class TreatmentStack {
    private TreatmentNode top;

    public TreatmentStack() {
        this.top = null;

    }
    public void push(Treatment  treatment) {
        hospital.TreatmentNode newNode = new TreatmentNode(treatment);
        newNode.next = top;
        top = newNode;
    }
    //remove the treatment stack
    public Treatment pop(){
        if (top == null){
            System.out.println("The Treatment history is empty.nothing to undo.");
            return null;
        }
        Treatment poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    public void displayStack() {
        if (top == null) {
            System.out.println("The treatment history empty.");
            return;
        }
        System.out.println("\n--- Treatment History ---");
        TreatmentNode current = top;
        while (current != null){
            System.out.println(current.data.toString());
            current = current.next;
        }
        System.out.println("---------------------------------------------------");
    }

}
