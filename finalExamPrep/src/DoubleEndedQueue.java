public class DoubleEndedQueue {
  private int dqueue[]= new int[10];
  private int front =-1 , back = -1;
  public void enqueueFromStart(int data){
    if(front==-1){
      front++;
      dqueue[front]=data;
      return;
    }
    if (back==dqueue.length){
      System.out.println("full");
    }else {

      dqueue[++front]=data;

    }
  }

  public void enqueueFromEnd(int data){
    if(front==-1){
      front++;
      dqueue[front]=data;
      return;
    }
    if (back==dqueue.length){
      System.out.println("full");
    }else {

    back++;
    dqueue[back]=data;

    }
  }
  public void display(){
    int temp = front;

    while (temp!=back+1){

      System.out.println(dqueue[temp]);
      temp=(temp+1)%dqueue.length;
    }
  }
 /* public void addFront(int data) {
    if ((front - 1 + dqueue.length) % cqueue.length == back) {
      System.out.println("Deque is full. Cannot add more elements.");
      return;
    }

    if (front == -1) {
      front = 0;
      back = 0;
    } else {
      front = (front - 1 + cqueue.length) % cqueue.length;
    }

    cqueue[front] = data;
  }

      public void addFront(T data) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add more elements.");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }

        dequeArray[front] = data;
        size++;
    }






  */


  public static void main(String[] args) {
    DoubleEndedQueue dq = new DoubleEndedQueue();
    dq.enqueueFromStart(3);
    dq.enqueueFromStart(2);
    dq.enqueueFromStart(1);
    dq.display();
  }


}
