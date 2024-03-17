public class circularqueue {
  private int cq[]=new int[10];
  private int front=-1,back=-1;
  public void enqueu(int data){
    if (front==-1){
      front++;
    }
    if ((back% cq.length)==front){
      System.out.println("full");
    }else {
      back=(back+1)% cq.length;
      cq[back]=data;
    }

  }
  public void dequeue(){
    if (front==back){
      front=-1;back=-1;
    }
    if (front==-1){
      System.out.println("its empty");
    }else {
      cq[front]=0;
      front = (front + 1 ) % cq.length;
    }
  }
}
