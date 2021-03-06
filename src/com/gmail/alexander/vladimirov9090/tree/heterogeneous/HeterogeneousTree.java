package com.gmail.alexander.vladimirov9090.tree.heterogeneous;


/**
 * Created on 25.04.16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class HeterogeneousTree {
    private Node root;
    /**
     * Adding nodes in heterogeneous com.gmail.alexander.vladimirov9090.tree
     * @param key
     */
    public void add(int key, Object object) {
        Node newNode = new Node(key , object);

        if (root == null) {
            root = newNode;

        } else {
            Node focusNode = root;
            Node parent;

            if (findNode(key) == null) {
                while (true) {
                    parent = focusNode;

                    if (key < focusNode.key) {
                        focusNode = focusNode.leftChild;

                        if (focusNode == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    } else {
                        focusNode = focusNode.rightChild;

                        if (focusNode == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }
            }
        }
    }

    /**
     * Traversing com.gmail.alexander.vladimirov9090.tree
     */
    public void traverse(){
        orderedTraverse(root);
    }
    /**
     * Searching of existing node if not return null;
     * @param key value is used for search
     * @return
     */
    public Node findNode(int key) {
        Node focusNode = root;

        while (focusNode.key !=key) {

            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;

            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    /**
     *
     * @param focusNode
     */
    private void orderedTraverse(Node focusNode){
        if (focusNode !=null){
            orderedTraverse(focusNode.leftChild);
            System.out.println(focusNode);
            orderedTraverse(focusNode.rightChild);
        }
    }
}

