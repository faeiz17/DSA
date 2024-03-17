public class LinkedQueue {
  Node front , rear;

  public LinkedQueue() {
    this.front = null;
    this.rear = null;
  }
  public void add(Transactions transactions){
    Node node = new Node(transactions);
    if (front==null){
      front = node;
      rear = node;
    }else{
      rear.next = node;
      rear = node;
    }
  }
  public Transactions first(){
    return front.transactions;
  }
  public void Display(){
    while (front!=null){
      System.out.println(front.transactions.toString());
      front=front.next;
    }
  }
  public void remove(){
    Node temp = front;
    front=front.next;
    temp=null;
  }

}
