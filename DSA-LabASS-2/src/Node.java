public class Node {
  public Transactions transactions;
  public Node next;

  public Node(Transactions transactions) {
    this.transactions = transactions;
    this.next = null;
  }


}
