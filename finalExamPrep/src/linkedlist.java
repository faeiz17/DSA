public class linkedlist {

  class Node{
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  Node head;

  public linkedlist() {
    this.head = null;
  }

  public void insertSTART(int data){
    Node newNode = new Node(data);
    if(head==null){
      head = newNode;
      return;
    }else {
      newNode.next=head;
      head=newNode;
    }
  }

  public void insertATLAST(int data){
    Node newNode = new Node(data);
        if(head==null){
          head=newNode;
        return;}else {
          Node temp = head;
          while (temp.next!=null){
            temp=temp.next;
          }
          temp.next=newNode;
        }
  }
  public void insertATANYWHERE(int data , int location){
    Node newNode = new Node(data);
    if(location==1){
      insertSTART(data);
    }else{
      Node prevNode = head;
      Node afterNode = head.next;
      int count =1;
      while (count<location){
        count++;
        if (count==location){
          prevNode.next=newNode;
          newNode.next=afterNode;
          break;
        }else {
          prevNode=prevNode.next;
          afterNode=afterNode.next;
        }
      }
    }
  }
  public void search(int data){
    Node temp = head;
    while (temp!=null){
      if (temp.data == data){
        System.out.println("the value has been found");
        break;
      }else {
        temp = temp.next;
      }
      System.out.println("the value has not found");
    }
  }

  public void deletFROMSTART(){
    if (head==null){
      System.out.println("already empty");
    }
    if (head.next==null){
      head=null;
    }else {
      head=head.next;
    }

  }
  public void deletFROMEND(){
    if (head==null){
      System.out.println("already empty");
    }
    if (head.next==null){
      head=null;
    }else {
      Node prev = head;
      Node after = head.next;
      while (after.next != null) {
        prev=prev.next;
        after=after.next;
      }
      prev.next=null;
    }}
  public void reverse(){


    Stack stack = new Stack();
    Node temp = head;
  while (temp!=null){
    stack.push(temp.data);
    temp=temp.next;
  }
  stack.display();
  }
  public void display(){
    Node temp = head;
    while (temp!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
  }


  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.insertSTART(3);
    ll.insertSTART(2);
    ll.insertSTART(1);
    ll.insertATLAST(4);
    ll.insertATANYWHERE(15,2);


    ll.reverse();
  }


}
