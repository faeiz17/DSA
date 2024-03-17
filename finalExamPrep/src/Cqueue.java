public class Cqueue {
  private int cqueue[]=new int[10];
  private int front =-1 , back = -1;

      public void enqueue(int data){
        if((back+1)%cqueue.length==front){
          System.out.println("full");
        }
        if (front==-1){
          front=0;
        }

          back=(back+1)% cqueue.length;
          cqueue[back]=data;

      }


      public void dequeue(){
        if (front==back){
          front=-1;
          back=-1;

        }
        if (front==-1){
          System.out.println("empty");
        }else {
          front=front+1%cqueue.length;
        }
      }
      public void display(){
        int temp = front;

        while (temp!=back+1){

          System.out.println(cqueue[temp]);
          temp=(temp+1)%cqueue.length;
        }
      }

  public static void main(String[] args) {
    Cqueue cqueue1 =new Cqueue();
    cqueue1.enqueue(10);
    cqueue1.enqueue(20);
    cqueue1.enqueue(30);
    cqueue1.display();
  }

}
