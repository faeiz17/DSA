import java.util.Scanner;

public class BST {
  class Node {
    int data;
    Node leftchild , rightchild;

    public Node(int data) {
      this.data = data;
      this.leftchild = null;
      this.rightchild = null;
    }

  }
  Node root;

  public BST() {
    this.root = null;
  }
  public void insert(int data){
    root = insert(root,data );
  }
  public Node insert(Node node , int data){

    if(node==null) {
      return new Node(data);
    }
    else if(data< root.data){
      node.leftchild=insert(node.leftchild,data);
    } else if (data> node.data) {
      node.rightchild=insert(node.rightchild,data);

    }
    return node;
  }
  public void display(){
    display(root);
  }
  public void display(Node node){
    if (node!=null){
      display(node.leftchild);
      System.out.println(node.data);
      display(node.rightchild);
    }
  }
  public void delete(int data) {
    root = deleteRecursive(root, data);
  }

  private Node deleteRecursive(Node node, int data) {
    if (node == null) {
      return null;
    }

    if (data == node.data) {
      if (hasLeft(node) && hasRight(node)) {
        Node predecessor = findInOrderPredecessor(node);
        copy(node, predecessor);
        node.leftchild = deleteRecursive(node.leftchild, predecessor.data);
      } else {
        node = getChildNode(node);
      }
    } else if (data < node.data) {
      node.leftchild = deleteRecursive(node.leftchild, data);
    } else {
      node.rightchild = deleteRecursive(node.rightchild, data);
    }

    return node;
  }
  private boolean hasLeft(Node node) {
    return node.leftchild != null;
  }

  private boolean hasRight(Node node) {
    return node.rightchild != null;
  }

  private Node getChildNode(Node node) {
    if (hasLeft(node)) {
      return node.leftchild;
    } else if (hasRight(node)) {
      return node.rightchild;
    } else {
      return null;
    }
  }

  private void copy(Node destination, Node source) {
    destination.data = source.data;
  }


  private Node findInOrderPredecessor(Node node) {

      Node curr = node.leftchild;
      while (curr.rightchild != null) {
        curr = curr.rightchild;
      }
    return curr;

    }
    public void search(int data){
search(root,data);
  }


  public void search(Node node, int data) {
    if (node == null) {
      System.out.println("Data not found");
      return;
    }

    while (node != null) {
      if (data == node.data) {
        System.out.println("Data found");
        return;
      } else if (data < node.data) {
        node = node.leftchild;
      } else {
        node = node.rightchild;
      }
    }

    System.out.println("Data not found");
  }
}
