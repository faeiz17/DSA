public class stackmain {
  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.pop();
    stack.display();
    System.out.println(stack.peek());
  }
}
