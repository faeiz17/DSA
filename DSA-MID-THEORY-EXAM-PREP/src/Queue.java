public class Queue {
  private int queue [] = new int[10];
  private int front = - 1 , back = -1 ;
  public void enqueuatback(int data ){
    if(front ==-1 ){
      front++;
    }
    if(back == queue.length){
      System.out.println("full");
    }else {
      queue[++back]=data;
    }
  }
  public void dequeufromstart(){

    if(front == -1 && back==-1 ){
      System.out.println("empty");
    }else{
      if(front ==back){
        front=back=-1;
      }
      queue[front]=0;
      front++;

    }
  }
  public void enqueufromstart(int data){
    if(front == -1){
      queue[++front]=data;
      back++;
    }
    if(back== queue.length){
    System.out.println("array is full");
  }else{
    int temp = queue[front];
      System.out.println(temp);

      queue[++back] = temp;
    queue[front]=data;
      System.out.println(queue[front]);


  }

}
public void Display(){
    int temp = 0;
    while (temp<=back){
      System.out.print(queue[temp] +" ");
      temp++;
    }
}

}
