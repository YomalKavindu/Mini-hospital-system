package hospital;

public class BSTNode {
    public PatientRecord data;
    public BSTNode left;  // Points to a node with a smaller ID
    public BSTNode right; // Points to a node with a larger ID

    public BSTNode(PatientRecord data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}