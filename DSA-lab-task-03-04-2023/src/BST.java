public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }
    public static Node insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = insertNode(root.left, value);

        } else {
            root.right = insertNode(root.right, value);
        }
        return root;
    }
    public static void recursive_postorder(Node root){
        if(root!=null){
            recursive_postorder(root.left);
            recursive_postorder(root.right);
            System.out.println(root.data);
        }
    }
    public static void recursive_preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            recursive_postorder(root.left);
            recursive_postorder(root.right);

        }
    }
    public Node left(Node node) {
        return node.left;
    }

    public Node right(Node node) {
        return node.right;
    }

    public boolean hasLeft(Node node) {
        return node.left != null;
    }

    public boolean hasRight(Node node) {
        return node.right != null;
    }

    public Node parent(Node node, Node root) {
        if (root == null || root == node) {
            return null;
        }
        if (root.left == node || root.right == node) {
            return root;
        }
        if (node.data < root.data) {
            return parent(node, root.left);
        } else {
            return parent(node, root.right);
        }
    }

    public Node sibling(Node node, Node root) {
        Node parent = parent(node, root);
        if (parent == null) {
            return null;
        }
        if (parent.left == node) {
            return parent.right;
        } else {
            return parent.left;
        }
    }


    public static void recursive_inorder(Node root){
        if(root!=null){
            recursive_inorder(root.left);
            System.out.println(root.data);
            recursive_inorder(root.right);
        }
    }
    // Search method
    public Node search(Node root, int value) {
        if (root == null || root.data == value) {
            return root;
        }
        if (value < root.data) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.data) {
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right, value);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
        }
        return root;
    }


    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }



    public static void main(String[] args) {
        int value[]={1,2,3,4,5,6,7,8,9};
        Node root = null;
        for(int i = 0 ;i<=value.length;i++){
            root =  insertNode(root,value[i]);

        }
    }
}

