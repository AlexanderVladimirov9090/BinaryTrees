package com.gmail.alexander.vladimirov9090.tree.heterogeneous;

/**
 * Created on 25.04.16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
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
