import java.util.Stack;

public class QueueStack {
//QUEUE CLASS
    class Stack{

      //STACK CLASS USING NODE(link list style implementation)
      Node top;

      public Stack() {
        this.top= null;
      }
      public void push(Node n){
        if(top==null){
          top =n;
        }else {
          top.next=n;
          n.prev=top;
          top=n;
        }
      }
      public Node pop(){
        Node poppedNode = top;
        if(top==null){
          System.out.println("empty");
        }else{

          Node temp = top.prev;
          temp.next=null;
          top=temp;

        }
        return poppedNode;

      }
    }
    static class Node{
      //NODE CLASS FOR LINK IMPLEMENTATION

      int data ;
      Node next,prev;

      public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev=null;
      }
    }
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();


 public void enQueue( Node x){

    stack1.push(x);
 }

 public Node deQueue(){

    if(stack1.top==null&&stack2.top==null){
      System.out.println("error");
    }
    if(stack2.top==null){
      Node temp = stack1.top;
      while (temp.prev!=null){
        stack2.push(stack1.pop());

      }
    }
    return stack2.pop();
 }
}
