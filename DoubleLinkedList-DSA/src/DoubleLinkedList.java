public class DoubleLinkedList {
  Node head;

  public DoubleLinkedList() {
    this.head = null;
  }
  public void insertAtStart(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
    }else{
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }

  }
  public void insertAtEnd(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
    }else{
      Node temp = head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newNode;

      newNode.prev=temp;
      System.out.println(newNode.prev.data);
    }
  }
  public void Display(){
    Node temp = head;
    while (temp!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public void insertAtAnyLocation(int location , int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
    }else{
      if (location==1){
        insertAtStart(data);
      }else {
        Node prevnode = head;
        Node afternode = head.next;
        int nodecount=1;
        while (nodecount<location){
          nodecount++;
          if(nodecount==location){
            prevnode.next=newNode;
            newNode.prev=prevnode;
            newNode.next=afternode;
            afternode.prev=newNode;
            break;
          }else {
            prevnode=prevnode.next;
            afternode=afternode.next;
          }

        }
      }
    }
  }
  public void insertatanloc(int data , int loc){
    Node newNode = new Node(data);
    if (loc==1){
      insertAtStart(data);
    }else {
      Node prevNode = head;
      Node afternode = head.next;
      int count = 1;
      while(count<loc){
        count++;
        if (count==loc){
          prevNode.next=newNode;
          newNode.prev=prevNode;
          afternode.prev=newNode;
          newNode.next=afternode;

        }else{
          prevNode=prevNode.next;
          afternode=afternode.next;
        }

      }
    }
  }
  public void deleteFromStart(){
    if(head==null){
      System.out.println("cannot delete error 404");
    }else{
      Node temp = head;
      head=head.next;
      temp=null;
    }
  }
  public void deleteFromEnd(){
    if(head==null){
      System.out.println("cannot delete what don't exist");
    }
    if(head.next==null){
      head=null;
    }else {
      Node prevNode = head;
      Node afterNode=head.next;
      while (afterNode.next!=null){
        prevNode=prevNode.next;
        afterNode=afterNode.next;
      }
      prevNode.next=null;
      afterNode=null;
    }
  }
  public void deleteFromAnyWhere(int location){
    if(head==null){
      System.out.println("cannot delete what do not exist ");
    }
    if(location==1){
        deleteFromStart();
    }else {
      Node prevNode = head;
      Node afterNode = head.next;
      int countNode = 1;
      while(countNode<location){
        countNode++;
        if(countNode==location){
          Node temp = afterNode.next;
          prevNode.next=temp;
          temp.prev=prevNode;
          afterNode=null;
          break;
        }else{
          prevNode=prevNode.next;
          afterNode=afterNode.next;
        }
      }
    }
  }
}
