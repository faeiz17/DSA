public class AVLTree {
  private Node root;

  public AVLTree() {
    this.root = null;
  }
  public void removeall(){
    root=null;
  }
  public Boolean checkempty(){
    if (root==null){
      return true;
    }
    else {
      return false;
    }
  }
  public void insertelementWITHKEY(int data){

    root=insertelementWITHNODEandKEY(data,root);
  }
  public int getHeight(Node node )
  {
    return node == null ? -1 : node.height;
  }
  public int getMaxHeight(int leftNodeHeight , int rightNodeHeight) {

  return leftNodeHeight>rightNodeHeight ? leftNodeHeight:rightNodeHeight;
  }


  public Node insertelementWITHNODEandKEY(int data, Node rootnode){
    if(rootnode==null){
      rootnode=new Node(data);
    } else if (data<rootnode.data) {

      rootnode.left=insertelementWITHNODEandKEY(data,rootnode.left);
          if(getHeight(rootnode.left)-getHeight(rootnode.right)==2){
            if(data<rootnode.left.data){
              rootnode = rotateWithLeftChild(rootnode);
            }else{
              rootnode = rotateDoubleWithLeftChild(rootnode);
            }
          }
      
    }
  }
}