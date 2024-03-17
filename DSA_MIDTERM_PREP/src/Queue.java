public class Queue {
  public int queue[]=new int[10];
  public int front, back=-1;
  public void enqueue(int data){
    if(front==-1){
      front++;
    }
    if (back== queue.length){
      System.out.println("full");
    }else {
      queue[++back]=data;
    }
  }
  public void dequeueFROMEND(){

    if (front==back){
      front = back = -1;
    }
    if(front==-1){
      System.out.println("empty");
    }else {
      queue[back]=0;
      back--;
    }

  }
  public void dequeueFROMSTART(){

    if (front==back){
      front = back = -1;
    }
    if(front==-1){
      System.out.println("empty");
    }else {
      queue[front]=0;
      front++;
    }

  }
  public void display(){

    int temp = front;
    while (temp<=back){
      System.out.println("data\t"+queue[temp]);
      temp++;
    }
  }
}
