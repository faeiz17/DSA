public class BTclass {
   static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }//node constructor
    }
     static class binarytree{
        static int index=-1; //points to the first node
        public static Node buildtree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                Node temp = new Node(nodes[index]);
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left=buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }//returns node

    }
    public static void preorderprinting(Node root){
        if(root==null){
          return;
        }
        System.out.println(root.data +" ");
        preorderprinting(root.left);
        preorderprinting(root.right);
    }

    public static void main(String[] args) {
        int[] nodes ={5,2,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        Node root = binarytree.buildtree(nodes);
//        System.out.println(root.data);
        preorderprinting(root);

   }



}
