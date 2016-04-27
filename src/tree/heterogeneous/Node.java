package tree.heterogeneous;

/**
 * Created by clouway on 25.04.16.
 */
public class Node {
    int key;
    Object type;
    Node leftChild;
    Node rightChild;

    Node(int key, Object type) {
        this.key = key;
        this.type = type;
    }

    /**
     * Returning string representation of key field of class Node.
     * @return
     */
    public String toString() {
        return type +" key: " + key;
    }

}
