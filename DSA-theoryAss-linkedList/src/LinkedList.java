public class LinkedList {
  Node head;

  public LinkedList() {
    this.head = null;
  }
  public void insertAtfirst(int data){
    Node newNode = new Node(data);
    if(head==null){
     head = newNode;
    }else { newNode.next = head;
      head=newNode;
    }

    }
  public void Display(){
    Node temp = head;

    while(temp!=null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  public void insertAtlast(int data){
    Node newNode= new Node(data);
    if(head==null){
      head=newNode;
    }else {
      Node temp =head;
      while(temp.next!=null){
        temp=temp.next;
      }
        temp.next = newNode;
    }
  }
  public boolean SearchProcess(int data){
    if(head==null){
      System.out.println("the value cannot be found bcz list is empty");
    } else {
      Node temp = head;
      while (temp!=null){
        if(data == temp.data){
         return true;
        }
        temp=temp.next;
      }
    }
    return false;
  }
  public void Search(int data){
    if(SearchProcess(data)==true){
      System.out.println("value has been found");
    }else{
      System.out.println("the value has not been found");
    }
  }
  public void InsertionAtanywhere(int location , int data){
    Node newNode = new Node(data);
    int nodecount = 1;

    if(location==1){
      newNode.next=head;
      head=newNode;
    }else {
      Node prev = head;
      Node after = head.next;
    while(nodecount<location){

      nodecount++;
        if(nodecount==location){
        prev.next=newNode;
        newNode.next=after;
        break;
      } else {
        prev = prev.next;
        after = after.next;
      }
    }}
  }
  public void deleteFromStart(){
    if(head==null){
      System.out.println("cannot delete bcz the list doesnot exist");
    }else{
    Node temp = head;
    head=head.next;
    temp=null;
  }
  }
  public void deleteFROMEND(){
    if(head==null){
      System.out.println("the list doesnot exist");
    } else{
      Node prev = head;
      Node after = head.next;
      if(after==null){
        head=null;
      }else{
      while (after.next!=null){
        prev = prev.next;
        after=after.next;
      }
      prev.next=null;
    }}
  }
  public void deleteFromAnyPoint(int location){

    if(head==null){
      System.out.println("cannot delete the list doesnot exist");

    }else {
      if(location==1){
        if(head.next==null){
          head=null;
        }else {
          deleteFromStart();
        }
      }else {
        Node prev = head;
        Node after=head.next;
        int nodecount=1;
        while (nodecount<location){
          nodecount++;
          if(nodecount==location){
            prev.next=after.next;
            break;
          }else {
            prev=prev.next;
            after=after.next;
          }

        }
      }
    }
  }
  public Node NodeCopy(Node head){
    Node temp = head;
    Node copyNode = new Node(temp.data);
    copyNode.next=temp.next;
    temp=temp.next;

    while (temp!=null){
//      System.out.println(copyNode.data);
      copyNode = new Node(temp.data);
      copyNode.next=temp.next;



      temp=temp.next;
    }return copyNode;
  }
  public void Display(Node head){
    Node temp = head;
    while (temp!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
  }

}
