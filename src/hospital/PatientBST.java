package hospital;

public class PatientBST {
    private BSTNode root;

    public PatientBST() {
        this.root = null;
    }

    
    public void insert(PatientRecord record) {
        root = insertRecursive(root, record);
    }

    private BSTNode insertRecursive(BSTNode current, PatientRecord record) {
        
        if (current == null) {
            return new BSTNode(record);
        }

        
        if (record.patientId < current.data.patientId) {
            current.left = insertRecursive(current.left, record);
        } else if (record.patientId > current.data.patientId) {
            current.right = insertRecursive(current.right, record);
        }
        
        return current; 
    }

    
    public PatientRecord search(int id) {
        BSTNode resultNode = searchRecursive(root, id);
        if (resultNode != null) {
            return resultNode.data;
        }
        return null; 
    }

    private BSTNode searchRecursive(BSTNode current, int id) {
        
        if (current == null || current.data.patientId == id) {
            return current;
        }

        
        if (current.data.patientId > id) {
            return searchRecursive(current.left, id);
        }

        
        return searchRecursive(current.right, id);
    }


    public void displayInOrder() {
        if (root == null) {
            System.out.println("No patient records found.");
            return;
        }
        System.out.println("\n--- Patient Records (Sorted by ID) ---");
        inOrderRecursive(root);
        System.out.println("--------------------------------------");
    }

    private void inOrderRecursive(BSTNode current) {
        if (current != null) {
            inOrderRecursive(current.left);         
            System.out.println(current.data);       
            inOrderRecursive(current.right);        
        }
    }
}