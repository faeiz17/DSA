public class Main {
  public static void main(String[] args) {

    avlTrees avl = new avlTrees();
    avl.insert(20);
    avl.insert(25);
    avl.insert(10);
    avl.Display(avl.root);

    System.out.println(avl.countNodes(avl.root));
  }
}