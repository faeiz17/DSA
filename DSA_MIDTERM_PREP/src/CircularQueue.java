public class CircularQueue {
  public int cqueu[]=new int[10];
  public int front =-1 , back =-1;
      public void enqueue(int data) {

        if ((back + 1) % 10 == front) {
          System.out.println("full");
          return;
        }

        if (front == -1) {
          front=0;
        }
          back = (back + 1) % 10;
          cqueu[back] = data;


      }
      public void dequeue(){

    if(front==-1&&back==-1){
      System.out.println("empty");
    }else {
      cqueu[front]=0;
      front=(front+1)% cqueu.length;
      if(front==back){
        front=-1;
        back=-1;
      }
    }
      }
      public void display(){
        int temp = front;
            while(temp!=back){
              System.out.println(cqueu[temp]);
              temp=(temp+1)% 10;
              if(temp==back){
                System.out.println(cqueu[temp]);
                break;
              }
            }

      }
}
