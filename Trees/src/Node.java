public class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            root = null;

        }
        public void insert(int key){
            Node newNode = new Node(key);
            if (root==null){
                root = newNode;
                return;
            }
            while (root!=null){
                

            }
        }

    }
}