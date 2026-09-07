package hospital;

public class VisitLikedList {
    private VisitNode head;  //string point of the list

    public VisitLikedList(){
        this.head = null; //the linkedlist start empty
    }
    //method to add a new visit to the end of the list
    public void addVisit(PatientVisit visit) {
        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            head == newNode;
            return;
        }
        VisitNode current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }
    // Method to display all visits
    public void displayHistory() {
        if (head == null) {
            System.out.println("No visit history found. The list is empty.");
            return;
        }

        System.out.println("\n--- Patient Visit History ---");
        VisitNode current = head;
        while (current != null) {
            System.out.println(current.visitData.toString());
            current = current.next; // Move to the next link in the chain
        }
        System.out.println("-----------------------------");
    }

}
