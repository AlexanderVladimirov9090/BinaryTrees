package com.gmail.alexander.vladimirov9090.tree.homogeneous;

/**
 * Created on 21.04.16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
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
