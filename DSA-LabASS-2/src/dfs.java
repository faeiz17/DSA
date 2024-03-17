import java.util.Stack;

public class dfs {
  treeNode root;

  public dfs() {
    this.root = null;
  }
  public void traversedfs(treeNode root){
    if(root==null){
return;
    }else{
      Stack<treeNode> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()){
        treeNode node = stack.pop();
        System.out.println(node.data);

        if (node.right!=null){
          stack.push(node.right);
        }
        if (node.left!=null){
          stack.push(node.left);
        }
      }
    }
  }

  public static void main(String[] args) {
    dfs s = new dfs();
    s.root=new treeNode(1);
    s.root.left=new treeNode(2);
    s.root.left.right=new treeNode(3);
    s.root.right=new treeNode(4);
    s.traversedfs(s.root);
  }
}
