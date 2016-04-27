package tree.homogeneous;

/**
 * Created by clouway on 21.04.16.
 */
public class Node {
    int key;
    Node leftChild;
    Node rightChild;

    Node(int key) {
        this.key = key;

    }

    /**
     * Returning string representation of key field of class Node.
     * @return
     */
    public String toString() {
        return " key: " + key;
    }
}
