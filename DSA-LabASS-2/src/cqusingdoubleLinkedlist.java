public class cqusingdoubleLinkedlist {

  class Node{
    int data;
    Node prev ,next;

    public Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
    }

  }
  Node front , back ;

  public cqusingdoubleLinkedlist() {
    this.front = null;
    this.back = null;
  }
  public void add(int data){
    Node newNode = new Node(data);
    if(front==null&&back==null){
      front=newNode;
      back=newNode;
      front.prev=back;
      back.next=front;
    }else {
      back.next=newNode;
      back=newNode;
      newNode.next=front;
      front.prev=newNode;

    }
  }
  /*public class CircularQueue {

  class Node {
    int data;
    Node prev, next;

    public Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
    }
  }

  private Node front, rear;

  public CircularQueue() {
    this.front = null;
    this.rear = null;
  }

  public void enqueue(int data) {
    Node newNode = new Node(data);
    if (front == null && rear == null) {
      front = newNode;
      rear = newNode;
      newNode.next = front;
      front.prev = newNode;
    } else {
      rear.next = newNode;
      newNode.prev = rear;
      rear = newNode;
      newNode.next = front;
      front.prev = newNode;
    }
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    int removedData = front.data;
    if (front == rear) {
      front = null;
      rear = null;
    } else {
      front = front.next;
      front.prev = rear;
      rear.next = front;
    }
    return removedData;
  }

  public boolean isEmpty() {
    return front == null;
  }

  public int size() {
    if (isEmpty()) {
      return 0;
    }
    int count = 0;
    Node current = front;
    do {
      count++;
      current = current.next;
    } while (current != front);
    return count;
  }

  public void printQueue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }
    Node current = front;
    do {
      System.out.print(current.data + " ");
      current = current.next;
    } while (current != front);
    System.out.println();
  }
}
*/


}
