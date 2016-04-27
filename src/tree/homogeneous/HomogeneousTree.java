package tree.homogeneous;

/**
 * Created by clouway on 21.04.16.
 */
public class HomogeneousTree {
   private Node root;

    /**
     * Adding nodes in homogeneous tree
     * @param key
     */
    public void add(int key) {
        Node newNode = new Node(key);

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
     * Traversing tree casting orderedTraverse
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

        while (focusNode.key != key) {

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
     * Traversing tree by order
     * @param focusNode user for traversing
     */
    private void orderedTraverse(Node focusNode){
        if (focusNode !=null){
            orderedTraverse(focusNode.leftChild);
            System.out.println(focusNode);
            orderedTraverse(focusNode.rightChild);
        }
    }
}
