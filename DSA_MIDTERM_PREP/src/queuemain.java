public class queuemain {
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.dequeueFROMEND();
    q.dequeueFROMSTART();
    q.display();
  }
}
