public class avlTrees {

    private class Node{
      int data;
      Node leftChild;
      Node rightChild;
      int height ;

      Node(int data){
        this.data=data;
        this.height=1;
      }

    }
public Node root; //bcz avl trees like bst starts from root;

public void insert(int data){ //ye method user ko dekhana hai

 this.root= insert(this.root,data); //ye root node lainay k liyay hai ye recursive funtion hai ismay this jo hai wo indicate krha k is class ka object jaisay node k constructor may this.data

}

private int height(Node node){
  if (node==null)
  { return 0;

  }
  return node.height;
}

private Node insert(Node root, int data){ // ye tree ki root node return karay ga

  if(root==null){//ye agr shuru say tree bana rhy
    Node newNode= new Node(data);
    return newNode;//qk humnay root node he return krni thi
  }
  if(data>root.data){
    //ye right sub tree may jy ga
    root.rightChild=insert(root.rightChild,data);
  }else if(data< root.data){
    root.leftChild=insert(root.leftChild,data);
  }

  root.height=Math.max(height(root.leftChild),height(root.rightChild))+1;
 int BalanceFactor = balanceFactor(root);

 if(BalanceFactor>1&&data<root.leftChild.data){
   return rightRotation(root); //ll case->right rotate

 }
  if(BalanceFactor>1&&data>root.leftChild.data){
   root.leftChild=leftRotate(root.leftChild);
   return rightRotation(root);//lr case

  }

 if(BalanceFactor<-1&&data>root.rightChild.data){
   return leftRotate(root); //rr case -> left rotate
 }
  if(BalanceFactor<-1&&data<root.rightChild.data){
    root.rightChild=rightRotation(root.rightChild); //rl case
    return leftRotate(root);
  }

  return root;

}

public void Display(Node root){
  if (root!=null){
    Display(root.leftChild);
    System.out.println(root.data);
    Display(root.rightChild);
  }

}

public void search(Node node,int data){
  if (node!=null){
    if (data==node.data){
      System.out.println("data found");
    }else
    search(node.leftChild,data);
    search(node.rightChild,data);
  }
}


private int balanceFactor(Node node){
  return height(node.leftChild)-height(node.rightChild);
}

private Node rightRotation(Node a){
  Node b = a.leftChild;
  Node node = b.rightChild;
  b.rightChild=a;
  a.leftChild=node;
  a.height=Math.max(height(a.leftChild),height(a.rightChild))+1;
  b.height=Math.max(height(b.leftChild),height(b.rightChild))+1;
  return b;
}

private Node leftRotate(Node a){
  Node b= a.rightChild;
  Node node = b.leftChild;
  b.leftChild=a;
  a.rightChild=node;
  a.height=Math.max(height(a.leftChild),height(a.rightChild))+1;
  b.height=Math.max(height(b.leftChild),height(b.rightChild))+1;
  return b;
}

  public void delete(int data) {
    this.root = delete(this.root, data);
  }

  private Node delete(Node root, int data) {
    if (root == null) {
      return null;
    }

    if (data < root.data) {
      root.leftChild = delete(root.leftChild, data);
    } else if (data > root.data) {
      root.rightChild = delete(root.rightChild, data);
    } else {
      // Node to be deleted is found

      // Case 1: Node has no child or only one child
      if (root.leftChild == null || root.rightChild == null) {
        Node temp = null;
        if (root.leftChild == null) {
          temp = root.rightChild;
        } else {
          temp = root.leftChild;
        }

        // If node has no child
        if (temp == null) {
          temp = root;
          root = null;
        } else { // If node has one child
          root = temp;
        }
      } else { // Case 2: Node has two children
        Node temp = findMin(root.rightChild); // Find minimum node in the right subtree
        root.data = temp.data; // Replace the data of the current node with the minimum node value
        root.rightChild = delete(root.rightChild, temp.data); // Delete the minimum node in the right subtree
      }
    }

    if (root == null) {
      return null;
    }

    root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1; // Update the height of the current node

    int balanceFactor = balanceFactor(root);

    // Perform necessary rotations if the tree becomes unbalanced
    if (balanceFactor > 1 && balanceFactor(root.leftChild) >= 0) {
      return rightRotation(root); // LL case: Right rotation
    }
    if (balanceFactor > 1 && balanceFactor(root.leftChild) < 0) {
      root.leftChild = leftRotate(root.leftChild);
      return rightRotation(root); // LR case: Left rotation + Right rotation
    }
    if (balanceFactor < -1 && balanceFactor(root.rightChild) <= 0) {
      return leftRotate(root); // RR case: Left rotation
    }
    if (balanceFactor < -1 && balanceFactor(root.rightChild) > 0) {
      root.rightChild = rightRotation(root.rightChild);
      return leftRotate(root); // RL case: Right rotation + Left rotation
    }

    return root;
  }

  private Node findMin(Node node) {
    while (node.leftChild != null) {
      node = node.leftChild;
    }
    return node;
  }
  int count=0;
public int countNodes(Node node){
  if(node==null){
    return 0;
  }else {
    countNodes(node.leftChild);
    countNodes(node.rightChild);
    count++;

  }
  return count;
}



}
