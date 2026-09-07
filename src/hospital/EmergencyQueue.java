package hospital;

public class EmergencyQueue {
    private EmergencyNode front; // The first person in line
    private EmergencyNode rear;  // The last person in line

    public EmergencyQueue() {
        this.front = null;
        this.rear = null;
    }

    
    public void enqueue(EmergencyPatient patient) {
        EmergencyNode newNode = new EmergencyNode(patient);

        
        if (rear == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        
        rear.next = newNode;
        rear = newNode;
    }

    
    public EmergencyPatient dequeue() {
        if (front == null) {
            System.out.println("The emergency queue is empty. No patients waiting.");
            return null;
        }

       
        EmergencyPatient patientData = front.data;
        
        
        front = front.next;

        
        if (front == null) {
            rear = null;
        }

        return patientData;
    }


    public void displayQueue() {
        if (front == null) {
            System.out.println("The emergency queue is empty.");
            return;
        }

        System.out.println("\n--- Emergency Queue (Front to Back) ---");
        EmergencyNode current = front;
        int position = 1;
        while (current != null) {
            System.out.println(position + ". " + current.data.toString());
            current = current.next;
            position++;
        }
        System.out.println("---------------------------------------");
    }
}