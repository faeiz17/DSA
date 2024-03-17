public class Queue {

  private int queue[]= new int[10];
  private int front=-1,back=-1;

  public void enqueue(int data){

    if(front==-1){
      front++;
    }

    if(back== queue.length){
      System.out.println("queue is full");
    }else {
      queue[++back]=data;
    }
  }

  public void dequeue(){
if(front==back){
  front=back=-1;
}
    if(front==-1&&back==-1){
      System.out.println("empty cannot delete");
    }else {
      queue[front]=0;
      front++;
    }
  }

public void diplay(){
    int temp = front;
    while (temp!=back){
      System.out.println(queue[temp]);
      temp++;
      if (temp==back){
        System.out.println(queue[temp]);
      }
    }

}
  public static void main(String[] args) {
    Queue queue1 = new Queue();
    queue1.enqueue(1);
    queue1.enqueue(2);
    queue1.enqueue(3);
    queue1.dequeue();
    queue1.diplay();
  }


}
