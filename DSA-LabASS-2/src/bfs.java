import java.util.LinkedList;
import java.util.Queue;

public class bfs {
  treeNode root;

  public bfs() {
    this.root = null;
  }

  public void bfs(treeNode root){
if(root==null){
  return;
}else{
  Queue<treeNode> queue = new LinkedList<>() ;
  queue.add(root);

  while (!queue.isEmpty()){

    treeNode node=queue.remove();
    System.out.println(node.data);
    if(node.left!=null){
      queue.add(node.left);
    }
    if (node.right!=null){
      queue.add(node.right);
    }
  }
}
  }

  public static void main(String[] args) {
    bfs b = new bfs();
    b.root=new treeNode(1);
    b.root.left=new treeNode(2);
    b.root.left.right=new treeNode(3);
    b.root.right=new treeNode(4);
    b.bfs(b.root);
  }

}
