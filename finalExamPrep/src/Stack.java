public class Stack {

  private int [] stack = new int[10];
  private int top=-1;

  public void push(int data){
    if(top== stack.length){
      System.out.println("stack is full");
    }else {
      stack[++top]=data;
    }
  }
  public int pop(){
    int value = 0;
    if(top==-1){
      System.out.println("cannot delete stack is empty");

    }else {

       value =stack[top];
      stack[top]=0;

      top--;

  }
  return value;
  }

  public void display(){
   // System.out.println(stack[top]);
    if(top!=-1){
    int temp = top;
    while (temp!=-1){
      System.out.println(stack[temp]);
      temp--;
    }
  }else {
      System.out.println("stack empty cannot print");
    }
  }

  public static void main(String[] args) {
    Stack stack1 = new Stack();
    stack1.push(5);
    stack1.push(4);
    stack1.push(3);
    stack1.display();
  }


}
