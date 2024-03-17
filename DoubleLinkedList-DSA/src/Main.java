public class Main {
  public static void main(String[] args) {
   DoubleLinkedList dll = new DoubleLinkedList();
    dll.insertAtStart(20);
    dll.insertAtStart(15);
    dll.insertAtStart(10);
    dll.insertAtStart(5);
    dll.insertAtEnd(25);
    dll.insertAtAnyLocation(5,22);
//    dll.deleteFromAnyWhere(1);
    dll.Display();
  }
}